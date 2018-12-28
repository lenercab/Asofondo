package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreNullsValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RangeValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;

/**
 * <p>
 * Java class for tipoDestinacionRecursos complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDestinacionRecursos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="porcentaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDestinacionRecursos", propOrder = { "codigoTipo", "porcentaje" })
public class TipoDestinacionRecursos {

    @XmlElement(required = true, nillable = true)
    protected String codigoTipo;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer porcentaje;

    /**
     * Gets the value of the codigoTipo property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @IgnoreNullsValidator
    @StringLengthValidator(min = 2, max = 2, message = "{0} debe tener una longitud de 2 caracteres.")
    public String getCodigoTipo() {
        return codigoTipo;
    }

    /**
     * Sets the value of the codigoTipo property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCodigoTipo(String value) {
        this.codigoTipo = value;
    }

    /**
     * Gets the value of the porcentaje property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    @NotNullValidator
    @RangeValidator(min = 1 , max = 100, message = "{0} debe debe ser mayor a 0 y menor o igual a 100.")
    public Integer getPorcentaje() {
        return porcentaje;
    }

    /**
     * Sets the value of the porcentaje property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setPorcentaje(Integer value) {
        this.porcentaje = value;
    }

}
