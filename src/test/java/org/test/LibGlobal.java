package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
static WebDriver driver;
public static void browserConfig()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\MvnProject\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
}
public static void openUrl(String Url)
{
	driver.navigate().to(Url);
}
public static void maximizeWindow()
{
	driver.manage().window().maximize();
}
public static void type(WebElement element, String data)
{
	element.sendKeys(data);
}

public static void click(WebElement element)
{
	element.click();
}
public static void close()
{
driver.close();
}
static String data=null;

public static String excelRead(int row, int cell) throws IOException
{
	File f=new File("C:\\Users\\user\\eclipse-workspace\\MvnProject\\excel\\Test1.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet s = w.getSheet("AdactinLogin");																									
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	int cellType = c.getCellType();
	if(cellType==1)
	{
		data = c.getStringCellValue();
		System.out.println(data);
	}
	else if(cellType==0)
	{
		if(DateUtil.isCellDateFormatted(c))
		{
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd-mm-yyyy");
			data = sim.format(dateCellValue);
			System.out.println(data);
		}
		else
		{
			double numericCellValue = c.getNumericCellValue();
			long l=(long) numericCellValue;
			data = String.valueOf(l);
			System.out.println(data);
		}
	}
	return data;
	
}
public static void excelWrite(int row,int cell, String data) throws IOException
{
	File f=new File("C:\\Users\\user\\eclipse-workspace\\MvnProject\\excel\\Test1.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet s = w.getSheet("ExcelWrite");
	Row r = s.createRow(row);
	Cell c = r.createCell(cell);
	c.setCellValue(data);
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
}
public static void dropDownText(WebElement element, String data)
{
	Select s=new Select(element);
	s.selectByVisibleText(data);
}
public static void dropDownIndex(WebElement element, int index)
{
	Select s=new Select(element);
	s.selectByIndex(index);
}
public static void dropDownValue(WebElement element, String value)
{
	Select s=new Select(element);
	s.selectByValue(value);
}
public static void scrollDown(int a, WebElement element)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[a].srollIntoView(true, arg1)", element);
}
public static void scrollUp(int a, WebElement element)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[a].scrollIntoView(false)", element);
}
public static void jsInsert(int a, String data, WebElement element)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[a].setAttribute('value', data)", element);
}
public static void jsClick(int a, WebElement element)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[a].click()", element);
}
public static void jsGetAttribute(int a, WebElement element)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	String executeScript = (String) js.executeScript("return arguments[a].getAttribute('value')", element);
	System.out.println(executeScript);
}
public static void takesScreenshot(String data) throws IOException
{
	TakesScreenshot tk=(TakesScreenshot) driver;
	File s=tk.getScreenshotAs(OutputType.FILE);
	File d=new File(data);
	FileUtils.copyFile(s, d);
}


}	