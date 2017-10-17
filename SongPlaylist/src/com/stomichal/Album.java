package com.stomichal;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> albumListOfSongs;

    public Album(String name) {
        this.name = name;
        this.albumListOfSongs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getAlbumListOfSongs() {
        return albumListOfSongs;
    }

    public void addSongToAlbum(Song song){
        albumListOfSongs.add(song);
    }
}
