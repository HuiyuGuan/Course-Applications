public class Async_Class_Online extends Course {

    private String classInfo;

    public Async_Class_Online() {
        super();
    }

    public Async_Class_Online(String className, int creditHours, String classInfo) {
        super(className, creditHours);
        this.classInfo = classInfo;
    }

    public String getClassInfo() {
        return classInfo;
    }

    public String toString() {
        String instructorList = "[";
        for (int i = 0; i < getInstructorsInCourse().length; i++) {
            if (getInstructorsInCourse()[i] != null) {
                instructorList += getInstructorsInCourse()[i].getName() + ", ";
            }
        }
        if (getInstructorsInCourse()[0] == null) {
            instructorList += "  ";
        }

        String teachingAssistantsList = "[";
        for (int i = 0; i < getTeachingAssistantsInCourse().length; i++) {
            if (getTeachingAssistantsInCourse()[i] != null) {
                teachingAssistantsList += getTeachingAssistantsInCourse()[i].getName() + ", ";
            }
        }
        if (getTeachingAssistantsInCourse()[0] == null) {
            teachingAssistantsList += "  ";
        }

        String staffMembersList = "[";
        for (int i = 0; i < getStaffMembersInCourse().length; i++) {
            if (getStaffMembersInCourse()[i] != null) {
                staffMembersList += getStaffMembersInCourse()[i].getName() + ", ";
            }
        }
        if (getStaffMembersInCourse()[0] == null) {
            staffMembersList += "  ";
        }

        return "Course Information: \nCourse Type: Online Asynchronous" +
                " \nCourse Name: " + getClassName() + "\nCredit Hours: " + getCreditHours() +
                "\nClass Information: " + classInfo + "\nInstructor(s): " + instructorList + "\b\b]" +
                "\nTeaching Assistant(s): " + teachingAssistantsList + "\b\b]" + "\nStaff Member(s): " +
                staffMembersList + "\b\b]" + "\nEnrollment: " + getStudentEnrollmentCounter() + "/" +
                getStudentCapacity() + "\n-------------------------------------------\n";
    }
}
