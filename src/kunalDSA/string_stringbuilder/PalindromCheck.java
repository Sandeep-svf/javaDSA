package kunalDSA.string_stringbuilder;

public class PalindromCheck {
    public static void main(String[] args) {
        // read form left to right or read from right to left it should be same.
        System.out.println(check_palindrome("a"));
    }

    private static boolean check_palindrome(String str) {
        if(str==null|| str.length()==0){
            return false;
        }

        str = str.toLowerCase();
        for (int index = 0; index <= str.length()/2; index++) {
            char start = str.charAt(index);
            char end = str.charAt(str.length()-1-index);
            if(start!=end) return false;
        }
        return true;
    }
}
