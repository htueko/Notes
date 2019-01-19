

public class DeviceFactory {

    public static void main(String[] args) {

        GeneralDevieAssembly manufacturAssembly = new SmartphoneManufacturingProcess("MyPhone");
        manufacturAssembly.launchProcess();
    }

}