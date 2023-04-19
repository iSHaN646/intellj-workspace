// Use of this keyword on 11 april
package JavaCodes;
class This 
{
	
	void fun(){
		System.out.println("i am in fun()");
		System.out.println("this: " + this);
	}

	public static void main(String[] args) 
	{
		This t=new This();
		System.out.println("t " + t);
        t.fun();
		This t1=new This();
		System.out.println("t1 " + t1);
		t1.fun();

	}
}
