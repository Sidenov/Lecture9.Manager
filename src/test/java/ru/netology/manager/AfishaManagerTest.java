package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    Films first = new Films("Бладшот");
    Films second = new Films("Вперед");
    Films third = new Films("Отель");
    Films fourth = new Films("Джентельмены");
    Films fifth = new Films("Человек-невидимка");
    Films sixth = new Films("Тролли");
    Films seventh = new Films("Номер один");
    Films eighth = new Films("Бэтмен");
    Films ninth = new Films("Зверопой 2");
    Films tenth = new Films("Человек-паук");
    Films eleventh = new Films("Человек-паук 2");

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

        Films[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        Films[] actual = manager.findAll();

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

        Films[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Films[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

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

        Films[] expected = {tenth, ninth, eighth, seventh, sixth};
        Films[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

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

        Films[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Films[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

}