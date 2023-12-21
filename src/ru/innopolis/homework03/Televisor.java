package ru.innopolis.homework03;
class Televisor {
    private String name;
    private int diag;
    private String color;
    public String chanell() {
        String [] chanellList = {"Россия", "Первый канал", "В мире животных", "Спорт", "Кино"};
        int oneList = chanellList.length;
        int chanell = (int) (Math.random() * oneList);
        String ch = chanellList [chanell];
        return "на Телевизоре " + getName() + " включен канал: " + ch;
    }
    public Televisor(){
    }
public Televisor(String name, int diag, String color){
        this.name = name;
        this.diag = diag;
        this.color = color;
}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDiag(int diag) {
        this.diag = diag;
    }
      public void setColor(String color) {
        this.color = color;
    }


    public String toString(){
        return "\nТелевизор c параметрами:\n"
                + this.name +  " - Модель;\n"
                + this.diag + " - Диагональ;\n"
                + this.color + " - Цвет;" ;
    }
}


