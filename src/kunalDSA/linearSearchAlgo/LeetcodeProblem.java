package kunalDSA.linearSearchAlgo;

public class LeetcodeProblem {

    // given and array of nums of integer how many of them contains even number of digits.
    public static void main(String[] args) {
        int[] arr ={12,37,6,77,898,4567};
        System.out.println(find_even_digits_of_element(arr));
    }

    private static int find_even_digits_of_element(int[] arr) {
        int count =0;
        for (int index = 0; index < arr.length; index++) {
            int temp2 = countDigits(arr[index]);
            if(temp2%2==0){
                count++;
                System.out.println(count+" "+temp2);
            }

        }
        return count;
    }

    // Method to count the number of digits in an integer
    private static int countDigits(int n) {
        // Handling negative numbers by taking absolute value
        n = Math.abs(n);
        // Counting digits using logarithm
        return (int) Math.log10(n) + 1;
    }
}
