import java.util.*;
public class FreqofEachCharinStr {
public static void main(String[] args) {
    String str="Hello You";
    HashMap<Character,Integer>countMap=new HashMap<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(countMap.containsKey(ch)){
            countMap.put(ch, countMap.get(ch)+1);
        }else{
            countMap.put(ch, 1);
        }
    }
    for(char ch:countMap.keySet()){
        System.out.println(ch+" : "+countMap.get(ch));
    }
}
}