package com.sandeep.Config;

import com.sandeep.Beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("Auidvehichle")
    Vehicle beasnClass()
    {
        var veh=new Vehicle();
        veh.setName("Audi");
        veh.setPrice(15000);
        return veh;
    }
    @Bean (value = "Hondavehicle")
    Vehicle vehicle()
    {
        var veh=new Vehicle();
        veh.setName("Honda");
        veh.setPrice(12000);
        return veh;
    }
}
