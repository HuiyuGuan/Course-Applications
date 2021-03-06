public class Student extends Person implements Comparable<Student>{

    private String name = null;
    private int id;
    private final int CREDIT_LIMIT = 18;
    private int currentCredits;



    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return "[Student]" + name;
    }

    // public String toString() {
    //     return "[Student]" + getName();


    public int getId() {
        return id;
    }

    public int getCREDIT_LIMIT() {
        return CREDIT_LIMIT;
    }

    public int getCurrentCredits() {
        return currentCredits;
    }

    public void addCredits(int creditHours) {
        this.currentCredits += creditHours;
    }
    public int compareTo(Student students ) {
       return name.compareTo(students.name);
    }
}
