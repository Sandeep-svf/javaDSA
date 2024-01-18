package kunalDSA.array_arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // can't use primitive data here... like ArrayList<int>
        // have to use wrapper classes... like ArrayList<Integer>

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

       /* list.add(90);
        list.add(89);
        list.set(0,99);
        list.remove(0);
        list.get(0);

        System.out.println(list.contains(87));
        System.out.println(list);*/

        /*ArrayList<Objects> allObj = new ArrayList<>();
        ColNoFix colNoFix = new ColNoFix();
        allObj.add(colNoFix);*/

        // add
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //output
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");// pass index here. list[index] syntax will not work here...
        }


        // how arraylist work internally.......
        // size is fixed internally...
        /* if array fixed some amount
        * it will create new list and double size.\
        * copy element form old list in to new created list
        * old one is deleted...
        * and go so on.....
        * */

        // Time complexity -> Amortised o(1)







    }
}
