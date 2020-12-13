public class Hybrid_Class extends Course {

    private String classRoomName;
    private String labRoomName;
    private String classTime;
    private String labTime;
    private String textInfo;

    public Hybrid_Class() {
        super();
    }

    public Hybrid_Class(String className, int creditHours, String classRoomName, String labRoomName, String classTime, String labTime) {
        super(className, creditHours);
        this.classRoomName = classRoomName;
        this.labRoomName = labRoomName;
        this.classTime = classTime;
        this.labTime = labTime;
    }

    public Hybrid_Class(String textInfo) {
      this.textInfo = textInfo;
    }

    public String getTextInfo() {
          return "[Hybrid]" + textInfo;
        }


    public String getClassRoomName() {
        return classRoomName;
    }

    public String getLabRoomName() {
        return labRoomName;
    }

    public String getClassTime() {
        return classTime;
    }

    public String getLabTime() {
      return labTime;
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

        String labTechnicianList = "[";
        for (int i = 0; i < getLabTechniciansInCourse().length; i++) {
            if (getLabTechniciansInCourse()[i] != null) {
                labTechnicianList += getLabTechniciansInCourse()[i].getName() + ", ";
            }
        }
        if (getLabTechniciansInCourse()[0] == null) {
            labTechnicianList += "  ";
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

        return "[Hybrid]Course Type: Hybrid (Lecture and Laboratory)" +
                ", Course Name: " + getClassName() + ", Credit Hours: " + getCreditHours() +
                ", Classroom Location: " + classRoomName + ", Class Time: " + classTime +
                ", Laboratory Location: " + labRoomName + ", Lab Time: " + labTime +
                ", Instructor(s): " + instructorList + "\b\b]" + ", Lab Technician(s): " + labTechnicianList +
                "\b\b]" + ", Teaching Assistant(s): " + teachingAssistantsList +
                "\b\b]" + ", Staff Member(s): " + staffMembersList + "\b\b]" +
                ", Enrollment: " + getStudentEnrollmentCounter() + "/" + getStudentCapacity();
    }
}
