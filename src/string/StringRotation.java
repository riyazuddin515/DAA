package string;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "ABACD";
        String str2 = "CDABA";

        String temp = str1 + str1;

        if(str1.length() == str2.length() && temp.contains(str2))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
