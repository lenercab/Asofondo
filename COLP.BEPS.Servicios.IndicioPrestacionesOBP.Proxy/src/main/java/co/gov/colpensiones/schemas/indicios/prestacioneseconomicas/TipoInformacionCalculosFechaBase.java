
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionCalculosFechaBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionCalculosFechaBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicadorActivo300692" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorDesvinculado300692" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFinalLaboral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorSuspensionLicencia300692" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInicioLicencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCalculosFechaBase", propOrder = {
    "indicadorActivo300692",
    "indicadorDesvinculado300692",
    "fechaFinalLaboral",
    "indicadorSuspensionLicencia300692",
    "fechaInicioLicencia"
})
public class TipoInformacionCalculosFechaBase {

    protected String indicadorActivo300692;
    protected String indicadorDesvinculado300692;
    protected String fechaFinalLaboral;
    protected String indicadorSuspensionLicencia300692;
    protected String fechaInicioLicencia;

    /**
     * Gets the value of the indicadorActivo300692 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorActivo300692() {
        return indicadorActivo300692;
    }

    /**
     * Sets the value of the indicadorActivo300692 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorActivo300692(String value) {
        this.indicadorActivo300692 = value;
    }

    /**
     * Gets the value of the indicadorDesvinculado300692 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorDesvinculado300692() {
        return indicadorDesvinculado300692;
    }

    /**
     * Sets the value of the indicadorDesvinculado300692 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorDesvinculado300692(String value) {
        this.indicadorDesvinculado300692 = value;
    }

    /**
     * Gets the value of the fechaFinalLaboral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinalLaboral() {
        return fechaFinalLaboral;
    }

    /**
     * Sets the value of the fechaFinalLaboral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinalLaboral(String value) {
        this.fechaFinalLaboral = value;
    }

    /**
     * Gets the value of the indicadorSuspensionLicencia300692 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorSuspensionLicencia300692() {
        return indicadorSuspensionLicencia300692;
    }

    /**
     * Sets the value of the indicadorSuspensionLicencia300692 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorSuspensionLicencia300692(String value) {
        this.indicadorSuspensionLicencia300692 = value;
    }

    /**
     * Gets the value of the fechaInicioLicencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioLicencia() {
        return fechaInicioLicencia;
    }

    /**
     * Sets the value of the fechaInicioLicencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioLicencia(String value) {
        this.fechaInicioLicencia = value;
    }

}
