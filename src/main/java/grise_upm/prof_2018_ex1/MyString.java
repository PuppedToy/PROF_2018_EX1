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
		return this.value.compareTo(other.getValue());
	}

}
