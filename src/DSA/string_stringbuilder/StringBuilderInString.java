package DSA.string_stringbuilder;

public class StringBuilderInString {
    public static void main(String[] args) {
        // it will only one object made and change is done in that object only
        // this is mutable.
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch); //it will not create new obj every time. will change in existing obj only.
        }
        System.out.print(builder);
        builder.deleteCharAt(0);
        System.out.print(builder);
    }
}
