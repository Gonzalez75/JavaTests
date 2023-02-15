package com.mycompany.class02;

import java.util.Scanner;

public class Class02 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
//        Exercicio 1
//        int n =1;
//        int result = 0;
//        
//        do
//        {
//            result = ((n * n) + 1);
//            System.out.println(result + "\n");
//            n++;
//        }
//        while( n<= 15);
                   
//        Exercicio 2

//        System.out.print("Digite um número: ");
//        int n = input.nextInt();
//
//        int soma = 0;
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                soma += i;
//            }
//        }
//
//        if (soma == n) {
//            System.out.println(num + " é um número perfeito.");
//        } else {
//            System.out.println(num + " não é um número perfeito.");
//        }

//        Exercicio 3


        System.out.print("Digite o N para Fibonacci: ");
        int n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
