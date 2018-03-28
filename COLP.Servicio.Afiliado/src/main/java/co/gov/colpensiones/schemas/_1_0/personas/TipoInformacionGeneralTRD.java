
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralTRD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralTRD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionTRD" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionTRDDocumento"/>
 *         &lt;element name="agrupador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDocumentosTRD"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralTRD", propOrder = {
    "identificacionTRD",
    "agrupador",
    "documentos"
})
public class TipoInformacionGeneralTRD {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionTRDDocumento identificacionTRD;
    @XmlElement(required = true, nillable = true)
    protected String agrupador;
    @XmlElement(required = true, nillable = true)
    protected TipoDocumentosTRD documentos;

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
     * Gets the value of the documentos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentosTRD }
     *     
     */
    public TipoDocumentosTRD getDocumentos() {
        return documentos;
    }

    /**
     * Sets the value of the documentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentosTRD }
     *     
     */
    public void setDocumentos(TipoDocumentosTRD value) {
        this.documentos = value;
    }

}
