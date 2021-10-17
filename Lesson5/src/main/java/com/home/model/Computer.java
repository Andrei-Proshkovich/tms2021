package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

        String processor;
        String operative;
         String hdd;
         boolean isBurned;

    public Computer(String processor, String operative, String hdd) {
        this.processor = processor;
        this.operative = operative;
        this.hdd = hdd;
        System.out.println(processor +" "+ operative +" "+ hdd+ " ");
    }





  public void on(){

            System.out.println("Внимание! Введите 0 или 1");
            Random r = new Random();

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            if (isBurned=false){

            if (a == r.nextInt(1)) {
            off();
            isBurned=false;
            }

            else if (a!= r.nextInt(1)){
                System.out.println("computer sgorel");
                isBurned=true;
                off();


            }

            else if (a>1){
                System.out.println("computer sgorel");
                off();
                isBurned =true;
            }


        }
            else {
                isBurned=true;
                System.out.println("computer sgorel");
            }
    }



    private  void off() {
        if(isBurned == true){
        System.out.println("computer off");

    }
        else {

        } System.out.println("computer off");
}}
/*- при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
        на консоль вывести сообщение (Внимание! Введите 0 или 1)
        создать экземпляр класса Random, который будет генерировать число 0 или 1.
        если введенное вами число совпадет с рандомным, то компьютер выключается, вызывается метод off().
        если введенное вами число не совпадет с рандомным, то компьютер сгорает.
        - при повторном включении компьютера, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"
        - выключить (off()) (аналогично включению)
        - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"**/