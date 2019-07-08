package com.sgic.automation.leaveSystem.pages;

import org.openqa.selenium.By;

import com.sgic.automation.leaveSystem.utils.PageBase;

public class ManageEmployeepage extends PageBase {
	private static By clickManage=By.xpath("//*[@class='fas fa-list mr-3 text-gray']");
	private static By clickRecuitment=By.xpath("//a[@href='/recuitmentType']");
    private static By AddRecuitment=By.xpath("//*[@class=\"btn btn-info btn \"]");
    private static By txtReTypeName=By.id("exampleForm.ControlTextarea1");
    private static By clickAdd=By.xpath("//*[@class=\"btn btn-info \"]");
	private static By clickClose=By.xpath("//*[@class=\"btn btn-danger \"]");
	//private static By clickEdit=By.xpath("//*[@class=\"fas fa-pen-fancy\"]");
	//private static By EditAdd=By.xpath("//*[@class=\"btn btn-info \"]");
	private static By clickDesgination=By.xpath("//*[@href=\"/designation\"]");
	private static  By AddDesination=By.xpath("//*[@class=\"btn btn-info btn-circle\"]");

	
	
	
	public static void clickMana() {
		getDriver().findElement(clickManage).click();
	}
	public static void clickRecu() {
		getDriver().findElement(clickRecuitment ).click();
	}
	public static void AddRecu() {
		getDriver().findElement(AddRecuitment).click();
	}
	public static void settxtRetype(String txtrecuit) {
		getDriver().findElement(txtReTypeName).sendKeys(txtrecuit);
		
	}
	public static void cliAdd() {
		getDriver().findElement(clickAdd).click();
	}
	public static void cliclose() {
		getDriver().findElement(clickClose).click();
	}
	//public static void cliEdit(){
		//getDriver().findElement(clickEdit).click();

	//public static  void AdEdit(){getDriver().findElement(EditAdd).click();}
public static void clickDesig(){getDriver().findElement(clickDesgination).click();

}
public static void AdDesign(){getDriver().findElement(AddDesination).click();

}
}
