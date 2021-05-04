package string;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "abc";
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                System.out.print(false);
                break;
            }
        }
    }
}
