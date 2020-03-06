import java.io.Console;

import static java.lang.Thread.sleep;

public class Program {

    public static int OperationsCount = 0;
    public static int ValueToModify = 0;
    public static int OperationsThreshold = 1000000;
    public static int LoopsCount = 1000;
    public static int PerformedLoops = 0;

    public static void main(String[] args) throws InterruptedException {
        while (PerformedLoops < LoopsCount)
        {
            OperationsCount = 0;
            ValueToModify = 0;

            int value = GetResult();
            System.out.println(value);
            PerformedLoops++;
        }
    }

    private static int GetResult() throws InterruptedException {

        Thread add = new ModifyStaticVariableThread(1);
        Thread subtract = new ModifyStaticVariableThread(-1);

        subtract.start();
        add.start();

        add.join();
        subtract.join();

        return ValueToModify;
    }
}
