public class MaximumnestingDepth {
    public static void main(String[] args) {
        String str="(1+(2*3)+((8)/4))+1";
       int maxdepth=0,currentdepth=0;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='('){
            currentdepth++;
      maxdepth= Math.max(maxdepth,currentdepth);
        }else if (str.charAt(i)==')'){
            currentdepth--;   
        }
       }
       System.out.println("The maximum nesting depth is :"+maxdepth);
        }
    }

