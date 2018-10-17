
package cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicahorario;

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
 *         &lt;element name="Consignatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Almacen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Turno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoMuelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoCalendario" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_horario}TipoCalendario" minOccurs="0"/>
 *         &lt;element name="Diario" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_horario}Diario" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_horario}Error" minOccurs="0"/>
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
    "consignatario",
    "empresa",
    "proveedor",
    "almacen",
    "turno",
    "tipoMuelle",
    "fecha",
    "tipoCalendario",
    "diario",
    "error"
})
@XmlRootElement(name = "Archivo")
public class Archivo {

    @XmlElement(name = "Consignatario", required = true)
    protected String consignatario;
    @XmlElement(name = "Empresa", required = true)
    protected String empresa;
    @XmlElement(name = "Proveedor", required = true)
    protected String proveedor;
    @XmlElement(name = "Almacen")
    protected long almacen;
    @XmlElement(name = "Turno", required = true)
    protected String turno;
    @XmlElement(name = "TipoMuelle", required = true)
    protected String tipoMuelle;
    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(name = "TipoCalendario")
    protected TipoCalendario tipoCalendario;
    @XmlElement(name = "Diario")
    protected Diario diario;
    @XmlElement(name = "Error")
    protected Error error;

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
     * Gets the value of the almacen property.
     * 
     */
    public long getAlmacen() {
        return almacen;
    }

    /**
     * Sets the value of the almacen property.
     * 
     */
    public void setAlmacen(long value) {
        this.almacen = value;
    }

    /**
     * Gets the value of the turno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Sets the value of the turno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurno(String value) {
        this.turno = value;
    }

    /**
     * Gets the value of the tipoMuelle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMuelle() {
        return tipoMuelle;
    }

    /**
     * Sets the value of the tipoMuelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMuelle(String value) {
        this.tipoMuelle = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the tipoCalendario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCalendario }
     *     
     */
    public TipoCalendario getTipoCalendario() {
        return tipoCalendario;
    }

    /**
     * Sets the value of the tipoCalendario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCalendario }
     *     
     */
    public void setTipoCalendario(TipoCalendario value) {
        this.tipoCalendario = value;
    }

    /**
     * Gets the value of the diario property.
     * 
     * @return
     *     possible object is
     *     {@link Diario }
     *     
     */
    public Diario getDiario() {
        return diario;
    }

    /**
     * Sets the value of the diario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diario }
     *     
     */
    public void setDiario(Diario value) {
        this.diario = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

}
