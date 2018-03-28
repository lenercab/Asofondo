
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralBeneficiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralPersona"/>
 *         &lt;element name="informacionUbicacionNacimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralBeneficiario.informacionUbicacionNacimientoType"/>
 *         &lt;element name="codigoParentesco" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tipoNovedad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralBeneficiario", propOrder = {
    "informacionPersonal",
    "informacionUbicacionNacimiento",
    "codigoParentesco",
    "tipoNovedad"
})
public class TipoInformacionGeneralBeneficiario {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralPersona informacionPersonal;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralBeneficiarioInformacionUbicacionNacimientoType informacionUbicacionNacimiento;
    protected long codigoParentesco;
    protected long tipoNovedad;

    /**
     * Gets the value of the informacionPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPersona }
     *     
     */
    public TipoInformacionGeneralPersona getInformacionPersonal() {
        return informacionPersonal;
    }

    /**
     * Sets the value of the informacionPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPersona }
     *     
     */
    public void setInformacionPersonal(TipoInformacionGeneralPersona value) {
        this.informacionPersonal = value;
    }

    /**
     * Gets the value of the informacionUbicacionNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralBeneficiarioInformacionUbicacionNacimientoType }
     *     
     */
    public TipoInformacionGeneralBeneficiarioInformacionUbicacionNacimientoType getInformacionUbicacionNacimiento() {
        return informacionUbicacionNacimiento;
    }

    /**
     * Sets the value of the informacionUbicacionNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralBeneficiarioInformacionUbicacionNacimientoType }
     *     
     */
    public void setInformacionUbicacionNacimiento(TipoInformacionGeneralBeneficiarioInformacionUbicacionNacimientoType value) {
        this.informacionUbicacionNacimiento = value;
    }

    /**
     * Gets the value of the codigoParentesco property.
     * 
     */
    public long getCodigoParentesco() {
        return codigoParentesco;
    }

    /**
     * Sets the value of the codigoParentesco property.
     * 
     */
    public void setCodigoParentesco(long value) {
        this.codigoParentesco = value;
    }

    /**
     * Gets the value of the tipoNovedad property.
     * 
     */
    public long getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Sets the value of the tipoNovedad property.
     * 
     */
    public void setTipoNovedad(long value) {
        this.tipoNovedad = value;
    }

}
