public class RotationofEachotherStr {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="dcba";
        if(s1.length()!=s2.length()){
            System.out.println("The string is not a rotation of each other");
            return;
        }
        String combine=s1+s2;
        if(combine.contains(s2)){
            System.out.println("The string s2 is rotation of each other");
        }else{
            System.out.println("Not a Rotation");
        }

    }
}
