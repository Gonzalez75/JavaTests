package Class01;

import java.util.Scanner;

public class Class01 {
   
    public static void main(String[] args) {
        
        //Exercicio 1
        
        double varTemp;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em °C: ");
        varTemp = Double.parseDouble(in.nextLine());
        System.out.println("Sua temperatura equivalente em Fahrenheit é igual à:  " + (varTemp * (1.8) + 32) + "\n");

        //Exercicio 2
        
        double p1,p2,p3,p4;
        System.out.println("Digite a nota da p1: ");
        p1 = Double.parseDouble(in.nextLine());
        System.out.println("Digite a nota da p2: ");
        p2 = Double.parseDouble(in.nextLine());
        System.out.println("Digite a nota da p3: ");
        p3 = Double.parseDouble(in.nextLine());
        System.out.println("Digite a nota da p4: ");
        p4 = Double.parseDouble(in.nextLine());
        
        //Exercicio 3
        
        double media = ((p1 + p2 + p3+ p4) / 4);
        if (media>=6)
        System.out.println("Aprovado");
        if (media<3)
            System.out.println("Reprovado");
        if (media >= 3 || media<6)
            System.out.println("Está de exame");

        //Exercicio 4

        double a, b, c, d;
        
        System.out.println("Digite o primeiro valor: ");
        a = Double.parseDouble(in.nextLine());
        System.out.println("Digite o segundo valor: ");
        b = Double.parseDouble(in.nextLine());
        System.out.println("Digite o terceiro valor: ");
        c = Double.parseDouble(in.nextLine());
        System.out.println("Digite o quarto: ");
        d = Double.parseDouble(in.nextLine());
        
        System.out.println("A média é: " + Math.pow(a*b*c*d , 0.25) + "\n" );
     
        //Exercicio 5

        int mes,dias;
        System.out.println("Digite o mês: ");
        mes = (int)(in.nextInt());
        dias = mes * 31;
         System.out.println("Total de dias é aproximadamente: " + dias);



            
    }
    
}
