//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.02 at 12:12:30 PM COT 
//


package co.gov.colpensiones.beps.comunes.databaseconfiguration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the colp.comunes.databaseconfiguration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DatabaseConfiguration_QNAME = new QName("http://www.example.org/DatabaseConfiguration", "DatabaseConfiguration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: colp.comunes.databaseconfiguration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatabaseConfiguration }
     * 
     */
    public DatabaseConfiguration createDatabaseConfiguration() {
        return new DatabaseConfiguration();
    }

    /**
     * Create an instance of {@link MetadataQuery }
     * 
     */
    public MetadataQuery createMetadataQuery() {
        return new MetadataQuery();
    }

    /**
     * Create an instance of {@link MetadataParameter }
     * 
     */
    public MetadataParameter createMetadataParameter() {
        return new MetadataParameter();
    }

    /**
     * Create an instance of {@link MetadataParameters }
     * 
     */
    public MetadataParameters createMetadataParameters() {
        return new MetadataParameters();
    }

    /**
     * Create an instance of {@link MetadataQueries }
     * 
     */
    public MetadataQueries createMetadataQueries() {
        return new MetadataQueries();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/DatabaseConfiguration", name = "DatabaseConfiguration")
    public JAXBElement<DatabaseConfiguration> createDatabaseConfiguration(DatabaseConfiguration value) {
        return new JAXBElement<DatabaseConfiguration>(_DatabaseConfiguration_QNAME, DatabaseConfiguration.class, null, value);
    }

}
