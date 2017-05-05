/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloaderFile;

import java.io.FileOutputStream;

/**
 *
 * @author Kshitiz
 */
public class JavaFile {
    
    public static void main(String[] args) {
        
    try{
        FileOutputStream fos=new FileOutputStream("personal-info.txt");
        String s="Personal info"+
                "\n Name: Kshtiz Maharjan"+
                "\n Age: 22"+
                "\n Gender: Male"+
                "\n Phone: 9841394097"+
                "\n Email: kshitizmaharjan@gmail.com";
        
        byte[] b=s.getBytes(); // changing the s to bytes
        fos.write(b);
        fos.close();
            System.out.println("File write is successful");

}catch(Exception e){
    
            System.out.println("error: "+e);


}
    }
    
}
