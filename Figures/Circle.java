package OOP.Figures;


public class Circle extends Shape implements Movable, Resizable {


    Circle(double x, double y, double size){
        super(x,y,size);
    }

    @Override
    public void moveForward() {
        y++;
        System.out.println("Circle moving forward");
    }

    @Override
    public void moveBackward() {
        y--;
        System.out.println("Circle moving backward");
    }

    @Override
    public void moveLeft() {
        x--;
        System.out.println("Circle moving left");
    }

    @Override
    public void moveRight() {
        x++;
        System.out.println("Circle moving right");
    }

    @Override
    public void increaseSize() {
        size++;
        System.out.println("Circle increasing size");
    }

    @Override
    public void decreaseSize() {
        size--;
        System.out.println("Circle decreasing size");
    }


}