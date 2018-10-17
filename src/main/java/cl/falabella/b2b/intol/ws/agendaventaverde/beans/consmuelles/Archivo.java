
package cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles;

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
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Almacen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaEntrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Turno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoMuelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Periodos" type="{http://b2b.falabella.com/schemas/ol/ventaverde-muelles}Periodos" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://b2b.falabella.com/schemas/ol/ventaverde-muelles}Error" minOccurs="0"/>
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
    "empresa",
    "almacen",
    "fechaEntrega",
    "turno",
    "tipoMuelle",
    "periodos",
    "error"
})
@XmlRootElement(name = "Archivo")
public class Archivo {

    @XmlElement(name = "Empresa", required = true)
    protected String empresa;
    @XmlElement(name = "Almacen", required = true)
    protected String almacen;
    @XmlElement(name = "FechaEntrega", required = true)
    protected String fechaEntrega;
    @XmlElement(name = "Turno", required = true)
    protected String turno;
    @XmlElement(name = "TipoMuelle", required = true)
    protected String tipoMuelle;
    @XmlElement(name = "Periodos")
    protected Periodos periodos;
    @XmlElement(name = "Error")
    protected Error error;

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
     * Obtiene el valor de la propiedad turno.
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
     * Define el valor de la propiedad turno.
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
     * Obtiene el valor de la propiedad periodos.
     * 
     * @return
     *     possible object is
     *     {@link Periodos }
     *     
     */
    public Periodos getPeriodos() {
        return periodos;
    }

    /**
     * Define el valor de la propiedad periodos.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodos }
     *     
     */
    public void setPeriodos(Periodos value) {
        this.periodos = value;
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
