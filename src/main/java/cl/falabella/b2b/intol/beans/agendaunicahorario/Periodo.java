
package cl.falabella.b2b.intol.beans.agendaunicahorario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Periodo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Periodo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoraDesde" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraHasta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Muelles" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_horario}Muelles"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Periodo", propOrder = {
    "num",
    "horaDesde",
    "horaHasta",
    "muelles"
})
public class Periodo {

    @XmlElement(name = "Num")
    protected int num;
    @XmlElement(name = "HoraDesde", required = true)
    protected String horaDesde;
    @XmlElement(name = "HoraHasta", required = true)
    protected String horaHasta;
    @XmlElement(name = "Muelles", required = true)
    protected Muelles muelles;

    /**
     * Gets the value of the num property.
     * 
     */
    public int getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     */
    public void setNum(int value) {
        this.num = value;
    }

    /**
     * Gets the value of the horaDesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraDesde() {
        return horaDesde;
    }

    /**
     * Sets the value of the horaDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraDesde(String value) {
        this.horaDesde = value;
    }

    /**
     * Gets the value of the horaHasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraHasta() {
        return horaHasta;
    }

    /**
     * Sets the value of the horaHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraHasta(String value) {
        this.horaHasta = value;
    }

    /**
     * Gets the value of the muelles property.
     * 
     * @return
     *     possible object is
     *     {@link Muelles }
     *     
     */
    public Muelles getMuelles() {
        return muelles;
    }

    /**
     * Sets the value of the muelles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Muelles }
     *     
     */
    public void setMuelles(Muelles value) {
        this.muelles = value;
    }

}
