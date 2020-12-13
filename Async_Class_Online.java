public class Async_Class_Online extends Course {

    private String classInfo;
    private String textInfo;

    public Async_Class_Online() {
        super();
    }

    public Async_Class_Online(String className, int creditHours, String classInfo) {
        super(className, creditHours);
        this.classInfo = classInfo;
    }

    public Async_Class_Online(String textInfo) {
      this.textInfo = textInfo;
    }

    public String getTextInfo() {
          return "[Async]" + textInfo;
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

        return "[Async]Course Type: Online Asynchronous" +
                ", Course Name: " + getClassName() + ", Credit Hours: " + getCreditHours() +
                ", Class Information: " + classInfo + ", Instructor(s): " + instructorList + "\b\b]" +
                ", Teaching Assistant(s): " + teachingAssistantsList + "\b\b]" + ", Staff Member(s): " +
                staffMembersList + "\b\b]" + ", Enrollment: " + getStudentEnrollmentCounter() + "/" +
                getStudentCapacity();
    }
}
