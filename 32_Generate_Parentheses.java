
32.Generate Parentheses

solution:-

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lt = new ArrayList<>();
        generate_parentheses(lt, 0, 0, n, "");
        return lt;
    }

    public void generate_parentheses(List<String> lt, int close, int open, int n, String ans) {
        if (close == n && open == n) {
            lt.add(ans);
            return;
        }
        if (open < n) {
            generate_parentheses(lt, close, open + 1, n, ans + "(");
        }
        if (close < open) {
            generate_parentheses(lt, close + 1, open, n, ans + ")");
        }
    }
}