package grise_upm.prof_2018_ex1;

public class MyString {

	private String value;
	
	public void MyString(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public int compareTo(MyString other) {
		
		// nodo 1
		if(other == null)
			// nodo 2
			return -1;
		// nodo 3
		if(this.value != null && other.getValue() == null)
			// nodo 4
			return -1;
		// nodo 5
		if(this.value == null && other.getValue() != null)
			// nodo 6
			return 1;
		// nodo 7
		if(this.value == null && other.getValue() == null) 
			// nodo 8
			return 0;
		
		for(int i = 0; 
				// nodo 9
				i < this.value.length()
				// nodo 10
				&& i < other.getValue().length();
				i++) {
			// nodo 11
			if(this.value.charAt(i) < other.getValue().charAt(i)) 
				// nodo 12
				return -1;
			// nodo 13
			else if(this.value.charAt(i) > other.getValue().charAt(i)) 
				// nodo 14
				return 1;
		}
		
		// nodo 15
		if(this.value.length() < other.getValue().length()) 
			// nodo 16
			return -1;
		// nodo 17
		else if(this.value.length() > other.getValue().length()) 
			// nodo 18
			return 1;
		
		// nodo 19
		return 0;
		
	}

}
