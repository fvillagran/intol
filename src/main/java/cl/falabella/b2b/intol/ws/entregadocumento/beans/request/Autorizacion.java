
package cl.falabella.b2b.intol.ws.entregadocumento.beans.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for autorizacion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="autorizacion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CON_AUTORIZACION"/>
 *     &lt;enumeration value="FUERA_LINEA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "autorizacion")
@XmlEnum
public enum Autorizacion {

    CON_AUTORIZACION,
    FUERA_LINEA;

    public String value() {
        return name();
    }

    public static Autorizacion fromValue(String v) {
        return valueOf(v);
    }

}
