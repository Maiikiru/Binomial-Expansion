import java.util.InputMismatchException;

public class Driver {
    public static void main(String[] args) {
        try{
            System.out.println(Binomial_Expansion.binomialExpansion(5,"x","y"));
        }catch (Exception e){
            System.out.println("Error was "+e.getMessage());
        }

    }
}
