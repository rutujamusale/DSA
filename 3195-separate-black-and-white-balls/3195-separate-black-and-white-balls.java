class Solution {
    public long minimumSteps(String s) {
        char[] sp = s.toCharArray();
        long count = 0;
        long zeros = 0;

        for (int i = 0; i < sp.length; i++) {
            if (sp[i] == '1') {
                zeros++;  // count how many zeros are on the left so far
            } else {
                count += zeros; // each '1' needs to cross these zeros
            }
        }

        return count;
    }
}