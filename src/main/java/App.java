
import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (req,res) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      if(req.queryParams().size() == 0){






        model.put("requestsy",req);



      } else {
        String inString= req.queryParams("inAllers");
        String outDiseases = Allergies.alan(inString);

        model.put("yourAls", outDiseases);
      }
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine() );


  }

}
