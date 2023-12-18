package ru.innopolis.homework03;

public class App {
    public static void main(String[] args) {
    televisor Sony = new televisor();
        Sony.setColor("black");
        Sony.setName("Sony");
        Sony.setDiag(19);
        System.out.println(Sony);
        System.out.println(Sony.chanell()); // Канал

    televisor Sharp = new televisor("Sharp", 24,"white");

        System.out.println(Sharp);
       System.out.println(Sharp.chanell());  // Канал

    }
}
