import java.util.*;

public class IntelligentDNAPatternSearch{

    static int[] createLPS(String p) {
        int n = p.length();
        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        while (i < n) {
            if (p.charAt(i) == p.charAt(len)) {
                lps[i] = ++len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String T = sc.nextLine();
        String P = sc.nextLine();

        int[] lps = createLPS(P);

        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();

        while (i < T.length()) {
            if (T.charAt(i) == P.charAt(j)) {
                i++;
                j++;

                if (j == P.length()) {
                    result.append(i - j).append(" ");
                    j = lps[j - 1];
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        System.out.println(result.toString().trim());
    }
}