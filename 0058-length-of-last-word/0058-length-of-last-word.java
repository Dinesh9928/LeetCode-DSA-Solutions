class Solution {
    public int lengthOfLastWord(String s) {
        // Trim trailing whitespaces
        s = s.trim();

        int count = 0;
        // Iterate over the string in reverse
        for (int i = s.length() - 1; i >= 0; i--) {
            // Check for non-space characters
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                // Break loop if we encounter a space after counting a word
                break;
            }
        }
        return count; 
    }
}