package OOP.Figures;

import java.awt.Shape;

public class AppTest {
        public static void main(String[] args) {
            Canvas testC = new Canvas("a", 10);
            Circle circle1 = new Circle(0,0,1);
            Square square1 = new Square(0,0,1);
            testC.addShape(square1);
            testC.addShape(circle1);
            testC.moveAll("forward");
            testC.drawAll();
            testC.moveAll("backward");
            testC.resizeAll(1);
            testC.drawAll();
            try {
                Circle circle2 = new Circle(0,0,0);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            try {
                testC.removeShape(-100);
                System.out.println("succ");
            } catch (IllegalAccessError e) {
                System.out.println(e.getMessage());
            }
            testC.removeShape(1);
            testC.drawAll();
        }
    }