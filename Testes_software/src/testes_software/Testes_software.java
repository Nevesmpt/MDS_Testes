/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes_software;

import java.util.Scanner;

/**
 *
 * @author mneves
 */
public class Testes_software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner (System.in);
        //pedir valor ao utilizador
        System.out.println("Insira um valor inteiro");
        n = ler.nextInt();
        //Verifica par ou impar
        if(n%2==0)
            System.out.println(n+" é par\n"+n+"é múltiplo de 2");
        else
            System.out.println(n+" é ímpar");
        if (n%3==0)
            System.out.println(n+" é múltiplo de 3");
        if (n%5==0)
            System.out.println(n+" é múltiplo de 5");
        if (n%7==0 && n%14==0)
            System.out.println(n+" é múltiplo de 7 e 14");
        if (n%13==0 || n%19==0)
            System.out.println(n+"é múltiplo de 13 ou 19");    
    }
    
}
