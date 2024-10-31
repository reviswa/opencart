package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginData")
	public String [][] Logindata() throws IOException {
		
		ExcelUtility eu = new ExcelUtility(".\\testData\\Opencart_LoginData.xlsx");
		int rc = eu.getRowCount("sheet1");
		int col = eu.getCellCount("Sheet1", 1);
		String data [][] = new String [rc][col];
		for (int i=1; i<=rc; i++) {
		  for (int j=0; j<col;j++) {
			  data[i-1][j] = eu.getCellData("Sheet1", i, j);
			  
		  }
				
		}			
		return data;
		
	}

}
