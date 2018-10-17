
package cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar;

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
 *         &lt;element name="Almacen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoMuelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EntradaUnica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaEntrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraInicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Muelles" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_agendar}Muelles" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_agendar}Error" minOccurs="0"/>
 *         &lt;element name="Turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgLvlChild" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VpcTechKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NRut" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TipoAccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="items" type="{http://b2b.falabella.com/schemas/ol/agenda_unica_agendar}items"/>
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
    "error",
    "turno",
    "orgLvlChild",
    "vpcTechKey",
    "nRut",
    "tipoAccion",
    "items"
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
    @XmlElement(name = "Turno")
    protected String turno;
    @XmlElement(name = "OrgLvlChild")
    protected Long orgLvlChild;
    @XmlElement(name = "VpcTechKey")
    protected Long vpcTechKey;
    @XmlElement(name = "NRut")
    protected Long nRut;
    @XmlElement(name = "TipoAccion")
    protected String tipoAccion;
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
     * Gets the value of the almacen property.
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
     * Sets the value of the almacen property.
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
     * Gets the value of the fechaEntrega property.
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
     * Sets the value of the fechaEntrega property.
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
     * Gets the value of the horaInicio property.
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
     * Sets the value of the horaInicio property.
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
     * Gets the value of the horaTermino property.
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
     * Sets the value of the horaTermino property.
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
     * Gets the value of the muelles property.
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
     * Sets the value of the muelles property.
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
     * Gets the value of the orgLvlChild property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgLvlChild() {
        return orgLvlChild;
    }

    /**
     * Sets the value of the orgLvlChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgLvlChild(Long value) {
        this.orgLvlChild = value;
    }

    /**
     * Gets the value of the vpcTechKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVpcTechKey() {
        return vpcTechKey;
    }

    /**
     * Sets the value of the vpcTechKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVpcTechKey(Long value) {
        this.vpcTechKey = value;
    }

    /**
     * Gets the value of the nRut property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNRut() {
        return nRut;
    }

    /**
     * Sets the value of the nRut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNRut(Long value) {
        this.nRut = value;
    }

    /**
     * Gets the value of the tipoAccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAccion() {
        return tipoAccion;
    }

    /**
     * Sets the value of the tipoAccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAccion(String value) {
        this.tipoAccion = value;
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
