package Lexa;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            //l();
            p();
        }
        static int inputInt(String inp) {
            while (true) {
                try {
                    Scanner sk = new Scanner(System.in);
                    System.out.println(inp);
                    return sk.nextInt();
                } catch (InputMismatchException ex) {
                    System.err.println("Invalid Data");
                }
            }
        }

        static void l() {
            int n=inputInt("vvedit razmer");
            double[] mas = new double[n];


            for (int i = 0; i < n; i++) {
                mas[i] = Math.round(Math.random() * 50) - 25;//inputDouble();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(mas[i] + " ");
            }
            double summin=0,summax=0;
            for (int i = 0; i <n ; i++) {
                if (mas[i]>0){
                    summax+=mas[i];
                }else {
                    summin+=mas[i];
                }
            }
            System.out.println(summax+" "+summin);


        }
        static void p(){
            int n=inputInt("vvedit razmer");
            double[] mas = new double[n];


            for (int i = 0; i < n; i++) {
                mas[i] = Math.round(Math.random() * 50) - 25;//inputDouble();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(mas[i] + " ");
            }
            double nope=0;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j < n; j++) {
                    if (mas[i] == mas[j] && i != j){
                        nope++;
                    }
                }
            }
            nope/=2;
            System.out.println("est takie pari "+nope);
        }
    }


