package ru.netology.manager;

import ru.netology.domain.Film;

public class AfishaManager {
    private int amountFilms = 10;
    private Film[] poster = new Film[0];

    public AfishaManager() {
    }

    public AfishaManager(int amountFilms) {
        this.amountFilms = amountFilms;
    }


    public void addFilm(Film newFilm) {

        int lenght = poster.length + 1;
        Film[] tmp = new Film[lenght];
//        for (int i = 0; i < poster.length; i++) {
//            tmp[i] = poster[i];
//        }
        System.arraycopy(poster, 0, tmp, 0, poster.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = newFilm;
        poster = tmp;
    }

    public Film[] findLast() {
        Film[] film = findAll();
        int resultLength;
        if (amountFilms > film.length) {
            resultLength = film.length;
        } else {
            resultLength = amountFilms;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = film.length - i - 1;
            result[i] = film[index];
        }
        return result;
    }

    public Film[] findAll() {
        return poster;
    }
}
