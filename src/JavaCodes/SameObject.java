package JavaCodes;
class SameObject 
{
	int a=10;

	public static void main(String[] args) 
	{
		SameObject t = new SameObject();
		t.a=20;
		System.out.println(t.a);
		SameObject t1 = t;
		t1.a=30;
		System.out.println(t.a);
	}
}
