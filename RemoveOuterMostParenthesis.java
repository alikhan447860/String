public class RemoveOuterMostParenthesis{
    public static void main(String[]args){
        String s = "(()())(())";
       int count=0;
       StringBuilder sb=new StringBuilder();
         for(char c:s.toCharArray()){
              if(c=='('){
                if(count>0){
                     sb.append(c);
                }
                count++;
            }else{        
        count--;
        if(count>0){
            sb.append(c);
        }
     }
   }
       System.out.println(sb.toString());
 }
 }
