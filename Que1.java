class Que1 {
    int rollNo;
    String name;
    double marks;

    void display() {
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.rollNo = 101;
        s.name = "Aman";
        s.marks = 85.5;
        s.display();
    }
}
