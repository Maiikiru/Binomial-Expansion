public class Binomial_Expansion {
    private static long[] factorial;

    public static String binomialExpansion(int n,String x ,String y){
        if(x.length() >= 10) return "TERMS TOO LONG";
        if(y.length() >= 10) return "TERMS TOO LONG";

        Recursive.recursiveHelper(n);
        factorial = Recursive.getFactorialArray();

        boolean isXNum = true;
        boolean isYNum = true;
        long longX = 1;
        long longY = 1;

        try{longX = Long.parseLong(x);}
        catch (Exception e){isXNum = false;}

        try{longY = Long.parseLong(y);}
        catch (Exception e){isYNum = false;}

        //actual algorithm here.
        String s = "";
        if(!isXNum && !isYNum){
            for(int k=0;k<=n;k++) {
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
        }else if(isXNum && !isYNum){ // if X is a number and Y isn't
            for(int k=0;k<=n;k++) {

            }
        }else if(!isXNum && isYNum){ // if Y is a number and X isn't
            for(int k=0;k<=n;k++) {

            }
        }else{ // both are actual numbers(for some reason)
            return s+=(int)Math.pow((longX+longY),n);
        }


        return s.substring(0, s.length()-3);
    }


}
