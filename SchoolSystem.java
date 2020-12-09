import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class SchoolSystem {

    private static List<Course> courses = new ArrayList<>();
    private static List<Course> faceToFaceCourses = new ArrayList<>();
    private static List<Course> syncOnlineCourses = new ArrayList<>();
    private static List<Course> asyncOnlineCourses = new ArrayList<>();
    private static List<Course> lectureOnlyCourses = new ArrayList<>();
    private static List<Course> laboratoryOnlyCourses = new ArrayList<>();
    private static List<Course> hybridCourses = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();
    private static List<Instructor> instructors = new ArrayList<>();
    private static List<Teaching_Assistant> teachingAssistants = new ArrayList<>();
    private static List<Lab_Technician> labTechnicians = new ArrayList<>();
    private static List<Staff_Member> staffMembers = new ArrayList<>();

    public static boolean displayMainMenu() {
        System.out.println("-------------------------------------------");
        System.out.println(" 1. Add a Course");
        System.out.println(" 2. Add a Person");
        System.out.println(" 3. Register for a Course");
        System.out.println(" 4. Assign Personnel to a Course");
        System.out.println(" 5. Display Information");
		System.out.println(" 6. Search For Course by Personnel Name");
        System.out.println(" 0. Exit Application");
        System.out.println("What would you like to do:");
        System.out.println("-------------------------------------------");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        boolean canContinue = true;

        switch (choice) {
            case "1":
                addCourse(sc);
                break;
            case "2":
                addAPerson(sc);
                break;
            case "3":
                registerForACourse(sc);
                break;
            case "4":
                assignPersonnel(sc);
                break;
            case "5":
                displayInformation(sc);
                break;
			case "6":
                try {
                    searchForCourseByName(sc);
                } catch (NullPointerException e) {
                    System.err.println(e.getMessage());
                }
                break;
            case "0":
                canContinue = false;
                System.out.println("Thank you for using the School System.");
            default:
                System.out.print("");
        }
        return canContinue;
    }

    public static boolean addCourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.println("Choose the type of course you want to add: ");
        System.out.println(" 1. Face to Face");
        System.out.println(" 2. Synchronous Online");
        System.out.println(" 3. Asynchronous Online");
        System.out.println(" 4. Lecture Only");
        System.out.println(" 5. Laboratory Only");
        System.out.println(" 6. Hybrid (Lecture and Laboratory)");
        System.out.println("Enter your choice: ");
        System.out.println("-------------------------------------------");
        String choice = sc.next();
        boolean goon = true;
        switch (choice) {
            case "1":
                addFaceToFaceCourse(sc);
                goon = false;
                break;
            case "2":
                addSyncOnlineCourse(sc);
                goon = false;
                break;
            case "3":
                addAsyncOnlineCourse(sc);
                goon = false;
                break;
            case "4":
                addLectureOnlyCourse(sc);
                goon = false;
                break;
            case "5":
                addLaboratoryOnlyCourse(sc);
                goon = false;
                break;
            case "6":
                addHybridCourse(sc);
                goon = false;
                break;
            default:
        }
        return goon;
    }

    public static void addFaceToFaceCourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter Course Name: ");
        String className = sc.next();
        System.out.print("Enter Credit Hours: ");
        String crdHrs = sc.next();
        int creditHours = Integer.parseInt(crdHrs);
        System.out.print("Enter Classroom Location: ");
        String classRoomName = sc.next();
        System.out.print("Enter Class Time: ");
        String classTime = sc.next();
        Course course = new Face_to_Face_Class(className, creditHours, classRoomName, classTime);
        courses.add(course);
        faceToFaceCourses.add(course);
        System.out.println("Face To Face Course successfully added to the School System.");
    }

    public static void addSyncOnlineCourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter Course Name: ");
        String className = sc.next();
        System.out.print("Enter Credit Hours: ");
        String crdHrs = sc.next();
        int creditHours = Integer.parseInt(crdHrs);
        System.out.print("Enter Class Time: ");
        String classTime = sc.next();
        Course course = new Sync_Class_Online(className, creditHours, classTime);
        courses.add(course);
