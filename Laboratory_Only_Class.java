public class Laboratory_Only_Class extends Course {

    private String labRoomName;
    private String labTime;

    public Laboratory_Only_Class() {
        super();
    }

    public Laboratory_Only_Class(String className, int creditHours, String labRoomName, String labTime) {
        super(className, creditHours);
        this.labRoomName = labRoomName;
        this.labTime = labTime;
    }

    public String getLabRoomName() {
        return labRoomName;
    }

    public String getClassTime() {
        return labTime;
    }


    public String toString() {
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

        return "[LaboratoryOnly]" + getClassName() + ", Credit Hours: " + getCreditHours() +
                ", Laboratory Location: " + labRoomName + ", Lab Time: " + labTime +
                ", Lab Technician(s): " + labTechnicianList + "\b\b]" + ", Teaching Assistant(s): " + teachingAssistantsList
                + "\b\b]" + ", Staff Member(s): " + staffMembersList + "\b\b]" +
                ", Enrollment: " + getStudentEnrollmentCounter() + "/" + getStudentCapacity();
    }

}
