class Solution {

    public int wordsTyping(String[] sentence, int rows, int cols) {

        String sen = String.join(" ", sentence) + " ";
        int len = sen.length();
        int total = 0;

        for (int i = 0; i < rows; i++) {
            total += cols;
            if (sen.charAt(total % len) == ' ') {
                total++;
            } else {
                while (total > 0 && sen.charAt((total - 1) % len) != ' ') {
                    total--;
                }
            }
        }
        return total / len;
    }

}
