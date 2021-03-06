package com.SystemInformation.RestServices.SystemRequirements;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemData {

    @RequestMapping("/")
    public String Data()
    {
        String Info = null;

        //At first we will gather some hardware information
        Info = ("Hardware parts : <br><br>");
        //Add data about available cores
        Info += ("Now available cores are : " + Runtime.getRuntime().availableProcessors()+ "<br>" );

        //Add data about memory status : free , max and total
        Info += ("Free memory in bytes : " + Runtime.getRuntime().freeMemory() + "<br>" +
                 "Max memory in bytes : " + Runtime.getRuntime().maxMemory() + "<br>" +
                 "Total memory in bytes : " + Runtime.getRuntime().totalMemory() + "<br>"
                );

        //Add data software information
        Info += ("<br>Software parts :" + "<br><br>" +
                 "Name of your OS : " + System.getProperty("os.name") + "<br>" +
                 "Version of your OS : " + System.getProperty("os.version") + "<br>" +
                 "Architecture of your OS :" + System.getProperty("os.arch"));

        return Info;
    }
}
