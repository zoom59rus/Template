package com.zoom59rus.javacore.chapter15.behavior.memento;

import com.zoom59rus.javacore.chapter15.behavior.memento.database.BackupStore;
import com.zoom59rus.javacore.chapter15.behavior.memento.database.Database;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Database database = new Database();
        BackupStore backupStore = new BackupStore();
        User user = new User(null, "Василий", "Петрович", null);
        City city = new City(null, "Севереморск", null);
        User user2 = new User(null, "Николай", "Молодой", null);
        City city2 = new City(null, "Москва", null);
        User user3 = new User(null, "Петр", "Стабровский", null);
        City city3 = new City(null, "Питер", null);
        User user4 = new User(null, "Антон", "Назаров", null);
        City city4 = new City(null, "США", null);

        database.save(user, city);
        backupStore.backup(database);

        database.save(user2, city2);
        backupStore.backup(database);

        database.save(user3, city3);
        backupStore.backup(database);

        database.save(user4, city4);
        backupStore.backup(database);

        database.printUser(3);

        System.out.println("Ошибка!!! Антон Назаров живет в Перми");
        System.out.println("Производим откат до сохранения");
        Thread.sleep(5000);
        backupStore.rollback(database);

        User user5 = new User(null, "Антон", "Назаров", null);
        City city5 = new City(null, "Пермь", null);
        database.save(user5, city5);
        backupStore.backup(database);

        //Не понимаю почему не создается клон!
        database.printUser(4);

    }
}
