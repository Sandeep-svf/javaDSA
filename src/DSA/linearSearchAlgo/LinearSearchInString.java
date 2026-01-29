package DSA.linearSearchAlgo;

public class LinearSearchInString  {
    public static void main(String[] args) {
        String[] str={"aarav","sam","ram","krishna","pm"};
        String name = "ram";
        char target = 'x';
        System.out.println(searchChar(name,target));
        System.out.println("reverse string is:"+reverseString(name));
    }

    // search char in string
    private static boolean searchChar(String name, char target) {
        if(name.isEmpty()) return false;
        for (int i = 0; i < name.length(); i++) {
            if(target==name.charAt(i)) return true;
        }
        return false;
    }



    //reverse the string
    static String reverseString(String str){
        if(str.isEmpty()) return "String is empty";
        StringBuilder temp= new StringBuilder();
        for (int i =str.length()-1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return temp.toString();
    }


}
