import java.util.*;

class Student {
    int id;
    String name;
    int age;
    Set<String> subjects;
    Map<String, Integer> grades; // subject → marks

    public Student(int id, String name, int age, Set<String> subjects, Map<String, Integer> grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.grades = grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int mark : grades.values()) {
            sum += mark;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Age: " + age + " | Avg: " + getAverageGrade();
    }
}

public class StudentManagementSystem {

 
    private Map<Integer, Student> studentMap = new HashMap<>();

  
    public void addStudent(Student student) {
        studentMap.put(student.id, student);
    }

  
    public void removeStudent(int id) {
        studentMap.remove(id);
    }

  
    public Student searchById(int id) {
        return studentMap.get(id);
    }

  
    public List<Student> searchByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student s : studentMap.values()) {
            if (s.name.equalsIgnoreCase(name)) {
                result.add(s);
            }
        }
        return result;
    }

  
    public List<Student> sortByName() {
        List<Student> list = new ArrayList<>(studentMap.values());
        list.sort(Comparator.comparing(s -> s.name));
        return list;
    }

   
    public List<Student> sortByAverageGrade() {
        List<Student> list = new ArrayList<>(studentMap.values());
        list.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
        return list;
    }

   
    public List<Student> findBySubject(String subject) {
        List<Student> result = new ArrayList<>();
        for (Student s : studentMap.values()) {
            if (s.subjects.contains(subject)) {
                result.add(s);
            }
        }
        return result;
    }

  
    public void displayAll() {
        for (Student s : studentMap.values()) {
            System.out.println(s);
        }
    }

    
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        
        Set<String> subs1 = new HashSet<>(Arrays.asList("Math", "English"));
        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 90);
        grades1.put("English", 85);

        Set<String> subs2 = new HashSet<>(Arrays.asList("Science", "Math"));
        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Science", 95);
        grades2.put("Math", 88);

        sms.addStudent(new Student(101, "Alice", 20, subs1, grades1));
        sms.addStudent(new Student(102, "Bob", 21, subs2, grades2));

        System.out.println("🔹 All Students:");
        sms.displayAll();

        System.out.println("\n🔹 Search by ID 101:");
        System.out.println(sms.searchById(101));

        System.out.println("\n🔹 Search by Name 'Alice':");
        for (Student s : sms.searchByName("Alice")) {
            System.out.println(s);
        }

        System.out.println("\n🔹 Students sorted by Name:");
        for (Student s : sms.sortByName()) {
            System.out.println(s);
        }

        System.out.println("\n🔹 Students sorted by Average Grade:");
        for (Student s : sms.sortByAverageGrade()) {
            System.out.println(s);
        }

        System.out.println("\n🔹 Students enrolled in Math:");
        for (Student s : sms.findBySubject("Math")) {
            System.out.println(s);
        }
    }
}
