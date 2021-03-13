package harvard.factory;

public class OSFactory {

    public OS getInstance(String osType) {

        switch (osType) {
            case "open":
                return new Android();
            case "closed":
                return new iOS();
            default:
                return new Windows();
        }
    }

}
