package com.wipro.practice;
import java.util.Scanner;

public class ReduceString {
    static String reduceString(String input){
        String reduce_string="";
        if(input.length()%2==1){
            for(int i=1;i<input.length();i++)
                if(i%2==0)
                    reduce_string+=input.charAt(i);
        }
        else {
            for(int i=1;i<input.length();i++)
                if(i%2!=0)
                    reduce_string+=input.charAt(i);
        }
        return input.charAt(0)+""+reduce_string).toUpperCase();
    }
}
    //main() function is already written internally in the test engine.
