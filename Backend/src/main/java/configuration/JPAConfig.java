package configuration;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.File;

@Configuration
@EnableJpaRepositories(value = "model.dao",
        entityManagerFactoryRef = "entityManagerBean")
@EnableTransactionManagement
public class JPAConfig extends WebMvcConfigurerAdapter {

    public EntityManagerFactory entityManagerBean() {
        LocalContainerEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localEntityManagerFactoryBean.setPersistenceUnitName("persistance.reading");
        localEntityManagerFactoryBean.setDataSource(dataSource());
        localEntityManagerFactoryBean.setPackagesToScan("model.dao", "model.dto", "model");
        return localEntityManagerFactoryBean.getObject();
    }

    public DataSource dataSource() {
        DataSource dataSource1 = new MysqlDataSource();
        ((MysqlDataSource) dataSource1).setUser("root");
        ((MysqlDataSource) dataSource1).setDatabaseName("hajjVisa");
        ((MysqlDataSource) dataSource1).setURL("spring.datasource.url");
        ((MysqlDataSource) dataSource1).setPort(3306);
        return dataSource1;
    }
}