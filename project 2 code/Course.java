public class Course {

    private static final int STUDENT_LIMIT = 20;
    private static final int INSTRUCTOR_LIMIT = 3;
	  private static final int TEACHING_ASSISTANT_LIMIT = 3;
	  private static final int LAB_TECHNICIAN_LIMIT = 3;
	  private static final int STAFF_LIMIT = 3;
    private static final int CREDIT_LIMIT = 18;

    private String title;
    private int creditHours;
    private int roomNumber = (int) (Math.random() * 100);

    private Student[] students;
    private int numStudents = 0;

    private Instructor[] instructors;
    private int numInstructors = 0;

	  private TeachingAssistant[] teachingAssistants;
	  private int numTeachingAssistants = 0;

	  private LabTechnician[] labTechnicians;
	  private int numLabTechnicians = 0;

	  private Staff[] staff;
	  private int numStaff = 0;


    public Course(String title, int creditHours) {
        this.students = new Student[STUDENT_LIMIT];
        this.instructors = new Instructor[INSTRUCTOR_LIMIT];
        this.labTechnicians = new LabTechnician[LAB_TECHNICIAN_LIMIT];
        this.teachingAssistants = new TeachingAssistant[TEACHING_ASSISTANT_LIMIT];
        this.title = title;
        this.creditHours = creditHours;
    }

    public boolean addStudent(Student student) {
        for (int i = 0; i < STUDENT_LIMIT; i++) {
            if (students[i] == student) {
                System.out.print("\nStudent is already in the course.");
                return false;
            }
        }
        if (numStudents < STUDENT_LIMIT) {
            if (student.getCreditHours() + creditHours <= CREDIT_LIMIT) {
                students[numStudents] = student;
                student.addCreditHours(creditHours);

                numStudents++;
                return true;
            } else {
                System.out.println("Exceeded credit limit");
                return false;
            }
        }
        System.out.println("Exceeded student limit");
        return false;
    }


    public boolean addInstructor(Instructor instructor) {
        for (int i = 0; i < INSTRUCTOR_LIMIT; i++) {
            if (instructors[i] == instructor) {
                System.out.print("\nInstructor is already in the course.");
                return false;
            }
        }
        if (numInstructors < INSTRUCTOR_LIMIT) {
            instructors[numInstructors] = instructor;
            numInstructors++;

            return true;
        }
        System.out.println("There are already 3 instructors assigned to the course.");
        return false;
    }

	public boolean addTeachingAssistant(TeachingAssistant ta) {
        for (int i = 0; i < TEACHING_ASSISTANT_LIMIT; i++) {
            if (teachingAssistants[i] == ta) {
                System.out.print("\nTeaching assistant is already in the course.");
                return false;
            }
        }
        if (numTeachingAssistants < TEACHING_ASSISTANT_LIMIT) {
            teachingAssistants[numTeachingAssistants] = ta;
            numTeachingAssistants++;

            return true;
        }
        System.out.println("There are already 3 teaching assistants assigned to the course.");
        return false;
    }

	public boolean addLabTechnician(LabTechnician lt) {
        for (int i = 0; i < LAB_TECHNICIAN_LIMIT; i++) {
            if (labTechnicians[i] == lt) {
                System.out.print("\nLab technician is already in the course.");
                return false;
            }
        }
        if (numLabTechnicians < LAB_TECHNICIAN_LIMIT) {
            labTechnicians[numLabTechnicians] = lt;
            numLabTechnicians++;

            return true;
        }
        System.out.println("There are already 3 lab technicians assigned to the course.");
        return false;
    }

	  public boolean addStaff(Staff s) {
        for (int i = 0; i < STAFF_LIMIT; i++) {
            if (staff[i] == s) {
                System.out.print("\nStaff member is already in the course.");
                return false;
            }
        }
        if (numStaff < STAFF_LIMIT) {
            staff[numStaff] = s;
            numStaff++;

            return true;
        }
        System.out.println("There are already 3 staff members assigned to the course.");
        return false;
    }

    public Student findStudent(String name) {
        for (int i = 0; i < STUDENT_LIMIT; i++) {
            if (students[i].getName().equals(name)) {
                return students[i];
            }
        }
        return null;
    }

    public void printStudents() {
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    public void printInstructors() {
        for (int i = 0; i < numInstructors; i++) {
            System.out.println((i + 1) + ". " + instructors[i]);
        }
    }

	  public void printTeachingAssistants() {
        for (int i = 0; i < numTeachingAssistants; i++) {
            System.out.println((i + 1) + ". " + teachingAssistants[i]);
        }
    }

	  public void printLabTechnicians() {
        for (int i = 0; i < numLabTechnicians; i++) {
            System.out.println((i + 1) + ". " + labTechnicians[i]);
        }
    }

    public void printStaff() {
        for (int i = 0; i < numStaff; i++) {
            System.out.println((i + 1) + ". " + staff[i]);
        }
    }

    public String getTitle() {
        return title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public int getRoomNumber() {
      return roomNumber;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public Instructor[] getInstructor() {
        return instructors;
    }

    public int getNumLabTechs() {
        return numLabTechnicians;
    }

    public int getNumInstructors() {
        return numInstructors;
    }

	  public TeachingAssistant[] getTeachingAssistants(){
		    return teachingAssistants;
	}

	  public LabTechnician[] getLabTechnicians(){
		    return labTechnicians;
	}

	  public Staff[] getStaff(){
		    return staff;
	}

    public String toString(){
        String s = "[";
        for(int i =0; i<numInstructors;i++){
            s+=instructors[i];
            if (i != numInstructors-1) {
                s += ", ";
            }
        }
        s += "]";

        String t = "[";

        for (int i = 0; i < numTeachingAssistants; i++) {
            t += teachingAssistants[i];
            if (i != numTeachingAssistants-1) {
                t += ", ";
            }
        }

        t += "]";

        String a = "[";

        for (int i = 0; i < numLabTechnicians; i++) {
            t += labTechnicians[i];
            if (i != numLabTechnicians-1) {
                t += ", ";
            }
        }

        a += "]";

        String b = "[";

        for (int i = 0; i < numStaff; i++) {
            t += staff[i];
            if (i != numStaff-1) {
                t += ", ";
            }
        }

        b += "]";


        return String.format("Course Name: %s  Credit hours: %d  Enrollments: %d  Instructors: %s TeacherAssistant: %s StaffMember: %s",
                title, creditHours, numStudents, s, t, b);



    }
}
