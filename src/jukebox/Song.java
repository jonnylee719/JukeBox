/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox;

import java.util.Comparator;

/**
 *
 * @author Jonathan
 */
public class Song implements Comparable<Song>{
    private String artist;
    private String title;
    private String albumTitle;
    
    //this is what it will print if you just print Song object.
    public String toString(){
        return title;
    }
    
    public boolean equals(Object aSong){
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }
    
    public int hashCode(){
        return title.hashCode();
    }
    
    public Song(String s, String s1, String s2){
        artist = s;
        title = s1;
        albumTitle = s2;
    }
    
    public String getArtist(){
        return artist;
    }
    public void setArtist(String s){
        artist = s;
    }
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String s){
        title = s;
    }
    
    public String getAlbumTitle(){
        return albumTitle;
    }
    public void setAlbumTitle(String s){
        albumTitle = s;
    }
    
    public int compareTo(Song s){
        return title.compareTo(s.getTitle());
    }
}
