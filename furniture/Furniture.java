package OOP.furniture;

abstract public class Furniture {
    private String name_;
    private String color_;
    private int width_;
    private double rating_;
    private double price_;
    private String material_;

    public Furniture(String name, String color, int width, double rating, String material, double price ) {
        name_ = name;
        color_ = color;
        width_ = width;
        rating_ = rating;
        material_ = material;
        price_ = price;
    }

    void appedRating(double newRating){
        rating_ =(rating_+ newRating)/2;
    }

    public void setColor(String color_) {
        this.color_ = color_;
    }
    public double getPrice() {
        return price_;
    }
    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getColor_() {
        return color_;
    }

    public void setColor_(String color_) {
        this.color_ = color_;
    }

    public int getWidth_() {
        return width_;
    }

    public void setWidth_(int width_) {
        this.width_ = width_;
    }

    public double getRating_() {
        return rating_;
    }

    public void setRating_(int rating_) {
        this.rating_ = rating_;
    }

    public double getPrice_() {
        return price_;
    }

    public void setPrice_(double price_) {
        this.price_ = price_;
    }

    public String getMaterial_() {
        return material_;
    }

    public void setMaterial_(String material_) {
        this.material_ = material_;
    }

    void info() {
        System.out.println("Name: " + name_);
        System.out.println("Color: " + color_);
        System.out.println("Width: " + width_);
        System.out.println("Rating: " + rating_);
        System.out.println("Material: " + material_);
    }

}

class Table extends Furniture {
    private int numberOfLegs_;
    private double sqare_;

    double sqaremultiply(double mult){
        sqare_*= mult;
        return sqare_;
    }
    public Table(String name, String color, int width, int rating, String material, int numberOfLegs, double sqare, double price) {
        super(name, color, width, rating, material,  price);  
        numberOfLegs_ = numberOfLegs;
        sqare_ = sqare;
    }
    
}

class Chair extends Furniture {
    private int numberOfLegs_;
    private boolean hasBackrest_;
    void sawingLeg(){
        numberOfLegs_--;
    }
    void addLeg(){
        numberOfLegs_++;
    }
    public void setHasBackrest(boolean hasBackrest) {
        this.hasBackrest_ = hasBackrest;
    }
    public boolean hasBackrest() {
        return hasBackrest_;
    }
    public Chair(String name, String color, int width, int rating, String material, int numberOfLegs, double price, boolean hasBackrest) {
        super(name, color, width, rating, material, price); 
        numberOfLegs_ = numberOfLegs;
        hasBackrest_ = hasBackrest;
    }
}

