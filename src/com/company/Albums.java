package com.company;

import java.util.ArrayList;
import java.util.List;

public class Albums {
    private final List<Album> albums;

    public Albums() {
        albums = new ArrayList<>();
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void add(Album album) {
        this.albums.add(album);
    }

    public void remove(Album album) {
        this.albums.remove(album);
    }

    @Override
    public String toString() {
        return "Albums{" + albums + "," + "}";
    }

    public Albums findGreater1000() {
        Albums temp = new Albums();
        for (Album album : this.albums) {
            if (album.getEdition() > 10000)
                temp.add(album);
        }
        return temp;
    }

    public void fillRandom(int n) {
        for (int j = 0; j < n; j++) {
            albums.add(Album.generate());
        }
    }
}
