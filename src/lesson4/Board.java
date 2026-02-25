package lesson3;


public class Board {
    private double l; // length
    private double w; // width
    private String color; // color

    public Board(double length, double width, String color) {
        l = length;
        w = width;
        this.color = color;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Board(double length, double width) {
        l = length;
        w = width;
    }

    public Board() {
        l = 0;
        w = 0;
        color = null;
    }

    public double area() {
        return l * w;
    }

    public double getPerimeter() {
        return 2 * (l + w);
    }

    public void dislay() {
        System.out.println("Length = " + l + "\n Width = " + w + "\n Color=" + color);
    }
}
