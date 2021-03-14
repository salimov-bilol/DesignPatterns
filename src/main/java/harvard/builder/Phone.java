package harvard.builder;

public class Phone {
    private String OS;
    private int ram;
    private String processor;
    private int batterySize;

    public Phone(String OS, int ram, String processor, int batterySize) {
        this.OS = OS;
        this.ram = ram;
        this.processor = processor;
        this.batterySize = batterySize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", batterySize=" + batterySize +
                '}';
    }
}
