package JavaCodes;
class Complex {

	private int real;
	private int imag;

	public Complex(int real,int imag){
		this.real=real;
		this.imag=imag;
	}

	public void setReal(int real){
		this.real=real;
	}

	public void setImag(int imag){
		this.imag=imag;
	}

	public void print(){
		System.out.println(this.real + " + " + this.imag + "i" );
	}

	public void add(Complex c2){
		this.real=this.real + c2.real;
		this.imag=this.imag + c2.imag;
	}

	public void mult(Complex c2){
		int nreal=(this.real * c2.real) - (this.imag * c2.imag);
		int nimag=(this.real * c2.imag) + (this.imag * c2.real);
		this.real=nreal;
		this.imag=nimag;
	}

	public static Complex add(Complex c1,Complex c2){
		int nreal=c1.real + c2.real;
		int nimag=c1.imag + c2.imag;
		Complex ans = new Complex(nreal,nimag);
		return ans;
	}
	
}
