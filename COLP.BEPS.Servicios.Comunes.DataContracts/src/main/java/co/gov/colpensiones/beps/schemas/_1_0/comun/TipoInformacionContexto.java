
package co.gov.colpensiones.beps.schemas._1_0.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreEmptyValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;



/**
 * <b>Descripcion:</b> Estructura para el envio de los datos de contexto de la invocacion del servicio web <br/>
 * <b>Caso de Uso:</b> GOP-VIN-1-FAB-11-ModificarInformacionSensibleVinculado <br/>
 * 
 * @author Yenny Nustez <ynustez@heinsohn.com.co>
 */
/**
 * <p>Java class for tipoInformacionContexto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionContexto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sistemaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCorrelacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoProcesamiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioSistemaExterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idPeticion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionContexto", propOrder = {
    "sistemaOrigen",
    "idCorrelacion",
    "tipoProcesamiento",
    "usuarioSistemaExterno",
    "idPeticion"
})
@XmlRootElement
public class TipoInformacionContexto {

    /** Nombre que identifica el sistema externo que realiza la invocación */
    @XmlElement    
    protected String sistemaOrigen;
    
    /** Identificador del sistema externo para fines  de relacionar las acciones de los 2 sistemas */
    @XmlElement
    protected String idCorrelacion;
    
    /** Indica el tipo de procesamiento que va a ser utilizado para la generación de un proceso asincrono */
    @XmlElement
    protected String tipoProcesamiento;
    
    /** Nombre del usuario de la aplicación que consume el servicio */
    @XmlElement
    protected String usuarioSistemaExterno;
    
    /** Identificador que permite asociar un grupo de invocaciones de diferentes servicios web */
    @XmlElement
    protected String idPeticion;

    /**
     * Gets the value of the sistemaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @NotNullValidator
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Sets the value of the sistemaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaOrigen(String value) {
        this.sistemaOrigen = value;
    }

    /**
     * Gets the value of the idCorrelacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @IgnoreEmptyValidator   
    public String getIdCorrelacion() {
        return idCorrelacion;
    }

    /**
     * Sets the value of the idCorrelacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCorrelacion(String value) {
        this.idCorrelacion = value;
    }

    /**
     * Gets the value of the tipoProcesamiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @IgnoreEmptyValidator
    @RegexValidator(pattern ="^(A|S)?$", message = "{0} no es válido, debe ingresar alguna de las siguientes opciones: [A, S]")
    public String getTipoProcesamiento() {
        return tipoProcesamiento;
    }

    /**
     * Sets the value of the tipoProcesamiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProcesamiento(String value) {
        this.tipoProcesamiento = value;
    }

    /**
     * Gets the value of the usuarioSistemaExterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @NotNullValidator
    @StringLengthValidator(min = 5, max = 60, message = "{0} debe tener una longitud de 5 a 60 caracteres")
    public String getUsuarioSistemaExterno() {
        return usuarioSistemaExterno;
    }

    /**
     * Sets the value of the usuarioSistemaExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioSistemaExterno(String value) {
        this.usuarioSistemaExterno = value;
    }

    /**
     * Gets the value of the idPeticion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @IgnoreEmptyValidator
    @StringLengthValidator(min = 0, max = 20, message = "{0} debe tener una longitud de máximo 20 caracteres")
    public String getIdPeticion() {
        return idPeticion;
    }

    /**
     * Sets the value of the idPeticion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPeticion(String value) {
        this.idPeticion = value;
    }

}
