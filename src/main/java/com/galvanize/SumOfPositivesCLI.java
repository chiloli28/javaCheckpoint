//import java.util.*;
package com.galvanize;

public class SumOfPositivesCLI
{
    public static void main(String[] args)
    {
        //Keeps track of my sum values
        int sum = 0;

        int i = 0;

        //for(int i = 0; i < args.length; i++)
        //As we go through the number inputs, ONLY add up positives values
        while(i < args.length)
        {
            if(Integer.parseInt(args[i]) > 0)
            {
                sum += Integer.parseInt(args[i]);
            }
            i++;
        }
        System.out.println("# => prints " + sum);
    }

}


