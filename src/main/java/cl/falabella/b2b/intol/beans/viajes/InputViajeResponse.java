
package cl.falabella.b2b.intol.beans.viajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="inputViajeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "inputViajeResult"
})
@XmlRootElement(name = "inputViajeResponse")
public class InputViajeResponse {

    protected int inputViajeResult;

    /**
     * Gets the value of the inputViajeResult property.
     * 
     */
    public int getInputViajeResult() {
        return inputViajeResult;
    }

    /**
     * Sets the value of the inputViajeResult property.
     * 
     */
    public void setInputViajeResult(int value) {
        this.inputViajeResult = value;
    }

}
