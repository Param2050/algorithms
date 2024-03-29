package recursive;

public class LongestCommonSubsequence {

    public static void main(String args[]) {
        String X = "ABCDGH";
        String Y = "AEDFHR";

        // Find the length of String
        int m = X.length();
        int n = Y.length();
        System.out.println("Length of LCS: " + lcs(X, Y, m, n));
    }

    private static int lcs(String X, String Y, int m, int n) {

        if(m == 0 || n ==0)
            return 0;

        if(X.charAt(m-1) == Y.charAt(n-1)) {
            return 1 + lcs(X, Y, m-1, n-1);
        }else {
            return Math.max(lcs(X, Y, m-1, n), lcs(X, Y, m, n-1));
        }
    }
}
