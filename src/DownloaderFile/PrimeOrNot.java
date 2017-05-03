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
public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int c=0,d=0;
        for(int i=1; i<=n; i++){
        if( n%i==0 )
            c++;
     
        }
        
        if(c>2)
                System.out.println("The number is not prime" );
        else
                System.out.println("The number is prime");
        
        
    }
    
}
