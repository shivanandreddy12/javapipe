package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public int calculator(int a,int b){
        return a+b;
    }
    public int substract(int a,int b){
        return a-b;
    }
    public static void main( String[] args )
    {
        App a=new App();
        System.out.println("Addition"+a.calculator(10,5));
         System.out.println("sub"+a.substract(10,5));
    }
}
