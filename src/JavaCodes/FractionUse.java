package JavaCodes;
class FractionUse 
{
	public static void main(String[] args) 
	{
		Fraction f1=new Fraction(2,3); 
		Fraction f2=new Fraction(4,2);
		f1.print();
		f2.print();
		f1.setNumenator(5);
		f1.print();
		f2.increment();
		f2.print();
		f1.add(f2);
		f1.print();
		f2.print();
		
	}
}
