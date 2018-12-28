
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionConsultaGeneralBeneficiarioPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaGeneralBeneficiarioPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionGeneralBeneficiarioPension" minOccurs="0"/>
 *         &lt;element name="informacionPension" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoDatosPensiones" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaGeneralBeneficiarioPension", propOrder = {
    "informacionPersonal",
    "informacionPension"
})
public class TipoInformacionConsultaGeneralBeneficiarioPension {

    protected TipoInformacionGeneralBeneficiarioPension informacionPersonal;
    protected TipoDatosPensiones informacionPension;

    /**
     * Gets the value of the informacionPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralBeneficiarioPension }
     *     
     */
    public TipoInformacionGeneralBeneficiarioPension getInformacionPersonal() {
        return informacionPersonal;
    }

    /**
     * Sets the value of the informacionPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralBeneficiarioPension }
     *     
     */
    public void setInformacionPersonal(TipoInformacionGeneralBeneficiarioPension value) {
        this.informacionPersonal = value;
    }

    /**
     * Gets the value of the informacionPension property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDatosPensiones }
     *     
     */
    public TipoDatosPensiones getInformacionPension() {
        return informacionPension;
    }

    /**
     * Sets the value of the informacionPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDatosPensiones }
     *     
     */
    public void setInformacionPension(TipoDatosPensiones value) {
        this.informacionPension = value;
    }

}
