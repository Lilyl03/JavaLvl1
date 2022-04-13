package com.aca.homework.week11.hash;

public class Song {
    private Singer singer;
    private String name;
    private long duration;
    private float rating;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (duration != song.duration) return false;
        if (Float.compare(song.rating, rating) != 0) return false;
        if (singer != null ? !singer.equals(song.singer) : song.singer != null) return false;
        return name != null ? name.equals(song.name) : song.name == null;
    }

    @Override
    public int hashCode() {
        int result = singer != null ? singer.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (duration);
        result = 31 * result + (int)(rating);
        return result;
    }
}
