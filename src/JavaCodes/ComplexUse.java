package JavaCodes;
class ComplexUse 
{
	public static void main(String[] args) 
	{
		Complex c1 = new Complex(2,3);
		c1.print();
		c1.setReal(4);
		c1.setImag(10);
		c1.print();

		Complex c2 = new Complex(2,3);
		c1.add(c2);
		c1.print();
		c2.print();

		Complex c3 = new Complex(2,3);
		c3.mult(c2);
		c3.print();
		c2.print();

		Complex c4 = Complex.add(c1,c2);
		c1.print();
		c2.print();
		c4.print();
	}
}
