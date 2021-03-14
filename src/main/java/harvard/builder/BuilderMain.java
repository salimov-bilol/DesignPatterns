package harvard.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setOS("Android")
                .setRam(6)
                .getPhone();
        System.out.println(phone);
    }
}
