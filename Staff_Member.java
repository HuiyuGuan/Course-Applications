class Staff_Member extends Personnel implements Comparable<Staff_Member>{
    private String name;

    public Staff_Member(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }
    public int compareTo(Staff_Member staffMembers) {
       return name.compareTo(staffMembers.name);
    }
}
