package OOP.Figures;


public class Square extends Shape implements Movable,  Resizable {
    Square(double x, double y, double size){
        super(x,y,size);
    }

   @Override
    public void moveForward() {
        y++;
        System.out.println("Square moving forward");
    }

    @Override
    public void moveBackward() {
        y--;
        System.out.println("Square moving backward");
    }

    @Override
    public void moveLeft() {
        x--;
        System.out.println("Square moving left");
    }

    @Override
    public void moveRight() {
        x++;
        System.out.println("Square moving right");
    }

    @Override
    public void increaseSize() {
        size++;
        System.out.println("Square increasing size");
    }

    @Override
    public void decreaseSize() {
        size--;
        System.out.println("Square decreasing size");
    }


}