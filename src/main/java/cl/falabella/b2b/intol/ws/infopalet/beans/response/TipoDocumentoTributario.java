
package cl.falabella.b2b.intol.ws.infopalet.beans.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipo-documento-tributario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipo-documento-tributario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GUIA"/>
 *     &lt;enumeration value="BOLETA"/>
 *     &lt;enumeration value="FACTURA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipo-documento-tributario")
@XmlEnum
public enum TipoDocumentoTributario {

    GUIA,
    BOLETA,
    FACTURA;

    public String value() {
        return name();
    }

    public static TipoDocumentoTributario fromValue(String v) {
        return valueOf(v);
    }

}
