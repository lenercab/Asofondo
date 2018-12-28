
package co.gov.colpensiones.schemas.indicios.personas;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEstado;


/**
 * <p>Java class for tipoInformacionConsultaPersonaBEPS.informacionSisbenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaPersonaBEPS.informacionSisbenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="puntaje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nivel" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaPersonaBEPS.informacionSisbenType", propOrder = {
    "puntaje",
    "area",
    "nivel",
    "estado"
})
public class TipoInformacionConsultaPersonaBEPSInformacionSisbenType {

    protected BigDecimal puntaje;
    protected Integer area;
    protected TipoEstado nivel;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado estado;

    /**
     * Gets the value of the puntaje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPuntaje() {
        return puntaje;
    }

    /**
     * Sets the value of the puntaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPuntaje(BigDecimal value) {
        this.puntaje = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea(Integer value) {
        this.area = value;
    }

    /**
     * Gets the value of the nivel property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getNivel() {
        return nivel;
    }

    /**
     * Sets the value of the nivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setNivel(TipoEstado value) {
        this.nivel = value;
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

}
