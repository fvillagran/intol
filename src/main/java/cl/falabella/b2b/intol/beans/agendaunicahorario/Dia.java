
package cl.falabella.b2b.intol.beans.agendaunicahorario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaEntrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Periodos" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_horario}Periodos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dia", propOrder = {
    "fechaEntrega",
    "periodos"
})
public class Dia {

    @XmlElement(name = "FechaEntrega", required = true)
    protected String fechaEntrega;
    @XmlElement(name = "Periodos")
    protected Periodos periodos;

    /**
     * Gets the value of the fechaEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Sets the value of the fechaEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEntrega(String value) {
        this.fechaEntrega = value;
    }

    /**
     * Gets the value of the periodos property.
     * 
     * @return
     *     possible object is
     *     {@link Periodos }
     *     
     */
    public Periodos getPeriodos() {
        return periodos;
    }

    /**
     * Sets the value of the periodos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodos }
     *     
     */
    public void setPeriodos(Periodos value) {
        this.periodos = value;
    }

}
