
package cl.falabella.b2b.intol.ws.infodocumento.beans.request;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for info-documento-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="info-documento-request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo-documento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero-documento" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="patente-camion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rut-mantisa-cliente" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="rut-digito-cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha-evento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "info-documento-request", propOrder = {
    "tipoDocumento",
    "numeroDocumento",
    "patenteCamion",
    "rutMantisaCliente",
    "rutDigitoCliente",
    "fechaEvento",
    "latitud",
    "longitud"
})
@XmlRootElement(name = "info-documento-request")
public class InfoDocumentoRequest {

    @XmlElement(name = "tipo-documento", required = true)
    protected String tipoDocumento;
    @XmlElement(name = "numero-documento", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numeroDocumento;
    @XmlElement(name = "patente-camion", required = true)
    protected String patenteCamion;
    @XmlElement(name = "rut-mantisa-cliente", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger rutMantisaCliente;
    @XmlElement(name = "rut-digito-cliente", required = true)
    protected String rutDigitoCliente;
    @XmlElement(name = "fecha-evento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEvento;
    protected BigDecimal latitud;
    protected BigDecimal longitud;

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroDocumento(BigInteger value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the patenteCamion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatenteCamion() {
        return patenteCamion;
    }

    /**
     * Sets the value of the patenteCamion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatenteCamion(String value) {
        this.patenteCamion = value;
    }

    /**
     * Gets the value of the rutMantisaCliente property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRutMantisaCliente() {
        return rutMantisaCliente;
    }

    /**
     * Sets the value of the rutMantisaCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRutMantisaCliente(BigInteger value) {
        this.rutMantisaCliente = value;
    }

    /**
     * Gets the value of the rutDigitoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutDigitoCliente() {
        return rutDigitoCliente;
    }

    /**
     * Sets the value of the rutDigitoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutDigitoCliente(String value) {
        this.rutDigitoCliente = value;
    }

    /**
     * Gets the value of the fechaEvento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEvento() {
        return fechaEvento;
    }

    /**
     * Sets the value of the fechaEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEvento(XMLGregorianCalendar value) {
        this.fechaEvento = value;
    }

    /**
     * Gets the value of the latitud property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitud() {
        return latitud;
    }

    /**
     * Sets the value of the latitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitud(BigDecimal value) {
        this.latitud = value;
    }

    /**
     * Gets the value of the longitud property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitud() {
        return longitud;
    }

    /**
     * Sets the value of the longitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitud(BigDecimal value) {
        this.longitud = value;
    }

}
