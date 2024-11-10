package Examples;
import java.lang.Exception;
// try catch throw throws and finally

class ErrorHanlding {
    public static void main(String[] args) throws ArithmeticException {
        try{
            int a = 1;
            int b = 10;
            if(a/b != 0){
                System.out.println(a/b);
            } else
            {
            throw new NullPointerException("a/b is 0");
            }
        } catch(NullPointerException ae){
            System.out.println("Handled     " + ae);
        } catch (NumberFormatException ne)
        {
            System.out.println("Handled     " + ne);
        }
        finally {
            System.out.println("Hello WORLD");
        }
    }
}
