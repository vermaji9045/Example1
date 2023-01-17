package com.sandeep.Main;


import com.sandeep.Beans.Vehicle;
import com.sandeep.Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String args[])
    {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean("Hondavehicle",Vehicle.class);
        System.out.println("Name " + veh.getName()+" Price "+veh.getPrice());
    }
}
