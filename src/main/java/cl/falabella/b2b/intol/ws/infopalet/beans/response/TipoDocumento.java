
package cl.falabella.b2b.intol.ws.infopalet.beans.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipo-documento.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipo-documento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F11"/>
 *     &lt;enumeration value="F12"/>
 *	   &lt;enumeration value="F21"/>
 *	   &lt;enumeration value="F22"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tipo-documento")
@XmlEnum
public enum TipoDocumento {

    @XmlEnumValue("F11")
    F_11("F11"),
    @XmlEnumValue("F12")
    F_12("F12"),
    @XmlEnumValue("F21")
	F_21("F21"),
	@XmlEnumValue("F22")
    F_22("F22");
    private final String value;

    TipoDocumento(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDocumento fromValue(String v) {
        for (TipoDocumento c: TipoDocumento.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
