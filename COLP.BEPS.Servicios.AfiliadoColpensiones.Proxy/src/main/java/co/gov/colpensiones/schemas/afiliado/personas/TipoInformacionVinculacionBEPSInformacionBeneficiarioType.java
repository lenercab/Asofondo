
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionVinculacionBEPS.informacionBeneficiarioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionVinculacionBEPS.informacionBeneficiarioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona" minOccurs="0"/>
 *         &lt;element name="nombresApellidos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTelefonos" minOccurs="0"/>
 *         &lt;element name="parentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionVinculacionBEPS.informacionBeneficiarioType", propOrder = {
    "identificacion",
    "nombresApellidos",
    "genero",
    "telefonos",
    "parentesco"
})
public class TipoInformacionVinculacionBEPSInformacionBeneficiarioType {

    protected TipoIdentificacionPersona identificacion;
    protected TipoInformacionBasicaPersonaNatural nombresApellidos;
    protected String genero;
    protected TipoTelefonos telefonos;
    protected String parentesco;

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacion(TipoIdentificacionPersona value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the nombresApellidos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getNombresApellidos() {
        return nombresApellidos;
    }

    /**
     * Sets the value of the nombresApellidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setNombresApellidos(TipoInformacionBasicaPersonaNatural value) {
        this.nombresApellidos = value;
    }

    /**
     * Gets the value of the genero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Sets the value of the genero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Gets the value of the telefonos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTelefonos }
     *     
     */
    public TipoTelefonos getTelefonos() {
        return telefonos;
    }

    /**
     * Sets the value of the telefonos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTelefonos }
     *     
     */
    public void setTelefonos(TipoTelefonos value) {
        this.telefonos = value;
    }

    /**
     * Gets the value of the parentesco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentesco() {
        return parentesco;
    }

    /**
     * Sets the value of the parentesco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentesco(String value) {
        this.parentesco = value;
    }

}
