class Person {
    String name = "Rahul";
}
//Create a parent class Person and child class Employee. Display name and employee ID.
class Employee extends Person {
    int id = 101;

    void display() {
        System.out.println(name);
        System.out.println(id);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}
