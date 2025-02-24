public class RotationofEachotherStr {
    public static void main(String[] args) {
      String s1="ABCD";
      String s2="CDAB";
      if(s1.length()!=s2.length()){
          System.out.println("Not a Rotation of Each other");
          return;
      }
      String s3=s1+s1;
      if(s3.contains(s2)){
        System.out.println(" Rotation of each other");
      }else{
        System.out.println("Not Rotation of each other");
      }
    }
}
