
import org.junit.*;
import static org.junit.Assert.*;

public class AllerTest {

  @Test
  public void count_CorrispondingStringOfNum_String(){
    Allergies testAl = new Allergies();
    assertEquals("tomatoes eggs", testAl.alan("17"));
  }

}
