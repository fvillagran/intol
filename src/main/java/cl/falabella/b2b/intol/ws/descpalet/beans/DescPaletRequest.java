
package cl.falabella.b2b.intol.ws.descpalet.beans;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for desc-palet-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="desc-palet-request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero-palet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero-expedicion" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "desc-palet-request", propOrder = {
    "numeroPalet",
    "numeroExpedicion"
})
@XmlRootElement(name = "desc-palet-request")
public class DescPaletRequest {

    @XmlElement(name = "numero-palet", required = true)
    protected String numeroPalet;
    @XmlElement(name = "numero-expedicion", required = true)
    protected BigInteger numeroExpedicion;

    /**
     * Gets the value of the numeroPalet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPalet() {
        return numeroPalet;
    }

    /**
     * Sets the value of the numeroPalet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPalet(String value) {
        this.numeroPalet = value;
    }

    /**
     * Gets the value of the numeroExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroExpedicion() {
        return numeroExpedicion;
    }

    /**
     * Sets the value of the numeroExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroExpedicion(BigInteger value) {
        this.numeroExpedicion = value;
    }

}
