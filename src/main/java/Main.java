public class Main {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(Solution.isPalindrome(x));
    }

    public static class Solution {
        public static boolean isPalindrome(int x) {
            //runtime = 10mc; memory = 41.6 MB;
            String k = String.valueOf(x);
            if (k.length() > 1) {
                for (int i = 0; i < k.length() / 2; i++) {
                    if (k.charAt(i) != k.charAt(k.length() - 1 - i)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}