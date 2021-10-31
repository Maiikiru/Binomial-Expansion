public class Binomial_Expansion {
    private static long[] factorial;

    public static String binomialExpansion(int n,String x ,String y){
        Factorial.recursiveHelper(n);
        factorial = Factorial.getFactorialArray();

        String s = "";
        for (int k = 0; k <= n; k++) {
            long coeffX = (factorial[n] / (factorial[k] * factorial[(n - k)]));
            long powX = n - k;

            if (powX == 1) {
                s += coeffX + x;
            } else if (powX > 1) {
                if (coeffX == 1) {
                    s += (x + "^" + powX);
                } else if (coeffX > 1) {
                    s += (coeffX + x + "^" + powX);
                }
            }

            if (k == 1) s += y;
            else if (k > 1) s += (y + "^" + k);

            s += " + ";
        }
        return s.substring(0, s.length()-3);
    }


}
