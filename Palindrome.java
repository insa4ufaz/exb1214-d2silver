public class Palindrome{
    public static boolean is_palindrome(String s)
    {
        // add your code here
        for(int i=0; i<s.length()/2; ++i){
          if(s.charAt(i) != s.charAt(s.length()-1-i)){
            return false;
          }
        }
        return true;
    }
}
