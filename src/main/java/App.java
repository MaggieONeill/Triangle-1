import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/triangle", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      int side_1 = Integer.parseInt(request.queryParams("side_1"));
      int side_2 = Integer.parseInt(request.queryParams("side_2"));
      int side_3 = Integer.parseInt(request.queryParams("side_3"));

      boolean isNotTriangle = false; 


      Triangle myTriangle = new Triangle(side_1, side_2, side_3);
      model.put("myTriangle", myTriangle);

      model.put("template", "templates/triangle.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }


}
