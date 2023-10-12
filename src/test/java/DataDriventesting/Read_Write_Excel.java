package DataDriventesting;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.edge.EdgeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Write_Excel {

	public static void main(String[] args) throws Throwable{
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String title = driver.getTitle();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.get(url);
	}

}
