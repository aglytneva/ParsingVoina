package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("voyna.txt");
        Parser parser = new Parser();
        ArrayList<String> lines = parser.parse(file);
        int count = 0;
        System.out.println(lines.get(2));
        for (String line : lines) {
            if (line.contains("страда") == true) {
                count++;
            }
        }
        System.out.println("Кол-во вхождений слова страдание c помощью класса parser - " + count);


        Scanner sc = new Scanner(file);
        ArrayList<String> newList = new ArrayList<>();
        while (sc.hasNext()) {
            String[] scanWords = sc.nextLine().split(" ");
            for (String s : scanWords) {
                newList.add(s);
            }
        }
        int countWords = 0;
        for (String s : newList) {
            if (s.contains("страда"))
                countWords++;
        }
        System.out.println("Кол-во вхождений слова страдание c помощью класса scanner - " + countWords);


        System.out.println("Таблица умножения");
        int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int q : pif) {
            for (int w : pif) {
                System.out.printf("%4d", (q * w));
            }
            System.out.println();
        }
    }
}
