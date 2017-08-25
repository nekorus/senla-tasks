package net.neko.tasks;

import java.util.Scanner;

/**
 * Created by Neko on 25.08.2017.
 */
public class TaskFour {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа:");
        int a;
        a = scanner.nextInt();
        int b;
        b = scanner.nextInt();
        System.out.println("Найбольший общей делитель:"+ nod(b, a));
        System.out.println("Найменьшее общее кратное:"+ nok(b, a));

    }
    private static int nod(int a , int b){
        if (b==0){
            return a ;
        }
        else{
            return nod(b,a%b);
        }
    }
    private static int nok(int a, int b){
        return a/ nod(a,b)*b;
    }
}
