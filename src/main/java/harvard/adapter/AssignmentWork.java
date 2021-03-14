package harvard.adapter;

public class AssignmentWork {
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void writeAssigment(String someText) {
        pen.write(someText);
    }
}
