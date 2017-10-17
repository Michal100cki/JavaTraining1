package com.stomichal;

public class Song {
    private String songName="";
    private int duration =0;
    //=Duration.ofSeconds(0);


    public Song(String songName, int duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public int getDuration() {
        return duration;
    }

    public static Song createSong(String songName, int duration){
        return new Song(songName,duration);
    }
}
