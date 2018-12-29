package priv.lint.Service;

import priv.lint.entity.News;

import java.util.List;


public interface NewsService  {
    List<News> listAllNews();

    void addNews(News news);

    void delNews(News news);
}
