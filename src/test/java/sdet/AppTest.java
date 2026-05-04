package sdet;

import org.testng.Assert;
import org.testng.annotations.Test;
import Java_source_code.App;

public class AppTest {
  @Test
  public void testogin1() {
	  App obj = new App();
	  Assert.assertEquals(0,obj.usrlogin("izin","abc123"));//invalid data
  }
  
  @Test
  public void testogin2() {
	  App obj = new App();
	  Assert.assertEquals(1,obj.usrlogin("izin","izin"));//invalid data
  }
}
