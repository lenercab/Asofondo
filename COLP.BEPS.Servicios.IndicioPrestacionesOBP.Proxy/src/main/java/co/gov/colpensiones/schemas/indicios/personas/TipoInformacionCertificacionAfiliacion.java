
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEstado;


/**
 * <p>Java class for tipoInformacionCertificacionAfiliacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionCertificacionAfiliacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="fechaAfiliacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="informacionColombianoEnExterior" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionCertificacionColombianoExterior"/>
 *         &lt;element name="traslados" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTrasladosAfiliacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCertificacionAfiliacion", propOrder = {
    "informacionPersonal",
    "fechaAfiliacion",
    "estado",
    "informacionColombianoEnExterior",
    "traslados"
})
public class TipoInformacionCertificacionAfiliacion {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural informacionPersonal;
    @XmlElement(required = true, nillable = true)
    protected String fechaAfiliacion;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado estado;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionCertificacionColombianoExterior informacionColombianoEnExterior;
    protected TipoTrasladosAfiliacion traslados;

    /**
     * Gets the value of the informacionPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getInformacionPersonal() {
        return informacionPersonal;
    }

    /**
     * Sets the value of the informacionPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setInformacionPersonal(TipoInformacionBasicaPersonaNatural value) {
        this.informacionPersonal = value;
    }

    /**
     * Gets the value of the fechaAfiliacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    /**
     * Sets the value of the fechaAfiliacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAfiliacion(String value) {
        this.fechaAfiliacion = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setEstado(TipoEstado value) {
        this.estado = value;
    }

    /**
     * Gets the value of the informacionColombianoEnExterior property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionCertificacionColombianoExterior }
     *     
     */
    public TipoInformacionCertificacionColombianoExterior getInformacionColombianoEnExterior() {
        return informacionColombianoEnExterior;
    }

    /**
     * Sets the value of the informacionColombianoEnExterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionCertificacionColombianoExterior }
     *     
     */
    public void setInformacionColombianoEnExterior(TipoInformacionCertificacionColombianoExterior value) {
        this.informacionColombianoEnExterior = value;
    }

    /**
     * Gets the value of the traslados property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTrasladosAfiliacion }
     *     
     */
    public TipoTrasladosAfiliacion getTraslados() {
        return traslados;
    }

    /**
     * Sets the value of the traslados property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTrasladosAfiliacion }
     *     
     */
    public void setTraslados(TipoTrasladosAfiliacion value) {
        this.traslados = value;
    }

}
