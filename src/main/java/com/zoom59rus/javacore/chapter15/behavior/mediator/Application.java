package com.zoom59rus.javacore.chapter15.behavior.mediator;

import com.zoom59rus.javacore.chapter15.behavior.mediator.component.DividersNumber;
import com.zoom59rus.javacore.chapter15.behavior.mediator.component.FactorialCalc;
import com.zoom59rus.javacore.chapter15.behavior.mediator.component.NumberGenerate;

public class Application {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        NumberGenerate numberGenerate = new NumberGenerate();
        Component factorialCalc = new FactorialCalc();
        Component dividersNumber = new DividersNumber();

        mediator.registerComponent(numberGenerate);
        mediator.registerComponent(factorialCalc);
        mediator.registerComponent(dividersNumber);

        numberGenerate.genDecimal();
    }
}
