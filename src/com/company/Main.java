package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int listAsize = 5;
        int listBsize = 5;

        System.out.println("Введите данные для списка А: ");
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>(listAsize);

        while (listAsize > 0) {
            System.out.print(listAsize + ": ");
            listA.add(scanner.nextLine());
            listAsize--;
        }

        System.out.println("Данные списка А: \n" + listA);
        System.out.println("_______________________");

        System.out.println("Введите данные для списка Б: ");
        Scanner scanner1 = new Scanner(System.in);

        ArrayList<String> listB = new ArrayList<>(listBsize);

        while (listBsize > 0) {
            System.out.print(listBsize + ": ");
            listB.add(scanner1.nextLine());
            listBsize--;
        }

        System.out.println("Данные списка Б: \n" + listB);
        System.out.println("_______________________");

        ArrayList<String> listC = new ArrayList<>();

        Collections.sort(listA);
        Collections.sort(listB);
        Collections.reverse(listB);

        int index = 0;
        while (listA.size() + listB.size() > listC.size()) {
            listC.add(listA.get(index));
            listC.add(listB.get(index));
            index++;
        }

        System.out.println("Данные списка С: \n" + listC);
        System.out.println("_______________________");

        listC.sort(Comparator.comparing(String::length));
        System.out.println("Данные списка С после сортировки: \n" + listC);
    }
}