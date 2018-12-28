
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoCiudad;
import co.gov.colpensiones.schemas.indicios.personas.TipoDepartamento;


/**
 * <p>Java class for tipoInformacionFormato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionFormato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consecutivoFormato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaExpedicionCertificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudadExpedicionFormato" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCiudad" minOccurs="0"/>
 *         &lt;element name="departamentoExpedicionFormato" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDepartamento" minOccurs="0"/>
 *         &lt;element name="cantidadHojas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroActoAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="funcionarioCertificador" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionFuncionarioCertificador"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionFormato", propOrder = {
    "tipo",
    "numero",
    "consecutivoFormato",
    "fechaExpedicionCertificado",
    "ciudadExpedicionFormato",
    "departamentoExpedicionFormato",
    "cantidadHojas",
    "numeroActoAdministrativo",
    "funcionarioCertificador"
})
public class TipoInformacionFormato {

    @XmlElement(required = true, nillable = true)
    protected String tipo;
    @XmlElement(required = true, nillable = true)
    protected String numero;
    @XmlElement(required = true, nillable = true)
    protected String consecutivoFormato;
    @XmlElement(required = true, nillable = true)
    protected String fechaExpedicionCertificado;
    protected TipoCiudad ciudadExpedicionFormato;
    protected TipoDepartamento departamentoExpedicionFormato;
    protected Integer cantidadHojas;
    protected String numeroActoAdministrativo;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionFuncionarioCertificador funcionarioCertificador;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the consecutivoFormato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoFormato() {
        return consecutivoFormato;
    }

    /**
     * Sets the value of the consecutivoFormato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoFormato(String value) {
        this.consecutivoFormato = value;
    }

    /**
     * Gets the value of the fechaExpedicionCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionCertificado() {
        return fechaExpedicionCertificado;
    }

    /**
     * Sets the value of the fechaExpedicionCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionCertificado(String value) {
        this.fechaExpedicionCertificado = value;
    }

    /**
     * Gets the value of the ciudadExpedicionFormato property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCiudad }
     *     
     */
    public TipoCiudad getCiudadExpedicionFormato() {
        return ciudadExpedicionFormato;
    }

    /**
     * Sets the value of the ciudadExpedicionFormato property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCiudad }
     *     
     */
    public void setCiudadExpedicionFormato(TipoCiudad value) {
        this.ciudadExpedicionFormato = value;
    }

    /**
     * Gets the value of the departamentoExpedicionFormato property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamento }
     *     
     */
    public TipoDepartamento getDepartamentoExpedicionFormato() {
        return departamentoExpedicionFormato;
    }

    /**
     * Sets the value of the departamentoExpedicionFormato property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamento }
     *     
     */
    public void setDepartamentoExpedicionFormato(TipoDepartamento value) {
        this.departamentoExpedicionFormato = value;
    }

    /**
     * Gets the value of the cantidadHojas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadHojas() {
        return cantidadHojas;
    }

    /**
     * Sets the value of the cantidadHojas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadHojas(Integer value) {
        this.cantidadHojas = value;
    }

    /**
     * Gets the value of the numeroActoAdministrativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroActoAdministrativo() {
        return numeroActoAdministrativo;
    }

    /**
     * Sets the value of the numeroActoAdministrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroActoAdministrativo(String value) {
        this.numeroActoAdministrativo = value;
    }

    /**
     * Gets the value of the funcionarioCertificador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionFuncionarioCertificador }
     *     
     */
    public TipoInformacionFuncionarioCertificador getFuncionarioCertificador() {
        return funcionarioCertificador;
    }

    /**
     * Sets the value of the funcionarioCertificador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionFuncionarioCertificador }
     *     
     */
    public void setFuncionarioCertificador(TipoInformacionFuncionarioCertificador value) {
        this.funcionarioCertificador = value;
    }

}
