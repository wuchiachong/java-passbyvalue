package com.cloudberry.com.my.passbyvalue;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PassByValueTest {
    
	@Test
	public void testPassByValuePrimitive() {
		//Init
		int x = 1;
	    int y = 2;
	    
	    //Pre-modifyPrimitiveTypes()
	    System.out.print("Values of x & y before primitive modification: ");
	    System.out.println(" x = " + x + " ; y = " + y );
	    assertEquals(x, 1);
	    assertEquals(y, 2);
	    
	    modifyPrimitiveTypes(x,y);
	    
	    //Post-modifyPrimitiveTypes()
	    System.out.print("Values of x & y after primitive modification: ");
	    System.out.println(" x = " + x + " ; y = " + y );
	    assertEquals(x, 1);
	    assertEquals(y, 2);
	}
	
	@Ignore
	private void modifyPrimitiveTypes(int x, int y)
	{
	    x = 5;
	    y = 10;
	} 
	
	
	@Test 
	public void testPassByValueWrapper() {
		Integer x = new Integer(222);
	    Integer y = new Integer(888);
	    
	    assertEquals(x.intValue(), 222);
	    assertEquals(y.intValue(),888);
	    
	    System.out.print("Values of x & y before wrapper modification: ");
	    System.out.println("x = " + x.intValue() + " ; y = " + y.intValue());
	    modifyWrappers(x, y);
	    
	    assertEquals(x.intValue(), 222);
	    assertEquals(y.intValue(),888);
	    
	    System.out.print("Values of x & y after wrapper modification: ");
	    System.out.println("x = " + x.intValue() + " ; y = " + y.intValue());

	}
	
	@Ignore
	private void modifyWrappers(Integer x, Integer y) {
		  x = new Integer(555);
		  y = new Integer(777);
	}
	
	@Test
	public void testPassByValueCollection() {
		 List<Integer> lstNums = new ArrayList<Integer>();
		 lstNums.add(777);
		 
		 System.out.println("Size of list before List modification = " + lstNums.size());
		 
		 modifyCollection(lstNums);
		 
		 System.out.println("Size of list after List modification = " + lstNums.size());
	}
	
	@Ignore
	private void modifyCollection(List<Integer> lstParam) {
		lstParam.add(333);
	}
	
	@Test
	public void testPassByValueBusinessObject() {
		Student student = new Student();
		
		System.out.println("Value of name before Student modification = " + student.getName());
		assertEquals(student.getName(), null);
		
		modifyStudent(student);
	    
		System.out.println("Value of name after Student modification = " + student.getName());
		assertEquals(student.getName(), "Alex");
	}
	
	@Ignore
	private void modifyStudent(Student student) {
		student.setName("Daniel");
	}
}
