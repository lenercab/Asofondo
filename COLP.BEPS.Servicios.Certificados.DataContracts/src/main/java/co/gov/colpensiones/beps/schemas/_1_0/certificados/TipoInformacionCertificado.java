
package co.gov.colpensiones.beps.schemas._1_0.certificados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;


/**
 * <b>Descripción:</b> Clase que representa la estructura de la información de generación de un certificado.<br/>
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCertificado", propOrder = {
    "documento",
    "informacionDestinatario",
    "informacionOrigen",
    "informacionFuncionario"
})
public class TipoInformacionCertificado{

    /** Atributo para mantener la información de identificación del vinculado.*/
    @XmlElement(required = true)
    protected TipoDocumentoPersonaNatural documento;
    /** Atributo para mantener la información de destinatario para el certificado.*/
    @XmlElement(required = true)
    protected TipoInformacionDestinatario informacionDestinatario;
    /** Atributo para mantener la información del sistema origen que solicita el certificado.*/
    @XmlElement(required = true)
    protected TipoInformacionOrigen informacionOrigen;
    /** Atributo para mantener la información del funcionario que realiza la solicitud del certificado.*/
    @XmlElement(required = true)
    protected TipoInformacionFuncionario informacionFuncionario;

    /**
     * Devuelve el valor de Documento.
     *
     * @return El valor de Documento
     */
    public TipoDocumentoPersonaNatural getDocumento() {
        return documento;
    }

    /**
     * Establece el valor de Documento.
     *
     * @param value El valor por establecer para Documento
     */
    public void setDocumento(TipoDocumentoPersonaNatural value) {
        this.documento = value;
    }

    /**
     * Devuelve el valor de InformacionDestinatario.
     *
     * @return El valor de InformacionDestinatario
     */
    public TipoInformacionDestinatario getInformacionDestinatario() {
        return informacionDestinatario;
    }

    /**
     * Establece el valor de InformacionDestinatario.
     *
     * @param value El valor por establecer para InformacionDestinatario
     */
    public void setInformacionDestinatario(TipoInformacionDestinatario value) {
        this.informacionDestinatario = value;
    }

    public TipoInformacionOrigen getInformacionOrigen() {
		return informacionOrigen;
	}
    
    public void setInformacionOrigen(TipoInformacionOrigen informacionOrigen) {
		this.informacionOrigen = informacionOrigen;
	}
    
    /**
     * Devuelve el valor de InformacionFuncionario.
     *
     * @return El valor de InformacionFuncionario
     */
    public TipoInformacionFuncionario getInformacionFuncionario() {
        return informacionFuncionario;
    }

    /**
     * Establece el valor de InformacionFuncionario.
     *
     * @param value El valor por establecer para InformacionFuncionario
     */
    public void setInformacionFuncionario(TipoInformacionFuncionario value) {
        this.informacionFuncionario = value;
    }
}