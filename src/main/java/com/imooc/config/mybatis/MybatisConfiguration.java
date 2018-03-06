//package com.imooc.config.mybatis;
//
//import com.imooc.config.datasource.DataSourceConfiguration;
//import com.imooc.config.datasource.DynamicDataSourceRouter;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.ibatis.mapping.DatabaseIdProvider;
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
//import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
//import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
//import org.springframework.beans.factory.ObjectProvider;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Slf4j
//@Configuration
//@AutoConfigureAfter({DataSourceConfiguration.class})
//@MapperScan(basePackages = {"com.imooc.dao.mapper"})
//@EnableTransactionManagement
//@ConditionalOnClass({EnableTransactionManagement.class})
//public class MybatisConfiguration extends MybatisAutoConfiguration {
//
//    @Resource(name = "masterDataSource")
//    private DataSource masterDataSource;
//
//    @Resource(name = "slaveDataSource")
//    private DataSource slaveDataSource;
//
//    public MybatisConfiguration(MybatisProperties properties, ObjectProvider<Interceptor[]> interceptorsProvider,
//                         ResourceLoader resourceLoader, ObjectProvider<DatabaseIdProvider> databaseIdProvider,
//                         ObjectProvider<List<ConfigurationCustomizer>> configurationCustomizersProvider) {
//        super(properties, interceptorsProvider, resourceLoader, databaseIdProvider, configurationCustomizersProvider);
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactorys() throws Exception {
//        return super.sqlSessionFactory(roundRobinDataSouceProxy());
//    }
//
//    @Bean(name = "routingDataSource")
//    public AbstractRoutingDataSource roundRobinDataSouceProxy() {
//        DynamicDataSourceRouter proxy = new DynamicDataSourceRouter();
//        Map<Object, Object> targetDataSources = new HashMap<>(2);
//        targetDataSources.put("masterDataSource", masterDataSource);
//        targetDataSources.put("slaveDataSource", slaveDataSource);
//
//        proxy.setDefaultTargetDataSource(masterDataSource);
//        proxy.setTargetDataSources(targetDataSources);
//        return proxy;
//    }
//
//    @Bean(name = "transactionManager")
//    public DataSourceTransactionManager transactionManagers() {
//        log.info("-------------------- transactionManager init ---------------------");
//        return new DataSourceTransactionManager(roundRobinDataSouceProxy());
//    }
//
//
//}
