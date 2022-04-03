package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество чисел:");
        int num = scanner.nextInt();
        int[] mass = new int[num];
        System.out.println("Старый массив: ");
        for (int i = 0; i < num; i++) {
            mass[i] = random.nextInt(101);
            System.out.print(mass[i] + " ");
        }

        float redFactor = (float) 1.247;
        int step = num, temp;
        while (step > 1) {
            step = (int) (step/redFactor);
            for (int i = 0; step + i < num; i++) {
                if (mass[i] > mass[i+step]) {
                    temp = mass[i];
                    mass[i] = mass[i+step];
                    mass[i+step] = temp;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Новый массив: ");
        for (int i = 0; i < num; i++) {
            System.out.print(mass[i] + " ");
        }

    }
}