Collections.sort(courses );
        syncOnlineCourses.add(course);
        System.out.println("Online Synchronous Course successfully added to the School System.");
    }

    public static void addAsyncOnlineCourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter Course Name: ");
        String className = sc.next();
        System.out.print("Enter Credit Hours: ");
        String crdHrs = sc.next();
        int creditHours = Integer.parseInt(crdHrs);
        System.out.print("Enter Course Information: ");
        String classInfo = sc.next();
        Course course = new Async_Class_Online(className, creditHours, classInfo);
        courses.add(course);
        asyncOnlineCourses.add(course);
Collections.sort(syncOnlineCourses );
        System.out.println("Online Asynchronous Course successfully added to the School System.");
    }

    public static void addLectureOnlyCourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter Course Name: ");
        String className = sc.next();
        System.out.print("Enter Credit Hours: ");
        String crdHrs = sc.next();
        int creditHours = Integer.parseInt(crdHrs);
        System.out.print("Enter Classroom Location: ");
        String classRoomName = sc.next();
        System.out.print("Enter Class Time: ");
        String classTime = sc.next();
        Course course = new Lecture_Only_Class(className, creditHours, classRoomName, classTime);
        courses.add(course);
Collections.sort(addLectureOnlyCourse);
        lectureOnlyCourses.add(course);
        System.out.println("Lecture Only Course successfully added to the School System.");
    }

    public static void courses.add(course);(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter Course Name: ");
        String className = sc.next();
        System.out.print("Enter Credit Hours: ");
        String crdHrs = sc.next();
        int creditHours = Integer.parseInt(crdHrs);
        System.out.print("Enter Laboratory Room Location: ");
        String labRoomName = sc.next();
        System.out.print("Enter Lab Time: ");
        String labTime = sc.next();
        Course course = new Laboratory_Only_Class(className, creditHours, labRoomName, labTime);
        courses.add(course);
        laboratoryOnlyCourses.add(course);
      Collections.sort(laboratoryOnlyCourses);
        System.out.println("Laboratory Only Course successfully added to the School System.");
    }

    public static void addHybridCourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter Course Name: ");
        String className = sc.next();
        System.out.print("Enter Credit Hours: ");
        String crdHrs = sc.next();
        int creditHours = Integer.parseInt(crdHrs);
        System.out.print("Enter Lecture Room Location: ");
        String classRoomName = sc.next();
        System.out.print("Enter Class Time: ");
        String classTime = sc.next();
        System.out.print("Enter Laboratory Room Location: ");
        String labRoomName = sc.next();
        System.out.print("Enter Lab Time: ");
        String labTime = sc.next();
        Course course = new Hybrid_Class(className, creditHours, classRoomName, labRoomName, classTime, labTime);
        courses.add(course);
        hybridCourses.add(course);
