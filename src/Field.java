import java.util.*;

class Field {
  public Set set;

  public Field(int[][] points) {
    this.set = new HashSet();

    for (int i = 0; i < points.length; ++i) {
      this.set.add(points[i]);
    }
  }

  public boolean cell_at(int x, int y) {
    return this.set.contains({x, y});
  }

  public int count_alive_near_by(int x, int y) {
    return 0;
  }

  public boolean next_cell_at(int x, int y) {
    return false;
  }

  public void update() {
  }
}
