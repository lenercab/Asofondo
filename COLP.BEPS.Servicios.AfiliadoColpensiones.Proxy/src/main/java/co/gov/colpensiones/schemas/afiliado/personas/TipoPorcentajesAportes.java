
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPorcentajesAportes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPorcentajesAportes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalAporteNacional" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nacionalPrivadoLaboral" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nacionalPublico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalAporteExtranjero" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="extranjeroPrivado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="extranjeroPublico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPorcentajesAportes", propOrder = {
    "totalAporteNacional",
    "nacionalPrivadoLaboral",
    "nacionalPublico",
    "totalAporteExtranjero",
    "extranjeroPrivado",
    "extranjeroPublico"
})
public class TipoPorcentajesAportes {

    protected long totalAporteNacional;
    protected long nacionalPrivadoLaboral;
    protected long nacionalPublico;
    protected long totalAporteExtranjero;
    protected long extranjeroPrivado;
    protected long extranjeroPublico;

    /**
     * Gets the value of the totalAporteNacional property.
     * 
     */
    public long getTotalAporteNacional() {
        return totalAporteNacional;
    }

    /**
     * Sets the value of the totalAporteNacional property.
     * 
     */
    public void setTotalAporteNacional(long value) {
        this.totalAporteNacional = value;
    }

    /**
     * Gets the value of the nacionalPrivadoLaboral property.
     * 
     */
    public long getNacionalPrivadoLaboral() {
        return nacionalPrivadoLaboral;
    }

    /**
     * Sets the value of the nacionalPrivadoLaboral property.
     * 
     */
    public void setNacionalPrivadoLaboral(long value) {
        this.nacionalPrivadoLaboral = value;
    }

    /**
     * Gets the value of the nacionalPublico property.
     * 
     */
    public long getNacionalPublico() {
        return nacionalPublico;
    }

    /**
     * Sets the value of the nacionalPublico property.
     * 
     */
    public void setNacionalPublico(long value) {
        this.nacionalPublico = value;
    }

    /**
     * Gets the value of the totalAporteExtranjero property.
     * 
     */
    public long getTotalAporteExtranjero() {
        return totalAporteExtranjero;
    }

    /**
     * Sets the value of the totalAporteExtranjero property.
     * 
     */
    public void setTotalAporteExtranjero(long value) {
        this.totalAporteExtranjero = value;
    }

    /**
     * Gets the value of the extranjeroPrivado property.
     * 
     */
    public long getExtranjeroPrivado() {
        return extranjeroPrivado;
    }

    /**
     * Sets the value of the extranjeroPrivado property.
     * 
     */
    public void setExtranjeroPrivado(long value) {
        this.extranjeroPrivado = value;
    }

    /**
     * Gets the value of the extranjeroPublico property.
     * 
     */
    public long getExtranjeroPublico() {
        return extranjeroPublico;
    }

    /**
     * Sets the value of the extranjeroPublico property.
     * 
     */
    public void setExtranjeroPublico(long value) {
        this.extranjeroPublico = value;
    }

}
