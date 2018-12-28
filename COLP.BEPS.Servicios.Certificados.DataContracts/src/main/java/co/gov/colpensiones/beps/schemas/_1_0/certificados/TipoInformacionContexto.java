
package co.gov.colpensiones.beps.schemas._1_0.certificados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;


/**
 * <b>Descripción:</b> Clase que representa la estructura de la información de contexto para el servicio.<br/>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionContexto", propOrder = {
    "sistemaOrigen",
    "idCorrelacion",
    "usuarioSistemaExterno"
})
public class TipoInformacionContexto {

    /** Atributo para mantener el Nombre que identifica el sistema externo que realiza la invocación..*/
    @XmlElement(required = true)
    protected String sistemaOrigen;
    /** Atributo para mantener el Identificador del sistema externo para fines  de relacionar las acciones de los 2 sistemas.*/
    @XmlElement(required = true, nillable = true)
    protected String idCorrelacion;
    /** Atributo para mantener el nombre del usuario de la aplicación que consume el servicio.*/
    @XmlElement(required = true, nillable = true)
    protected String usuarioSistemaExterno;

    /**
     * Devuelve el valor de SistemaOrigen.
     *
     * @return El valor de SistemaOrigen
     */
    @StringLengthValidator(min = 1, max = 50, message = "{0} debe tener una longitud de 1 a 50 caracteres")
    @RegexValidator(pattern ="[A-Z1-9]*", message = "{0} no es válido, solo se permiten numeros y letras mayusculas")
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Establece el valor de SistemaOrigen.
     *
     * @param value El valor por establecer para SistemaOrigen
     */
    public void setSistemaOrigen(String value) {
        this.sistemaOrigen = value;
    }

    /**
     * Devuelve el valor de IdCorrelacion.
     *
     * @return El valor de IdCorrelacion
     */
    public String getIdCorrelacion() {
        return idCorrelacion;
    }

    /**
     * Establece el valor de IdCorrelacion.
     *
     * @param value El valor por establecer para IdCorrelacion
     */
    public void setIdCorrelacion(String value) {
        this.idCorrelacion = value;
    }

    /**
     * Devuelve el valor de UsuarioSistemaExterno.
     *
     * @return El valor de UsuarioSistemaExterno
     */
    public String getUsuarioSistemaExterno() {
        return usuarioSistemaExterno;
    }

    /**
     * Establece el valor de UsuarioSistemaExterno.
     *
     * @param value El valor por establecer para UsuarioSistemaExterno
     */
    public void setUsuarioSistemaExterno(String value) {
        this.usuarioSistemaExterno = value;
    }
}