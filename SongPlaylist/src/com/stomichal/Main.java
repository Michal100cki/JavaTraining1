package com.stomichal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Album album1=new Album("Pierwszy");
        Album album2=new Album("Drugi");

        album1.addSongToAlbum(Song.createSong("Jesień",45));
        album1.addSongToAlbum(Song.createSong("Wiosna",30));
        album2.addSongToAlbum(Song.createSong("Marzec",50));
        album2.addSongToAlbum(Song.createSong("Luty",15));

        System.out.println(album1.getName()+" pierwszy utwór "+album1.getAlbumListOfSongs().get(0).getSongName());

    }
}
