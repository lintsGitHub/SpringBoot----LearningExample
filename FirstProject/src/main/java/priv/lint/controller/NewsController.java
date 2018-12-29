package priv.lint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.lint.Service.NewsServiceImpl;
import priv.lint.entity.News;

import java.util.List;

@RestController
@RequestMapping
public class NewsController {

    @Autowired
    NewsServiceImpl newsService;

    @GetMapping("/newslist")
    public List<News> all(){
        return newsService.listAllNews();
    }
    @GetMapping("/n")
    public String all1(){
        return "sass";
    }
}
