
package cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consignatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Almacen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoMuelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EntradaUnica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaEntrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraInicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Muelles" type="{http://b2b.falabella.com/schemas/ol/ventaverde-agenda}Muelles" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://b2b.falabella.com/schemas/ol/ventaverde-agenda}Error" minOccurs="0"/>
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
    "tipoMuelle",
    "entradaUnica",
    "fechaEntrega",
    "horaInicio",
    "horaTermino",
    "muelles",
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
    @XmlElement(name = "Almacen", required = true)
    protected String almacen;
    @XmlElement(name = "TipoMuelle", required = true)
    protected String tipoMuelle;
    @XmlElement(name = "EntradaUnica", required = true)
    protected String entradaUnica;
    @XmlElement(name = "FechaEntrega", required = true)
    protected String fechaEntrega;
    @XmlElement(name = "HoraInicio", required = true)
    protected String horaInicio;
    @XmlElement(name = "HoraTermino")
    protected String horaTermino;
    @XmlElement(name = "Muelles")
    protected Muelles muelles;
    @XmlElement(name = "Error")
    protected Error error;

    /**
     * Obtiene el valor de la propiedad consignatario.
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
     * Define el valor de la propiedad consignatario.
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
     * Obtiene el valor de la propiedad empresa.
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
     * Define el valor de la propiedad empresa.
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
     * Obtiene el valor de la propiedad proveedor.
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
     * Define el valor de la propiedad proveedor.
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
     * Obtiene el valor de la propiedad almacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlmacen() {
        return almacen;
    }

    /**
     * Define el valor de la propiedad almacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlmacen(String value) {
        this.almacen = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMuelle.
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
     * Define el valor de la propiedad tipoMuelle.
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
     * Obtiene el valor de la propiedad entradaUnica.
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
     * Define el valor de la propiedad entradaUnica.
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
     * Obtiene el valor de la propiedad fechaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Define el valor de la propiedad fechaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEntrega(String value) {
        this.fechaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad horaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Define el valor de la propiedad horaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicio(String value) {
        this.horaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad horaTermino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraTermino() {
        return horaTermino;
    }

    /**
     * Define el valor de la propiedad horaTermino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraTermino(String value) {
        this.horaTermino = value;
    }

    /**
     * Obtiene el valor de la propiedad muelles.
     * 
     * @return
     *     possible object is
     *     {@link Muelles }
     *     
     */
    public Muelles getMuelles() {
        return muelles;
    }

    /**
     * Define el valor de la propiedad muelles.
     * 
     * @param value
     *     allowed object is
     *     {@link Muelles }
     *     
     */
    public void setMuelles(Muelles value) {
        this.muelles = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
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
     * Define el valor de la propiedad error.
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
