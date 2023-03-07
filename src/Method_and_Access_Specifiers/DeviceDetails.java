package Method_and_Access_Specifiers;

public class DeviceDetails {
    private int deviceNo;
    private String deviceName, deviceType;
    double devicePrice;

    public DeviceDetails() {
        deviceNo = 0;
        deviceName = "";
        deviceType = "";
        devicePrice = 0.0;
    }

    public DeviceDetails(int deviceNo, String deviceType) {
        this.deviceNo = deviceNo;
        this.deviceType = deviceType;
    }

    public void displayDetails() {
        System.out.println("Device Number: " + deviceNo);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Device Type: " + deviceType);
        System.out.println("Device Price: " + devicePrice);
    }

    public static void main(String[] args) {
        DeviceDetails objDevice = new DeviceDetails(10, "Laptop");
        objDevice.displayDetails();
    }
}
