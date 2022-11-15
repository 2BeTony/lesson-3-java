package ru.elf;


//extends - homecat наследник супер-класса Cats
public class HomeCats extends Cats { // создали класс

    void sleepOnBed () { // создали метод (описание поведения объектов этого класса)
        System.out.println("Я " + name + " и мне очень гуд");
    }
    //пончик и муся разные объекты - поведение одно
}
