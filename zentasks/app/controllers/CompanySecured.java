package controllers;

import controllers.CompanyController.Login;
import play.mvc.*;
import play.mvc.Http.*;
import play.data.Form;
import  play.data.Form.*;
import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import models.*;

public class CompanySecured extends Security.Authenticator {
    
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }
    
    @Override
    public Result onUnauthorized(Context ctx) {
           return redirect(
                   routes.CompanyController.login()
        	        );
    }
    
}