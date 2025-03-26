package OOP.Generics.Container;

import java.util.List;
import java.util.ArrayList;


public class Application {
    public static void main(String[] args) {
        Container<Integer> a = new Container<Integer>(10);

        Container<String> b = new Container<String>("ABBA");

        Container<Double> c = new Container<Double>(1.0001);
        List<Container<?>> Kuber = new ArrayList<>();
        Kuber.add(a);
        Kuber.add(b);
        Kuber.add(c);

        for (Container<?> container : Kuber) {
            System.out.println(container.getItem());
        }
        System.out.printf("\n\n");
        System.out.println(Finder.find(Kuber, "ABBA"));
        
        System.out.println(Finder.find(Kuber, 10));
        
        System.out.println(Finder.find(Kuber, 1.0001));
        
        System.out.println(Finder.find(Kuber, "p"));

    }
}
