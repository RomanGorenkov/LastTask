package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создание елки с именем \"Ёлочка\"");
        ChristmasTree elka = new ChristmasTree("Ёлочка");
        System.out.println("Вешаем игрушки на нашу елку");
        elka.putOnTree(ChristmasToy.creatToy(12,"Синий"),elka);
        elka.putOnTree(ChristmasToy.creatToy(15,"Красный"),elka);
        elka.putOnTree(ChristmasToy.creatToy(2,"Красный"),elka);
        elka.getInfo(elka);
        System.out.println("Выберите метод сортировки: 1/2");
        int choo = scanner.nextInt();
        if (choo == 1) {
            System.out.println("\nСортируем коллекцию применяя метод Collections.sort()\n");
            elka.sort1(elka);
            elka.getInfo(elka);
        }else {
            System.out.println("\nСортируем коллекцию применяя TreeSet\n");
            elka.sort2(elka);
            elka.getInfo(elka);
        }

    }
}
