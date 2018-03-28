
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEntidadOrganizacional;


/**
 * <p>Java class for tipoInformacionGeneralCargueReconocimiento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralCargueReconocimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionBasicaCargueReconocimiento"/>
 *         &lt;element name="informacionCausante" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionCausanteCargue"/>
 *         &lt;element name="informacionApoderado" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionApoderado" minOccurs="0"/>
 *         &lt;element name="informacionSolicitanteTercero" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionSolicitanteTercero" minOccurs="0"/>
 *         &lt;element name="entidadPrestadoraSalud" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEntidadOrganizacional" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralCargueReconocimiento", propOrder = {
    "informacionBasica",
    "informacionCausante",
    "informacionApoderado",
    "informacionSolicitanteTercero",
    "entidadPrestadoraSalud"
})
public class TipoInformacionGeneralCargueReconocimiento {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaCargueReconocimiento informacionBasica;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionCausanteCargue informacionCausante;
    protected TipoInformacionApoderado informacionApoderado;
    protected TipoInformacionSolicitanteTercero informacionSolicitanteTercero;
    protected TipoEntidadOrganizacional entidadPrestadoraSalud;

    /**
     * Gets the value of the informacionBasica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaCargueReconocimiento }
     *     
     */
    public TipoInformacionBasicaCargueReconocimiento getInformacionBasica() {
        return informacionBasica;
    }

    /**
     * Sets the value of the informacionBasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaCargueReconocimiento }
     *     
     */
    public void setInformacionBasica(TipoInformacionBasicaCargueReconocimiento value) {
        this.informacionBasica = value;
    }

    /**
     * Gets the value of the informacionCausante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionCausanteCargue }
     *     
     */
    public TipoInformacionCausanteCargue getInformacionCausante() {
        return informacionCausante;
    }

    /**
     * Sets the value of the informacionCausante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionCausanteCargue }
     *     
     */
    public void setInformacionCausante(TipoInformacionCausanteCargue value) {
        this.informacionCausante = value;
    }

    /**
     * Gets the value of the informacionApoderado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionApoderado }
     *     
     */
    public TipoInformacionApoderado getInformacionApoderado() {
        return informacionApoderado;
    }

    /**
     * Sets the value of the informacionApoderado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionApoderado }
     *     
     */
    public void setInformacionApoderado(TipoInformacionApoderado value) {
        this.informacionApoderado = value;
    }

    /**
     * Gets the value of the informacionSolicitanteTercero property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionSolicitanteTercero }
     *     
     */
    public TipoInformacionSolicitanteTercero getInformacionSolicitanteTercero() {
        return informacionSolicitanteTercero;
    }

    /**
     * Sets the value of the informacionSolicitanteTercero property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionSolicitanteTercero }
     *     
     */
    public void setInformacionSolicitanteTercero(TipoInformacionSolicitanteTercero value) {
        this.informacionSolicitanteTercero = value;
    }

    /**
     * Gets the value of the entidadPrestadoraSalud property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntidadOrganizacional }
     *     
     */
    public TipoEntidadOrganizacional getEntidadPrestadoraSalud() {
        return entidadPrestadoraSalud;
    }

    /**
     * Sets the value of the entidadPrestadoraSalud property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntidadOrganizacional }
     *     
     */
    public void setEntidadPrestadoraSalud(TipoEntidadOrganizacional value) {
        this.entidadPrestadoraSalud = value;
    }

}
