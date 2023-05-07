package allTestNg;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class Data {

		@Test(dataProvider = "bookticket")
		public void bookallTickets(String source,String destination) {

			System.out.println(source+"-> "+destination);
			
		}
		@DataProvider
		public Object[][] bookticket(){
			
			Object[][] data= new Object[2][2];
			
			data[0][0]="pune";
			data[0][1]="Banglore";
			data[1][0]="Mysore";
			data[1][1]="Goa";
			return data;
		}
		
	}


