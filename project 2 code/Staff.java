public class Staff{

    private String name;
		private static int count=0;
  	private int id;

    public Staff(String name) {
        this.name = name;
				id=count;
	 			count++;
    }

    public String toString() {
        return name + ", ID: " + id;
    }

    public String getName() {
        return name;
    }

		public int getId() {
	 			return id;

 }
 public boolean equals(Object obj) {
 				return ((Staff)obj).getId()==id;
 }

}
