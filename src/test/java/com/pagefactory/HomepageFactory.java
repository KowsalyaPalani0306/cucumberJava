package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class HomepageFactory extends BaseClass{
	
		public HomepageFactory()
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (xpath="//*[@class='_3704LK']")
		private WebElement searchBox;
		
		
		@FindBy (xpath="(//*[text()='OPPO K10 (Black Carbon, 128 GB)'])[1]")
		private WebElement oppo;
		
		@FindBy (xpath="//*[@class='_2KpZ6l _2U9uOA _3v1-ww']")
		private WebElement addCart;
		
		@FindBy (xpath=" //*[@class='_1dqRvU']")
		private WebElement price;


		public WebElement getSearchBox() {
			return searchBox;
		}

		public WebElement getOppo() {
			return oppo;
		}

		public WebElement getAddCart() {
			return addCart;
		}

		public WebElement getPrice() {
			return price;
		}
	

}
