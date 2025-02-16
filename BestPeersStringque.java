public class BestPeersStringque {
    public static void main(String[] args) {
       String str="ABHIEP98043HKJDKJF83";
       StringBuilder sb=new StringBuilder();
       for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        if(Character.isLetter(ch)){
            sb.append(ch);
        }
       }
        System.out.println("The Reverse alphabets only :"+sb);
    }
}
