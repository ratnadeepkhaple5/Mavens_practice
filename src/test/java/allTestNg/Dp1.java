package allTestNg;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp1 {
/*
	@Test(dataProvider = "dp5")
	public void test(Object[] data) {
//or
//	public void test(Object userdata,Object passdata) {
		
//don't take Object[][] b'coz 2d array is combination of single dimension arrays
// so to iterate it we have to iterate it by using single dim array parameterization
	//	System.out.println(data);
	//	System.out.println(data[0] +" is -> "+data[1]);
	//	System.out.println(userdata+" -> "+ passdata);
	
		//	System.out.println(data[0] + "=" +data[1] +","+ data[2]);
	//or use for loop to iterate
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}*/
	
	@Test(dataProvider = "dp6")
	public void test(Object o) {
		System.out.println(o);
	}
	@Test(dataProvider = "dp7")
	public void test(Object[] obj) {
	//	System.out.println(obj[0]+"->"+obj[1]);
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

	@DataProvider(name="dp1")
	public String[] dp1() {
		String[] data=new String[] {
				"abc","xyz","pqr","123"
		};
		return data;
	}
	@DataProvider(name="dp2")
	public int[] dp2() {
		int[] data=new int[] {
		1,2,3,4,5	
		};
		return data;
	}
	@DataProvider(name="dp3")
	public Object[] dp3() {
		Object[] data =new Object[] {
				"sunny",1,true,'c'
		};
		return data;
	}
	@DataProvider(name="dp4")
	public Object[][] dp4() {
		Object[][] data =new Object[][] {
			{"xyz",123},{"abc",456},{"pqr",true}
		};
		return data;
	}
	@DataProvider(name="dp5")
	public Object[][] dp5() {
		Object[][] data =new Object[][] {
			{"xyz",123,'@'},
			{"abc",456,'#'},
			{"pqr",true,'$'}
		};
		return data;
	}
	@DataProvider(name="dp6")
	public  Iterator<Object> dp6() {
		ArrayList data =new ArrayList() ;
		
		data.add("RATNADEEP");
		data.add(5555);
		data.add(true);
		
		return data.iterator();		
	}
	@DataProvider(name="dp7")
	public  Iterator<Object[]> dp7() {
		ArrayList<Object[]> data =new ArrayList() ;
		
		data.add(new Object[]{"RATNADEEP",123});
		data.add(new Object[] {5555,"sunny"}) ;
//		data.add(new Object[] {true});
		data.add(new Object[] {true,false});//2 values are required or we get ArrayIndexOutOfBoundsException
		
		return data.iterator();		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	