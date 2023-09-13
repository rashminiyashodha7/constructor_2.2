public class Student_1 {
    private String Name;
    private int Age;
    private char Grade;

    public void Student1() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public char getGrade() {
        return Grade;
    }

    public void setGrade(char Grade) {
        this.Grade = Grade;
    }
}

class Student2 {
    public static void main(String[] args) {
        Student_1 st = new Student_1();
        st.setName("Rashmini yashodha");
        st.setAge(21);
        st.setGrade('A');
        System.out.println("Name=" + st.getName() + "\n" + "Age=" + st.getAge() + "\n" + "Grade=" + st.getGrade());


    }
}