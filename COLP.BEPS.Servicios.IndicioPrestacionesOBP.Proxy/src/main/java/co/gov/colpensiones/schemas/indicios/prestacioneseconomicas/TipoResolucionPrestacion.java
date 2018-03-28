
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoResolucionPrestacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoResolucionPrestacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroResolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaReconocimientoPrestacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoResolucionPrestacion", propOrder = {
    "numeroResolucion",
    "fechaReconocimientoPrestacion"
})
public class TipoResolucionPrestacion {

    protected String numeroResolucion;
    protected String fechaReconocimientoPrestacion;

    /**
     * Gets the value of the numeroResolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroResolucion() {
        return numeroResolucion;
    }

    /**
     * Sets the value of the numeroResolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroResolucion(String value) {
        this.numeroResolucion = value;
    }

    /**
     * Gets the value of the fechaReconocimientoPrestacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaReconocimientoPrestacion() {
        return fechaReconocimientoPrestacion;
    }

    /**
     * Sets the value of the fechaReconocimientoPrestacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaReconocimientoPrestacion(String value) {
        this.fechaReconocimientoPrestacion = value;
    }

}
