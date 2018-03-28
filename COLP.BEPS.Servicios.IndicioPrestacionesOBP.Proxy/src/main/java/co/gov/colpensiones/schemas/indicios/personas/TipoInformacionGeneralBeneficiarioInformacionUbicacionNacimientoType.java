
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralBeneficiario.informacionUbicacionNacimientoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralBeneficiario.informacionUbicacionNacimientoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pais" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoPais"/>
 *         &lt;element name="departemento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDepartamento"/>
 *         &lt;element name="ciudad" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCiudad"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralBeneficiario.informacionUbicacionNacimientoType", propOrder = {
    "pais",
    "departemento",
    "ciudad"
})
public class TipoInformacionGeneralBeneficiarioInformacionUbicacionNacimientoType {

    @XmlElement(required = true, nillable = true)
    protected TipoPais pais;
    @XmlElement(required = true, nillable = true)
    protected TipoDepartamento departemento;
    @XmlElement(required = true, nillable = true)
    protected TipoCiudad ciudad;

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPais }
     *     
     */
    public TipoPais getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPais }
     *     
     */
    public void setPais(TipoPais value) {
        this.pais = value;
    }

    /**
     * Gets the value of the departemento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamento }
     *     
     */
    public TipoDepartamento getDepartemento() {
        return departemento;
    }

    /**
     * Sets the value of the departemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamento }
     *     
     */
    public void setDepartemento(TipoDepartamento value) {
        this.departemento = value;
    }

    /**
     * Gets the value of the ciudad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCiudad }
     *     
     */
    public TipoCiudad getCiudad() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCiudad }
     *     
     */
    public void setCiudad(TipoCiudad value) {
        this.ciudad = value;
    }

}
