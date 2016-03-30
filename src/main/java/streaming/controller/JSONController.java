/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@Controller
public class JSONController {
    
    @ResponseBody
    @RequestMapping(value = "chargejson", method = RequestMethod.GET)
    public Film charger(){
        Film f = new Film(null, "KUNG FU PANDA", "film de panda", 2016L);
        return f;
    }
    
    @RequestMapping(value = "chargerpage", method = RequestMethod.GET)
    public String chargerpage() {


        return "testjson";
    }
}
