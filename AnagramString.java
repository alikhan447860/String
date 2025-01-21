import java.util.*;
public class AnagramString {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
if(s1.length()!=s2.length()){
System.out.println("Not a anagram string");
    return;
}
char arr[]=s1.toCharArray();
char arr2[]=s2.toCharArray();
Arrays.sort(arr);
Arrays.sort(arr2);
if(Arrays.equals(arr, arr2)){
    System.out.println("The String is anagram of each other ");
}else{
    System.out.println("The string is not an anagram of each other");
}
    }
}
