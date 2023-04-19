package FundamentalJavai;

public class ComplexUse {

	public static void main(String[] args) {

		Complex c1= new Complex(2,3);
//		c1.print();
		c1.setReal(5);
		c1.setImag(3);
//		c1.print();
		
		Complex c2= new Complex(2,3);
		c1.multiply(c2);
		c1.print();
		c2.print();
		
//		Complex c3= Complex.add(c1, c2);
//		c3.print();
//		c1.print();
//		c2.print();
		
		
		
	}

}
