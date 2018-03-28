
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionRegistroInicialAfiliacion.informacionUbicacionVinculacionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionRegistroInicialAfiliacion.informacionUbicacionVinculacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departamento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDepartamento"/>
 *         &lt;element name="ciudad" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCiudad"/>
 *         &lt;element name="puntoAtencion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionRegistroInicialAfiliacion.informacionUbicacionVinculacionType", propOrder = {
    "departamento",
    "ciudad",
    "puntoAtencion"
})
public class TipoInformacionRegistroInicialAfiliacionInformacionUbicacionVinculacionType {

    @XmlElement(required = true, nillable = true)
    protected TipoDepartamento departamento;
    @XmlElement(required = true, nillable = true)
    protected TipoCiudad ciudad;
    @XmlElement(required = true, nillable = true)
    protected String puntoAtencion;

    /**
     * Gets the value of the departamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamento }
     *     
     */
    public TipoDepartamento getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamento }
     *     
     */
    public void setDepartamento(TipoDepartamento value) {
        this.departamento = value;
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

    /**
     * Gets the value of the puntoAtencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuntoAtencion() {
        return puntoAtencion;
    }

    /**
     * Sets the value of the puntoAtencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuntoAtencion(String value) {
        this.puntoAtencion = value;
    }

}
