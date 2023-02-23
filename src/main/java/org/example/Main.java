package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//        long start = System.nanoTime();
//        for (int i = 0; i < 10000; i++) {
//            list1.add(i);
//        }
//        long end = System.nanoTime();
//        System.out.println(end-start);
//
//        start = System.nanoTime();
//        for (int i = 0; i < 10000; i++) {
//            list2.add(i);
//        }
//        end = System.nanoTime();
//        System.out.println(end-start);
        List<String> names = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        String name = null;
        Integer index = 0;
        names.add(0, null);
        while(true) {
            String str = iScanner.nextLine();
            if (str.equals("Q")) //Выход из цикла
                break;
            String[] strArray = str.split("~"); //str[0] - слово до ~, str[1] - номер
            name = strArray[0];
            index = Integer.parseInt(strArray[1]);

            if (name.equals("print")) {
                System.out.println(names.get(index));
                names.remove(index);
            }
            else if (index > names.size()) {
                for (int i = names.size(); i < index; i++){
                    names.add(i, null);
                }
                names.add(index, name);

            }
            else names.add(index, name);



        }
iScanner.close();

    }
}