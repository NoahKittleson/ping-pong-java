import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingPongTest {

  @Test
  public void isPingPong_forInputNumber_ArrayList() {
    PingPong testPingPong = new PingPong();
    ArrayList<String> returnVals = new ArrayList<String>();
    returnVals.add("1");
    returnVals.add("2");
    assertEquals(returnVals, testPingPong.pingPong(2));
  }

  @Test
  public void isPingPong_forInputNumberDivisibleByThree_ArrayList() {
    PingPong testPingPong = new PingPong();
    ArrayList<String> returnVals = new ArrayList<String>();
    returnVals.add("1");
    returnVals.add("2");
    returnVals.add("Ping");
    assertEquals(returnVals, testPingPong.pingPong(3));
  }

  @Test
  public void isPingPong_forInputNumberDivisibleByFive_ArrayList() {
    PingPong testPingPong = new PingPong();
    ArrayList<String> returnVals = new ArrayList<String>();
    returnVals.add("1");
    returnVals.add("2");
    returnVals.add("Ping");
    returnVals.add("4");
    returnVals.add("Pong");
    assertEquals(returnVals, testPingPong.pingPong(5));
  }

  @Test
  public void isPingPong_forInputNumberDivisibleByFifteen_ArrayList() {
    PingPong testPingPong = new PingPong();
    ArrayList<String> returnVals = new ArrayList<String>();
    returnVals.add("1");
    returnVals.add("2");
    returnVals.add("Ping");
    returnVals.add("4");
    returnVals.add("Pong");
    returnVals.add("Ping");
    returnVals.add("7");
    returnVals.add("8");
    returnVals.add("Ping");
    returnVals.add("Pong");
    returnVals.add("11");
    returnVals.add("Ping");
    returnVals.add("13");
    returnVals.add("14");
    returnVals.add("Ping Pong");
    assertEquals(returnVals, testPingPong.pingPong(15));
  }
}
