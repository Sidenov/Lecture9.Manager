package ru.netology.manager;

import ru.netology.domain.Films;

public class AfishaManager {
    private int amountFilms = 10;
    private Films[] poster = new Films[0];

    public AfishaManager() {
    }

    public AfishaManager(int amountFilms) {
        this.amountFilms = amountFilms;
    }


    public void addFilm(Films newFilm) {

        int lenght = poster.length + 1;
        Films[] tmp = new Films[lenght];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = newFilm;
        poster = tmp;
    }

    public Films[] getAll() {
        Films[] films = findAll();
        int resultLenght;
        if (amountFilms > 10) {
            resultLenght = 10;
        } else {
            resultLenght = amountFilms;
        }
        Films[] result = new Films[resultLenght];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public Films[] findAll() {
        return poster;
    }
}
