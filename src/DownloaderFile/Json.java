/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloaderFile;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kshitiz
 */
public class Json {
    
    //Getter and Setter for Json
    String kind;
     ArrayList pageInfo;
    HashMap <String, String> items;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ArrayList getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ArrayList pageInfo) {
        this.pageInfo = pageInfo;
    }

    public HashMap<String, String> getItems() {
        return items;
    }

    public void setItems(HashMap<String, String> items) {
        this.items = items;
    }
    

}
