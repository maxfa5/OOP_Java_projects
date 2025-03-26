package OOP.Generics.Container;

public class Container<T> {
    private T item;
    Container(T item){
        this.item = item;
    }
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}
