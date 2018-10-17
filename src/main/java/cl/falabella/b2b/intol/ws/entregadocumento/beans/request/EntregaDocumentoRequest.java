
package cl.falabella.b2b.intol.ws.entregadocumento.beans.request;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for entrega-documento-request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entrega-documento-request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo-documento" type="{http://b2b.falabella.com/schemas/ol/entrega-documento-request}tipo-documento"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="patente" type="{http://b2b.falabella.com/schemas/ol/entrega-documento-request}patente"/>
 *         &lt;element name="fecha-evento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codigo-no-entrega" type="{http://b2b.falabella.com/schemas/ol/entrega-documento-request}codigo-no-entrega"/>
 *         &lt;element name="rut-receptor" type="{http://b2b.falabella.com/schemas/ol/entrega-documento-request}rut"/>
 *         &lt;element name="parentesco" type="{http://b2b.falabella.com/schemas/ol/entrega-documento-request}parentesco"/>
 *         &lt;element name="bultos" type="{http://b2b.falabella.com/schemas/ol/entrega-documento-request}bultos" minOccurs="0"/>
 *         &lt;element name="autorizacion" type="{http://b2b.falabella.com/schemas/ol/entrega-documento-request}autorizacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entrega-documento-request", propOrder = {
    "tipoDocumento",
    "folio",
    "patente",
    "fechaEvento",
    "latitud",
    "longitud",
    "codigoNoEntrega",
    "rutReceptor",
    "parentesco",
    "bultos",
    "autorizacion"
})
@XmlRootElement(name = "entrega-documento-request")
public class EntregaDocumentoRequest {

    @XmlElement(name = "tipo-documento", required = true)
    protected TipoDocumento tipoDocumento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger folio;
    @XmlElement(required = true)
    protected String patente;
    @XmlElement(name = "fecha-evento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEvento;
    @XmlElement(defaultValue = "0")
    protected Double latitud;
    @XmlElement(defaultValue = "0")
    protected Double longitud;
    @XmlElement(name = "codigo-no-entrega")
    protected int codigoNoEntrega;
    @XmlElement(name = "rut-receptor", required = true)
    protected Rut rutReceptor;
    @XmlElement(required = true)
    protected Parentesco parentesco;
    protected Integer bultos;
    protected Autorizacion autorizacion;

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFolio() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFolio(BigInteger value) {
        this.folio = value;
    }

    /**
     * Gets the value of the patente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatente() {
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
    public void setPatente(String value) {
        this.patente = value;
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
     *     {@link Double }
     *     
     */
    public Double getLatitud() {
        return latitud;
    }

    /**
     * Sets the value of the latitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitud(Double value) {
        this.latitud = value;
    }

    /**
     * Gets the value of the longitud property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * Sets the value of the longitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitud(Double value) {
        this.longitud = value;
    }

    /**
     * Gets the value of the codigoNoEntrega property.
     * 
     */
    public int getCodigoNoEntrega() {
        return codigoNoEntrega;
    }

    /**
     * Sets the value of the codigoNoEntrega property.
     * 
     */
    public void setCodigoNoEntrega(int value) {
        this.codigoNoEntrega = value;
    }

    /**
     * Gets the value of the rutReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link Rut }
     *     
     */
    public Rut getRutReceptor() {
        return rutReceptor;
    }

    /**
     * Sets the value of the rutReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rut }
     *     
     */
    public void setRutReceptor(Rut value) {
        this.rutReceptor = value;
    }

    /**
     * Gets the value of the parentesco property.
     * 
     * @return
     *     possible object is
     *     {@link Parentesco }
     *     
     */
    public Parentesco getParentesco() {
        return parentesco;
    }

    /**
     * Sets the value of the parentesco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parentesco }
     *     
     */
    public void setParentesco(Parentesco value) {
        this.parentesco = value;
    }

    /**
     * Gets the value of the bultos property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBultos() {
        return bultos;
    }

    /**
     * Sets the value of the bultos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBultos(Integer value) {
        this.bultos = value;
    }

    /**
     * Gets the value of the autorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link Autorizacion }
     *     
     */
    public Autorizacion getAutorizacion() {
        return autorizacion;
    }

    /**
     * Sets the value of the autorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Autorizacion }
     *     
     */
    public void setAutorizacion(Autorizacion value) {
        this.autorizacion = value;
    }

}
