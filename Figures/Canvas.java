package OOP.Figures;

import java.util.ArrayList;
import java.util.List;

import OOP.transport.Vehicle;

public class Canvas<T extends Circle, Square> {
    private String name;
    private List<Shape> figures;

    Canvas(String name, int initialCapacity){
        this.name = name;
        this.figures = new ArrayList<>(initialCapacity);
    }
    void addShape(Shape newShape){
        figures.add(newShape);
    }

    void removeShape(int index){
        if (index > 0 && index < figures.size()) 
            figures.remove(index);
    }
    private void move(int index,String direction) {
        switch (direction) {
            case "forward":
                Shape[index].moveForward();
                break;
            case "backward":
                movable.moveBackward();
                break;
            case "left":
                movable.moveLeft();
                break;
            case "right":
                movable.moveRight();
                break;
            default:
                System.out.println("Неизвестное направление движения.");
        }

    void <T>drawAll(String direction){
        for (Shape shape : figures) {
            move(shape, direction);
        }
    }

    void moveAll(Movable movable){
        for (Shape shape : figures) {
            shape.Movable();
        }
    }

resizeAll() - для изменения размера всех фигур

}
