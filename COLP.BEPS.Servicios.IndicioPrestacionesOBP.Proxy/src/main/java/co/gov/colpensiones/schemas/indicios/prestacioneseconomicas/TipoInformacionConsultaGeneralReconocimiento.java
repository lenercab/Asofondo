
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionConsultaGeneralReconocimiento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaGeneralReconocimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionCausante" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionCausanteReconocimiento"/>
 *         &lt;element name="informacionReconocimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionReconocimiento"/>
 *         &lt;element name="informacionTiemposPublicos" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionTiemposPublicos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaGeneralReconocimiento", propOrder = {
    "informacionCausante",
    "informacionReconocimiento",
    "informacionTiemposPublicos"
})
public class TipoInformacionConsultaGeneralReconocimiento {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionCausanteReconocimiento informacionCausante;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionReconocimiento informacionReconocimiento;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionTiemposPublicos informacionTiemposPublicos;

    /**
     * Gets the value of the informacionCausante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionCausanteReconocimiento }
     *     
     */
    public TipoInformacionCausanteReconocimiento getInformacionCausante() {
        return informacionCausante;
    }

    /**
     * Sets the value of the informacionCausante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionCausanteReconocimiento }
     *     
     */
    public void setInformacionCausante(TipoInformacionCausanteReconocimiento value) {
        this.informacionCausante = value;
    }

    /**
     * Gets the value of the informacionReconocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionReconocimiento }
     *     
     */
    public TipoInformacionReconocimiento getInformacionReconocimiento() {
        return informacionReconocimiento;
    }

    /**
     * Sets the value of the informacionReconocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionReconocimiento }
     *     
     */
    public void setInformacionReconocimiento(TipoInformacionReconocimiento value) {
        this.informacionReconocimiento = value;
    }

    /**
     * Gets the value of the informacionTiemposPublicos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionTiemposPublicos }
     *     
     */
    public TipoInformacionTiemposPublicos getInformacionTiemposPublicos() {
        return informacionTiemposPublicos;
    }

    /**
     * Sets the value of the informacionTiemposPublicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionTiemposPublicos }
     *     
     */
    public void setInformacionTiemposPublicos(TipoInformacionTiemposPublicos value) {
        this.informacionTiemposPublicos = value;
    }

}
