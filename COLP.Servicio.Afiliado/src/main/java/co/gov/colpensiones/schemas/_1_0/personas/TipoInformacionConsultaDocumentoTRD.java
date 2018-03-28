
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionConsultaDocumentoTRD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaDocumentoTRD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionTRD" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionTRDDocumento"/>
 *         &lt;element name="agrupador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filtrosDocumento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoPropiedades"/>
 *         &lt;element name="incluirContenido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaDocumentoTRD", propOrder = {
    "identificacionTRD",
    "agrupador",
    "filtrosDocumento",
    "incluirContenido"
})
public class TipoInformacionConsultaDocumentoTRD {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionTRDDocumento identificacionTRD;
    @XmlElement(required = true, nillable = true)
    protected String agrupador;
    @XmlElement(required = true, nillable = true)
    protected TipoPropiedades filtrosDocumento;
    protected boolean incluirContenido;

    /**
     * Gets the value of the identificacionTRD property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionTRDDocumento }
     *     
     */
    public TipoIdentificacionTRDDocumento getIdentificacionTRD() {
        return identificacionTRD;
    }

    /**
     * Sets the value of the identificacionTRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionTRDDocumento }
     *     
     */
    public void setIdentificacionTRD(TipoIdentificacionTRDDocumento value) {
        this.identificacionTRD = value;
    }

    /**
     * Gets the value of the agrupador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrupador() {
        return agrupador;
    }

    /**
     * Sets the value of the agrupador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrupador(String value) {
        this.agrupador = value;
    }

    /**
     * Gets the value of the filtrosDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPropiedades }
     *     
     */
    public TipoPropiedades getFiltrosDocumento() {
        return filtrosDocumento;
    }

    /**
     * Sets the value of the filtrosDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPropiedades }
     *     
     */
    public void setFiltrosDocumento(TipoPropiedades value) {
        this.filtrosDocumento = value;
    }

    /**
     * Gets the value of the incluirContenido property.
     * 
     */
    public boolean isIncluirContenido() {
        return incluirContenido;
    }

    /**
     * Sets the value of the incluirContenido property.
     * 
     */
    public void setIncluirContenido(boolean value) {
        this.incluirContenido = value;
    }

}
