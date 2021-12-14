package com.example.servingwebcontent.Controller;

import com.example.servingwebcontent.Model.Times;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;



@Controller
public class MainController {

    private static final String INDEX = "index";
    private static final String URL= "https://api.nytimes.com/svc/search/v2/articlesearch.json?" +
            "facet_field=day_of_week&" +
            "facet=true&" +
            "begin_date=20210101&" +
            "end_date=20210101" +
            "&api-key=MMZe5bFoyhuIP0ySF3ln4K7Uvx0Qoymc";
    private static final String WAY = "&fq=";


    @GetMapping()
    public String test(@RequestParam(defaultValue = "Arts") String fq, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Times result = restTemplate.getForObject(URL + WAY + fq, Times.class);
        model.addAttribute("temp", result);


        return INDEX;
    };
}