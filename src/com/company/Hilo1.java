package com.company;

public class Hilo1 extends Thread{

    ClasePrincipal clasePrincipal;

    public Hilo1(ClasePrincipal clasePrincipal){
        this.clasePrincipal = clasePrincipal;
    }

    @Override
    public void run() {
        Hilo1 h1;
         try{
            sleep(4000);
        }catch(InterruptedException e){
            System.out.println("Error en Hilo1: ");
            e.printStackTrace();
        }
        clasePrincipal.setNumAleatorio(clasePrincipal.op4y20());
    }
}