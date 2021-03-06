
package be.facet.it.dojo.customershibernate.repository;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * Since we are using plain hibernate, without Spring, therefore we need to configure 
 * everything in classes with hardcoded references to the configuration file. We also need to make this an
 * enumeration type, as we want to make sure that there is only one hibernate sessionfactory around. 
 * 
 * 
 * About the StandardServiceRegistry: according to the documentation http://docs.jboss.org/hibernate/core/4.0/devguide/en-US/html/ch07.html#services-registry
 * and https://access.redhat.com/documentation/en-US/JBoss_Enterprise_Application_Platform/6.4/html/Development_Guide/sect-Hibernate_Services.html
 * a user can extend and even override specific functionality of Hibernate with services. All implementations of hibernate interfaces/contracts for type safety
 * and ofcource to enforce some kind of contract, basically customizing the behaviour of hibernate. 
 * 
 * The purpose of the serviceregistry is to hold, manage and provide access. 
 * 
 * ------------- not confirmed --------------
 * A service registry reminds me of the design pattern: Service locator (inversion of control). I wonder if it is implemented like that. 
 */
public enum HibernateSession {
    FACTORY;
    
    private SessionFactory factory = null;
    
    private HibernateSession(){
        /** this is for Hibernate version 4
            // step 1: create a configuration and point it to the hibernate configuration file
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfx.xml");

            // step 2: Create a service registry
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            //step 3: use the registry to build a sessionfactory
            factory = configuration.buildSessionFactory(registry);
        */
        
        //From the hibernate docs:
        //https://docs.jboss.org/hibernate/orm/5.0/topical/html/bootstrap/NativeBootstrapping.html#_building_the_serviceregistry
        //Step 1: create a Service registry for holding the services that Hiberate needs
        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
        registryBuilder.configure("hibernate.cfx.xml");
        StandardServiceRegistry registry = registryBuilder.build();
        
        //Step 2: create the metadata needed for our application, such as the mappings and the domainmodel representations
        //This deliveres metadata with default behaviour. This can be changed using the metadatasources builder
        Metadata metaData = new MetadataSources().buildMetadata(registry);
        
        //Step 3: Create the SessionFactory
        this.factory =  metaData.buildSessionFactory();
    }
    
    public SessionFactory factory(){
        return factory;
    }
    
}
