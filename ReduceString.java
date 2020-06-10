package com.wipro.practice;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class ReduceString {
    static String reduceString(String input){
        String reduce_string="";
        if(input.length()%2==1){
            for(int i=1;i<input.length();i++)
                if(i%2==0)
                    reduce_string+=input.charAt(i);
        }else {
            for(int i=1;i<input.length();i++)
                if(i%2!=0)
                    reduce_string+=input.charAt(i);
        }
        System.out.println((input.charAt(0)+""+reduce_string).toUpperCase());
        return null;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        reduceString(input1);
    }
}
