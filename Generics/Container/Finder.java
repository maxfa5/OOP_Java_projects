package OOP.Generics.Container;
import java.util.List;

public class Finder {
    public static <T> int find(List<? extends Container<?>> containers, T target){
        int result = -1;
        for (int i=0; i < containers.size();i++) {

            if (containers.get(i).getItem().equals(target)) {
                result = i;
                break;
            }
        }
        return result;
    }  
}
