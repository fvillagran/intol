
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
 *         &lt;element name="WM_RETORNA_STATUSResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wmretornastatusResult"
})
@XmlRootElement(name = "WM_RETORNA_STATUSResponse")
public class WMRETORNASTATUSResponse {

    @XmlElement(name = "WM_RETORNA_STATUSResult")
    protected String wmretornastatusResult;

    /**
     * Gets the value of the wmretornastatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWMRETORNASTATUSResult() {
        return wmretornastatusResult;
    }

    /**
     * Sets the value of the wmretornastatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWMRETORNASTATUSResult(String value) {
        this.wmretornastatusResult = value;
    }

}
