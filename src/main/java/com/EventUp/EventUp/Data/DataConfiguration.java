package com.EventUp.EventUp.Data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
public class DataConfiguration {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/EventUp?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true); //Mostra a criaçao do Banco de dados no console
        adapter.setGenerateDdl(true); //Cria a entidade de dados no Banco de dados
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect"); // Hibernate so serve para conectar e configurar o Banco de dados no Projeto / Codigo.
        adapter.setPrepareConnection(true);

        return adapter;

    }
}
