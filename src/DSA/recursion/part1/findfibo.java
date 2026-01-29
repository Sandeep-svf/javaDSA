package DSA.recursion.part1;

public class findfibo {

    public static void main(String[] args) {

        /***
         int ans = fino(50);      exponential time complexity

         Resursin tree evaluating many same tree again and agian ..

         e.g. for n = 4 tree graph will be

                    F(4)
                /         \
              F(3)        F(2)
            /    \       /    \
         F(2)   F(1)   F(1)   F(0)
            /    \
         F(1)   F(0)

         note: here evaluating f(1) two time and for n = 50 it will come more.
         so evaluating execution time will be exponential.



         */
        int ans = fino(10);
        System.out.println("fino is :" +ans);
    }

    static int fino(int number){
        if(number<2){
            return number;
        }

        return  fino(number-1) + fino(number-2);
    }
}
