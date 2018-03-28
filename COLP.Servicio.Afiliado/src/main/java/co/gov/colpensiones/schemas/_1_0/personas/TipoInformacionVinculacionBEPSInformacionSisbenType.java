
package co.gov.colpensiones.schemas._1_0.personas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionVinculacionBEPS.informacionSisbenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionVinculacionBEPS.informacionSisbenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="puntajeModificado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="areaModificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indicadorCambioPuntaje" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indicadorCambioArea" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionVinculacionBEPS.informacionSisbenType", propOrder = {
    "puntajeModificado",
    "areaModificado",
    "indicadorCambioPuntaje",
    "indicadorCambioArea"
})
public class TipoInformacionVinculacionBEPSInformacionSisbenType {

    protected BigDecimal puntajeModificado;
    protected Integer areaModificado;
    protected boolean indicadorCambioPuntaje;
    protected boolean indicadorCambioArea;

    /**
     * Gets the value of the puntajeModificado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPuntajeModificado() {
        return puntajeModificado;
    }

    /**
     * Sets the value of the puntajeModificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPuntajeModificado(BigDecimal value) {
        this.puntajeModificado = value;
    }

    /**
     * Gets the value of the areaModificado property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAreaModificado() {
        return areaModificado;
    }

    /**
     * Sets the value of the areaModificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAreaModificado(Integer value) {
        this.areaModificado = value;
    }

    /**
     * Gets the value of the indicadorCambioPuntaje property.
     * 
     */
    public boolean isIndicadorCambioPuntaje() {
        return indicadorCambioPuntaje;
    }

    /**
     * Sets the value of the indicadorCambioPuntaje property.
     * 
     */
    public void setIndicadorCambioPuntaje(boolean value) {
        this.indicadorCambioPuntaje = value;
    }

    /**
     * Gets the value of the indicadorCambioArea property.
     * 
     */
    public boolean isIndicadorCambioArea() {
        return indicadorCambioArea;
    }

    /**
     * Sets the value of the indicadorCambioArea property.
     * 
     */
    public void setIndicadorCambioArea(boolean value) {
        this.indicadorCambioArea = value;
    }

}
