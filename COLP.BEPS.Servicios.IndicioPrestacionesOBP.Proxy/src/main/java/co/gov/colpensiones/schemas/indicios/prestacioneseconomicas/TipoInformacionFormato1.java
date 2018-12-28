
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionFormato1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionFormato1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vinculacionesLaborales" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionPeriodosVinculacion"/>
 *         &lt;element name="aportesPensionales" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionPeriodosAportes"/>
 *         &lt;element name="informacionComplementaria" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionComplementariaFormato1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionFormato1", propOrder = {
    "vinculacionesLaborales",
    "aportesPensionales",
    "informacionComplementaria"
})
public class TipoInformacionFormato1 {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionPeriodosVinculacion vinculacionesLaborales;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionPeriodosAportes aportesPensionales;
    protected TipoInformacionComplementariaFormato1 informacionComplementaria;

    /**
     * Gets the value of the vinculacionesLaborales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPeriodosVinculacion }
     *     
     */
    public TipoInformacionPeriodosVinculacion getVinculacionesLaborales() {
        return vinculacionesLaborales;
    }

    /**
     * Sets the value of the vinculacionesLaborales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPeriodosVinculacion }
     *     
     */
    public void setVinculacionesLaborales(TipoInformacionPeriodosVinculacion value) {
        this.vinculacionesLaborales = value;
    }

    /**
     * Gets the value of the aportesPensionales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPeriodosAportes }
     *     
     */
    public TipoInformacionPeriodosAportes getAportesPensionales() {
        return aportesPensionales;
    }

    /**
     * Sets the value of the aportesPensionales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPeriodosAportes }
     *     
     */
    public void setAportesPensionales(TipoInformacionPeriodosAportes value) {
        this.aportesPensionales = value;
    }

    /**
     * Gets the value of the informacionComplementaria property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionComplementariaFormato1 }
     *     
     */
    public TipoInformacionComplementariaFormato1 getInformacionComplementaria() {
        return informacionComplementaria;
    }

    /**
     * Sets the value of the informacionComplementaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionComplementariaFormato1 }
     *     
     */
    public void setInformacionComplementaria(TipoInformacionComplementariaFormato1 value) {
        this.informacionComplementaria = value;
    }

}
