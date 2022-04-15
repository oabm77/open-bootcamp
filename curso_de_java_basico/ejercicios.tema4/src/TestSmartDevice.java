public class TestSmartDevice {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsumg", 7f, "litio", 4, "Android");
        SmartWatch smartWatch = new SmartWatch("Ksix", 1.54f, "litio", true, "magnética");

        System.out.println("Dispositivo 1:\n"+smartPhone);
        System.out.println("Dispositivo 2:\n"+smartWatch);
    }
}
