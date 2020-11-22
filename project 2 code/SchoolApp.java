import java.util.Scanner;

public class SchoolApp {

    private static School defaultSchool = new School();
    private static Scanner sc = new Scanner(System.in);

    private static boolean courseAdded = false;
    private static boolean hybridAdded = false;
    private static boolean onlineAdded = false;
    private static boolean studentAdded = false;
    private static boolean instructorAdded = false;
    private static boolean labTechnicianAdded = false;
    private static boolean assistantAdded = false;

    private static int courseNum = 0;

    public static void main(String[] args) {
        boolean trigger = true;
        while (trigger == true) {
            trigger = mainMenu();
            System.out.println();
        }
    }

    public static boolean mainMenu() {
        System.out.println("1. Add new course");
        System.out.println("2. Enroll student");
        System.out.println("3. Hire Instructor");
        System.out.println("4. Hire Lab Technician");
        System.out.println("5. Hire Teaching Assistant");
        System.out.println("6. Enroll in a Lecture course");
        System.out.println("7. Enroll in a Hybrid course");
        System.out.println("8. Enroll in an Online course");
        System.out.println("9. Display Lectures");
        System.out.println("10. Display Hybrids");
        System.out.println("11. Display Online Courses");
        System.out.println("12. Display Student Enrollment");
        System.out.println("13. Display Courses Taught By Instructors");
        System.out.println("0. Exit App\n");

        System.out.print("Enter your choice: ");
        String answer = sc.nextLine();
        boolean trigger = true;
        switch (answer) {
            case "1":
                System.out.println("\nSelect the type of course to create \n1. Lecture (face-to-face)\n2. Hybrid (lab + lecture)\n3. Online");
                String courseType = sc.nextLine();
            switch (courseType) {
                case "1":
                createCourse();
                courseAdded = true;
                break;
                case "2":
                createHybrid();
                hybridAdded = true;
                break;
                case "3":
                createOnlineCourse();
                onlineAdded = true;
                break;
                default:
                  System.out.print("\nPlease select a course type to create\n ");
              }
                break;

            case "2":
                addStudentToCourse();
                studentAdded = true;
                break;
            case "3":
                hireInstructor();
                instructorAdded = true;
                break;
            case "4":
                hireLabTechnician();
                labTechnicianAdded = true;
                break;
            case "5":
                hireTeachingAssistant();
                assistantAdded = true;
                break;

            case "6":
                if (courseAdded == false || studentAdded == false || instructorAdded == false) {
                    System.out.println();
                    if (courseAdded == false) {
                        System.out.println("Please add a course first.");
                    }
                    if (studentAdded == false) {
                        System.out.println("Please add a student first.");
                    }
                    if (instructorAdded == false) {
                        System.out.println("Please add a instructor first.");
                    }
                    break;
                } else {
                    Course selectedCourse = callUponCourse();
                    System.out.println("Selected Course: " + selectedCourse.getTitle() + " (credits:" + selectedCourse.getCreditHours() + ")");
                    boolean loop = true;
                    while (loop == true) {
                        System.out.println("\n1. Assign Instructor");
                        System.out.println("2. Assign Student");
                        System.out.println("3. Display Course Enrollment");
                        System.out.println("0. Return To Main Menu");
                        System.out.print("\nEnter your choice: ");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "1":
                                assignInstructor(selectedCourse);
                                System.out.print("Would you like to add a teaching assistant?\n1. Yes\n2. No ");
                                String assistant = sc.nextLine();
                            switch (assistant) {
                                case "1":
                                  if (assistantAdded == false) {
                                  System.out.println("Please add a teaching assistant");
                                  break;
                                } else {
                                  assignTeachingAssistant(selectedCourse);
                                  System.out.println("You have added a teaching assistant to this course.");
                                }
                                case "2":
                                  assistantAdded = false;
                                  break;
                                }
                                break;
                            case "2":
                                assignStudent(selectedCourse);
                                break;
                            case "3":
                                displayCourseEnrollment(selectedCourse);
                                break;
                            case "0":
                                loop = false;
                                break;
                            default:
                                System.out.println("User Input Incorrect, Please Reselect A Choice: ");

                        }
                    }
                }
                break;

            case "7":
                if (hybridAdded == false || studentAdded == false || instructorAdded == false || labTechnicianAdded == false) {
                    System.out.println();
                    if (hybridAdded == false) {
                      System.out.println("Please create a hybrid course first.");
                    }
                    if (studentAdded == false) {
                        System.out.println("Please add a student first.");
                    }
                    if (instructorAdded == false) {
                        System.out.println("Please hire an instructor first.");
                    }
                    if (labTechnicianAdded == false) {
                        System.out.println("Please hire a lab tech first.");
                    }
                    break;
                } else {
                    Laboratory selectedCourse = callUponHybrid();
                    System.out.println("Selected Course: " + selectedCourse.getTitle() + " (credits:" + selectedCourse.getCreditHours() + ", (Lab type " + selectedCourse.getLabType() + ")");
                    boolean loop = true;
                    while (loop == true) {
                        System.out.println("\n1. Assign Instructor");
                        System.out.println("2. Assign Student");
                        System.out.println("3. Assign Lab Tech");
                        System.out.println("4. Display Course Enrollment");
                        System.out.println("0. Return To Main Menu");
                        System.out.print("\nEnter your choice: ");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "1":
                                assignInstructor(selectedCourse);
                                break;
                            case "2":
                                assignStudent(selectedCourse);
                                break;
                            case "3":
                                assignLabTech(selectedCourse);
                                break;
                            case "4":
                                displayHybridEnrollment(selectedCourse);
                                break;
                            case "0":
                                loop = false;
                                break;
                            default:
                                System.out.println("User Input Incorrect, Please Reselect A Choice: ");

                        }
                    }
                }
                break;

