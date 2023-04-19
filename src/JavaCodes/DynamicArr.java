package JavaCodes;
class DynamicArr{

	int data[];
	int nextIndex;

	public DynamicArr(){
		data = new int[5];
		nextIndex=0;
	}

	public int size(){
		return nextIndex;
	}

	public boolean isEmpty(){
		return nextIndex==0;
	}

	public int get(int index) throws InvalidIndexException{
		if(index >= nextIndex){
			throw new InvalidIndexException();
		}
		return data[index];
	}

	public void set(int index,int element) throws InvalidIndexException{
		if(index >= nextIndex){
			throw new InvalidIndexException();
		}
		data[index]=element;
	}

	public int removeLast(){
		int last = data[nextIndex-1];
		nextIndex--;
		return last;
	}

	public void add(int element){
		if(nextIndex==data.length){
			doubleCapacity();
		}
		data[nextIndex]=element;
		nextIndex++;
	}

	private void doubleCapacity(){
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<temp.length;i++){
			data[i]=temp[i];
		}
	}
	
}
