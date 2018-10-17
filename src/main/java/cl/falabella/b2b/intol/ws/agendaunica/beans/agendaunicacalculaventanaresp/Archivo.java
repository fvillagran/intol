
package cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp;

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
 *         &lt;element name="EntradaUnica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ventanas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_calcula_ventanaresp}Error" minOccurs="0"/>
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
    "entradaUnica",
    "ventanas",
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
    @XmlElement(name = "EntradaUnica", required = true)
    protected String entradaUnica;
    @XmlElement(name = "Ventanas", required = true)
    protected String ventanas;
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
     * Gets the value of the entradaUnica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntradaUnica() {
        return entradaUnica;
    }

    /**
     * Sets the value of the entradaUnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntradaUnica(String value) {
        this.entradaUnica = value;
    }

    /**
     * Gets the value of the ventanas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVentanas() {
        return ventanas;
    }

    /**
     * Sets the value of the ventanas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVentanas(String value) {
        this.ventanas = value;
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
