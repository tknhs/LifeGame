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
		assertTrue(field.cell_at(1, 0));
		assertTrue(field.cell_at(1, 1));
		assertTrue(field.cell_at(1, 2));

	}

	@Test
	public void test2() {
		int[][] points={
				{1,0},
				{1,1},
				{1,2},
		};
		Field field=new Field(points);
		assertTrue(2==field.count_alive_near_by(1, 1));
		assertTrue(1==field.count_alive_near_by(1, 0));
		assertTrue(1==field.count_alive_near_by(1, 2));
		assertTrue(0==field.count_alive_near_by(5, 5));
		assertTrue(0==field.count_alive_near_by(10, 10));

	}
}
