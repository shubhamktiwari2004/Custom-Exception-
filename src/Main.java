//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Throwable {

        Voter aman = new Voter();
        aman.checkEligibilityHandled(17);
        aman.checkEligibilityThrows(16);
        aman.checkEligibilityRuntime(16);
    }
}
