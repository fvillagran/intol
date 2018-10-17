
package cl.falabella.b2b.intol.ws.trl.validagps.cliente;

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
 *         &lt;element name="PATENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CLIENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idcliente"
})
@XmlRootElement(name = "WM_RETORNA_STATUS")
public class WMRETORNASTATUS {

    @XmlElement(name = "PATENTE")
    protected String patente;
    @XmlElement(name = "ID_CLIENTE")
    protected int idcliente;

    /**
     * Gets the value of the patente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATENTE() {
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
    public void setPATENTE(String value) {
        this.patente = value;
    }

    /**
     * Gets the value of the idcliente property.
     * 
     */
    public int getIDCLIENTE() {
        return idcliente;
    }

    /**
     * Sets the value of the idcliente property.
     * 
     */
    public void setIDCLIENTE(int value) {
        this.idcliente = value;
    }

}
