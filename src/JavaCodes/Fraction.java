package JavaCodes;
class Fraction 
{
	private int numenator;
	private int denomenator;

	public Fraction(int numenator,int denomenator){
		this.numenator=numenator;
		this.denomenator=denomenator;
		simplify();
	}

	private void simplify(){
		int gcd=1;
		int min=Math.min(numenator,denomenator);
		for(int i=2;i<=min;i++){
			if((numenator%i==0) && (denomenator%i==0)){
				gcd=i;
			}
		}
		this.numenator=this.numenator/gcd;
		this.denomenator=this.denomenator/gcd;
	}

	public void setNumenator(int numenator){
		this.numenator=numenator;
		simplify();
	}

	public void setDenomenator(int denomenator){
		this.denomenator=denomenator;
		simplify();
	}

	public void print(){
		System.out.println(numenator + "/" + denomenator);
	}

	public void increment(){
		this.numenator=this.numenator + this.denomenator;
		simplify();
	}

	public void add(Fraction f2){
		this.numenator = (this.numenator*f2.denomenator) + (f2.numenator*this.denomenator);
		this.denomenator = this.denomenator * f2.denomenator;
		simplify();
	}
}
