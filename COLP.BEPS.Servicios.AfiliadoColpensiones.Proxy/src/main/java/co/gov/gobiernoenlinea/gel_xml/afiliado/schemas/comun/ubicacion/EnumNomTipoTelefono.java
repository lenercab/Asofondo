
package co.gov.gobiernoenlinea.gel_xml.afiliado.schemas.comun.ubicacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumNomTipoTelefono.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumNomTipoTelefono">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESIDENCIA"/>
 *     &lt;enumeration value="OFICINA"/>
 *     &lt;enumeration value="MOVIL"/>
 *     &lt;enumeration value="FAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumNomTipoTelefono")
@XmlEnum
public enum EnumNomTipoTelefono {

    RESIDENCIA,
    OFICINA,
    MOVIL,
    FAX;

    public String value() {
        return name();
    }

    public static EnumNomTipoTelefono fromValue(String v) {
        return valueOf(v);
    }

}
