public class Palindrome {
public static void main(String[] args) {
    String str="racecar";
   boolean ispalindrome=true;
   for(int i=0;i<str.length();i++){
    if(str.charAt(i)!=str.charAt(str.length()-i-1)){
        ispalindrome=false;
        break;
    }
   }
   if(ispalindrome){
    System.out.println("Palindrome");
   }else{
    System.out.println("Not Palindrome");
   }
}
}