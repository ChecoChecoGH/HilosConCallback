package com.company;

public class Hilo2 extends Thread{
    ClasePrincipal clasePrincipal;

    public Hilo2(ClasePrincipal clasePrincipal){
        this.clasePrincipal = clasePrincipal;
    }

    @Override
    public void run(){
        long tInicio = System.currentTimeMillis();
        int i = 0;
        int max = 0;

        max = clasePrincipal.getNumAleatorio();
        for (i=1; i<=max; i++){
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long tFin = System.currentTimeMillis();
        clasePrincipal.setStringHilo2("He dado "+--i+" vueltas en el loop de Hilo2 y he tardado: "+((tFin - tInicio)/1000)%60+" segundos");
    }
}

