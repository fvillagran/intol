
package cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for file complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="file">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo-archivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="archivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extension-archivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file", propOrder = {
    "tipoArchivo",
    "archivo",
    "extensionArchivo"
})
public class File {

    @XmlElement(name = "tipo-archivo", required = true)
    protected String tipoArchivo;
    @XmlElement(required = true)
    protected String archivo;
    @XmlElement(name = "extension-archivo", required = true)
    protected String extensionArchivo;

    /**
     * Gets the value of the tipoArchivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoArchivo() {
        return tipoArchivo;
    }

    /**
     * Sets the value of the tipoArchivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoArchivo(String value) {
        this.tipoArchivo = value;
    }

    /**
     * Gets the value of the archivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivo() {
        return archivo;
    }

    /**
     * Sets the value of the archivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivo(String value) {
        this.archivo = value;
    }

    /**
     * Gets the value of the extensionArchivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionArchivo() {
        return extensionArchivo;
    }

    /**
     * Sets the value of the extensionArchivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionArchivo(String value) {
        this.extensionArchivo = value;
    }

}
