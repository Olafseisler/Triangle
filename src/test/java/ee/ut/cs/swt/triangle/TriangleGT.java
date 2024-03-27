package ee.ut.cs.swt.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleGT {

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    String string0 = triangle0.classify();
	    assertEquals("equilateral", string0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengthsAndIsIsoscelesReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(2, 0, (-1));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("2,0,-1", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    triangle0.setSideLengths(2636, 0, (-1069));
	    double double0 = triangle0.getArea();
	    assertTrue(triangle0.isScalene());
	    assertEquals((-1.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereIsRightAngledIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    Triangle triangle1 = triangle0.setSideLengths(2, 0, 2);
	    boolean boolean0 = triangle1.isScalene();
	    assertEquals("2,0,2", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(3635, 0, 3635);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertTrue(boolean0);
	    assertTrue(triangle0.isIsosceles());
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndIsScaleneReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1282, (-500), 1256);
	    boolean boolean0 = triangle0.isScalene();
	    assertTrue(boolean0);
	    assertEquals("1282,-500,1256", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(2, 0, (-1));
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(triangle0.isIsosceles());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsIsoscelesIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    triangle0.setSideLengths(1, 1, 1866);
	    triangle0.classify();
	    assertEquals(1868, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    triangle0.setSideLengths(0, (-1), 1);
	    int int0 = triangle0.getPerimeter();
	    assertTrue(triangle0.isScalene());
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(535, 598, 535);
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals(1668, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(13, 13, 13);
	    double double0 = triangle0.getArea();
	    assertEquals(39, triangle0.getPerimeter());
	    assertEquals(64.06246951218786, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(0, (-1558), 2227);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertEquals(669, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaAndSetSideLengthsAndSetSideLengthsWithZero() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(1588, 2, 0);
	    double double0 = triangle0.getArea();
	    assertFalse(triangle0.isIsosceles());
	    assertEquals((-1.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsImpossible() throws Throwable {
	    Triangle triangle0 = new Triangle(1249, (-2089), 1249);
	    boolean boolean0 = triangle0.isImpossible();
	    assertTrue(boolean0);
	    assertEquals(409, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(7908, int0);
	}

	@Test(timeout = 4000)
	public void testIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(0, (-1558), 2227);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertEquals(669, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateralAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(2, 0, (-1));
	    boolean boolean0 = triangle0.isEquilateral();
	    assertFalse(triangle0.isIsosceles());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("2636,2636,2636", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle(3635, 0, 3635);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertTrue(boolean0);
	    assertTrue(triangle0.isIsosceles());
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsWithZero() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 2);
	    triangle0.setSideLengths(0, 1336, 2);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("0,1336,2", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(2, 0, 0);
	    triangle0.setSideLengths((-830), (-2020), (-2020));
	    int int0 = triangle0.getPerimeter();
	    assertEquals("-830,-2020,-2020", triangle0.getSideLengths());
	    assertEquals((-4870), int0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(7908, int0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    triangle0.setSideLengths(0, (-1), 1);
	    int int0 = triangle0.getPerimeter();
	    assertTrue(triangle0.isScalene());
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 0, 1011);
	    triangle0.setSideLengths(3, 1283, (-1));
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals(1285, triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaAndSetSideLengthsAndSetSideLengthsWithZeroAndSetSideLengthsWithNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    triangle0.setSideLengths(2636, 0, (-1069));
	    double double0 = triangle0.getArea();
	    assertTrue(triangle0.isScalene());
	    assertEquals((-1.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetAreaAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(3, (-1), (-2145032184));
	    triangle0.setSideLengths(3, 3, 1866);
	    double double0 = triangle0.getArea();
	    assertEquals("3,3,1866", triangle0.getSideLengths());
	    assertEquals(Double.NaN, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(2, 0, (-1));
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(triangle0.isIsosceles());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScalene0() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 4836, 4836);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals("0,4836,4836", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsScalene1() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals(Double.NaN, triangle0.getArea(), 0.01);
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(13, 13, 13);
	    double double0 = triangle0.getArea();
	    assertEquals(39, triangle0.getPerimeter());
	    assertEquals(64.06246951218786, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndIsIsoscelesReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), 2162, (-1700));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertFalse(boolean0);
	    assertEquals(461, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle((-20), 0, 0);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertEquals("-20,0,0", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereGetPerimeterIsNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(2, 0, 0);
	    triangle0.setSideLengths((-830), (-2020), (-2020));
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals("-830,-2020,-2020", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle((-20), 0, 0);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertEquals("-20,0,0", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(3, (-1), (-2145032184));
	    String string0 = triangle0.getSideLengths();
	    assertEquals("3,-1,-2145032184", string0);
	}

	@Test(timeout = 4000)
	public void testClassify0() throws Throwable {
	    Triangle triangle0 = new Triangle(13, 13, 1);
	    String string0 = triangle0.classify();
	    assertEquals("13,13,1", triangle0.getSideLengths());
	    assertEquals("isossceles", string0);
	}

	@Test(timeout = 4000)
	public void testClassify1() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    String string0 = triangle0.classify();
	    assertEquals(0, triangle0.getPerimeter());
	    assertEquals("impossible", string0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereIsEquilateralIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(2614, 2614, 2614);
	    Triangle triangle1 = triangle0.setSideLengths(2614, 876, 2614);
	    boolean boolean0 = triangle1.isIsosceles();
	    assertEquals("2614,876,2614", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(1282, (-500), 1256);
	    boolean boolean0 = triangle0.isScalene();
	    assertTrue(boolean0);
	    assertEquals("1282,-500,1256", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testClassify2() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    String string0 = triangle0.classify();
	    assertEquals("equilateral", string0);
	}

	@Test(timeout = 4000)
	public void testClassify3() throws Throwable {
	    Triangle triangle0 = new Triangle(13, 1466, 1466);
	    String string0 = triangle0.classify();
	    assertEquals("scalene", string0);
	    assertEquals("13,1466,1466", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsImpossible() throws Throwable {
	    Triangle triangle0 = new Triangle(1249, (-2089), 1249);
	    boolean boolean0 = triangle0.isImpossible();
	    assertTrue(boolean0);
	    assertEquals(409, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle((-495), (-495), (-495));
	    triangle0.setSideLengths(3001, 3001, 1);
	    double double0 = triangle0.getArea();
	    assertFalse(triangle0.isImpossible());
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    triangle0.setSideLengths(1, 1, 1866);
	    triangle0.classify();
	    assertEquals(1868, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals("0,0,0", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(2, 0, (-1));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("2,0,-1", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsIsoscelesIsFalse() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), 2162, (-1700));
	    triangle0.setSideLengths(1630, 890, 469);
	    triangle0.classify();
	    assertFalse(triangle0.isImpossible());
	}

	@Test(timeout = 4000)
	public void testGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(3, (-1), (-2145032184));
	    String string0 = triangle0.getSideLengths();
	    assertEquals("3,-1,-2145032184", string0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndIsIsoscelesReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, 2636, 2636);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("2636,2636,2636", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengthsAndIsIsoscelesReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(2636, (-18), 3);
	    triangle0.setSideLengths(3635, 0, 0);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals(3635, triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

}
