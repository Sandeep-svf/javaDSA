package kunalDSA.methods;

public class swap {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        swap(10,20);
        System.out.println(a+" "+b);
        String name = "aarav";
        chnage_name(name);
        System.out.println(name);
    }

    private static void chnage_name(String name) {
        name="sam";
    }

    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        // reason for not reflect swap in main method...
        // because passing only copy of reference variable here... which means value is being passed...
        // whenever change made then new object will be created here...



    }
}
