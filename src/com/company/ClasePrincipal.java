package com.company;

import java.util.Random;

public class ClasePrincipal {

    private Integer result;
    private String StringHilo2;

    public ClasePrincipal(){

        Hilo1 h1 = new Hilo1(this);
        h1.start();
        try{
            h1.join();
        }catch(InterruptedException e){
            System.out.println("Error en join() Hilo1: ");
            e.printStackTrace();
        }

        Hilo2 h2 = new Hilo2(this);
        h2.start();
        try{
            h2.join();
        }catch(InterruptedException e){
            System.out.println("Error en join() Hilo2: ");
            e.printStackTrace();
        }

        System.out.println(getStringHilo2());

    }

    public void setNumAleatorio(Integer result1){
        this.result = result1;
    }

    public int getNumAleatorio(){
        return result;
    }

    public void setStringHilo2(String StringHilo2){
        this.StringHilo2 = StringHilo2;
    }

    public String getStringHilo2(){
        return StringHilo2;
    }

    public int op4y20(){
        Random r = new Random();
        return r.nextInt(20-4)+4;
    }
}