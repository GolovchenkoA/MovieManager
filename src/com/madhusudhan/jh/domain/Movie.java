package com.madhusudhan.jh.domain;

/**
 * Created by головченко on 15.05.2016.
 */
public class Movie {
    private int id;
    private String title = "notitle";
    private String director;
    private String synopsis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (id != movie.id) return false;
        if (director != null ? !director.equals(movie.director) : movie.director != null) return false;
        if (synopsis != null ? !synopsis.equals(movie.synopsis) : movie.synopsis != null) return false;
        if (title != null ? !title.equals(movie.title) : movie.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (synopsis != null ? synopsis.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        //return super.toString();
        return getId() + "," + getTitle() + "," + getDirector() + "," + getSynopsis();
    }
}
