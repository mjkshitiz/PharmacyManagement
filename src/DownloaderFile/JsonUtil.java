/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloaderFile;

import java.io.File;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Kshitiz
 */
public class JsonUtil {
    
    public static void main(String[] args) {
        ObjectMapper mapper=new ObjectMapper();
        Json yd=null;
        
        String jsonData=" {\"name\": \"Kshitiz\", \"address\":\"Kathmandu\"} ";
        
        try{
           yd=mapper.readValue(new File("youtube.json"), Json.class);
        } catch (Exception e){
            System.out.println(yd);
        
        }
    }
    
}



