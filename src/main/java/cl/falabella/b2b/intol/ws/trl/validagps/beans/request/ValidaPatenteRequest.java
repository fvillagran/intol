
package cl.falabella.b2b.intol.ws.trl.validagps.beans.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id-cliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "patente",
    "idCliente"
})
@XmlRootElement(name = "valida-patente-request")
public class ValidaPatenteRequest {

    protected String patente;
    @XmlElement(name = "id-cliente")
    protected int idCliente;

    /**
     * Gets the value of the patente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Sets the value of the patente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatente(String value) {
        this.patente = value;
    }

    /**
     * Gets the value of the idCliente property.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

}
