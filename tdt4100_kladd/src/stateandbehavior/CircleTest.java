package stateandbehavior;

import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
	description="A Circle must contain a radius field and methods for calculating its circumference and area."
)
public class CircleTest extends TestCase {

	Circle circle1;
	Circle circle2;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		circle1 = new Circle(5);
		circle2 = new Circle(10);
	}

	@JExercise(
		tests="double getCircumference()",
		description="The getCircumference() method should return the circumference of the circle."
	)
	public void testGetCircumference() {
		assertEquals(circle1.getCircumference(), 2 * 5 * Math.PI);
		assertEquals(circle2.getCircumference(), 2 * 10 * Math.PI);
	}
	
	@JExercise(
			tests="double getArea()",
			description="The getArea() method should return the area of the circle"
			)
	public void testGetArea() {
		assertEquals(circle1.getArea(), 5 * 5 * Math.PI);
		assertEquals(circle2.getArea(), 10 * 10 * Math.PI);
	}
	
	@JExercise(
		tests="void toString()",
		description="The toString() method should return a String representation of the object."
	)
	public void testToString() {
		assertEquals(circle1.toString(), "[En sirkel med radius 5.0, har omkrets 31.42 og areal 78.54]");
		assertEquals(circle2.toString(), "[En sirkel med radius 10.0, har omkrets 62.83 og areal 314.16]");
	}

	public static void main(String[] args) {
		JexStandalone.main(AccountTest.class);
	}
}