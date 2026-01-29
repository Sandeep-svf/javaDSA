package DSA.string_stringbuilder;

public class PerformanceOfString {
    public static void main(String[] args) {
        String series ="";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            //System.out.print(ch);
            series = series+ch; // new string obj will be created every time...copy old one and appending new one.
        }
        System.out.println(series);
        //note -> if we add n character in string it will have complexity o(n power 2)
    }


    // solution-> a datatype which allow to modify  its value. which is Stirngbuilder.
    // it will only one object made and change is done in that object only


}
