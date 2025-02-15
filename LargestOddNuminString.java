public class LargestOddNuminString {
    public static void main(String[] args) {
        String str="13579";
       char largestnum='0';
       for(int i=0;i<str.length();i++){
        char currentchar=str.charAt(i);
        if((currentchar-'0')%2!=0 && currentchar>largestnum){
            largestnum=currentchar;
        }
       }
       if(largestnum=='0'){
System.out.println("No odd number found");
       }else{
        System.out.println("Largest odd number is :"+largestnum);
       }           
    }
}
