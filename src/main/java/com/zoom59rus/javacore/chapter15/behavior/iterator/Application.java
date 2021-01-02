package com.zoom59rus.javacore.chapter15.behavior.iterator;

public class Application {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<>("SomeEntity", new String[]{"A", "B","C","D","I","F","G","H",});

        /**
         * Сначало сделал свой итератор, потом использовал из пакета java.util
          */

//        Iterator<String> iterator = myCollection.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (String s : myCollection) {
            System.out.println(s);
        }
    }
}
