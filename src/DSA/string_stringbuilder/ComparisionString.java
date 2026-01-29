package DSA.string_stringbuilder;

public class ComparisionString {
    public static void main(String[] args) {
        //proof ref point to the same object of they are same...

        String a = "ram";
        String b= "ram";
        System.out.println(a==b);   //print -> true

        a="radha";
        System.out.println(a==b);//print-> false

        //two-way we can compare
        // == -> checks if ref variable are pointing to the same object.


        // how to create different object for the same value in the string pool.
        //note-> it will create obj outside the string pool but in the heap memory.
        String name1 = new String ("abc");
        String name2 = new String ("abc");

        System.out.println(name1==name2);   //output-> false

        //note-> for check value use .equal method.
        System.out.println(name1.equals(name2));

        // find char in string by its index...
        // internally it working like array only.
        System.out.println(name1.charAt(0));


    }
}
