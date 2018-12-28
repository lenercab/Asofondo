
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaNatural;


/**
 * <p>Java class for tipoInformacionGeneralBeneficiarioPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralBeneficiarioPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural" minOccurs="0"/>
 *         &lt;element name="identificadorBeneficiarioPension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoBeneficiarioPension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralBeneficiarioPension", propOrder = {
    "informacionBasica",
    "identificadorBeneficiarioPension",
    "estadoBeneficiarioPension"
})
public class TipoInformacionGeneralBeneficiarioPension {

    protected TipoInformacionBasicaPersonaNatural informacionBasica;
    protected String identificadorBeneficiarioPension;
    protected String estadoBeneficiarioPension;

    /**
     * Gets the value of the informacionBasica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getInformacionBasica() {
        return informacionBasica;
    }

    /**
     * Sets the value of the informacionBasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setInformacionBasica(TipoInformacionBasicaPersonaNatural value) {
        this.informacionBasica = value;
    }

    /**
     * Gets the value of the identificadorBeneficiarioPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBeneficiarioPension() {
        return identificadorBeneficiarioPension;
    }

    /**
     * Sets the value of the identificadorBeneficiarioPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBeneficiarioPension(String value) {
        this.identificadorBeneficiarioPension = value;
    }

    /**
     * Gets the value of the estadoBeneficiarioPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoBeneficiarioPension() {
        return estadoBeneficiarioPension;
    }

    /**
     * Sets the value of the estadoBeneficiarioPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoBeneficiarioPension(String value) {
        this.estadoBeneficiarioPension = value;
    }

}
