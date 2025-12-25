package com.company;
import java.util.Scanner; 
public class CWH_05_TakingInpu {
    public static void main(String[] args) {
        System.out.println("Calculating Percentage Marks of Student");
        Scanner sc=new Scanner(System.in);// making new class 
        System.out.println("Enter Marks of Math");
        float a= sc.nextFloat(); 
        System.out.println("Enter Marks in English "); 
        float b=sc.nextFloat(); 
        System.out.println("Enter Marks in Biology");
        float c=sc.nextFloat();
        System.out.println("Enter Marks in Physics");
        float d=sc.nextFloat();
        System.out.println("Enter Marks in Chemistry");
        float e=sc.nextFloat(); 
        
        float sum=a+b+c+d+e;
        float percentage=(sum/500)*100;
        System.out.println("Percentage of Marks :");
        System.out.print(percentage);
        System.out.print("%");
        System.out.println("this is your code");
    }

