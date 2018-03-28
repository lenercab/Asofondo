
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaNatural;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionComplementariaPersonaNatural;


/**
 * <p>Java class for tipoInformacionCausanteReconocimiento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionCausanteReconocimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural" minOccurs="0"/>
 *         &lt;element name="informacionComplementaria" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionComplementariaPersonaNatural" minOccurs="0"/>
 *         &lt;element name="fechaMuerteInvalidez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorTransicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regimenTransicion" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionRegimenTransicion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCausanteReconocimiento", propOrder = {
    "informacionBasica",
    "informacionComplementaria",
    "fechaMuerteInvalidez",
    "indicadorTransicion",
    "regimenTransicion"
})
public class TipoInformacionCausanteReconocimiento {

    protected TipoInformacionBasicaPersonaNatural informacionBasica;
    protected TipoInformacionComplementariaPersonaNatural informacionComplementaria;
    protected String fechaMuerteInvalidez;
    @XmlElement(required = true, nillable = true)
    protected String indicadorTransicion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionRegimenTransicion regimenTransicion;

    /**
     * Gets the value of the informacionBasica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getInformacionBasica() {
        return informacionBasica;
    }

    /**
     * Sets the value of the informacionBasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setInformacionBasica(TipoInformacionBasicaPersonaNatural value) {
        this.informacionBasica = value;
    }

    /**
     * Gets the value of the informacionComplementaria property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionComplementariaPersonaNatural }
     *     
     */
    public TipoInformacionComplementariaPersonaNatural getInformacionComplementaria() {
        return informacionComplementaria;
    }

    /**
     * Sets the value of the informacionComplementaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionComplementariaPersonaNatural }
     *     
     */
    public void setInformacionComplementaria(TipoInformacionComplementariaPersonaNatural value) {
        this.informacionComplementaria = value;
    }

    /**
     * Gets the value of the fechaMuerteInvalidez property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaMuerteInvalidez() {
        return fechaMuerteInvalidez;
    }

    /**
     * Sets the value of the fechaMuerteInvalidez property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaMuerteInvalidez(String value) {
        this.fechaMuerteInvalidez = value;
    }

    /**
     * Gets the value of the indicadorTransicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorTransicion() {
        return indicadorTransicion;
    }

    /**
     * Sets the value of the indicadorTransicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorTransicion(String value) {
        this.indicadorTransicion = value;
    }

    /**
     * Gets the value of the regimenTransicion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionRegimenTransicion }
     *     
     */
    public TipoInformacionRegimenTransicion getRegimenTransicion() {
        return regimenTransicion;
    }

    /**
     * Sets the value of the regimenTransicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionRegimenTransicion }
     *     
     */
    public void setRegimenTransicion(TipoInformacionRegimenTransicion value) {
        this.regimenTransicion = value;
    }

}
