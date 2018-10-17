
package cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for agu-planification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agu-planification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consignatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="di-provider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="place-delivery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="warehouse-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data-delivery" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="turn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="items" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_calcula_ventana}items"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agu-planification", propOrder = {
    "consignatario",
    "empresa",
    "proveedor",
    "eu",
    "diProvider",
    "placeDelivery",
    "warehouseType",
    "dataDelivery",
    "turn",
    "items"
})

@XmlRootElement(name = "agu-planification")
public class AguPlanification {

    @XmlElement(name = "Consignatario", required = true)
    protected String consignatario;
    @XmlElement(name = "Empresa", required = true)
    protected String empresa;
    @XmlElement(name = "Proveedor", required = true)
    protected String proveedor;
    @XmlElement(required = true)
    protected String eu;
    @XmlElement(name = "di-provider", required = true)
    protected String diProvider;
    @XmlElement(name = "place-delivery", required = true)
    protected String placeDelivery;
    @XmlElement(name = "warehouse-type", required = true)
    protected String warehouseType;
    @XmlElement(name = "data-delivery", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDelivery;
    @XmlElement(required = true)
    protected String turn;
    @XmlElement(required = true)
    protected Items items;

    /**
     * Gets the value of the consignatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignatario() {
        return consignatario;
    }

    /**
     * Sets the value of the consignatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignatario(String value) {
        this.consignatario = value;
    }

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the proveedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * Sets the value of the proveedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedor(String value) {
        this.proveedor = value;
    }

    /**
     * Gets the value of the eu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEu() {
        return eu;
    }

    /**
     * Sets the value of the eu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEu(String value) {
        this.eu = value;
    }

    /**
     * Gets the value of the diProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiProvider() {
        return diProvider;
    }

    /**
     * Sets the value of the diProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiProvider(String value) {
        this.diProvider = value;
    }

    /**
     * Gets the value of the placeDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceDelivery() {
        return placeDelivery;
    }

    /**
     * Sets the value of the placeDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceDelivery(String value) {
        this.placeDelivery = value;
    }

    /**
     * Gets the value of the warehouseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseType() {
        return warehouseType;
    }

    /**
     * Sets the value of the warehouseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseType(String value) {
        this.warehouseType = value;
    }

    /**
     * Gets the value of the dataDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDelivery() {
        return dataDelivery;
    }

    /**
     * Sets the value of the dataDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDelivery(XMLGregorianCalendar value) {
        this.dataDelivery = value;
    }

    /**
     * Gets the value of the turn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurn() {
        return turn;
    }

    /**
     * Sets the value of the turn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurn(String value) {
        this.turn = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link Items }
     *     
     */
    public Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link Items }
     *     
     */
    public void setItems(Items value) {
        this.items = value;
    }

}
