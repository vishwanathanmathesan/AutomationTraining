package jUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DemoTest {
@Before
public static void beforeClass() {
	System.out.println("before Class");
}
@Before
public void before() {
	System.out.println("before");
}
	
@Test
public void test1() {
	System.out.println("test@1");
	
}
@Test
public void test2() {
	System.out.println("test@2");

}
@After
public void after() {
	System.out.println("After@");
		
}
@AfterClass
public static void afterclass() {
	System.out.println("After Class");

}
@Ignore

public void ingoreclass() {
	System.out.println("ingoreCLASS");

}






}
