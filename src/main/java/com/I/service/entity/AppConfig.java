package com.I.service.entity;

//@ComponentScan(value = "com")
//@Configuration
//@MapperScan(value = "com.I.service.mapper")
////@EnableAspectJAutoProxy
//@EnableTransactionManagement
//@PropertySource("jdbc.properties")
public class AppConfig {
//    @Value("${jdbc.url}")
//    String jdbcUrl;
//
//    @Value("${jdbc.username}")
//    String jdbcUsername;
//
//    @Value("${jdbc.password}")
//    String jdbcPassword;
//
//    @Bean
//    DataSource createDataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl(jdbcUrl);
//        config.setUsername(jdbcUsername);
//        config.setPassword(jdbcPassword);
//        config.addDataSourceProperty("autoCommit", "true");
//        config.addDataSourceProperty("connectionTimeout", "5");
//        config.addDataSourceProperty("idleTimeout", "60");
//        return new HikariDataSource(config);
//    }
//
//    /**
//     * MyBatis datasource is SqlSessionFactory
//     * @param dataSource
//     * @return
//     */
//    @Bean
//    SqlSessionFactoryBean createSqlSessionFactoryBean(@Autowired DataSource dataSource) {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        return sqlSessionFactoryBean;
//    }
//
//    @Bean
//    PlatformTransactionManager createTxManager(@Autowired DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }








//    @Bean
//    JdbcTemplate createJdbcTemplate(@Autowired DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }




}

