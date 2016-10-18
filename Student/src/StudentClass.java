public class StudentClass {
     private int id;
     private int marks;
     private String name;
     private String address;
     public int getId() {
            return id;
     }
     public void setId(int id) {
            this.id = id;
     }
     public int getMarks() {
            return marks;
     }
     public void setMarks(int marks) {
            this.marks = marks;
     }
     public String getName() {
            return name;
     }
     public void setName(String name) {
            this.name = name;
     }
     public String getAddress() {
            return address;
     }
     public void setAddress(String address) {
            this.address = address;
     }
     
     
     public StudentClass(int sid, String n, int m, String add){
            id = sid;
            marks = m;
            name = n;
            address = add;
     }
     
}
