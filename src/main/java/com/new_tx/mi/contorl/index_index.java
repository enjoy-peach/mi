package com.new_tx.mi.contorl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class index_index {

    @ResponseBody
    @RequestMapping(value = "/")
    public ModelAndView index_index(){
        ModelAndView model = new ModelAndView();

        model.setViewName("index_index");
        return model;
        //return  "index_index";
    }

    @RequestMapping(value = "/test/{id}/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        return "id:" + id + " name:" + name;
    }

    //get请求，获取url请求参数的值 @RequestParam
//localhost:8080/test?id=99
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sayHello(@RequestParam Integer id) {
        return "id:" + id;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String sayHello2(@RequestParam(value = "id", required = false, defaultValue = "1") Integer id) {
        return "id:" + id;
    }

}
