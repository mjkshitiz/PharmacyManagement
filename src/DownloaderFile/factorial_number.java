/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloaderFile;

import java.util.Scanner;

/**
 *
 * @author Kshitiz
 */
public class factorial_number {
    
    public static void main(String[] args) {
        System.out.println("Enter a Number \n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
        
    }
    
    static int fact(int n)
    {
      int result;
      if(n==0 || n==1)
          return 1;
      
      result=fact(n-1)*n;
      return result;
      
    
    }
    
}
