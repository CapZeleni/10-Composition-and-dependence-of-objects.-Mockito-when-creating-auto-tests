package org.example;

public class Manager {

    private String[] movies = new String[0];
    private int Limit;

    public Manager() {
        Limit = 10;
    }

    public Manager(int limit) {
        Limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public String[] findAll() {
        return movies;
    }
    public String[] findLast() {
        String[] result = new String[Limit];
        for (int i = 0; i < Limit; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }


}