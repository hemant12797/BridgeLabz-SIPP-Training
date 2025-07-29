import java.util.*;

public class StudentMarksReport {


    private Map<String, List<Integer>> studentMarks = new HashMap<>();

  
    public void addMarks(String studentName, int mark) {
        studentMarks.putIfAbsent(studentName, new ArrayList<>());
        studentMarks.get(studentName).add(mark);
    }

 
    public double calculateAverage(String studentName) {
        List<Integer> marks = studentMarks.get(studentName);
        if (marks == null || marks.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

   
    public String getTopStudent() {
        String topStudent = null;
        double highestAvg = 0.0;

        for (String student : studentMarks.keySet()) {
            double avg = calculateAverage(student);
            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = student;
            }
        }

        return topStudent;
    }

 
    public void displayReport() {
        System.out.println("Student Marks Report:");
        for (String student : studentMarks.keySet()) {
            System.out.println(student + ": " + studentMarks.get(student) +
                               " | Average: " + calculateAverage(student));
        }

        String top = getTopStudent();
        if (top != null) {
            System.out.println("\nTop Performer: " + top + 
                               " with average " + calculateAverage(top));
        }
    }

    public static void main(String[] args) {
        StudentMarksReport report = new StudentMarksReport();

        report.addMarks("Alice", 85);
        report.addMarks("Alice", 92);
        report.addMarks("Bob", 78);
        report.addMarks("Bob", 88);
        report.addMarks("Charlie", 95);
        report.addMarks("Charlie", 91);
        report.addMarks("Charlie", 87);

      
        report.displayReport();
    }
}
