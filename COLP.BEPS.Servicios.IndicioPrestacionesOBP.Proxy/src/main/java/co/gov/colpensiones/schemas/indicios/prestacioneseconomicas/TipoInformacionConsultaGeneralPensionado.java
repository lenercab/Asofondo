
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionConsultaGeneralPensionado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaGeneralPensionado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pensionado" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionGeneralPensionado" minOccurs="0"/>
 *         &lt;element name="pensiones" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoPensiones" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaGeneralPensionado", propOrder = {
    "pensionado",
    "pensiones"
})
public class TipoInformacionConsultaGeneralPensionado {

    protected TipoInformacionGeneralPensionado pensionado;
    protected TipoPensiones pensiones;

    /**
     * Gets the value of the pensionado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPensionado }
     *     
     */
    public TipoInformacionGeneralPensionado getPensionado() {
        return pensionado;
    }

    /**
     * Sets the value of the pensionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPensionado }
     *     
     */
    public void setPensionado(TipoInformacionGeneralPensionado value) {
        this.pensionado = value;
    }

    /**
     * Gets the value of the pensiones property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPensiones }
     *     
     */
    public TipoPensiones getPensiones() {
        return pensiones;
    }

    /**
     * Sets the value of the pensiones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPensiones }
     *     
     */
    public void setPensiones(TipoPensiones value) {
        this.pensiones = value;
    }

}
