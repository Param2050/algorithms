package dp;

public class MinimumNoOfInsertionDeletionToCovertStringAToStringB {

    public static void main(String args[]) {
        String s1 = "heap";
        String s2 = "pea";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        int lcs = lcs( X, Y, m, n );
        System.out.println("Length of LCS is" + " " + lcs);
        int minimumDeletions = m-lcs;
        int minimumInsertions = n-lcs;
        System.out.println("Minimum minimumDeletions " + " " + minimumDeletions);
        System.out.println("Minimum minimumInsertions " + " " + minimumInsertions);
    }

    private static int lcs(char X[], char Y[], int m, int n) {

        int t[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {

                if(i == 0 || j == 0) {
                    t[i][j] = 0;
                }
                else if(X[i-1] == Y[j-1]) {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }

            }
        }
        return t[m][n];
    }
}
