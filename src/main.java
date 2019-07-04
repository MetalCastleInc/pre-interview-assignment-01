import ca.metalcastle.demos.eg.assignment01.Rectangle;

/**
 * <h1>Rectangle - Pre-interview Assignment</h1>
 * This is the demo code for Rectangle.
 *
 * @author  Jason Muskat, <a href="http://www.metalcastle.ca/">Metal Castle Inc.</a>
 * <p><i>Architect, integrate, and build IT security optimized solutions&trade;.</i></p>
 * <p>Follow me on <a href="https://www.linkedin.com/in/jasonmuskat/">Linkedin</a>, and <a href="https://twitter.com/MetalCastleInc">Twitter</a>.</p>
 * @version 1.0
 * @since   2019-06-18
 */
public class main {
/**
 * This is the Java main method.
 * @param args Unused.
 */
	public static void main(String[] args) {
		try {
			System.out.println("Pre Interview Assignment by Jason Muskat.\n\n");
			Rectangle r1 = new Rectangle(5,6);
			System.out.println("Rectangle with a length of 5 units, and width of 6 units:");
			System.out.println("\tArea: " + r1.area() + ".");
			System.out.println("\tPerimeter: " + r1.perimeter() + ".");

			System.out.println("\n");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
