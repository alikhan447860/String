public class ReverseWordonOriginal {
    public static void main(String[] args) {
        String str="Hello You";
        String words[]=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String temp=new StringBuilder(words[i]).reverse().toString();
            sb.append(temp);
            sb.append(" ");
        }
        System.out.println("The Reverse words in the original order:"+sb);
    }
}
