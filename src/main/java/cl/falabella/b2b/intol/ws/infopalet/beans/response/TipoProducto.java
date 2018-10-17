
package cl.falabella.b2b.intol.ws.infopalet.beans.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipo-producto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipo-producto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="SBT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipo-producto")
@XmlEnum
public enum TipoProducto {

    MT,
    BT,
    SBT;

    public String value() {
        return name();
    }

    public static TipoProducto fromValue(String v) {
        return valueOf(v);
    }

}
