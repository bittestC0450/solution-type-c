package problem03;

public class MyStack {
	
	private String[] buffer;
	private int count = 0;

	public MyStack( int size ) {
		buffer = new String[size];
	}
	
	public void push(String item) {
		if(buffer.length <= count ) {
			String[] temp = new String[count+1];
			for(int i=0; i< buffer.length; i++) {
				temp[i] = buffer[i];
			}
			buffer = temp;
			count++;
			buffer[buffer.length-1] = item;
		}else {
			buffer[count] = item;
			count++;
		}
	}

	public String pop() {
		String output;
		if(count ==0) {
			return null;
		}else if(count <= buffer.length) {
			output = buffer[count-1];
			String[] temp = new String[count];
			for(int i=0; i< temp.length; i++) {
				temp[i] = buffer[i];
			}
			buffer = temp;
			count--;
			return output;
		}else {
			output= buffer[count-1];
			count--;
			return output;
		}
	}

	public boolean isEmpty() {
		if(count==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {
		return buffer.length;
	}
}