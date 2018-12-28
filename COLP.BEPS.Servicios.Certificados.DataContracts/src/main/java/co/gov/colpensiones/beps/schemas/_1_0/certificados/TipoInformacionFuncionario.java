
package co.gov.colpensiones.beps.schemas._1_0.certificados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;


/**
 * <b>Descripción:</b> Clase que representa la estructura de la información del funcionario.<br/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionFuncionario", propOrder = {
    "nombreFuncionario",
    "cargoFuncionario"
})
public class TipoInformacionFuncionario {

    /** Atributo para mantener el Nombre completo del responsable de firmar la certificación.*/
    @XmlElement(required = true, nillable = true)
    protected String nombreFuncionario;
    /** Atributo para mantener el Cargo del responsable  de firmar la certificación.*/
    @XmlElement(required = true, nillable = true)
    protected String cargoFuncionario;

    /**
     * Devuelve el valor de NombreFuncionario.
     *
     * @return El valor de NombreFuncionario
     */
    @NotNullValidator
    @StringLengthValidator(min = 5, max = 120, message = "{0} debe tener una longitud de 5 a 120 caracteres")
    public String getNombreFuncionario() {
        return nombreFuncionario;
    }

    /**
     * Establece el valor de NombreFuncionario.
     *
     * @param value El valor por establecer para NombreFuncionario
     */
    public void setNombreFuncionario(String value) {
        this.nombreFuncionario = value;
    }

    /**
     * Devuelve el valor de CargoFuncionario.
     *
     * @return El valor de CargoFuncionario
     */
    @NotNullValidator
    @StringLengthValidator(min = 2, max = 100, message = "{0} debe tener una longitud de 2 a 100 caracteres")
    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    /**
     * Establece el valor de CargoFuncionario.
     *
     * @param value El valor por establecer para CargoFuncionario
     */
    public void setCargoFuncionario(String value) {
        this.cargoFuncionario = value;
    }
}