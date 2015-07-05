/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Jonathan
 */
public class JukeBox {
    private ArrayList<Song> songList = new ArrayList<Song>();
    
    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        
        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
        
    }
    
    void getSongs(){
        try{
            File file = new File("Songs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            String line = null;
            
            while((line = reader.readLine())!= null){
                addSong(line);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    void addSong(String s){
        String[] songDt = s.split("/");
        Song newSong = new Song(songDt[0], songDt[1], songDt[3]);
        songList.add(newSong);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}


class TitleCompare implements Comparator <Song>{
    public int compare(Song one, Song two){
        return one.getTitle().compareTo(two.getTitle());
    }
}

class ArtistCompare implements Comparator <Song>{
    public int compare(Song one, Song two){
        return one.getArtist().compareTo(two.getArtist());
    }
}
