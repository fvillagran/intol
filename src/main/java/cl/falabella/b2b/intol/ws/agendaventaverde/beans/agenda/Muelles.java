
package cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Muelles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Muelles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Muelle" type="{http://b2b.falabella.com/schemas/ol/ventaverde-agenda}Muelle" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Muelles", propOrder = {
    "muelle"
})
public class Muelles {

    @XmlElement(name = "Muelle", required = true)
    protected List<Muelle> muelle;

    /**
     * Gets the value of the muelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the muelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMuelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Muelle }
     * 
     * 
     */
    public List<Muelle> getMuelle() {
        if (muelle == null) {
            muelle = new ArrayList<Muelle>();
        }
        return this.muelle;
    }

}
