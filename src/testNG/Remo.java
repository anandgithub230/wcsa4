package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void remo() {
	  Reporter.log("This is a remo method",true);
  }
  @Test
  public void remo1() {
	  Reporter.log("This is a remo1 method",true);
  }
  @Test
  public void remo2() {
	  Reporter.log("This is a remo2 method",true);
  }
}
