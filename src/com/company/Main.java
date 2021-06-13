package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        int year = scanner.nextInt();
        if (year%100==0){
            switch (year%400){
                case 0:
                    System.out.println(year + " bir artık yıldır !");
                    break;
                default:
                    System.out.println(year + " bir artık yıl değildir !");
            }
        }
        else if (year%4==0){
            System.out.println(year + " bir artık yıldır !");
        }

        else {
            System.out.println(year + " bir artık yıl değildir !");
        }


    }
}
