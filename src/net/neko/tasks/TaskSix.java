package net.neko.tasks;

import java.util.Scanner;

/**
 * Created by Neko on 25.08.2017.
 */
public class TaskSix {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово:");
        String str = scanner.next();
        String result = str.replaceAll("\\d","");
        System.out.print("результат:");
        System.out.println(result);
    }
}
