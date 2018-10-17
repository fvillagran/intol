
package cl.falabella.b2b.intol.ws.infopalet.beans.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for info-palet-response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="info-palet-response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="info-palet" type="{http://b2b.falabella.com/schemas/ol/info-palet-response}info-palet"/>
 *           &lt;element name="error" type="{http://b2b.falabella.com/schemas/ol/info-palet-response}message"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "info-palet-response", propOrder = {
    "infoPalet",
    "error"
})
@XmlRootElement(name = "info-palet-response")
public class InfoPaletResponse {

    @XmlElement(name = "info-palet")
    protected InfoPalet infoPalet;
    protected Message error;

    /**
     * Gets the value of the infoPalet property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPalet }
     *     
     */
    public InfoPalet getInfoPalet() {
        return infoPalet;
    }

    /**
     * Sets the value of the infoPalet property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPalet }
     *     
     */
    public void setInfoPalet(InfoPalet value) {
        this.infoPalet = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setError(Message value) {
        this.error = value;
    }

}
