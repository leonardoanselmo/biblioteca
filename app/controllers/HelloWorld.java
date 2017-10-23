package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class HelloWorld extends Controller {

    public Result index(){
        return ok(hello.render("Hello World."));
    }

}
