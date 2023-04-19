package JavaCodes;
class DynamicArrUse 
{
	public static void main(String[] args) 
	{
		DynamicArr arr = new DynamicArr();
		for(int i=1;i<=10;i++){
			arr.add(i);
		}
		try{
			System.out.println(arr.get(4));
			System.out.println(arr.size());
			arr.set(31,21);
			System.out.println(arr.get(2));
		}catch(InvalidIndexException e){
			System.out.println("The Arr[Index] have no element: " + e);
		}
		System.out.println(arr.size());
		
	}
}
