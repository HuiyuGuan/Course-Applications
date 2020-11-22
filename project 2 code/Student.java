public class Student {

    private String name;
    private int creditHours = 0;
    private static int count = 0;
    private int id;

    public Student(String name) {
        this.name = name;
        id = count;
	 	    count++;
    }

    public String toString() {
        return name + ", ID: " + id;
    }

    public String getName() {
        return name;
    }

    public int getCreditHours() {
      return creditHours;
    }

    public void addCreditHours(int additive) {
      creditHours += additive;
    }

    public int getId() {
      return id;
 }
    public boolean equals(Object obj) {
      return ((Student)obj).getId()==id;
 }

}
