public class PrintAllsubstring {
    public static void main(String[] args) {
        String str = "You";
        System.out.println("All substrings:");
        // Loop through all possible starting indices
        for (int start = 0; start < str.length(); start++) {  
            // Loop through all possible ending indices
            for (int end = start + 1; end <= str.length(); end++) {
                // Manually build the substring
                StringBuilder currentSubstring = new StringBuilder();
                for (int i = start; i < end; i++) {
                    currentSubstring.append(str.charAt(i));
                }
                System.out.println(currentSubstring);
            }
        }
        // Calculate total using formula
        int total = str.length() * (str.length() + 1) / 2;
        System.out.println("Total number of substrings: " + total);
    }
}