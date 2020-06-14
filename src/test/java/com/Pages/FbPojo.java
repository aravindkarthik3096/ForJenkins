package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class FbPojo extends BaseClass{


public FbPojo(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtUser;

	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(id="u_0_b")
	private WebElement txtLoginBtn;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getTxtLoginBtn() {
		return txtLoginBtn;
	}




}
