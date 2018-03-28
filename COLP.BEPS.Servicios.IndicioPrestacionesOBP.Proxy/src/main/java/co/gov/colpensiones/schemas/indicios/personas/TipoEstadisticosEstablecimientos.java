
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEstadisticosEstablecimientos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoEstadisticosEstablecimientos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroEstablecimientosAgropecuarios" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosMineros" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosManufactureros" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosServiciosPublicos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosConstruccionObrasCiviles" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosComerciales" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosRestaurantesHoteles" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosTransporteAlmacenamiento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosComunicacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosFinancierosSegurosInmobiliarios" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroEstablecimientosServiciosComunalesPersonales" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEstadisticosEstablecimientos", propOrder = {
    "numeroEstablecimientosAgropecuarios",
    "numeroEstablecimientosMineros",
    "numeroEstablecimientosManufactureros",
    "numeroEstablecimientosServiciosPublicos",
    "numeroEstablecimientosConstruccionObrasCiviles",
    "numeroEstablecimientosComerciales",
    "numeroEstablecimientosRestaurantesHoteles",
    "numeroEstablecimientosTransporteAlmacenamiento",
    "numeroEstablecimientosComunicacion",
    "numeroEstablecimientosFinancierosSegurosInmobiliarios",
    "numeroEstablecimientosServiciosComunalesPersonales"
})
public class TipoEstadisticosEstablecimientos {

    protected long numeroEstablecimientosAgropecuarios;
    protected long numeroEstablecimientosMineros;
    protected long numeroEstablecimientosManufactureros;
    protected long numeroEstablecimientosServiciosPublicos;
    protected long numeroEstablecimientosConstruccionObrasCiviles;
    protected long numeroEstablecimientosComerciales;
    protected long numeroEstablecimientosRestaurantesHoteles;
    protected long numeroEstablecimientosTransporteAlmacenamiento;
    protected long numeroEstablecimientosComunicacion;
    protected long numeroEstablecimientosFinancierosSegurosInmobiliarios;
    protected long numeroEstablecimientosServiciosComunalesPersonales;

    /**
     * Gets the value of the numeroEstablecimientosAgropecuarios property.
     * 
     */
    public long getNumeroEstablecimientosAgropecuarios() {
        return numeroEstablecimientosAgropecuarios;
    }

    /**
     * Sets the value of the numeroEstablecimientosAgropecuarios property.
     * 
     */
    public void setNumeroEstablecimientosAgropecuarios(long value) {
        this.numeroEstablecimientosAgropecuarios = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosMineros property.
     * 
     */
    public long getNumeroEstablecimientosMineros() {
        return numeroEstablecimientosMineros;
    }

    /**
     * Sets the value of the numeroEstablecimientosMineros property.
     * 
     */
    public void setNumeroEstablecimientosMineros(long value) {
        this.numeroEstablecimientosMineros = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosManufactureros property.
     * 
     */
    public long getNumeroEstablecimientosManufactureros() {
        return numeroEstablecimientosManufactureros;
    }

    /**
     * Sets the value of the numeroEstablecimientosManufactureros property.
     * 
     */
    public void setNumeroEstablecimientosManufactureros(long value) {
        this.numeroEstablecimientosManufactureros = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosServiciosPublicos property.
     * 
     */
    public long getNumeroEstablecimientosServiciosPublicos() {
        return numeroEstablecimientosServiciosPublicos;
    }

    /**
     * Sets the value of the numeroEstablecimientosServiciosPublicos property.
     * 
     */
    public void setNumeroEstablecimientosServiciosPublicos(long value) {
        this.numeroEstablecimientosServiciosPublicos = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosConstruccionObrasCiviles property.
     * 
     */
    public long getNumeroEstablecimientosConstruccionObrasCiviles() {
        return numeroEstablecimientosConstruccionObrasCiviles;
    }

    /**
     * Sets the value of the numeroEstablecimientosConstruccionObrasCiviles property.
     * 
     */
    public void setNumeroEstablecimientosConstruccionObrasCiviles(long value) {
        this.numeroEstablecimientosConstruccionObrasCiviles = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosComerciales property.
     * 
     */
    public long getNumeroEstablecimientosComerciales() {
        return numeroEstablecimientosComerciales;
    }

    /**
     * Sets the value of the numeroEstablecimientosComerciales property.
     * 
     */
    public void setNumeroEstablecimientosComerciales(long value) {
        this.numeroEstablecimientosComerciales = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosRestaurantesHoteles property.
     * 
     */
    public long getNumeroEstablecimientosRestaurantesHoteles() {
        return numeroEstablecimientosRestaurantesHoteles;
    }

    /**
     * Sets the value of the numeroEstablecimientosRestaurantesHoteles property.
     * 
     */
    public void setNumeroEstablecimientosRestaurantesHoteles(long value) {
        this.numeroEstablecimientosRestaurantesHoteles = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosTransporteAlmacenamiento property.
     * 
     */
    public long getNumeroEstablecimientosTransporteAlmacenamiento() {
        return numeroEstablecimientosTransporteAlmacenamiento;
    }

    /**
     * Sets the value of the numeroEstablecimientosTransporteAlmacenamiento property.
     * 
     */
    public void setNumeroEstablecimientosTransporteAlmacenamiento(long value) {
        this.numeroEstablecimientosTransporteAlmacenamiento = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosComunicacion property.
     * 
     */
    public long getNumeroEstablecimientosComunicacion() {
        return numeroEstablecimientosComunicacion;
    }

    /**
     * Sets the value of the numeroEstablecimientosComunicacion property.
     * 
     */
    public void setNumeroEstablecimientosComunicacion(long value) {
        this.numeroEstablecimientosComunicacion = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosFinancierosSegurosInmobiliarios property.
     * 
     */
    public long getNumeroEstablecimientosFinancierosSegurosInmobiliarios() {
        return numeroEstablecimientosFinancierosSegurosInmobiliarios;
    }

    /**
     * Sets the value of the numeroEstablecimientosFinancierosSegurosInmobiliarios property.
     * 
     */
    public void setNumeroEstablecimientosFinancierosSegurosInmobiliarios(long value) {
        this.numeroEstablecimientosFinancierosSegurosInmobiliarios = value;
    }

    /**
     * Gets the value of the numeroEstablecimientosServiciosComunalesPersonales property.
     * 
     */
    public long getNumeroEstablecimientosServiciosComunalesPersonales() {
        return numeroEstablecimientosServiciosComunalesPersonales;
    }

    /**
     * Sets the value of the numeroEstablecimientosServiciosComunalesPersonales property.
     * 
     */
    public void setNumeroEstablecimientosServiciosComunalesPersonales(long value) {
        this.numeroEstablecimientosServiciosComunalesPersonales = value;
    }

}
