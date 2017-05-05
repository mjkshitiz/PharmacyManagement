/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloaderFile;

import java.io.File;

/**
 *
 * @author Kshitiz
 */
public class FileCopy {
    public static void main(String[] args) {
    try{
       java.io.FileReader fr=new java.io.FileReader("personal-info.txt");
       java.io.FileWriter fw=new java.io.FileWriter("kshitiz.txt");
       int i=0;
       while((i=fr.read())!=-1){
           System.out.print((char)i);
           fw.write(i);
           
       }
       fw.close();
       fr.close();
    }catch(Exception e){

    }
    }
}
