
package cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pending-quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="unit-quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="bulge-quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="packaging-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "line",
    "subline",
    "pendingQuantity",
    "unitQuantity",
    "bulgeQuantity",
    "packagingType",
    "sku"
})
public class Item {

    @XmlElement(required = true)
    protected String line;
    @XmlElement(required = true)
    protected String subline;
    @XmlElement(name = "pending-quantity", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pendingQuantity;
    @XmlElement(name = "unit-quantity", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger unitQuantity;
    @XmlElement(name = "bulge-quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bulgeQuantity;
    @XmlElement(name = "packaging-type", required = true)
    protected String packagingType;
    @XmlElement(required = true)
    protected String sku;
    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the subline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubline() {
        return subline;
    }

    /**
     * Sets the value of the subline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubline(String value) {
        this.subline = value;
    }

    /**
     * Gets the value of the pendingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPendingQuantity() {
        return pendingQuantity;
    }

    /**
     * Sets the value of the pendingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPendingQuantity(BigInteger value) {
        this.pendingQuantity = value;
    }

    /**
     * Gets the value of the unitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitQuantity() {
        return unitQuantity;
    }

    /**
     * Sets the value of the unitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitQuantity(BigInteger value) {
        this.unitQuantity = value;
    }

    /**
     * Gets the value of the bulgeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBulgeQuantity() {
        return bulgeQuantity;
    }

    /**
     * Sets the value of the bulgeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBulgeQuantity(BigInteger value) {
        this.bulgeQuantity = value;
    }

    /**
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingType(String value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
