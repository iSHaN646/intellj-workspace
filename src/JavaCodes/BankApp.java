//BankDetails Use class creating array of BankDetails objects on 12 april
package JavaCodes;
class BankApp 
{
	public static void main(String[] args) 
	{
		BankDetails Customer[] = new BankDetails[5];

		for(int i=0;i<Customer.length;i++){
			Customer[i] = new BankDetails();
			Customer[i].openAccount();
		}
		System.out.println("Details of customer 2:");
		Customer[2].getDetails();
	}
}
