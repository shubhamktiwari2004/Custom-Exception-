public class Voter {


    //Without Method Signature(handled using try catch)
    public void checkEligibilityHandled(int age){
        try {
            if (age < 18) {
                throw new MyException("you are not eligible to vote");
            }
        }  catch (MyException e) {

            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    //With Method Signature
    public void checkEligibilityThrows(int age) throws MyException {
        if (age < 18) {
            throw new MyException("you are not eligible to vote from method signature");
        }
    }

    //with RunTimeException
    public void checkEligibilityRuntime(int age){
        if (age < 18) {
            throw new MyRuntimeException("you are not eligible to vote from runtime exception");
        }
    }



}
