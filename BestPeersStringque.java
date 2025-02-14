public class BestPeersStringque {
    public static void main(String[] args) {
        String input="ADBCR34098SH8L";
        StringBuilder sb=new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            char c=input.charAt(i);
            if(Character.isLetter(c)){
                sb.append(c);
            }
        }
        System.out.println("The Reverse alphabets only :"+sb);
    }
}
