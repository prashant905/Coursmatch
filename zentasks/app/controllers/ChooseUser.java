package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.chooseLogin;
public class ChooseUser extends Controller{
	
	public static Result login(){
		return ok(chooseLogin.render());
	}

}
