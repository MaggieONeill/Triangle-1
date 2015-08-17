import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instanciatesCorrectly(){
    Triangle testTriangle = new Triangle (2, 2, 2);
    assertEquals(true, testTriangle instanceof Triangle);

  }

}
