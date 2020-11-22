import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class School {

    private static final int COURSE_LIMIT = 10;
    private static final int LAB_LIMIT = 10;
    private static final int ONLINE_COURSE_LIMIT = 10;
    private static final int STUDENT_LIMIT = 100;
    private static final int INSTRUCTOR_LIMIT = 100;
	private static final int TEACHING_ASSISTANT_LIMIT = 100;
	private static final int LAB_TECHNICIAN_LIMIT = 100;
	private static final int STAFF_LIMIT = 100;


	private Course[] courses;
    private int numCourses = 0;

    private Laboratory[] labs;
    private int numLabs = 0;

    private OnlineCourse[] onlineCourses;
    private int numOnlineCourses = 0;

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


    public School() {
        courses = new Course[COURSE_LIMIT];
        onlineCourses = new OnlineCourse[ONLINE_COURSE_LIMIT];
        labs = new Laboratory[LAB_LIMIT];
        students = new Student[STUDENT_LIMIT];
        instructors = new Instructor[INSTRUCTOR_LIMIT];
        labTechnicians = new LabTechnician[LAB_TECHNICIAN_LIMIT];
        teachingAssistants = new TeachingAssistant[TEACHING_ASSISTANT_LIMIT];
        staff = new Staff[STAFF_LIMIT];
    }

    public boolean addCourse(Course course) {
        if (numCourses < COURSE_LIMIT) {
            courses[numCourses] = course;
            numCourses++;

            return true;
        }
        return false;
    }

    public boolean addLab(Laboratory lab) {
        if (numLabs < LAB_LIMIT) {
            labs[numLabs] = lab;
            numLabs++;

            return true;
        }
        return false;
    }

    public boolean addOnlineCourse(OnlineCourse course) {
        if (numLabs < LAB_LIMIT) {
            onlineCourses[numOnlineCourses] = course;
            numOnlineCourses++;

            return true;
        }
        return false;
    }

    public boolean enrollStudent(Student student) {
        if (numStudents < STUDENT_LIMIT) {
            students[numStudents] = student;
            numStudents++;
            return true;
        }
        return false;
    }

    public boolean enrollInstructor(Instructor instructor) {
        if (numInstructors < INSTRUCTOR_LIMIT) {
            instructors[numInstructors] = instructor;
            numInstructors++;
            return true;
        }
        return false;
    }

    public boolean enrollTeachingAssistant(TeachingAssistant assistant) {
        if (numTeachingAssistants < TEACHING_ASSISTANT_LIMIT) {
            teachingAssistants[numTeachingAssistants] = assistant;
            numTeachingAssistants++;
            return true;
        }
        return false;
    }

    public boolean enrollLabTechnician(LabTechnician labTech) {
        if (numLabTechnicians < LAB_TECHNICIAN_LIMIT) {
            labTechnicians[numLabTechnicians] = labTech;
            numLabTechnicians++;
            return true;
        }
        return false;
    }

    public boolean enrollStaff(Staff staffMember) {
        if (numStaff < STAFF_LIMIT) {
            staff[numStaff] = staffMember;
            numStaff++;
            return true;
        }
        return false;
    }

    public Course searchInstructor(String name) {
      List<Course> list = Arrays.asList(courses);
      for (int i = 0; i < list.size(); i++) {
        Course c1 = list.get(i);
        if (list.contains(name)) {
          return c1;
        }
    }

    return null;
  }

    public Student[] getStudents() {
        return students;
    }

    public Instructor[] getInstructors() {
        return instructors;
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

    public Course[] getCourses() {
        return courses;
    }

    public Laboratory[] getLabs() {
      return labs;
    }

    public OnlineCourse[] getOnlineCourses() {
      return onlineCourses;
    }

    public int printCourses() {
        int count;
        for (count = 0; count < numCourses; count++) {
            System.out.println((count + 1) + ". " + courses[count].getTitle());
        }
        return count;
    }

    public int printHybrids() {
      int count;
      for (count = 0; count < numLabs; count++) {
          System.out.println((count + 1) + ". " + labs[count].getTitle());
      }
        return count;
  }

    public int printOnlineCourses() {
      int count;
      for (count = 0; count < numOnlineCourses; count++) {
          System.out.println((count + 1) + ". " + onlineCourses[count].getTitle());
        }
        return count;
    }

    public void printCoursesInfo() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println((i + 1) + ". " + courses[i].getTitle() + "(Credits: " + courses[i].getCreditHours() + ", Instructors: " + courses[i].getNumInstructors() + ", Students: " + courses[i].getNumStudents() + ", Room: " + courses[i].getRoomNumber() + ")");
        }
    }

    public void printHybridInfo() {
        for (int i = 0; i < numLabs; i++) {
            System.out.println((i + 1) + ". " + labs[i].getTitle() + "(Credits: " + labs[i].getCreditHours() + ", Instructors: " + labs[i].getNumInstructors() + ", Lab Technicians: " + labs[i].getNumLabTechs() + ", Students: " + labs[i].getNumStudents() +
            ", Lab Type: " + labs[i].getLabType() + ", Lab is located in room " + labs[i].getLabRoom() + ")");
        }
    }

    public void printOnlineCourseInfo() {
        for (int i = 0; i < numOnlineCourses; i++) {
            System.out.println((i + 1) + ". " + onlineCourses[i].getTitle() + "(Credits: " + onlineCourses[i].getCreditHours() + ", Instructors: " + onlineCourses[i].getNumInstructors() + ", Students: " + onlineCourses[i].getNumStudents()
            + ", Meeting site: " + onlineCourses[i].getWebsite() + ", Assignment Hub: " + onlineCourses[i].getAssignmentHub() + ")");
        }
    }

    public int printInstructors() {
        int count;
        for (count = 0; count < numInstructors; count++) {
            System.out.println((count + 1) + ". " + instructors[count]);
        }
        return count;
    }

    public int printTeachingAssistants() {
        int count;
        for (count = 0; count < numTeachingAssistants; count++) {
            System.out.println((count + 1) + ". " + teachingAssistants[count]);
        }
        return count;
    }

    public int printLabTechnicians() {
        int count;
        for (count = 0; count < numLabTechnicians; count++) {
            System.out.println((count + 1) + ". " + labTechnicians[count]);
        }
        return count;
    }

    public int printStaff() {
        int count;
        for (count = 0; count < numStaff; count++) {
            System.out.println((count + 1) + ". " + staff[count]);
        }
        return count;
    }


    public int printStudents() {
        int count;
        for (count = 0; count < numStudents; count++) {
            System.out.println((count + 1) + ". " + students[count]);
        }
        return count;
    }
        public void searchCourse(){
            System.out.println("please type the course you want to search");
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.nextLine();
            for(int a=0 ;a<numCourses; a++) {
                if (s1.equals(courses[a].getTitle())){
                    System.out.println(courses[a].toString());
                }
            }

            for(int a=0 ;a<numLabs; a++) {
                if (s1.equals(labs[a].getTitle())){
                    System.out.println(labs[a].toString());
                }
            }

            for(int a=0 ;a<numOnlineCourses; a++) {
                if (s1.equals(onlineCourses[a].getTitle())){
                    System.out.println(onlineCourses[a].toString());
                }
            }
        }



    }
