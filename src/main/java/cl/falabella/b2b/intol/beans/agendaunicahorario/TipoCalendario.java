
package cl.falabella.b2b.intol.beans.agendaunicahorario;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCalendario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCalendario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIA"/>
 *     &lt;enumeration value="SEMANA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoCalendario")
@XmlEnum
public enum TipoCalendario {

    DIA,
    SEMANA;

    public String value() {
        return name();
    }

    public static TipoCalendario fromValue(String v) {
        return valueOf(v);
    }

}
