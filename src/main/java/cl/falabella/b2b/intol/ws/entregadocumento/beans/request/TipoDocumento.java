
package cl.falabella.b2b.intol.ws.entregadocumento.beans.request;

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
 *     &lt;enumeration value="F12"/>
 *     &lt;enumeration value="SOR"/>
 *     &lt;enumeration value="RET"/>
 *     &lt;enumeration value="ENV"/>
 *     &lt;enumeration value="ENTD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipo-documento")
@XmlEnum
public enum TipoDocumento {

    @XmlEnumValue("F12")
    F_12("F12"),
    @XmlEnumValue("SOR")
    SOR("SOR"),
    @XmlEnumValue("RET")
    RET("RET"),
    @XmlEnumValue("ENV")
    ENV("ENV"),
    @XmlEnumValue("ENTD")
    ENTD("ENTD");
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
