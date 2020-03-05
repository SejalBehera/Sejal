package in.nit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableTransactionManagement
@EnableWebMvc
@PropertySource("classpath:app.properties")
@ComponentScan("in.nit")
public class AppConfig implements WebMvcConfigurer{

	@Autowired
	private Environment env;

	//DataSource
	@Bean
	public DataSource ds() {
		BasicDataSource  ds=new BasicDataSource();
		ds.setDriverClassName(env.getProperty("db.driver"));
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.user"));
		ds.setPassword(env.getProperty("db.password"));
		return ds;
	}

	//SessionFactory
	@Bean
	public LocalSessionFactoryBean sf() {
		LocalSessionFactoryBean sfb=new LocalSessionFactoryBean();
		sfb.setDataSource(ds());
		sfb.setHibernateProperties(props());
		//sfb.setAnnotatedPackages("in.nit.model");
		sfb.setPackagesToScan("in.nit.model");
		return sfb;

	}
	@Bean
	public Properties props() {
		Properties p=new Properties();
		p.put("hibernate.dialect",env.getProperty("orm.dialect"));
		p.put("hibernate.show_sql",env.getProperty("orm.showsql"));
		p.put("hibernate.format_sql",env.getProperty("orm.fmtsql"));
		p.put("hibernate.hbm2ddl.auto",env.getProperty("orm.ddlauto"));
		return p;
	}

	//HibernateTemplate
	@Bean
	public HibernateTemplate ht() {
		HibernateTemplate h=new HibernateTemplate();
		h.setSessionFactory(sf().getObject());
		return h;
	}

	// HibernateTransactionManager
	@Bean
	public HibernateTransactionManager htx() {
		HibernateTransactionManager htm=new  HibernateTransactionManager();
		htm.setSessionFactory(sf().getObject());
		return htm;
	}

	//ViewResolver
	@Bean
	public InternalResourceViewResolver irvr() {
		InternalResourceViewResolver iv=new InternalResourceViewResolver();
		iv.setPrefix(env.getProperty("mvc.prefix"));
		iv.setSuffix(env.getProperty("mvc.suffix"));
		return iv;
	}
	
	//Activate CMF
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		return new CommonsMultipartResolver();
	}

	

	/*
	 * public void addResourceHandler(ResourceHandlerRegistry registry) {
	 * registry.addResourceHandler("/resources/**").addResourceLocations(
	 * "/resources/"); }
	 */
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations( "/resources/"); 
		}
	
}
