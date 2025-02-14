public class ReverseWordsinString {
    public static void main(String[] args) {
        String str="This is a very good game";
       String word[]=str.split(" ");
       StringBuffer sb=new StringBuffer();
       for(int i=word.length-1;i>=0;i--){
        sb.append(word[i]);
        sb.append(" ");
       }
        System.out.println("Original String : "+str);
        System.out.println("New String :"+sb);
    }
}
