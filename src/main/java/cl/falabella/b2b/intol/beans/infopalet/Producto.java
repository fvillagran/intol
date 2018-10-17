//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.26 at 03:06:02 PM CLT 
//


package cl.falabella.b2b.intol.beans.infopalet;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for producto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="producto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A_SKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="N_ALTO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="N_ANCHO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="N_LARGO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="A_DETALLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QCANTIDA" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="num" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producto", propOrder = {
    "asku",
    "nalto",
    "nancho",
    "nlargo",
    "adetalle",
    "qcantida"
})
public class Producto {

    @XmlElement(name = "A_SKU", required = true)
    protected String asku;
    @XmlElement(name = "N_ALTO", required = true)
    protected BigDecimal nalto;
    @XmlElement(name = "N_ANCHO", required = true)
    protected BigDecimal nancho;
    @XmlElement(name = "N_LARGO", required = true)
    protected BigDecimal nlargo;
    @XmlElement(name = "A_DETALLE", required = true)
    protected String adetalle;
    @XmlElement(name = "QCANTIDA", required = true)
    protected BigInteger qcantida;
    @XmlAttribute
    protected Integer num;

    /**
     * Gets the value of the asku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASKU() {
        return asku;
    }

    /**
     * Sets the value of the asku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASKU(String value) {
        this.asku = value;
    }

    /**
     * Gets the value of the nalto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNALTO() {
        return nalto;
    }

    /**
     * Sets the value of the nalto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNALTO(BigDecimal value) {
        this.nalto = value;
    }

    /**
     * Gets the value of the nancho property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNANCHO() {
        return nancho;
    }

    /**
     * Sets the value of the nancho property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNANCHO(BigDecimal value) {
        this.nancho = value;
    }

    /**
     * Gets the value of the nlargo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNLARGO() {
        return nlargo;
    }

    /**
     * Sets the value of the nlargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNLARGO(BigDecimal value) {
        this.nlargo = value;
    }

    /**
     * Gets the value of the adetalle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADETALLE() {
        return adetalle;
    }

    /**
     * Sets the value of the adetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADETALLE(String value) {
        this.adetalle = value;
    }

    /**
     * Gets the value of the qcantida property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQCANTIDA() {
        return qcantida;
    }

    /**
     * Sets the value of the qcantida property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQCANTIDA(BigInteger value) {
        this.qcantida = value;
    }

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum(Integer value) {
        this.num = value;
    }

}
