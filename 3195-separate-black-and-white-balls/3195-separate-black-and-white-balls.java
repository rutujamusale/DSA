class Solution {
    public long minimumSteps(String s) {
        long steps = 0;
        long zeros = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                zeros++;  // count how many '1's are before current position
            } else {
                steps += zeros; // this '0' must jump over all those zeros
            }
        }

        return steps;
    }
}