package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    Film first = new Film("Бладшот");
    Film second = new Film("Вперед");
    Film third = new Film("Отель");
    Film fourth = new Film("Джентельмены");
    Film fifth = new Film("Человек-невидимка");
    Film sixth = new Film("Тролли");
    Film seventh = new Film("Номер один");
    Film eighth = new Film("Бэтмен");
    Film ninth = new Film("Зверопой 2");
    Film tenth = new Film("Человек-паук");
    Film eleventh = new Film("Человек-паук 2");

    @Test
    void addNewFilm() {

        AfishaManager manager = new AfishaManager();

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getAll() {

        AfishaManager manager = new AfishaManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);

        Film[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Film[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    // Тест если задано вывести меньше чем 10 фильмов
    @Test
    void getAllIf5Films() {

        AfishaManager manager = new AfishaManager(5);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] expected = {tenth, ninth, eighth, seventh, sixth};
        Film[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    // Тест если задано вывести больше чем 10 фильмов
    @Test
    void getAllIf11Films() {

        AfishaManager manager = new AfishaManager(11);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);

        Film[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}