package com.amazon.pageObjects;

public class SignInObjects {
	public final String btnSignIn="//a[@id='nav-link-accountList']";
	public final String emailLocatorValue="//input[@id='ap_email']";
	public final String btnContinue="input[id='continue']";
	public final String linkChange="//a[normalize-space(text())='Change']";
	public final String linkForget="//a[@id='auth-fpp-link-bottom']";
	public final String btnSignInsub="//input[@id='signInSubmit']";
	public final String passwordField="//input[@id='ap_password']";
	//#btnClose is present inside the DetailsLink--popOver
	public final String btnClose="//button[@aria-label='Close']";
	public final String linkDetails="//a[normalize-space(text())='Details']";
	public final String linkCndn="//a[text()='Conditions of Use']";
	public final String linkPrivacy="//a[text()='Privacy Notice']";
	public  final String linkNeedHelp="//span[normalize-space(text())='Need help?']";
	//creating new account link in signInPage
	public final String linkNewAcc="#createAccountSubmit";

}
