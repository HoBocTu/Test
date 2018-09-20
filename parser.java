package com.parser;

import java.util.*;

public class parser
{
      public static void main(String args[])
      {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            printType(n);
            System.out.println(toBinaryString(n));
      }
      private static String toBinaryString(int i){
            String ans = "";
            int ci = i;
            int sign = ( ci < 0 )? -1: 1;
            ci*= sign;
            i*= sign;
            int res = 0;
            String bit;

            while (i > 0){
                  i >>= 1;
                  res++;
            }
            while ( --res >= 0 ){
                  bit = ((( ci & (1 << res)) == 0)) ? "0" : "1";
                  ans += bit;
            }
            return ( sign > 0 )? "0" + ans : "1" + ans;
      }
      private static void printType(long n){
            if (-129 < n < 128)
                  System.out.print("byte ");
            else if(-32769 < n < 32768)
                  System.out.print("short ");
            else if(-2147483649l < n < 2147483648l)
                  System.out.print("int ");
            else
                  System.out.print("long ");
            System.out.print("\n");
      }
}
