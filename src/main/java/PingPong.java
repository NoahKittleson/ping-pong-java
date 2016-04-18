import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.ArrayList;
import java.util.List;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class PingPong {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, respone) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/output.vtl");

      String countTo = request.queryParams("countTo");
      Integer countToInteger = Integer.parseInt(countTo);
      List<String> pingPongArray = pingPong(countToInteger);

      model.put("countTo", countTo);
      model.put("pingPongArray", pingPongArray);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static List<String> pingPong(Integer inputNumber) {
    List<String> returnVals = new ArrayList<String>();
    for (Integer i = 1; i <= inputNumber; i++) {
      if (i % 15 == 0) {
        returnVals.add("Ping Pong");
      } else if (i % 3 == 0) {
        returnVals.add("Ping");
      } else if (i % 5 == 0) {
        returnVals.add("Pong");
      } else {
        returnVals.add(Integer.toString(i));
      }
    }
    return returnVals;
  }
}
