package Atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um número");
        double num = sc.nextDouble();
        System.out.println("O numero informado foi: " + num);
    
        sc.close();

    } 

}
