package ru.innopolis.homework01;

public class Main {
    String res; // строковая переменная

    public static void main(String[] args) {
        Main[] Game = new Main[3];
        int z;
        Game[0] = new Main(); // создаем 3 объекта и присваиваем их элементам массива
        Game[1] = new Main();
        Game[2] = new Main();
        Game[0].res = "Камень"; // получаем доступ к переменной res
        Game[1].res = "Ножницы";
        Game[2].res = "Бумага";
        int x;
        int y;

        x = (int) (Math.random() * 3); // случайный выбор от 0 до 2 для Васи
        y = (int) (Math.random() * 3); // случайный выбор от 0 до 2 для Пети
        System.out.println("Игра началась !");
        z = x;
        System.out.println("Вася выбросил " + Game[z].res); // вывод на экран случайного выброса Васи
        z = y;
        System.out.println("Петя выбросил " + Game[z].res); // вывод на экран случайного выброса Пети
        if (x == y) {
            System.out.println("Ничья, попробуйте заново !");
        }
           if (x == 2) {
               if (y == 0) {
                   System.out.println("Вася победил !");
               }
           }
           if (x == 1) {
               if (y == 2) {
                   System.out.println("Вася победил !");
               }
           }
           if (x == 0) {
                        if (y == 1) {
                            System.out.println("Вася победил !");
                        }
           }
           if (y==2) {
               if (x==0) {
                   System.out.println("Петя победил !");
               }
           }
        if (y==0) {
            if (x == 1) {
                System.out.println("Петя победил !");
            }
        }
        if (y==1) {
            if (x == 2) {
                System.out.println("Петя победил !");
            }
        }
                }
            }





