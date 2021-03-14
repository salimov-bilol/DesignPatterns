package harvard.adapter;

public class School {

    public static void main(String[] args) {
        PenAdapter penAdapter = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(penAdapter);
        assignmentWork.writeAssigment("I am finishing my Bachelor's degree!");
    }
}
