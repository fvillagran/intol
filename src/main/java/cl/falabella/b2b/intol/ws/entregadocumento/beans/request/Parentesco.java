
package cl.falabella.b2b.intol.ws.entregadocumento.beans.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parentesco.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="parentesco">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONYUGE"/>
 *     &lt;enumeration value="TRABAJADOR"/>
 *     &lt;enumeration value="CONSERJE"/>
 *     &lt;enumeration value="HIJO"/>
 *     &lt;enumeration value="PADRE"/>
 *     &lt;enumeration value="SUEGRO"/>
 *     &lt;enumeration value="TIO"/>
 *     &lt;enumeration value="SOBRINO"/>
 *     &lt;enumeration value="AMIGO"/>
 *     &lt;enumeration value="VECINO"/>
 *     &lt;enumeration value="CLIENTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "parentesco")
@XmlEnum
public enum Parentesco {

    CONYUGE,
    TRABAJADOR,
    CONSERJE,
    HIJO,
    PADRE,
    SUEGRO,
    TIO,
    SOBRINO,
    AMIGO,
    VECINO,
    CLIENTE;

    public String value() {
        return name();
    }

    public static Parentesco fromValue(String v) {
        return valueOf(v);
    }

}
