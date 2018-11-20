package grise_upm.prof_2018_ex1;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class Test {
	
	private MyString ms1, ms2;
	
	public void assertMyStrings(int expected) {
		int actual = ms1.compareTo(ms2);
		assertEquals(expected, actual);
	}

	@org.junit.Test
	public void test_1_2() {
		ms1 = new MyString("");
		ms2 = null;
		
		int expected = -1;
		
		assertMyStrings(expected);	
	}
	
	@org.junit.Test
	public void test_1_3_4_20() {
		ms1 = new MyString("");
		ms2 = new MyString(null);
		
		int expected = -1;
		
		assertMyStrings(expected);	
	}
	
	@org.junit.Test
	public void test_1_3_5_6_21() {
		ms1 = new MyString(null);
		ms2 = new MyString("");
		
		int expected = 1;
		
		assertMyStrings(expected);	
	}
	
	@org.junit.Test
	public void test_1_3_5_7_8() {
		ms1 = new MyString(null);
		ms2 = new MyString(null);
		
		int expected = 0;
		
		assertMyStrings(expected);	
	}
	
	@org.junit.Test
	public void test_1_3_4__5_7_9_10_11_13_15_16() {
		ms1 = new MyString("a");
		ms2 = new MyString("aa");
		
		int expected = -1;
		
		assertMyStrings(expected);	
	}
	
	@org.junit.Test
	public void test_1_3_4__5_7_9_10_11_13_15_17_18() {
		ms1 = new MyString("aa");
		ms2 = new MyString("a");
		
		int expected = 1;
		
		assertMyStrings(expected);	
	}
	
	@org.junit.Test
	public void test_1_3_4__5_7_9_10_11_12() {
		ms1 = new MyString("a");
		ms2 = new MyString("b");
		
		int expected = -1;
		
		assertMyStrings(expected);	
	}
	
	@org.junit.Test
	public void test_1_3_4__5_7_9_10_11_13_14() {
		ms1 = new MyString("b");
		ms2 = new MyString("a");
		
		int expected = 1;
		
		assertMyStrings(expected);	
	}
	
	@org.junit.Test
	public void test_1_3_4__5_7_9_15_17_19() {
		ms1 = new MyString("");
		ms2 = new MyString("");
		
		int expected = 0;
		
		assertMyStrings(expected);	
	}
	
}
