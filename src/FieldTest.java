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
	
	@Test
	public void test3() {
		int[][] points={
				{1,0},
				{1,1},
				{1,2},
		};
		Field field=new Field(points);
		assertTrue(field.next_cell_at(1, 1));
		assertFalse(field.next_cell_at(1, 0));
		assertFalse(field.next_cell_at(1, 2));

	}
	@Test
	public void test4() {
		int[][] points={
				{1,0},
				{1,1},
				{1,2},
		};
		Field field=new Field(points);
		field.update();
		assertTrue(field.cell_at(0, 1));
		assertTrue(field.cell_at(1, 1));
		assertTrue(field.cell_at(2, 1));


	}
	
}