Collections.sort(hybridCourses);
        System.out.println("Hybrid Course successfully added to the School System.");
    }


    public static boolean addAPerson(Scanner sc) { //provide options to school to add what kind of person to school
        System.out.println("-------------------------------------------");
        System.out.println("Choose the type of person you want to add: ");
        System.out.println(" 1. Student");
        System.out.println(" 2. Instructor");
        System.out.println(" 3. Teaching Assistant");
        System.out.println(" 4. Lab Technician");
        System.out.println(" 5. Staff Member");
        System.out.println("Enter your choice: ");
        System.out.println("-------------------------------------------");
        String choice = sc.next();
        boolean goon = true;
        switch (choice) {
            case "1":
                addStudent(sc);
                goon = false;
                break;
            case "2":
                addInstructor(sc);
                goon = false;
                break;
            case "3":
                addTeachingAssistant(sc);
                goon = false;
                break;
            case "4":
                addLabTechnician(sc);
                goon = false;
                break;
            case "5":
                addStaffMember(sc);
                goon = false;
                break;
            default:
        }
        return goon;
    }

    public static void addStudent(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter student's full name: ");
        String name = sc.next() + sc.nextLine();
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        Student student = new Student(name, id);
        students.add(student);
Collections.sort(students);
        System.out.println("Student successfully added to the School System.");
    }

    public static void addInstructor(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter instructor's full name: ");
        String name = sc.next() + sc.nextLine();
        Instructor instructor = new Instructor(name);
        instructors.add(instructor);
Collections.sort(instructors);
        System.out.println("Instructor successfully added to the School System.");
    }

    public static void addTeachingAssistant(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter teaching assistants's full name: ");
        String name = sc.next() + sc.nextLine();
        Teaching_Assistant teachingAssistant = new Teaching_Assistant(name);
        teachingAssistants.add(teachingAssistant);
Collections.sort(teachingAssistants);
        System.out.println("Teaching Assistant successfully added to the School System.");
    }

    public static void addLabTechnician(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter lab technician's full name: ");
        String name = sc.next() + sc.nextLine();
        Lab_Technician labTechnician = new Lab_Technician(name);
        labTechnicians.add(labTechnician);
Collections.sort(labTechnicians);
        System.out.println("Lab Technician successfully added to the School System.");
    }

    public static void addStaffMember(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter staff member's full name: ");
        String name = sc.next() + sc.nextLine();
        Staff_Member staffMember = new Staff_Member(name);
        staffMembers.add(staffMember);
Collections.sort(staffMembers);
        System.out.println("Staff Member successfully added to the School System.");
    }

    public static boolean assignPersonnel(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.println("Choose the type of personnel you want to assign to a course: ");
        System.out.println(" 1. Instructor");
        System.out.println(" 2. Teaching Assistant");
        System.out.println(" 3. Lab technician");
        System.out.println(" 4. Staff Member");
        System.out.println("Enter your choice: ");
        System.out.println("-------------------------------------------");
        String choice = sc.nextLine();
        boolean goon = true;
        switch (choice) {
            case "1":
                assignInstructorToACourse(sc);
                goon = false;
                break;
            case "2":
                assignTeachingAssistantToACourse(sc);
                goon = false;
                break;
            case "3":
                assignLabTechnicianToACourse(sc);
                goon = false;
                break;
            case "4":
                assignStaffMemberToACourse(sc);
                goon = false;
                break;
            default:
        }
        return goon;
    }

    public static void assignInstructorToACourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter the instructor's full name: ");
        String tempName = sc.nextLine();
        Instructor foundInstructor = searchForInstructor(tempName);
        if (foundInstructor != null) {
            System.out.print("Enter the name of the course that the instructor will teach: ");
            String tempCourseName = sc.nextLine();
            Course foundCourse = searchForCourse(tempCourseName);
            if (foundCourse != null && foundCourse.hasInstructorSpace()) {
                foundCourse.addInstructorToCourse(foundInstructor);
                System.out.println("Instructor successfully assigned to " + tempCourseName);
            } else {
                System.out.println("The instructor was not successfully assigned to this course because " +
                        "it has reached its maximum instructor capacity or this course does not exist. " +
                        "Create the desired course or assign a different course.");
            }
        } else {
            System.out.println("Please create an instructor.");
        }
    }


    public static void assignTeachingAssistantToACourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter the teaching Assistant's full name: ");
        String tempName = sc.nextLine();
        Teaching_Assistant foundTeachingAssistant = searchForTeachingAssistant(tempName);
        if (foundTeachingAssistant != null) {
            System.out.print("Enter the name of the course that the teaching assistant will assist in: ");
            String tempCourseName = sc.nextLine();
            Course foundCourse = searchForCourse(tempCourseName);
            if (foundCourse != null && foundCourse.hasTeachingAssistantSpace()) {
                foundCourse.addTeachingAssistantToCourse(foundTeachingAssistant);
                System.out.println("Teaching assistant successfully assigned to " + tempCourseName);
            } else {
                System.out.println("The teaching assistant was not successfully assigned to this course because " +
                        "it has reached its maximum teaching assistant capacity or this course does not exist. " +
                        "Create the desired course or assign a different course.");
            }
        } else {
            System.out.println("Please create a teaching assistant.");
        }
    }

    public static void assignLabTechnicianToACourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter the lab technician's full name: ");
        String tempName = sc.nextLine();
        Lab_Technician foundLabTechnician = searchForLabTechnician(tempName);
        if (foundLabTechnician != null) {
            System.out.print("Enter the name of the course that the lab technician will teach: ");
            String tempCourseName = sc.nextLine();
            Course foundCourse = searchForCourse(tempCourseName);
            if (foundCourse != null && foundCourse.hasLabTechnicianSpace() && foundCourse.hasLaboratory()) {
                foundCourse.addLabTechnicianToCourse(foundLabTechnician);
                System.out.println("Lab technician successfully assigned to " + tempCourseName);
            } else {
                System.out.println("The lab technician was not successfully assigned to this course because " +
                        "it has reached its maximum lab technician capacity or this course does not exist, or this class doesn't requre laboratory. " +
                        "Create the desired course or assign a different course.");
            }
        } else {
            System.out.println("Please add a lab technician.");
        }
    }

    public static void assignStaffMemberToACourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter the staff member's full name: ");
        String tempName = sc.nextLine();
        Staff_Member foundStaffMember = searchForStaffMember(tempName);
        if (foundStaffMember != null) {
            System.out.print("Enter the name of the course that the staff member will work in: ");
            String tempCourseName = sc.nextLine();
            Course foundCourse = searchForCourse(tempCourseName);
            if (foundCourse != null && foundCourse.hasLabTechnicianSpace()) {
                foundCourse.addStaffMemberToCourse(foundStaffMember);
                System.out.println("Staff Member successfully assigned to " + tempCourseName);
            } else {
                System.out.println("The staff member was not successfully assigned to this course because " +
                        "it has reached its maximum staff member capacity or this course does not exist. " +
                        "Create the desired course or assign a different course.");
            }
        } else {
            System.out.println("Please add a staff member.");
        }
    }

    public static void registerForACourse(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.print("Enter your ID: ");
        int tempID = sc.nextInt();
        Student foundStudent = searchForStudent(tempID);
        if (foundStudent != null) {
            System.out.print("Enter the name of the course you want to enroll in: ");
            String tempCourseName = sc.nextLine() + sc.nextLine();
            Course foundCourse = searchForCourse(tempCourseName);
//            System.out.println("LIMIT: " + foundStudent.getCREDIT_LIMIT());
//            System.out.println("Current: " + foundStudent.getCurrentCredits());
            if (foundCourse != null && foundCourse.hasStudentSpace()) {
//                System.out.println("Course: " + foundCourse.getCreditHours());
                if (foundStudent.getCurrentCredits() + foundCourse.getCreditHours() <= foundStudent.getCREDIT_LIMIT()) {
                    foundCourse.addStudentToCourse(foundStudent);
                    foundStudent.addCredits(foundCourse.getCreditHours());
//                    System.out.println("UPDATED: " + foundStudent.getCurrentCredits());
                    System.out.println("Student successfully enrolled to " + tempCourseName);
                } else {
                    System.out.println("The student was not successfully enrolled in this course because" +
                            " they have reached or will exceed their credit limit.");
                }
            } else {
                System.out.println("This course does not exist, or it has reached it maximum student capacity." +
                        " Create the desired course or enroll in a different course.");
            }
        } else {
            System.out.println("Please create a student.");
        }
    }


    public static Student searchForStudent(int tempId) {
        Student result = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == tempId) {
                return students.get(i);
            }
        }
        return result;
    }

    public static Course searchForCourse(String tempCourseName) {
        Course result = null;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getClassName().equals(tempCourseName)) {
                return courses.get(i);
            }
        }
        return result;
    }

    public static Instructor searchForInstructor(String tempName) {
        Instructor result = null;
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getName().equals(tempName)) {
                return instructors.get(i);
            }
        }
        return result;
    }

    public static Teaching_Assistant searchForTeachingAssistant(String tempName) {
        Teaching_Assistant result = null;
        for (int i = 0; i < teachingAssistants.size(); i++) {
            if (teachingAssistants.get(i).getName().equals(tempName)) {
                return teachingAssistants.get(i);
            }
        }
        return result;
    }

    public static Lab_Technician searchForLabTechnician(String tempName) {
        Lab_Technician result = null;
        for (int i = 0; i < labTechnicians.size(); i++) {
            if (labTechnicians.get(i).getName().equals(tempName)) {
                return labTechnicians.get(i);
            }
        }
        return result;
    }

    public static Staff_Member searchForStaffMember(String tempName) {
        Staff_Member result = null;
        for (int i = 0; i < staffMembers.size(); i++) {
            if (staffMembers.get(i).getName().equals(tempName)) {
                return staffMembers.get(i);
            }
        }
        return result;
    }

    public static boolean displayInformation(Scanner sc) {
        System.out.println("-------------------------------------------");
        System.out.println(" 1. Students");
        System.out.println(" 2. Instructors");
        System.out.println(" 3. Teacher Assistants");
        System.out.println(" 4. Lab Technicians");
        System.out.println(" 5. Staff Members");
        System.out.println(" 6. Face to Face");
        System.out.println(" 7. Synchronous Online");
        System.out.println(" 8. Asynchronous Online");
        System.out.println(" 9. Lecture Only");
        System.out.println(" 10. Laboratory Only");
        System.out.println(" 11. Hybrid (Lecture and Laboratory)");
        System.out.println(" 12. Display All People");
        System.out.println(" 13. Display All Courses");
        System.out.println(" 14. Display Everything");
        System.out.println("Select the Information you want to display: ");
        System.out.println("-------------------------------------------");
        String user = sc.nextLine();
        boolean goon = true;
        switch (user) {
            case "1":
                displayStudents();
                goon = false;
                break;
            case "2":
                displayInstructors();
                goon = false;
                break;
            case "3":
                displayTeacherAssistants();
                goon = false;
                break;
            case "4":
                displayLabTechnicians();
                goon = false;
                break;
            case "5":
                displayStaffMembers();
                goon = false;
                break;
            case "6":
                displayFaceToFaceCourses();
                goon = false;
                break;
            case "7":
                displaySyncOnlineCourses();
                goon = false;
                break;
            case "8":
                displayAsyncOnlineCourses();
                goon = false;
                break;
            case "9":
                displayLectureOnlyCourses();
                goon = false;
                break;
            case "10":
                displayLaboratoryOnlyCourses();
                goon = false;
                break;
            case "11":
                displayHybridCourses();
                goon = false;
                break;
            case "12":
                displayAllPeople();
                goon = false;
                break;
            case "13":
                displayAllCourses();
                goon = false;
                break;
            case "14":
                displayAllPeople();
                displayAllCourses();
                goon = false;
                break;
            default:
        }
        return goon;
    }


    public static void displayStudents() {
        System.out.println("-------------------------------------------");
        String studentList = "Students: [";
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName() != null) {
                studentList += students.get(i).getName() + ", ";
            }
        }
        if (students.size() == 0) {
            studentList += "  ";
        }
        System.out.println(studentList + "\b\b]");
    }

    public static void displayInstructors() {
        System.out.println("-------------------------------------------");
        String InstructorList = "Instructors: [";
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getName() != null) {
                InstructorList += instructors.get(i).getName() + ", ";
            }
        }
        if (instructors.size() == 0) {
            InstructorList += "  ";
        }
        System.out.println(InstructorList + "\b\b]");
    }

    public static void displayTeacherAssistants() {
        System.out.println("-------------------------------------------");
        String TeacherAssistantList = "Teacher Assistants: [";
        for (int i = 0; i < teachingAssistants.size(); i++) {
            if (teachingAssistants.get(i).getName() != null) {
                TeacherAssistantList += teachingAssistants.get(i).getName() + ", ";
            }
        }
        if (teachingAssistants.size() == 0) {
            TeacherAssistantList += "  ";
        }
        System.out.println(TeacherAssistantList + "\b\b]");
    }

    public static void displayLabTechnicians() {
        System.out.println("-------------------------------------------");
        String labTechnicianList = "Lab Technicians: [";
        for (int i = 0; i < labTechnicians.size(); i++) {
            if (labTechnicians.get(i).getName() != null) {
                labTechnicianList += labTechnicians.get(i).getName() + ", ";
            }
        }
        if (labTechnicians.size() == 0) {
            labTechnicianList += "  ";
        }
        System.out.println(labTechnicianList + "\b\b]");
    }

    public static void displayStaffMembers() {
        System.out.println("-------------------------------------------");
        String staffMemberList = "Staff Members: [";
        for (int i = 0; i < staffMembers.size(); i++) {
            if (staffMembers.get(i).getName() != null) {
                staffMemberList += staffMembers.get(i).getName() + ", ";
            }
        }
        if (staffMembers.size() == 0) {
            staffMemberList += "  ";
        }
        System.out.println(staffMemberList + "\b\b]");
    }

    public static void displayFaceToFaceCourses() {
        System.out.println("-------------------------------------------");
        for (int i = 0; i < faceToFaceCourses.size(); i++) {
            System.out.print(faceToFaceCourses.get(i).toString());
        }
    }

    public static void displaySyncOnlineCourses() {
        System.out.println("-------------------------------------------");
        for (int i = 0; i < syncOnlineCourses.size(); i++) {
            System.out.print(syncOnlineCourses.get(i).toString());
        }
    }

    public static void displayAsyncOnlineCourses() {
        System.out.println("-------------------------------------------");
        for (int i = 0; i < asyncOnlineCourses.size(); i++) {
            System.out.print(asyncOnlineCourses.get(i).toString());
        }
    }

    public static void displayLectureOnlyCourses() {
        System.out.println("-------------------------------------------");
        for (int i = 0; i < lectureOnlyCourses.size(); i++) {
            System.out.print(lectureOnlyCourses.get(i).toString());
        }
    }

    public static void displayLaboratoryOnlyCourses() {
        System.out.println("-------------------------------------------");
        for (int i = 0; i < laboratoryOnlyCourses.size(); i++) {
            System.out.print(laboratoryOnlyCourses.get(i).toString());
        }
    }

    public static void displayHybridCourses() {
        System.out.println("-------------------------------------------");
        for (int i = 0; i < hybridCourses.size(); i++) {
            System.out.print(hybridCourses.get(i).toString());
        }
    }

    public static void displayAllCourses() {
        displayFaceToFaceCourses();
        displaySyncOnlineCourses();
        displayAsyncOnlineCourses();
        displayLectureOnlyCourses();
        displayLaboratoryOnlyCourses();
        displayHybridCourses();
    }

    public static void displayAllPeople() {
        displayStudents();
        displayInstructors();
        displayTeacherAssistants();
        displayLabTechnicians();
        displayStaffMembers();
    }

	public static String searchForCourseByName(Scanner sc) throws NullPointerException {
        System.out.println("-------------------------------------------");
        System.out.print("Enter the name of the personnel member you want to search courses by: ");
        String tempPersonnelName = sc.next();

        String result = "[";

        try {
            for (int i = 0; i < courses.size(); i++) {
                Instructor[] instructorList = courses.get(i).getInstructorsInCourse();
                Teaching_Assistant[] teachingAssistantList = courses.get(i).getTeachingAssistantsInCourse();
                Lab_Technician[] labTechnicianList = courses.get(i).getLabTechniciansInCourse();
                Staff_Member[] staffMemberList = courses.get(i).getStaffMembersInCourse();

                for (int j = 0; j < instructorList.length; j++) {
                    if (instructorList[j].getName() != null) {
                        if (instructorList[j].getName() == tempPersonnelName) {
                            result += courses.get(j).getClassName() + ", ";
                        }
                    }
                    break;
                }

                for (int j = 0; j < teachingAssistantList.length; j++) {
                    if (teachingAssistantList[j].getName() != null) {
                        if (teachingAssistantList[j].getName() == tempPersonnelName) {
                            result += courses.get(j).getClassName() + ", ";
                        }
                    }
                    break;
                }

                for (int j = 0; j < labTechnicianList.length; j++) {
                    if (labTechnicianList[j].getName() != null) {
                        if (labTechnicianList[j].getName() == tempPersonnelName) {
                            result += courses.get(j).getClassName() + ", ";
                        }
                    }
                    break;
                }

                for (int j = 0; j < staffMemberList.length; j++) {
                    if (staffMemberList[j].getName() != null) {
                        if (staffMemberList[j].getName() == tempPersonnelName) {
                            result += courses.get(j).getClassName() + ", ";
                        }
                    }
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        return result;
    }
}
