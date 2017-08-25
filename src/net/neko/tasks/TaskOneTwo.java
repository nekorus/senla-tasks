package net.neko.tasks;

import jdk.internal.util.xml.impl.Input;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Neko on 24.08.2017.
 */
public class TaskOneTwo {
    public static void main(String[] args) {
        int i,a;
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предел :");
        length = scanner.nextInt();
        int d[] = new int[length];
                for (i = 2; i <= d.length; i++) {

            // Задание 1, простые числа

            for (a=2 ; (i%a)>0; a++){
            }
            if (i==a) System.out.print(a + "\t" );
        }
        System.out.println("<<--Простые числа");

        //Задание 2 , Числа Фибоначчи

        int fib=0,b=1,c=0;
        while ( fib <= d.length ){
            fib=b+c;
            b=c;
            c=fib;
            System.out.print(fib + "\t");

        }
        System.out.println("<<--Числа Фибоначчи");
        scanner.close();
            }



    }





