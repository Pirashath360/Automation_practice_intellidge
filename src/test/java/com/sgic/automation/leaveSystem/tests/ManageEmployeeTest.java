package com.sgic.automation.leaveSystem.tests;

import org.testng.annotations.Test;

import com.sgic.automation.leaveSystem.pages.ManageEmployeepage;
import com.sgic.automation.leaveSystem.utils.Constants;
import com.sgic.automation.leaveSystem.utils.TestBase;



public class ManageEmployeeTest extends TestBase {
	@Test(priority = 1

    )
	public void Datarecruiment() {
		ManageEmployeepage.clickMana();
		ManageEmployeepage.clickRecu();
	ManageEmployeepage.AddRecu();
	ManageEmployeepage.settxtRetype(Constants.RecruitmenttType);
		ManageEmployeepage.cliAdd();
		
		
		
	}
	@Test ( priority = 2)
	public void Emptyrecruiment() {
		ManageEmployeepage.clickMana();
		ManageEmployeepage.clickRecu();
		ManageEmployeepage.AddRecu();
		ManageEmployeepage.settxtRetype(Constants.ERecruitmenttType);
		ManageEmployeepage.cliAdd();
		
		
		
	}
	
	@Test(priority = 3)
	public void closeEmptyrecruiment() {
		ManageEmployeepage.clickMana();
		ManageEmployeepage.clickRecu();
		ManageEmployeepage.AddRecu();
		ManageEmployeepage.settxtRetype(Constants.ERecruitmenttType);
		ManageEmployeepage.cliclose();
		
	}
	@Test(priority = 4)
	public void specialcharacterrecruiment() {
		ManageEmployeepage.clickMana();
		ManageEmployeepage.clickRecu();
		ManageEmployeepage.AddRecu();
		ManageEmployeepage.settxtRetype(Constants.SpecialCharacter);
		ManageEmployeepage.cliAdd();
		
		
	}
	//@Test
	//public void Updaterecruiment() {
	//	ManageEmployeepage.clickMana();
		//ManageEmployeepage.clickRecu();
	//	ManageEmployeepage.cliEdit();
		//ManageEmployeepage.settxtRetype(Constants.SpecialCharacter);
	//	ManageEmployeepage.AdEdit();


	@Test( priority = 5)
    public void DataDesignation () {
		ManageEmployeepage.clickMana();
        ManageEmployeepage.implicitWait(3);
		ManageEmployeepage.clickDesig();
        ManageEmployeepage.AdDesign();


	}




	}
