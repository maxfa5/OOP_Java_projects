package OOP.Figures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Shape implements Drawable {
    protected double x;
    protected double y;
    protected double size;
    public Shape(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }
    @Override
    public String draw() {
        return "Рисование на координатах: " + String.format("%.2f, %.2f c размером %.2f", x, y, size);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
   @Override
   public String getInfo(){
    return "Класс Формы(родителский клас для круга и квадрата)";
   }

}