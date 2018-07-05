package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Создание елки с именем \"Ёлочка\"");
        ChristmasTree elka = new ChristmasTree("Ёлочка");
        System.out.println("Вешаем игрушки на нашу елку");
        elka.getPull().add(ChristmasToy.creatToy(12,"Красный"));
        elka.getPull().add(ChristmasToy.creatToy(2,"Синия"));
        elka.getInfo(elka);
        elka.sortToy(elka);
        elka.getInfo(elka);

    }
}
