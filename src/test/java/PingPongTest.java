import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingPongTest {

  @Test
  public void isPingPong_forInputNumberDivisibleByThree_true() {
    PingPong testPingPong = new PingPong();
    ArrayList<String> returnVals = new ArrayList<String>();
    returnVals.add("1");
    returnVals.add("2");
    assertEquals(returnVals, testPingPong.pingPong(2));

  }
}
