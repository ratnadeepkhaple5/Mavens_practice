//@Ignore
package allTestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//ignore at class level...all test will not get executed
//@Ignore
public class Ignore_test {

// 2 options to ignore tests--> 1st by using @Test(enabled=false)	
							//	2nd by using @Ignore
	
	//@Ignore
	@Test//(enabled = false)
	public void test1() {
		System.out.println("test1");
	}
	
	@Ignore
	@Test//(enabled=true)
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
}
