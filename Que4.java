class Que4{
  int id;
  String name;
  double Salary;
  double AnnualSalary(){
    return Salary*12;
  }
  public static void main(String[] args){
    Que4 q = new Que4();
    q.id=101;
    q.name="Aman";
    q.Salary=30000;
    System.out.println(q.AnnualSalry());
  }
}
