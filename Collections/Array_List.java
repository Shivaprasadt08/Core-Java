package Collections;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
    ArrayList li = new ArrayList();
    li.add(10);
    li.add(10.45d);
    li.add("Shivaprasad");
    li.add(15.25f);
    li.add('a');
    boolean x = li.contains("shivaprasad");
    System.out.println("Is string present in that list "+ x);
    System.out.println("Array list contains:"+ li);

    }

}
