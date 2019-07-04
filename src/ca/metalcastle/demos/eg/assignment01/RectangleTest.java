/**
 * 
 */
package ca.metalcastle.demos.eg.assignment01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * <h1>Rectangle JUnit - Pre-interview Assignment</h1>
 * This is the JUnit test for the Rectangle.
 *
 * @author  Jason Muskat, <a href="http://www.metalcastle.ca/">Metal Castle Inc.</a>
 * <p><i>Architect, integrate, and build IT security optimized solutions&trade;.</i></p>
 * <p>Follow me on <a href="https://www.linkedin.com/in/jasonmuskat/">Linkedin</a>, and <a href="https://twitter.com/MetalCastleInc">Twitter</a>.</p>
 * @version 1.0
 * @since   2019-06-18
 */
class RectangleTest {
	OutputStream os = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(os);
	PrintStream originalOut = System.out;
	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#version()}.
	 */
	@Test
	void testVersion() {
		Rectangle r1 = new Rectangle();
		System.setOut(ps);
		r1.version();
		assertEquals("Assignment Rectangle by Jason Muskat.\n", os.toString());		
		System.setOut(originalOut);
	}

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#Rectangle()}.
	 */
	@Test
	void testRectangle() {
		Rectangle r1 = new Rectangle();
		assertNotNull(r1);
	}

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#Rectangle(int, int)}.
	 */
	@Test
	void testRectangleIntInt() {
		try {
			Rectangle r1 = new Rectangle(5,6);
			assertNotNull(r1);
			assertEquals(5,r1.getLength());
			assertEquals(6,r1.getWidth());
		}
		catch (Exception e){
			fail(e.getMessage());
		}
		try {
			assertThrows(Exception.class,
		            ()->{
		            	Rectangle r1 = new Rectangle(0,6);
		            });
		}
		catch (Exception e){
			fail("Accepted invalid Length. " + e.getMessage());
		}
		try {
			assertThrows(Exception.class,
		            ()->{
		            	Rectangle r1 = new Rectangle(5,0);
		            });
		}
		catch (Exception e){
			fail("Accepted invalid Length. " + e.getMessage());
		}
	}

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#New(int, int)}.
	 */
	@Test
	void testNew() {
		try {
			Rectangle r1 = new Rectangle(5,6);
			assertNotNull(r1);
			
			Rectangle r2 = r1.New(7,8);
			assertNotSame(r1,r2);
			
			assertEquals(5,r1.getLength());
			assertEquals(6,r1.getWidth());
			
			assertEquals(7,r2.getLength());
			assertEquals(8,r2.getWidth());			
			
		}
		catch (Exception e){
			fail(e.getMessage());
		}
		try {
			assertThrows(Exception.class,
		            ()->{
		            	Rectangle r1 = new Rectangle(0,6);
		            });
		}
		catch (Exception e){
			fail("Accepted invalid length. " + e.getMessage());
		}
		try {
			assertThrows(Exception.class,
		            ()->{
		            	Rectangle r1 = new Rectangle(5,0);
		            });	
		}
		catch (Exception e){
			fail("Accepted invalid width. " + e.getMessage());
		}
	}

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#getLength()}.
	 */
	@Test
	void testGetLength() {
		try {
			Rectangle r1 = new Rectangle(5,6);
			assertNotNull(r1);
			assertEquals(5,r1.getLength());
		}
		catch (Exception e){
			fail(e.getMessage());
		}
		try {
			Rectangle r1 = new Rectangle();
			assertNotNull(r1);
			assertThrows(Exception.class,
		            ()->{
		            	r1.getLength();
		            });
		}
		catch (Exception e){
			fail("No Exception for \"Length not set.\" " + e.getMessage());
		}
	}
	

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#getWidth()}.
	 */
	@Test
	void testGetWidth() {
		try {
			Rectangle r1 = new Rectangle(5,6);
			assertNotNull(r1);
			assertEquals(6,r1.getWidth());
		}
		catch (Exception e){
			fail(e.getMessage());
		}
		try {
			Rectangle r1 = new Rectangle();
			assertNotNull(r1);
			assertThrows(Exception.class,
		            ()->{
		            	r1.getWidth();
		            });
		}
		catch (Exception e){
			fail("No Exception for \"Width not set.\" " + e.getMessage());
		}
	}

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#setLength(int)}.
	 */
	@Test
	void testSetLength() {
		try {
			Rectangle r1 = new Rectangle();
			assertNotNull(r1);
			assertThrows(Exception.class,
		            ()->{
		            	r1.setLength(0);
		            });
		}
		catch (Exception e){
			fail("Accepted invalid Length. " + e.getMessage());
		}
	}

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#setWidth(int)}.
	 */
	@Test
	void testSetWidth() {
		try {
			Rectangle r1 = new Rectangle();
			assertNotNull(r1);
			assertThrows(Exception.class,
		            ()->{
		            	r1.setWidth(0);
		            });
		}
		catch (Exception e){
			fail("Accepted invalid Width. " + e.getMessage());
		}
	}

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#isValid()}.
	 */
	@Test
	void testIsValid() {
		try {
			Rectangle r1 = new Rectangle();
			assertNotNull(r1);
			r1.setLength(5);
			r1.setWidth(6);
			assertTrue(r1.isValid());
		}
		catch (Exception e){
			fail(e.getMessage());
		}
		try {
			Rectangle r1 = new Rectangle();
			assertNotNull(r1);
			assertThrows(Exception.class,
		            ()->{
		            	r1.isValid();
		            });
		}
		catch (Exception e){
			fail("Accepted unset rectangle. " + e.getMessage());
		}
	}

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#area()}.
	 */
	@Test
	void testArea() {
		try {
			Rectangle r1 = new Rectangle(5,6);
			assertNotNull(r1);
			assertEquals(30,r1.area());
		}
		catch (Exception e){
			fail(e.getMessage());
		}
		try {
			Rectangle r1 = new Rectangle(Integer.MAX_VALUE,Integer.MAX_VALUE);
			assertNotNull(r1);
			assertEquals(Integer.MAX_VALUE, r1.getLength());
			assertEquals(Integer.MAX_VALUE, r1.getWidth());
			assertEquals(4.6116860141324206E18,r1.area());
		}
		catch (Exception e){
			fail(e.getMessage());
		}
		try {
			Rectangle r1 = new Rectangle();
			assertNotNull(r1);
			assertThrows(Exception.class,
		            ()->{
		            	r1.area();
		            });
		}
		catch (Exception e){
			fail("Invalid area returned. " + e.getMessage());
		}
	}

	/**
	 * Test method for {@link ca.metalcastle.demos.eg.assignment01.Rectangle#perimeter()}.
	 */
	@Test
	void testPerimeter() {
		try {
			Rectangle r1 = new Rectangle(5,6);
			assertNotNull(r1);
			assertEquals(22,r1.perimeter());
		}
		catch (Exception e){
			fail(e.getMessage());
		}
		try {
			Rectangle r1 = new Rectangle(Integer.MAX_VALUE,Integer.MAX_VALUE);
			assertNotNull(r1);
			assertEquals(Integer.MAX_VALUE, r1.getLength());
			assertEquals(Integer.MAX_VALUE, r1.getWidth());
			assertEquals(8.589934588E9,r1.perimeter());
		}
		catch (Exception e){
			fail(e.getMessage());
		}
		try {
			Rectangle r1 = new Rectangle();
			assertNotNull(r1);
			assertThrows(Exception.class,
		            ()->{
		            	r1.perimeter();
		            });
		}
		catch (Exception e){
			fail("Invalid perimeter returned. " + e.getMessage());
		}
	}

}
