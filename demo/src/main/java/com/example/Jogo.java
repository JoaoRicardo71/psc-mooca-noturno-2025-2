package com.example;


public class Jogo {

    public static void main(String[] args) {
        Personagem cacador = new Personagem("Joao",1,1,1);
        Personagem soneca = new Personagem("Danilo",2,2,2);



        while(true){
        cacador.cacar();
        soneca.dormir();
        cacador.comer();
        soneca.dormir();
        cacador.dormir();
        soneca.dormir();
        cacador.cacar();
        soneca.comer();
     cacador.cacar();
       // soneca.cacar();
        System.out.println("========================");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
