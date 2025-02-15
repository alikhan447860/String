import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicString {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }
        // Create a HashMap to store character mappings
        HashMap<Character, Character> charMap = new HashMap<>();
        // Create a HashSet to track already mapped characters
        HashSet<Character> mappedChars = new HashSet<>();
        // Iterate through each character of the strings
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            // Check if c1 is already mapped
            if (charMap.containsKey(c1)) {
                // If the mapping is inconsistent, strings are not isomorphic
                if (charMap.get(c1) != c2) {
                    System.out.println("Not Isomorphic");
                    return;
                }
            } else {
                // If c2 is already mapped to another character, strings are not isomorphic
                if (mappedChars.contains(c2)) {
                    System.out.println("Not Isomorphic");
                    return;
                }
                // Add the new mapping
                charMap.put(c1, c2);
                mappedChars.add(c2);
            }
        }
        // If all characters are mapped consistently, strings are isomorphic
        System.out.println("Isomorphic");
    }
}