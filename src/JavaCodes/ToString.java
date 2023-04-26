package JavaCodes;

public class ToString {

    int empid;
    String empname;
    String address;

    @Override
    public String toString() {
        return this.empid+" "+this.empname+" "+this.address;
    }

    public ToString(int empid, String empname, String address) {
        this.empid=empid;
        this.empname=empname;
        this.address=address;
    }
}
