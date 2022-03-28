package Test;

import org.junit.Test;

public class TestColorable {

	@Test
	public void testMain() {

		GeometricObject[] squares = { new Square(2.0), new Square(3.0), new Square(4.0), new Square(5.0),
				new Square(6.0) };
		for (int i = 0; i < squares.length; i++) {
			if (squares[i] instanceof Colorable) {
				((Colorable) squares[i]).howToColor();
			}
		}

	}

}
