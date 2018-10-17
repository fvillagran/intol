
package cl.falabella.b2b.intol.beans.agendaunicahorario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Diario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dia" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_horario}Dia" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diario", propOrder = {
    "dia"
})
public class Diario {

    @XmlElement(name = "Dia", required = true)
    protected List<Dia> dia;

    /**
     * Gets the value of the dia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dia }
     * 
     * 
     */
    public List<Dia> getDia() {
        if (dia == null) {
            dia = new ArrayList<Dia>();
        }
        return this.dia;
    }

}
