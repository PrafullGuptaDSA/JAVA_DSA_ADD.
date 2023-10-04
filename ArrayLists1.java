import java.util.ArrayList;
import java.util.*;
import javafx.beans.binding.IntegerBinding;
import javafx.print.Collation;

class ArrayLists1{
    public static void main(String[] args) {
        // Integer Float String
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> list2=new ArrayList<String>();

        //add elements
        list.add(9);
        list.add(1);
        list.add(7);
        System.out.println(list);

        //get
        int element=list.get(0);
        System.out.println(element);

        //to add element in between
        list.add(1,1);
        System.out.println(list);

        //set update a element
        list.set(2,2);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        //sort
        Collections.sort(list);
        System.out.println(list);
    }

}