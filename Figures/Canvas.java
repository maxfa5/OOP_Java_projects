package OOP.Figures;

import OOP.Figures.Shape;
import java.util.ArrayList;
import java.util.List;


public class Canvas {
    private String name;
    private List<Shape> figures;

    Canvas(String name, int initialCapacity){
        this.name = name;
        this.figures = new ArrayList<>(initialCapacity);
    }
    
    public void addShape(Shape shape) {
        figures.add(shape);
    }

    void removeShape(int index) throws IllegalAccessError{
        if (index >= 0 && index < figures.size()) 
            figures.remove(index);
        else{
            throw new IllegalAccessError("incorect index!"); 
        }
    }

    private<T extends Movable > void moveParser(T shape, String direction) {
        switch (direction) {
            case "forward":
                shape.moveForward();
                break;
            case "backward":
                shape.moveBackward();
                break;
            case "left":
                shape.moveLeft();
                break;
            case "right":
                shape.moveRight();
                break;
            default:
                System.out.println("Неизвестное направление движения.");
        }
    }
    

    void drawAll(){
        for (Shape shape : figures) {
            System.out.println(shape.draw());
            
        }
    }

    void moveAll(String direction){
        for (Shape shape : figures) {
            if (shape instanceof Movable) {
                moveParser((Movable)shape, direction);
            }
        }
    }
    
    void resizeAll(int is_increase){
        for (Shape shape : figures) {
            if (shape instanceof Resizable) {
                if(is_increase == 1){
                    ((Resizable) shape).increaseSize();
                }else if(is_increase == 0){
                    ((Resizable) shape).decreaseSize();
                }else{
                    throw new IllegalArgumentException("Invalid value for is_increase. Must be 0 or 1.");        }
                }   
            }
        }
}
