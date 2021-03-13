package harvard.factory;

public class FactoryMain {
    public static void main(String[] args) {
        new OSFactory()
                .getInstance("open")
                .specification();
        new OSFactory()
                .getInstance("closed")
                .specification();
        new OSFactory()
                .getInstance("any other")
                .specification();

    }
}

