import java.util.InputMismatchException;

public class Driver {
    public static void main(String[] args) {
        try{
            System.out.println(Binomial_Expansion.binomialExpansion(5,"x","y"));
        }catch(InputMismatchException e){
            System.out.println("Error was "+e.getMessage());
        }catch (Exception e){
            System.out.println("Error was "+e.getMessage());
        }

    }
}
