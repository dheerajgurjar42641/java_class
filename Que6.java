class Que6 {
  //Create an Employee class with private salary. Ensure salary cannot be negative.
    private double salary;

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Invalid Salary");
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Que6 e = new Que6();
        e.setSalary(40000);
        System.out.println(e.getSalary());
    }
}
