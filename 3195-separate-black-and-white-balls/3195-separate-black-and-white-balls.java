class Solution {
    public long minimumSteps(String s) {
        long steps = 0;
        long zeros = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '0') {
                zeros++; 
            } else {
                steps += zeros; 
            }
        }

        return steps;
    }
}