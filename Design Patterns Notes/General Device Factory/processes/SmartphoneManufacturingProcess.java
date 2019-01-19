public class SmartphoneManufacturingProcess extends GeneralDevieAssembly{

    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assemblyDevice() {
        System.out.println( name + " is on assembling state");
    }

    @Override
    protected void testDevie() {
        System.out.println( name + " is on testing state");
    }

    @Override
    protected void packageDevice() {
        System.out.println( name + " is on packaging state");
    }

    @Override
    protected void storeDevice() {
        System.out.println( name + " is on storing state");
    }

}