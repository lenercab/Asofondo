
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionVinculacionBEPS.informacionNacimientoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionVinculacionBEPS.informacionNacimientoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departamento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDepartamento" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCiudad" minOccurs="0"/>
 *         &lt;element name="indicadorCambioFechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionVinculacionBEPS.informacionNacimientoType", propOrder = {
    "departamento",
    "ciudad",
    "indicadorCambioFechaNacimiento",
    "fecha"
})
public class TipoInformacionVinculacionBEPSInformacionNacimientoType {

    protected TipoDepartamento departamento;
    protected TipoCiudad ciudad;
    protected boolean indicadorCambioFechaNacimiento;
    protected String fecha;

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
     * Gets the value of the indicadorCambioFechaNacimiento property.
     * 
     */
    public boolean isIndicadorCambioFechaNacimiento() {
        return indicadorCambioFechaNacimiento;
    }

    /**
     * Sets the value of the indicadorCambioFechaNacimiento property.
     * 
     */
    public void setIndicadorCambioFechaNacimiento(boolean value) {
        this.indicadorCambioFechaNacimiento = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

}
