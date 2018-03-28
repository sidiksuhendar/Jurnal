package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int inputan = show.nextInt();
        long fib[] = new long[inputan];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < inputan; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < inputan; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
