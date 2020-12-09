public class Course implements Comparable<Course>{
    private String className;
    private int creditHours;
    private Student[] studentsInCourse;
    private int studentCapacity;
    private int studentEnrollmentCounter;
    private Instructor[] instructorsInCourse;
    private int instructorCapacity;
    private int instructorEnrollmentCounter;
    private Teaching_Assistant[] teachingAssistantsInCourse;
    private int teachingAssistantCapacity;
    private int teachingAssistantEnrollmentCounter;
    private Lab_Technician[] labTechniciansInCourse;
    private int labTechnicianCapacity;
    private int labTechnicianEnrollmentCounter;
    private Staff_Member[] staffMembersInCourse;
    private int staffMemberCapacity;
    private int staffMemberEnrollmentCounter;
    private String labRoomName;//

    public Course() {

    }


    public Course(String className, int creditHours) {
        this.className = className;
        this.creditHours = creditHours;
        studentEnrollmentCounter = 0;
        instructorEnrollmentCounter = 0;
        teachingAssistantEnrollmentCounter = 0;
        labTechnicianEnrollmentCounter = 0;
        staffMemberEnrollmentCounter = 0;
        studentCapacity = 30;
        instructorCapacity = 3;
        teachingAssistantCapacity = 3;
        labTechnicianCapacity = 3;
        staffMemberCapacity = 3;
        studentsInCourse = new Student[studentCapacity];
        instructorsInCourse = new Instructor[instructorCapacity];
        teachingAssistantsInCourse = new Teaching_Assistant[teachingAssistantCapacity];
        labTechniciansInCourse = new Lab_Technician[labTechnicianCapacity];
        staffMembersInCourse = new Staff_Member[staffMemberCapacity];
        this.labRoomName = labRoomName;//
    }

    public String getClassName() {
        return className;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getLabRoomName() {
        return labRoomName;
    }//

    public int getStudentEnrollmentCounter() {
        return studentEnrollmentCounter;
    }

    public int getInstructorEnrollmentCounter() {
        return instructorEnrollmentCounter;
    }

    public int getTeachingAssistantEnrollmentCounter() {
        return teachingAssistantEnrollmentCounter;
    }

    public int getLabTechnicianEnrollmentCounter() {
        return labTechnicianEnrollmentCounter;
    }

    public int getStaffMemberEnrollmentCounter() {
        return staffMemberEnrollmentCounter;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public int getInstructorCapacity() {
        return instructorCapacity;
    }

    public int getTeachingAssistantCapacity() {
        return teachingAssistantCapacity;
    }

    public int getLabTechnicianCapacity() {
        return labTechnicianCapacity;
    }

    public int getStaffMemberCapacity() {
        return staffMemberCapacity;
    }

    public Student[] getStudentsInCourse() {
        return studentsInCourse;
    }

    public Instructor[] getInstructorsInCourse() {
        return instructorsInCourse;
    }

    public Teaching_Assistant[] getTeachingAssistantsInCourse() {
        return teachingAssistantsInCourse;
    }

    public Lab_Technician[] getLabTechniciansInCourse() {
        return labTechniciansInCourse;
    }

    public Staff_Member[] getStaffMembersInCourse() {
        return staffMembersInCourse;
    }


    public boolean hasStudentSpace() {
        if (studentEnrollmentCounter < studentCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public void addStudentToCourse(Student student) {
        this.studentsInCourse[studentEnrollmentCounter] = student;
        studentEnrollmentCounter++;
    }

    public boolean hasInstructorSpace() {
        if (instructorEnrollmentCounter < instructorCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public void addInstructorToCourse(Instructor instructor) {
        this.instructorsInCourse[instructorEnrollmentCounter] = instructor;
        instructorEnrollmentCounter++;
    }

    public boolean hasTeachingAssistantSpace() {
        if (teachingAssistantEnrollmentCounter < teachingAssistantCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public void addTeachingAssistantToCourse(Teaching_Assistant teachingAssistant) {
        this.teachingAssistantsInCourse[teachingAssistantEnrollmentCounter] = teachingAssistant;
        teachingAssistantEnrollmentCounter++;
    }

    public boolean hasLabTechnicianSpace() {
        if (labTechnicianEnrollmentCounter < labTechnicianCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public void addLabTechnicianToCourse(Lab_Technician labTechnician) {
        this.labTechniciansInCourse[labTechnicianEnrollmentCounter] = labTechnician;
        labTechnicianEnrollmentCounter++;
    }

    public boolean hasStaffMemberSpace() {
        if (staffMemberEnrollmentCounter < staffMemberCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public void addStaffMemberToCourse(Staff_Member staffMember) {
        this.staffMembersInCourse[staffMemberEnrollmentCounter] = staffMember;
        staffMemberEnrollmentCounter++;
    }

    public boolean hasLaboratory(){
        if(getLabRoomName()!= null){
            return true;
        } else {
            return false;
        }
    }//
    public int compareTo(Course course) {
       return className.compareTo(course.className);
    }



}
