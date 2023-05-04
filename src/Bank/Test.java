package Bank;

public class Test implements Bank{

    @Override
    public Employee getEmployeeDetails() {
      return new Employee("ISHAN", "98443"," #35");
    }

    public static void main(String[] args) {
        
        Test t=new Test();
        System.out.println(t.getEmployeeDetails());
    }
    
}
