package harvard.adapter;

public class PenAdapter implements Pen {

    PilotPen pilotPen;

    public PenAdapter() {
        this.pilotPen = new PilotPen();
    }

    @Override
    public void write(String someText) {
        pilotPen.mark(someText);
    }
}
