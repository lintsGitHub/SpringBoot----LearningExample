package priv.lint.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.lint.DAO.NewsDAO;
import priv.lint.entity.News;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDAO newsDAO;


    @Override
    public List<News> listAllNews() {
        return newsDAO.findAll();
    }

    @Override
    public void addNews(News news) {
        newsDAO.save(news);
    }

    @Override
    public void delNews(News news) {
        newsDAO.delete(news);
    }
}
