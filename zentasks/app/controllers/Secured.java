package controllers;

import controllers.Application.Login;
import play.mvc.*;
import play.mvc.Http.*;
import views.html.login;
import play.data.Form;
import  play.data.Form.*;
import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import models.*;

public class Secured extends Security.Authenticator {
    
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }
    
    @Override
    public Result onUnauthorized(Context ctx) {
           return ok(
                login.render(form(Login.class))
                );
    }
    
}