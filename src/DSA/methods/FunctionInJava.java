package DSA.methods;

public class FunctionInJava {
    public static void main(String[] args) {
        //function-> block of code.

        //question -> take two integer and add it.
        //save from dry formate.dry(Don't repete yourself)
        System.out.println(sum(2,3));
        System.out.println(sum(50,50));


    }
    private static int sum(int a,int b){
        int sum=0;
        sum = a+b;
        return sum;
        //System.out.println("this will not reachable");
    }
}
