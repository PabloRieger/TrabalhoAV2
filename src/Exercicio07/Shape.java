package Exercicio07;

abstract class Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void getArea();
    /*public abstract void toString();*/
}