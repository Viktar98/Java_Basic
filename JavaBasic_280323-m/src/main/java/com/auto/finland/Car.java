package com.auto.finland;

public class Car {

    //переменные экземпляра класса
    public double power;
    public int year = 2021;
    public String fabric;

    //статические переменная
    public static int histYear = 1993;

    //локальные переменные
    public void printParametrs (){
      String result = "Auto is " + fabric + " ," + year + " year.";
        System.out.println(result);
    }



}
