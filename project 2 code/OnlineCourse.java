public class OnlineCourse extends Course {
  private String website; // website where online classes meet
  private String assignmentHub; // where class assignments are hosted



  public OnlineCourse(String title, int creditHours, String website, String assignmentHub) {
    super(title, creditHours);
    this.website = website;
    this.assignmentHub = assignmentHub;

  }

  public String toString() {

    return String.format("%s website: %s assignmentHub: %s",
            super.toString(), website, assignmentHub);
  }

  public String getWebsite() {
    return website ;
  }

  public String getAssignmentHub() {
    return assignmentHub;
  }

}
