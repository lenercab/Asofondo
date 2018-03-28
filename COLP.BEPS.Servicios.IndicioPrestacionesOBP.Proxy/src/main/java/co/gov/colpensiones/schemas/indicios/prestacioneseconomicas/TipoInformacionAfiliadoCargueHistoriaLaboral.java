
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionAfiliadoCargueHistoriaLaboral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionAfiliadoCargueHistoriaLaboral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consecutivoTipo1" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoConsecutivo"/>
 *         &lt;element name="tipoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionActualAfiliado" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionDatosActualesAfiliado" minOccurs="0"/>
 *         &lt;element name="informacionApoderado" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionApoderadoAutorizado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionAfiliadoCargueHistoriaLaboral", propOrder = {
    "consecutivoTipo1",
    "tipoSolicitante",
    "informacionActualAfiliado",
    "informacionApoderado"
})
public class TipoInformacionAfiliadoCargueHistoriaLaboral {

    @XmlElement(required = true, nillable = true)
    protected TipoConsecutivo consecutivoTipo1;
    @XmlElement(required = true, nillable = true)
    protected String tipoSolicitante;
    protected TipoInformacionDatosActualesAfiliado informacionActualAfiliado;
    protected TipoInformacionApoderadoAutorizado informacionApoderado;

    /**
     * Gets the value of the consecutivoTipo1 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConsecutivo }
     *     
     */
    public TipoConsecutivo getConsecutivoTipo1() {
        return consecutivoTipo1;
    }

    /**
     * Sets the value of the consecutivoTipo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConsecutivo }
     *     
     */
    public void setConsecutivoTipo1(TipoConsecutivo value) {
        this.consecutivoTipo1 = value;
    }

    /**
     * Gets the value of the tipoSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSolicitante() {
        return tipoSolicitante;
    }

    /**
     * Sets the value of the tipoSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSolicitante(String value) {
        this.tipoSolicitante = value;
    }

    /**
     * Gets the value of the informacionActualAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionDatosActualesAfiliado }
     *     
     */
    public TipoInformacionDatosActualesAfiliado getInformacionActualAfiliado() {
        return informacionActualAfiliado;
    }

    /**
     * Sets the value of the informacionActualAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionDatosActualesAfiliado }
     *     
     */
    public void setInformacionActualAfiliado(TipoInformacionDatosActualesAfiliado value) {
        this.informacionActualAfiliado = value;
    }

    /**
     * Gets the value of the informacionApoderado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionApoderadoAutorizado }
     *     
     */
    public TipoInformacionApoderadoAutorizado getInformacionApoderado() {
        return informacionApoderado;
    }

    /**
     * Sets the value of the informacionApoderado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionApoderadoAutorizado }
     *     
     */
    public void setInformacionApoderado(TipoInformacionApoderadoAutorizado value) {
        this.informacionApoderado = value;
    }

}
