package Bank;

class Employee {

    String emp_name;
    String emp_adhaar_no;
    String emp_address;

    @Override
    public String toString() {
        return "Employee [emp_name=" + emp_name + ", emp_adhaar_no=" + emp_adhaar_no + ", emp_address=" + emp_address
                + "]";
    }

    public Employee(String emp_name, String emp_adhaar_no, String emp_address) {
        this.emp_name = emp_name;
        this.emp_adhaar_no = emp_adhaar_no;
        this.emp_address = emp_address;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_adhaar_no() {
        return emp_adhaar_no;
    }

    public void setEmp_adhaar_no(String emp_adhaar_no) {
        this.emp_adhaar_no = emp_adhaar_no;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

}
