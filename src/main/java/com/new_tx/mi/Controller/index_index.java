package com.new_tx.mi.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLEncoder;

@RestController
public class index_index {

    @ResponseBody
    @RequestMapping(value = "/")
    public ModelAndView index_index() {
        ModelAndView model = new ModelAndView();

        long lo = System.currentTimeMillis();
        URL url;
        try {
            url = new URL("http://localhost:9999");
            InputStream in = url.openStream();
            System.out.println("连接可用");
        } catch (Exception e1) {
            System.out.println("连接打不开!");
            url = null;
        }


        model.setViewName("index_index");
        return model;
        //return  "index_index";
    }

    @RequestMapping(value = "/test/{id}/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("id") Integer id, @PathVariable("name") String name) {


        return "id:" + id + " name:" + name;
    }
    @RequestMapping(value = "/reh", method = RequestMethod.GET)
    public String sayHello1() {


        return "id:"  + " name:" ;
    }

    //get请求，获取url请求参数的值 @RequestParam
//localhost:8080/test?id=99
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void sayHello(HttpServletResponse response) {
        String path = "src/main/resources/templates/index_index.html";
        File file = new File(path);
        String filename = file.getName();
        String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();
        // 以流的形式下载文件。
        InputStream fis = null;
        OutputStream output = null;
        try {
            fis = new BufferedInputStream(new FileInputStream(path));

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            response.reset();

            output = response.getOutputStream();
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setHeader("Content-Disposition",
                    "attachment;fileName=" + URLEncoder.encode("环境信访数据导出.html", "UTF-8"));

            output.write(buffer);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String sayHello2(@RequestParam(value = "id", required = false, defaultValue = "1") Integer id) {
        return "id:" + id;
    }

}
