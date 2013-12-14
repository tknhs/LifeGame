import static org.junit.Assert.*;

import org.junit.Test;


public class FieldTest {

	@Test
	public void test() {
		int[][] points={
				{1,0},
				{1,1},
				{1,2},
		};
		Field field=new Field(points);
		assertTrue(field.cell_at(1, 1));
	}

}
