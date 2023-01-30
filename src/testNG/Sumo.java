package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
	@Test
	public void sumo() {
		Reporter.log("This is a semo1 method",true);
	}
	@Test
	public void sumo1() {
		Reporter.log("This is a semo2 method",true);
	}
	@Test
	public void sumo2() {
		Reporter.log("This is a semo2 method",true);
	}
}

