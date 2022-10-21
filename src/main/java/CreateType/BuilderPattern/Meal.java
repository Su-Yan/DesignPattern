package CreateType.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private ArrayList<Item> items = new ArrayList<>();

    public List getItemsList(){
        return items;
    }

    public void addItems(Item item){
        items.add(item);
    }

    public float getCost(){
        float cnt=0;
        for (Item i :
                items) {
            cnt+=i.price();
        }
        System.out.println("商品总价为："+cnt);
        return cnt;
    }

    public void showItems(){
        for (Item i :
                items) {
            System.out.println(i.name()+"   "+ i.packing().pack()+"  "+i.price());
        }
    }
}
