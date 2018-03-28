
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.errores.TipoEstadoEjecucion;


/**
 * <p>Java class for tipoInformacionConsultaGeneralCausanteDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaGeneralCausanteDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detalle" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionConsultaGeneralCausante"/>
 *         &lt;element name="estadoEjecucion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun/errores}tipoEstadoEjecucion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaGeneralCausanteDTO", propOrder = {
    "detalle",
    "estadoEjecucion"
})
public class TipoInformacionConsultaGeneralCausanteDTO {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionConsultaGeneralCausante detalle;
    @XmlElement(required = true, nillable = true)
    protected TipoEstadoEjecucion estadoEjecucion;

    /**
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionConsultaGeneralCausante }
     *     
     */
    public TipoInformacionConsultaGeneralCausante getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionConsultaGeneralCausante }
     *     
     */
    public void setDetalle(TipoInformacionConsultaGeneralCausante value) {
        this.detalle = value;
    }

    /**
     * Gets the value of the estadoEjecucion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoEjecucion }
     *     
     */
    public TipoEstadoEjecucion getEstadoEjecucion() {
        return estadoEjecucion;
    }

    /**
     * Sets the value of the estadoEjecucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoEjecucion }
     *     
     */
    public void setEstadoEjecucion(TipoEstadoEjecucion value) {
        this.estadoEjecucion = value;
    }

}
