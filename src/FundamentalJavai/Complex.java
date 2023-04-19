package FundamentalJavai;

public class Complex {
	
	private int real;
	private int imag;
	
	public Complex(int real,int imag) {
		this.real=real;
		this.imag=imag;
	}
	
	public void print() {
		System.out.println(this.real + "+" + this.imag + "i");
	}
	
	public void setReal(int real) {
		this.real=real;
	}
	
	public void setImag(int imag) {
		this.imag=imag;
	}
	
	public void add(Complex c2) {
		this.real= this.real + c2.real;
		this.imag= this.imag + c2.imag;
	}
	
	public void multiply(Complex c2) {
		this.real= (this.real * c2.real) - (this.imag * c2.imag);
		this.imag= (this.real * c2.imag) + (this.imag * c2.real);
	}
	
	public static Complex add(Complex c1,Complex c2) {
		int r= c1.real + c2.real;
		int i= c1.imag + c2.imag;
		Complex c3 = new Complex(r,i);
		return c3;
	}

}
