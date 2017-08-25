package net.neko.tasks;

import java.util.Scanner;

/**
 * Created by Neko on 25.08.2017.
 */
public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово:");
        String str = scanner.next();
        check(str);
    }

    public static String invert(String str) {
        int i;
        String t="";
        for (i =  str.length()-1; i>=0;--i)
            t+=str.charAt(i);

        return t;
    }

    public static void check(String str){
        if (str.equals(invert(str))){
            System.out.println("Является");
            return;
        }

        System.out.println("Не является");
        return;
    }
}
