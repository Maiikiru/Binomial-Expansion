import java.math.BigInteger;

public class Factorial {
    private static long []factorialArray;
    private static int lengthOfFac;

    public static long recursiveHelper(int n){
        //if its factorial of 0 or 1 its 1, else if we already solved the factorial, do not redo the work.
        if(n == 0 || n == 1) return 1;
        if(lengthOfFac >= n) return factorialArray[n];

        factorialArray = new long[n+1];
        lengthOfFac = factorialArray.length;
        factorialArray[0]=1;
        factorialArray[1]=1;

        return bottomUpRecursive(n);
    }

    private static long bottomUpRecursive(int n){
        if(n == 0 || n == 1) return 1;
        for(int i=2;i<=n;i++){
            factorialArray[i] = Math.multiplyExact(i,factorialArray[i-1]); // This will throw an exception if we overflow
        }
        return factorialArray[n];
    }

    public static long[] getFactorialArray() {
        return factorialArray;
    }

}