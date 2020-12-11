public class Instructor extends Personnel implements Comparable<Instructor>{

    private String name;



    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return "[Instructor]" + name;
    }
    public int compareTo(Instructor instructors) {
       return name.compareTo(instructors.name);
    }
}
