public class Laboratory extends Course {
  private String labType;
  private int labRoom = (int) (Math.random() * 25);

  public Laboratory(String title, int creditHours, String labType) {
    super(title, creditHours);
    this.labType = labType;
  }

  public String toString() {

    return String.format("%s Lab type: %s Lab Room information: %s",
            super.toString(), labType, labRoom);
  }


  public String getLabType() {
    return labType;
  }

  public int getLabRoom() {
    return labRoom;
  }

}
