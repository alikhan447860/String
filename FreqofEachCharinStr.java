import java.util.*;
public class FreqofEachCharinStr {
public static void main(String[] args) {
    String str="Hello world";
    HashMap<Character,Integer>FreeMap=new HashMap<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(FreeMap.containsKey(ch)){
            FreeMap.put(ch, FreeMap.get(ch)+1);
        }else{
            FreeMap.put(ch, 1);
        }
    }
    for(char ch:FreeMap.keySet()){
        System.out.println(ch+" : "+FreeMap.get(ch));
    }
}
}