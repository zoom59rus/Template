package com.zoom59rus.javacore.chapter15.mediator;

import com.zoom59rus.javacore.chapter15.mediator.component.DividersNumber;
import com.zoom59rus.javacore.chapter15.mediator.component.FactorialCalc;
import com.zoom59rus.javacore.chapter15.mediator.component.NumberGenerate;
import com.zoom59rus.javacore.chapter15.mediator.factory.Event;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
    private NumberGenerate numberGenerate;
    private FactorialCalc factorialCalc;
    private DividersNumber dividersNumber;

    public MediatorImpl() {
    }

    @Override
    public void registerComponent(Component component) {
        switch (component.getComponentName()) {
            case "NumberGenerate": {
                this.numberGenerate = (NumberGenerate) component;
                this.numberGenerate.registerMediator(this);
                break;
            }
            case "FactorialCalc": {
                this.factorialCalc = (FactorialCalc) component;
                this.factorialCalc.registerMediator(this);
                break;
            }
            case "DividersNumber": {
                this.dividersNumber = (DividersNumber) component;
                this.dividersNumber.registerMediator(this);
                break;
            }
        }
    }

    @Override
    public void event(Event event) {
        switch (event.getInvoker()) {
            case "NumberGenerate": {
                System.out.println("Получены данные от " + event.getInvoker() + ": " + event.getEvent());
                Integer input = (Integer) event.getEvent();
                if(input < 11){
                    System.out.println("По заданной логике отправляем на вычисление факториала.");
                    factorialCalc.calc(input);
                }
                if(input < 21){

                }
                if(input < 31){

                }
                if(input < 41){
                    System.out.println("По заданной логике отправляем на вычисление делителей числа.");
                    dividersNumber.getDividers(input);
                }
                if(input > 40){
                    System.out.println("Сгенерированное число " + input + " находится за пределами заданной логики.");
                    System.out.println("Отправим задание на генерацию нового числа.");
                    numberGenerate.genDecimal();
                }
            }
            case "FactorialCalc": {
                System.out.println("Получены данные от " + event.getInvoker());
                System.out.println("Факториал посчитан: " + event.getEvent());
                System.out.println("Отправляем запрос на генерацию нового числа.");
            }
            case "DividersNumber": {
                System.out.println("Получены данные от " + event.getInvoker());
                System.out.print("Делители найдены: ");
                System.out.println("Отправляем запрос на генерацию нового числа.");
                numberGenerate.genDecimal();
            }
        }
    }
}
