

public abstract class GeneralDevieAssembly {

    private String processName;

    public GeneralDevieAssembly(String name) {
        this.processName = name;
    }

    protected abstract void assemblyDevice();

    protected abstract void testDevie();

    protected abstract void packageDevice();

    protected abstract void storeDevice();

    // template method
    public void launchProcess() {
        if (processName != null && processName.isEmpty()) {
            assemblyDevice();
            testDevie();
            packageDevice();
            storeDevice();
        }else{
            System.out.println("No Process name was specified");
        }
    }

}