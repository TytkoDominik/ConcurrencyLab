public class ModifyStaticVariableThread extends Thread {

    private int value;

    public ModifyStaticVariableThread(int value)
    {
        this.value = value;
    }

    public void run()
    {
        while (Program.OperationsCount < Program.OperationsThreshold)
        {
            Program.ValueToModify += value;
            Program.OperationsCount++;
        }
    }
}
