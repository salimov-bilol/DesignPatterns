package harvard.builder;

public class PhoneBuilder {
    private String OS;
    private int ram;
    private String processor;
    private int batterySize;

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setBatterySize(int batterySize) {
        this.batterySize = batterySize;
        return this;
    }

    public Phone getPhone() {
        return new Phone(OS, ram, processor, batterySize);
    }
}
