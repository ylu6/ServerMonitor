package ylu6.org.servermonitor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jt on 10/6/17.
 */
@Configuration
@EnableCassandraRepositories(basePackages = "ylu6.org.servermonitor.repositories")
public class CassandraConfig extends AbstractCassandraConfiguration {

    public static final String KEYSPACE = "servers_db";

//    @Override
//    public SchemaAction getSchemaAction() {
//        return SchemaAction.CREATE_IF_NOT_EXISTS;
//    }

//    @Override
//    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
//        CreateKeyspaceSpecification specification = CreateKeyspaceSpecification.createKeyspace(KEYSPACE);
//
//        return Arrays.asList(specification);
//    }

//    @Override
//    protected List<DropKeyspaceSpecification> getKeyspaceDrops() {
//        return Arrays.asList(DropKeyspaceSpecification.dropKeyspace(KEYSPACE));
//    }

    @Override
    protected String getKeyspaceName() {
        return KEYSPACE;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"ylu6.org.servermonitor.domain"};
    }

    @Bean
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
        cluster.setContactPoints("yeqing-z440");
        cluster.setPort(9042);
        cluster.setUsername("cassandra");
        cluster.setPassword("cassandra");
        return cluster;
    }
}