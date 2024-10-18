package InternalExam;

class TryCatchFinally {
    public static void main(String args[]) throws ArithmeticException {
        int a = args.length;
        int d = 45;
        try{
            if(a == 0){
                d = d/a-1;
                throw new ArithmeticException("ZeroZeroZZEERRROO");
            }
        }
        catch(ArithmeticException ae){
            System.out.println("Exception Caught Successfully: " + ae);
        }
        finally{
            System.out.println("Inside Finally!");
        }
    }
}
