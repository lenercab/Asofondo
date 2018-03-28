//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.02 at 12:12:30 PM COT 
//


package co.gov.colpensiones.beps.comunes.databaseconfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommandText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommandType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{http://www.example.org/DatabaseConfiguration}MetadataParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataQuery", propOrder = {
    "queryName",
    "commandText",
    "commandType",
    "parameters"
})

/**
 * Estructura para almacenar un query SQL
 * @author jgomez
 *
 */

public class MetadataQuery {

    @XmlElement(name = "QueryName", required = true)
    protected String queryName;
    @XmlElement(name = "CommandText", required = true)
    protected String commandText;
    @XmlElement(name = "CommandType")
    protected String commandType;
    @XmlElement(name = "Parameters")
    protected MetadataParameters parameters;

    /**
     * Gets the value of the queryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryName(String value) {
        this.queryName = value;
    }

    /**
     * Gets the value of the commandText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandText() {
        return commandText;
    }

    /**
     * Sets the value of the commandText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandText(String value) {
        this.commandText = value;
    }

    /**
     * Gets the value of the commandType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * Sets the value of the commandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandType(String value) {
        this.commandType = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataParameters }
     *     
     */
    public MetadataParameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataParameters }
     *     
     */
    public void setParameters(MetadataParameters value) {
        this.parameters = value;
    }

}