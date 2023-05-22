package com.wheelpros.qa.testcases;

import org.testng.annotations.Test;

import com.wheelpros.qa.test.base.HeroKuAppBaseTest;

import testmagento.HeroKuAppPage;

public class HeroKuAppTestCase extends HeroKuAppBaseTest{

	@Test
	public void heroTest() {
		HeroKuAppPage hero=new HeroKuAppPage(driver);
		hero.clickAddRemove();
		//hero.clickAdd();
	
		
		for (int i = 0; i <= 12; i++) {
		    hero.clickAddElement();
		}
		
		for (int i=0;i<=10;i++) {
			hero.clickDeleteElement();
		}
		}



}
