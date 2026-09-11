import java.util.Scanner;

public class PreDefinedExceptions {
    public static void main(String[] args) {
        try{
        int[] arr = {1,2,3,4},i,b;
        Scanner sc = new Scanner(System.in);
        i=sc.nextInt();
        b=sc.nextInt();
        System.out.println(arr[i]);
        System.out.println(arr[i]/b);
        }
        catch(ArithmeticException e)
        {System.out.println("Exception caught is " + e.getMessage();}
        catch(ArrayIndexOutOfBoundsException)
        {System.out.println("Exception caught is "+e.getMessage());}
        finally{
            sc.close();
            System.out.println("finally excuated");
        }
    }    
}
