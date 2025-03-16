package OOP.furniture;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Shop {
    Map<Furniture, Integer> catalog_;
    public  Shop(){
        catalog_ = new HashMap<>();
    }
    
    public void assortment(){
        for (Furniture elem : catalog_.keySet()) {
            System.out.printf("name:%s\n", elem.getName_());
        }
    }

    public void addFurniture(Furniture newObj){
        if (catalog_.containsKey(newObj)==true) {
            int count = catalog_.get(newObj);
            catalog_.put(newObj, count + 1);
        }else{
            catalog_.put(newObj, 1);
        }

    }

    public boolean removeFurnitureByObj(Furniture Obj){
        if (Obj == null) {
            return false;
        }
        boolean res = true;
        if (catalog_.get(Obj) > 0) {
            int count = catalog_.get(Obj);
            catalog_.put(Obj, count - 1);
        }else{
            res = false;
        }
        if (catalog_.get(Obj) == 0) {
            catalog_.remove(Obj);
        }
        return res;
    }
    public boolean removeAllFurnitureByObj(Furniture Obj){
        if (Obj == null) {
            return false;
        }
        catalog_.remove(Obj);
        return true;
    }

    public double allPrices(){
        double res = 0;
        for (Furniture furniture : catalog_.keySet()) {
            res += (furniture.getPrice()*catalog_.get(furniture));
        }
        return res;
    }
}
