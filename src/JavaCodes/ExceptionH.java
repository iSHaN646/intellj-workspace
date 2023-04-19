package JavaCodes;
class ExceptionH 
{
	public static void divide(int a,int b) throws DivideByZeroException {
		if(b==0){
			throw new DivideByZeroException();
		}
		System.out.println(a/b);
	}

	public static void main(String[] args) 
	{
		try{
			divide(4,0);
		}catch(DivideByZeroException e){
			System.out.println("Cannot divide by zero: " + e);
		}
		
		System.out.println("Main");
	}
}
