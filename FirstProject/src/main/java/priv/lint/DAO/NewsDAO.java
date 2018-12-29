package priv.lint.DAO;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import priv.lint.entity.News;



public interface NewsDAO extends JpaRepository<News,Long> {
}
