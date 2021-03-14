package harvard.singleton;

public class Singleton {

    public static void main(String[] args) {
        SingletonPattern.getInstance().setId(5).printId();
        SingletonPattern.getInstance().printId();
    }


}

class SingletonPattern {

    static SingletonPattern singletonPattern = new SingletonPattern();
    private int id;

    private SingletonPattern() {

    }

    public static SingletonPattern getInstance() {
        return singletonPattern;
    }

    public SingletonPattern setId(int id) {
        this.id = id;
        return this;
    }

    public void printId() {
        System.out.println(id);
    }
}