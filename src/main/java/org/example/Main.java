package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;


public class Main {
    public static void main(String[] args) {

//        List<String> names = new LinkedList<>();
//        Scanner iScanner = new Scanner(System.in);
//        String name = null;
//        Integer index = 0;
//        names.add(0, null);
//        while(true) {
//            String str = iScanner.nextLine();
//            if (str.equals("Q")) //Выход из цикла
//                break;
//            String[] strArray = str.split("~"); //str[0] - слово до ~, str[1] - номер
//            name = strArray[0];
//            index = Integer.parseInt(strArray[1]);
//
//            if (name.equals("print")) {
//                System.out.println(names.get(index));
//                names.remove(index);
//            }
//            else if (index > names.size()) {
//                for (int i = names.size(); i < index; i++){
//                    names.add(i, null);
//                }
//                names.add(index, name);
//            }
//            else names.add(index, name);
//        }
//iScanner.close();

        Stack<String> stack = new Stack<>();

        Scanner iScanner = new Scanner(System.in);
//        String name = null;
//        Integer index = 0;
        while(true) {
            String str = iScanner.nextLine();

            if (str.equals("Q")) //Выход из цикла
                break;

            if (str.equals("revert")) {
                for (int i = stack.size() - 1; i >= 0 ; i--) {
                    System.out.println(stack.get(i));
                }

            }
            else if (str.equals("print")) stack.pop();

            else stack.push(str);
            }
    }
}