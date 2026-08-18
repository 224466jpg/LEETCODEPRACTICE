import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();

        for (char ch : num.toCharArray()) {
            while (!stk.isEmpty() && k > 0 && stk.peek() > ch) {
                stk.pop();
                k--;
            }

            stk.push(ch);
        }

        // If k digits are still left to remove
        while (k > 0) {
            stk.pop();
            k--;
        }

        // Build result
        StringBuilder sb = new StringBuilder();

        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }

        sb.reverse();

        // Remove leading zeros
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        String result = sb.substring(i);

        return result.isEmpty() ? "0" : result;
    }
}