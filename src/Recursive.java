import java.math.BigInteger;

public class Recursive {
    private static long []factorialArray;

    public static long recursiveHelper(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        factorialArray = new long[n+1];
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
