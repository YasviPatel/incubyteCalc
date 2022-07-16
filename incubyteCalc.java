package calculator;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.io.BufferedInputStream;

class Calculaotr{

    //constructor
    public Calculator(){

    }
    public void myCalc(String str){
        int ans=0;
        if(str.contains('-')){
           ans=-1;
           System.out.println("Enter only positive numbers ");
        }else if(str.contains(',')){
            String[] str1=in.split(',');
            for(String str2:str1){
                int a=integer.parseInt(str2);
                ans+=a;
            }
        }else if(!str.contains(',')){
            ans=Integer.parseInt(str);
        }
        if(ans!=-1){
            System.out.println("Addition is "+ans);
        }
    }
}

public class MainCalculator{
    public static void main(String args[]){
           Calculaotr c=new Calculaotr();
           Scanner sc=new Scanner(new BufferedInputStream(System.in));
           System.out.println("Enter input string ");
           String str=sc.nextLine();
           c.myCalc(str);
    }
}