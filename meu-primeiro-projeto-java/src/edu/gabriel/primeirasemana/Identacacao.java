package edu.gabriel.primeirasemana;

public class Identacacao {
    public static void main(String[] args) {
         int mediaFinal = 70;
         if(mediaFinal<6)
            System.out.println("REPROVADO");
         else if(mediaFinal==6)
            System.out.println("PROVA MINERVA");
         else
            System.out.println("APROVADO");
    }
}