            case "8":
                if (onlineAdded == false || studentAdded == false || instructorAdded == false) {
                    System.out.println();
                    if (onlineAdded == false) {
                        System.out.println("Please create an online course first.");
                    }
                    if (onlineAdded == false) {
                        System.out.println("Please add a student first.");
                    }
                    if (onlineAdded == false) {
                        System.out.println("Please hire a instructor first.");
                    }
                    break;
                } else {
                    OnlineCourse selectedCourse = callUponOnlineCourse();
                    System.out.println("Selected Course: " + selectedCourse.getTitle() + " (credits:" + selectedCourse.getCreditHours() + ")");
                    boolean loop = true;
                    while (loop == true) {
                        System.out.println("\n1. Assign Instructor");
                        System.out.println("2. Assign Student");
                        System.out.println("3. Display Course Enrollment");
                        System.out.println("0. Return To Main Menu");
                        System.out.print("\nEnter your choice: ");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "1":
                                assignInstructor(selectedCourse);
                                System.out.print("Would you like to add a teaching assistant?\n1. Yes\n2. No ");
                                String assistant = sc.nextLine();
                            switch (assistant) {
                                case "1":
                                  if (assistantAdded == false) {
                                  System.out.println("Please add a teaching assistant");
                                  break;
                                } else {
                                  assignTeachingAssistant(selectedCourse);
                                  System.out.println("You have added a teaching assistant to this course.");
                                }
                                case "2":
                                  assistantAdded = false;
                                  break;
                                }
                                break;
                            case "2":
                                assignStudent(selectedCourse);
                                break;
                            case "3":
                                displayOnlineEnrollment(selectedCourse);
                                break;
                            case "0":
                                loop = false;
                                break;
                            default:
                                System.out.println("User Input Incorrect, Please Reselect A Choice: ");

                        }
                    }
                }

            case "9":
                System.out.println("\nFace-to-face Lecture Info:");
                defaultSchool.printCoursesInfo();
                break;
            case "10":
                System.out.println("\nHybrid Info:");
                defaultSchool.printHybridInfo();
                break;
            case "11":
                System.out.println("\nOnline Course Info:");
                defaultSchool.printOnlineCourseInfo();
                break;
            case "12":
                System.out.println("\nStudents:");
                defaultSchool.printStudents();
                break;
            case "13":
                defaultSchool.searchCourse();


                break;
            case "0":
                trigger = false;
                break;
            default:
                System.out.println("User Input Incorrect, Please Reselect A Choice.");
        }
        return trigger;
    }

    // start of methods
    public static void createCourse() {
         int creditHours = 0;

         System.out.print("\nWhat is the name of the course? ");
         String courseName = sc.nextLine();

         System.out.print("How many credit hours are there? ");

         while(true) {
           try {
              creditHours = Integer.parseInt(sc.next());
              break;
        }   catch (NumberFormatException e) {
            System.out.println("Please enter a number");
        }
    }
         Course course = new Course(courseName, creditHours);
         defaultSchool.addCourse(course);
         sc.nextLine();
     }

     public static void createOnlineCourse() {
          int creditHours = 0;
          String website = "This class does not meet";
          String assignmentHub = "";

          System.out.print("\nWhat is the name of the course? ");
          String courseName = sc.nextLine();

          System.out.println("What type of online course is this? ");
          System.out.println("1. Asynchronous            2. Synchronous");
          String answer = sc.nextLine();
            switch (answer) {
            case "1":
              System.out.println("This is now an asynchronous course");
              System.out.println("Where are class assignments hosted?");
              assignmentHub = sc.nextLine();
              break;
            case "2":
              System.out.println("This is now an synchronous course");
              System.out.println("\nWhat website does class meet on?");
              website = sc.nextLine();
              System.out.println("\nWhere are class assignments hosted?");
              assignmentHub = sc.nextLine();
              break;
              default: System.out.println("Please select the type of online course");
          }

          System.out.println("How many credit hours are there? ");

          while(true) {
            try {
               creditHours = sc.nextInt();
               break;
         }   catch (NumberFormatException e) {
             System.out.println("Please enter a number");
         }
     }
          OnlineCourse online = new OnlineCourse(courseName, creditHours, website, assignmentHub);
          defaultSchool.addOnlineCourse(online);
          sc.nextLine();
      }

     public static void createHybrid() {
          int creditHours = 0;

          System.out.print("\nWhat is the name of the course? ");
          String courseName = sc.nextLine();

          System.out.print("What type of lab does this course require? ");
          String labType = sc.nextLine();

          System.out.print("How many credit hours are there? ");

          while(true) {
            try {
              creditHours = Integer.parseInt(sc.next());
              break;
         }   catch (NumberFormatException e) {
             System.out.println("Please enter a number");
         }
     }
          Laboratory lab = new Laboratory(courseName, creditHours, labType);
          defaultSchool.addLab(lab);
          sc.nextLine();
      }

    public static void addStudentToCourse() {
        System.out.print("\nEnter the student's full name: ");
        String name = sc.nextLine();
        Student student = new Student(name);
        defaultSchool.enrollStudent(student);
    }

    public static void hireInstructor() {
        System.out.print("\nEnter the Instructor's full name: ");
        String name = sc.nextLine();
        Instructor instructor = new Instructor(name);
        defaultSchool.enrollInstructor(instructor);
    }

    public static void hireLabTechnician() {
        System.out.print("\nEnter the Lab Tech's full name: ");
        String name = sc.nextLine();
        LabTechnician labTech = new LabTechnician(name);
        defaultSchool.enrollLabTechnician(labTech);
    }

    public static void hireTeachingAssistant() {
        System.out.print("\nEnter the TA's full name: ");
        String name = sc.nextLine();
        TeachingAssistant assistant = new TeachingAssistant(name);
        defaultSchool.enrollTeachingAssistant(assistant);

    }

    public static Course callUponCourse() {
        System.out.println("\nCourses: ");
        int number = defaultSchool.printCourses();
        System.out.print("\nSelect a course(#1-10): ");
        if (!sc.hasNextInt()) {
            System.out.print("Please Enter A Number: ");
            sc.next();
        }
        int courseNum = sc.nextInt();
        while (courseNum > number || courseNum < 1) {
            System.out.print("Please Enter A Number That Exist: ");
            courseNum = sc.nextInt();
        }
        sc.nextLine();
        System.out.println();

        return defaultSchool.getCourses()[courseNum - 1];
    }

    public static Laboratory callUponHybrid() {
        System.out.println("\nHybrids: ");
        int number = defaultSchool.printHybrids();
        System.out.print("\nSelect a course(#1-10): ");
        if (!sc.hasNextInt()) {
            System.out.print("Please Enter A Number: ");
            sc.next();
        }
        int courseNum = sc.nextInt();
        while (courseNum > number || courseNum < 1) {
            System.out.print("Please Enter A Number That Exist: ");
            courseNum = sc.nextInt();
        }
        sc.nextLine();
        System.out.println();

        return defaultSchool.getLabs()[courseNum - 1];
    }

    public static OnlineCourse callUponOnlineCourse() {
        System.out.println("\nOnline Courses: ");
        int number = defaultSchool.printOnlineCourses();
        System.out.print("\nSelect a course(#1-10): ");
        if (!sc.hasNextInt()) {
            System.out.print("Please Enter A Number: ");
            sc.next();
        }
        int courseNum = sc.nextInt();
        while (courseNum > number || courseNum < 1) {
            System.out.print("Please Enter A Number That Exist: ");
            courseNum = sc.nextInt();
        }
        sc.nextLine();
        System.out.println();

        return defaultSchool.getOnlineCourses()[courseNum - 1];
    }

    public static void assignInstructor(Course course) {
        System.out.println("\nInstructors: ");
        int number = defaultSchool.printInstructors();

        System.out.print("\nPick Instructor Number: ");
        if (!sc.hasNextInt()) {
            System.out.print("Please Enter A Number: ");
            sc.next();
        }
        int instructorIndex = sc.nextInt();
        while (instructorIndex > number || instructorIndex < 1) {
            System.out.print("Please Enter A Number That Exist: ");
            instructorIndex = sc.nextInt();
        }

        boolean resolved = course.addInstructor(defaultSchool.getInstructors()[instructorIndex - 1]);

        if (resolved) {
            System.out.println("\nInstructor succesfully added.");
        } else {
            System.out.println("\nInstructor was not added.");
        }

        sc.nextLine();
    }

    public static void assignLabTech(Laboratory lab) {
        System.out.println("\nLab technicians: ");
        int number = defaultSchool.printLabTechnicians();

        System.out.print("\nPick Lab Tech Number: ");
        if (!sc.hasNextInt()) {
            System.out.print("Please Enter A Number: ");
            sc.next();
        }
        int techIndex = sc.nextInt();
        while (techIndex > number || techIndex < 1) {
            System.out.print("Please Enter A Number That Exist: ");
            techIndex = sc.nextInt();
        }

        boolean resolved = lab.addLabTechnician(defaultSchool.getLabTechnicians()[techIndex - 1]);

        if (resolved) {
            System.out.println("\nLab tech succesfully added.");
        } else {
            System.out.println("\nLab tech was not added.");
        }
        sc.nextLine();
    }

    public static void assignTeachingAssistant(Course assistant) {
        System.out.println("\nTAs: ");
        int number = defaultSchool.printTeachingAssistants();

        System.out.print("\nPick Assistant Number: ");
        if (!sc.hasNextInt()) {
            System.out.print("Please Enter A Number: ");
            sc.next();
        }
        int assistantIndex = sc.nextInt();
        while (assistantIndex > number || assistantIndex < 1) {
            System.out.print("Please Enter A Number That Exist: ");
            assistantIndex = sc.nextInt();
        }

        boolean resolved = assistant.addTeachingAssistant(defaultSchool.getTeachingAssistants()[assistantIndex - 1]);

        if (resolved) {
            System.out.println("\nTA succesfully added.");
        } else {
            System.out.println("\nTA was not added.");
        }
        sc.nextLine();
    }

    public static void assignStudent(Course course) {
        System.out.println("\nStudents:");
        int number = defaultSchool.printStudents();

        System.out.print("\nPick Student Number: ");
        if (!sc.hasNextInt()) {
            System.out.print("Please Enter A Number: ");
            sc.next();
        }
        int studentIndex = sc.nextInt();
        while (studentIndex > number || studentIndex < 1) {
            System.out.print("Please Enter A Number That Exist: ");
            studentIndex = sc.nextInt();
        }

        boolean resolved = course.addStudent(defaultSchool.getStudents()[studentIndex - 1]);

        if (resolved) {
            System.out.println("\nStudent succesfully added.");
        } else {
            System.out.println("\nStudent was not added.");
        }
        sc.nextLine();
    }

    public static void displayCourseEnrollment(Course course) {
        System.out.println("Instructors: ");
        course.printInstructors();

        System.out.println("\nStudents: ");
        course.printStudents();

        System.out.println("\nTeaching Assistants: ");

    }

    public static void displayHybridEnrollment(Laboratory course) {
        System.out.println("Instructors: ");
        course.printInstructors();

        System.out.println("\nStudents: ");
        course.printStudents();

        System.out.println("\nTeaching Assistants: ");
        course.printTeachingAssistants();

        System.out.println("\nLab Technicians: ");
        course.printLabTechnicians();

}

    public static void displayOnlineEnrollment(OnlineCourse course) {
       System.out.println("Instructors: ");
       course.printInstructors();

       System.out.println("\nStudents: ");
       course.printStudents();

       System.out.println("\nTeaching Assistants: ");
       course.printTeachingAssistants();

}
    public static void findCoursesTaught() {


      System.out.println("Enter the name of instructor");
      String name = sc.nextLine();

      defaultSchool.searchInstructor(name);
    }

}
