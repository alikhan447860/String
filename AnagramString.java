import java.util.*;
public class AnagramString {
    public static void main(String[] args) {
     String s1 = "listen";
     String s2="silent";
     if(s1.length()!=s2.length()){
         System.out.println("Not Anagram");
         return;
     }
     char arr[]=s1.toCharArray();
     char arr1[]=s2.toCharArray();
     Arrays.sort(arr);
     Arrays.sort(arr1);
     if(Arrays.equals(arr,arr1)){
        System.out.println("Anagram of each other");
     }else{
        System.out.println("Not Anagram of each other");
     }
    }
}
