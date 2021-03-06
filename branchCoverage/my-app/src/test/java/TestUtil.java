import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//import sun.rmi.server.Util;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
  
  @Test
  public void test1() { 
	  boolean res=c.compute(1);
	  assertEquals(res,false);
	 }
  
  @Test
  public void test2() { 
	  boolean res=c.compute(1,2,3);
	  assertEquals(res,true);
	 }
	 
  @Test
  public void test3() { 
	  boolean res=c.compute(1,2);
	  assertEquals(res,false);
	 }
  @Test(expected = RuntimeException.class)
  public void test4() { 
	  boolean res=c.compute(0,1,2);
	 }
  @Test
  public void test5() { 
	  boolean res=c.compute(4,3,10);
	  assertEquals(res,false);
	 }
}
