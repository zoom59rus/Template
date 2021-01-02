package com.zoom59rus.javacore.chapter15.behavior.memento.database;

import com.zoom59rus.javacore.chapter15.behavior.memento.City;
import com.zoom59rus.javacore.chapter15.behavior.memento.Memento;
import com.zoom59rus.javacore.chapter15.behavior.memento.User;

import java.util.Date;

public class Database {
    private Table userTable;
    private Table cityTable;

    public Database() {
        this.userTable = new UserTable();
        this.cityTable = new CityTable();
    }

    public void save(User user, City city){
        Integer uId = userTable.save(user);
        Integer cId = cityTable.save(city);
        user.setCityId(cId);
        city.setUserId(uId);
        System.out.println("Пользователь сохранен.");
    }

    public void printUser(Integer id){
        User user = (User) userTable.getRow(id);
        City city = (City) cityTable.getRow(user.getCityId());

        System.out.println(
                "Имя: " + user.getFirstName() +  "\n" +
                        "Фамилия: " + user.getLastName() + "\n" +
                        "Город проживания: " + city.getName()

        );
    }

    public void rollback(Memento memento){
        Backup backup = (Backup) memento;
        this.userTable = backup.userTable;
        this.cityTable = backup.cityTable;

        System.out.println("Данные восстановлены.");
    }

    public Memento backup(){
        return new Backup(this);
    }

    private static class Backup implements Memento {
        private final Table userTable;
        private final Table cityTable;
        private final Date date;

        public Backup(Database database) {
            userTable = database.userTable.clone();
            cityTable = database.cityTable.clone();
            this.date = new Date();
        }
    }
}