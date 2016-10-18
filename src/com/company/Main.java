package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // task1();
        task2();
    }
    public static void task1(){
        int n = inputInt("vvedit razmer");
        double[] mas =new double[n];
        for (int i=0;i<n;i++){
            mas[i]=Math.round(Math.random() * 50220-2521);//inputDouble();
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        double min=0,sum=0,min5=0;
        for (int i = 0; i <n ; i++) {
            if (mas[i]%5==0){
                min5=mas[i];
            }
        }
        for (int i = 0; i <n ; i++) {
            if (mas[i]<0){
                min++;
                sum+=mas[i];
            }
            if (mas[i]%5==0&& min5 > mas[i]){
                min5=mas[i];
            }
        }
        System.out.println(min+" "+sum+" "+min5);
    }
    public static void task2(){
        /*Задані натуральне число n, цілочислена квадратна матриця порядку
        n. Одержати bi,..., bn, де bi це:
        а) найменше зі значень елементів, що знаходяться на початку i-го
        рядка матриці до елемента, що належить головній діагоналі,
                включно;
        б) значення першого за порядком позитивного елемента i-го рядка*/
        int n=inputInt("input");
        double[] sum = new double[n];
        double[][] mas = new double[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                mas[i][j]=Math.round(Math.random() * 50)-25;//inputDouble();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(mas[i][j]+" ");

            }
            System.out.println();
        }
        int j=0,q=0;
        for (int i=0;i<n;i++){
            if (i==j){
                for (int k = 0; k <i ; k++) {
                    sum[q]+=mas[i][k];
                }
                q++;
            }
            j++;
        }

        for (int i = 0; i < n ; i++) {
            System.out.println(sum[i]);
        }

    }
    static  int inputInt(String inp){
        while (true) {
            try {
                Scanner sk = new Scanner(System.in);
                System.out.println(inp);
                return sk.nextInt();
            }catch (InputMismatchException ex){
                System.err.println("Invalid Data");
            }
        }
    }
}
