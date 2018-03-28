
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralReconocimiento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralReconocimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBasicaTramiteReconocimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionBasicaTramiteReconocimiento"/>
 *         &lt;element name="informacionCausante" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionCausante"/>
 *         &lt;element name="beneficiarios" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoBeneficiariosReconocimiento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralReconocimiento", propOrder = {
    "informacionBasicaTramiteReconocimiento",
    "informacionCausante",
    "beneficiarios"
})
public class TipoInformacionGeneralReconocimiento {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaTramiteReconocimiento informacionBasicaTramiteReconocimiento;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionCausante informacionCausante;
    @XmlElement(required = true, nillable = true)
    protected TipoBeneficiariosReconocimiento beneficiarios;

    /**
     * Gets the value of the informacionBasicaTramiteReconocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaTramiteReconocimiento }
     *     
     */
    public TipoInformacionBasicaTramiteReconocimiento getInformacionBasicaTramiteReconocimiento() {
        return informacionBasicaTramiteReconocimiento;
    }

    /**
     * Sets the value of the informacionBasicaTramiteReconocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaTramiteReconocimiento }
     *     
     */
    public void setInformacionBasicaTramiteReconocimiento(TipoInformacionBasicaTramiteReconocimiento value) {
        this.informacionBasicaTramiteReconocimiento = value;
    }

    /**
     * Gets the value of the informacionCausante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionCausante }
     *     
     */
    public TipoInformacionCausante getInformacionCausante() {
        return informacionCausante;
    }

    /**
     * Sets the value of the informacionCausante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionCausante }
     *     
     */
    public void setInformacionCausante(TipoInformacionCausante value) {
        this.informacionCausante = value;
    }

    /**
     * Gets the value of the beneficiarios property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBeneficiariosReconocimiento }
     *     
     */
    public TipoBeneficiariosReconocimiento getBeneficiarios() {
        return beneficiarios;
    }

    /**
     * Sets the value of the beneficiarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBeneficiariosReconocimiento }
     *     
     */
    public void setBeneficiarios(TipoBeneficiariosReconocimiento value) {
        this.beneficiarios = value;
    }

}
