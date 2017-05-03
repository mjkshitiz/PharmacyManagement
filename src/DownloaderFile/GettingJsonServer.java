/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloaderFile;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Kshitiz
 */
public class GettingJsonServer {
    public static void main(String[] args) {
        try{
        String url="https://www.googleapis.com/youtube/v3/videos?id=SpAsaA9TARQ&part=snippet&key=AIzaSyCw5umNiPJc-VTgrOxBoupDf3IvBJJmFn4";
        URL website= new URL(url);
        HttpURLConnection con=(HttpURLConnection) website.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        
        // checking whether a server accepts our request or not
            System.out.println(con.getResponseCode());
            
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            String inputLine;
            FileWriter fw=new FileWriter("youtube.json");
            while((inputLine=in.readLine())!=null){
                fw.write(inputLine);
                System.out.println(inputLine);
            
            }
            in.close();
            fw.close();
            
        }catch(Exception e){
        
        }
    }
    
}
