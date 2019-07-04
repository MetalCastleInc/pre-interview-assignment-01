/**
 * 
 */
package ca.metalcastle.demos.eg.assignment01;

/**
 * <h1>Rectangle - Pre-interview Assignment</h1>
 * The Rectangle code.
 *
 * @author  Jason Muskat, <a href="http://www.metalcastle.ca/">Metal Castle Inc.</a>
 * <p><i>Architect, integrate, and build IT security optimized solutions&trade;.</i></p>
 * <p>Follow me on <a href="https://www.linkedin.com/in/jasonmuskat/">Linkedin</a>, and <a href="https://twitter.com/MetalCastleInc">Twitter</a>.</p>
 * @version 1.0
 * @since   2019-06-18
 */
public class Rectangle {

	/** Rectangle's length.
	 */
	private int length = 0;

	/** Was the Rectangle's length set?
	 */
	private boolean isLengthSet = false;
	
	/** Rectangle's width.
	 */
	private int width = 0;
	/** Was the Rectangle's width set?
	 */
	private boolean isWidthSet = false;
	
	/** Prints version info.
	 */
	public void version(){
		System.out.println("Assignment Rectangle by Jason Muskat.");
	}	
 
	/** Object.
	 */
	public Rectangle(){
	}
	/**
	 * A method to create a Rectangle with a size
	 * @param length Rectangle's length.
	 * @param width Rectangle's width.
	 * @throws Exception When the size isn't possible.
	 */
	public Rectangle(int length, int width) throws Exception {
		setLength(length);
		setWidth(width);
	}

	/**
	 * Odd for Java but as requested in the assignment.
	 * @param length Rectangle's length.
	 * @param width Rectangle's width.
	 * @return Rectangle
	 * @throws Exception When the size isn't possible.
	 */
	public Rectangle New (int length, int width) throws Exception {
		return new Rectangle(length, width);
	}
	
/**
 * Gets the Length.
 * @return the Length.
 * @throws Exception When the Length was not set.
 */
	protected int getLength() throws Exception {
		if (isLengthSet == true){
			return length;
		}
		else throw new Exception("Length not set.");
	}
/**
 * 
 * Gets the Width.
 * @return the Width.
 * @throws Exception When the Width was not set.
 */
	protected int getWidth() throws Exception {
		if (isWidthSet == true){
			return width;
		}
		else throw new Exception("Width not set.");
	}
/**
 * Sets the Length.
 * @param length positive int.
 * @throws Exception When the Length is isn't possible.
 */
	protected void setLength(int length) throws Exception {
		if (length > 0) {
			this.length = length;
			isLengthSet = true;
		} 
		else throw new Exception("Length must be an integer greater than zero and less than (Integer.MAX_VALUE + 1).");
	}
	/**
	 * Sets the Width.
	 * @param width Positive int.
	 * @throws Exception When the Width is isn't possible.
	 */	protected void setWidth(int width) throws Exception {
		if (width > 0) {
			this.width = width;
			isWidthSet = true;
		} 
		else throw new Exception("Width must be an integer greater than zero and less than (Integer.MAX_VALUE + 1).");
	}
	 
	 /**
	  * Checks that the Rectangle is set and the size is possible.
	  * @return True when the Rectangle is set and valid.
	  * @throws Exception when the Rectangle is not valid.
	  */
	 protected boolean isValid () throws Exception {
		if ((isLengthSet == true)&&(isWidthSet == true) && (length > 0) && (width > 0)) {
			return true;
		}
		else throw new Exception("Rectangle is not valid.");
	}

	 /**
	  * Calculates the area of a valid Rectangle.
	  * @return double Rectangle's area.
	  * @throws Exception When the Rectangle size is not set or is not possible.
	  */
	public double area () throws Exception {
		if (isValid() == true) { //throws Exception if false
			return (double) ((double)getLength() * (double)getWidth());
		}
		return 0; //never reached
	}
	 /**
	  * Calculates the perimeter of a valid Rectangle. Method name as requested in the assignment.
	  * @return double Rectangle's perimeter.
	  * @throws Exception When the Rectangle size is not set or is not possible.
	  */
	public double perimeter () throws Exception {
		if (isValid() == true) { //throws Exception if false
			return (double)(2 * ((double)getLength() + (double)getWidth()));
		}
		return 0; //never reached
	}
}
