package controllers;

import controllers.BasicCtr;
import play.data.validation.Required;
import play.mvc.*;
import java.util.Calendar;

public class HomeCtr extends BasicCtr {

    public static void index(){
        int tahun = Calendar.getInstance().get(Calendar.YEAR);
        render(tahun);
    }

    public static void login (@Required String username, @Required String password) throws Exception{
        System.out.println(username);
        redirect(LandingPageCtr.class,"index");
    }

    public static void logout () throws Exception{
        flash().success("Berhasil logout");
        redirect(HomeCtr.class,"index");
    }


}
