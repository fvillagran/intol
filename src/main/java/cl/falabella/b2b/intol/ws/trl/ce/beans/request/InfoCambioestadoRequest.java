
package cl.falabella.b2b.intol.ws.trl.ce.beans.request;

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
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="viaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fhevento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="evento" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "operacion",
    "viaje",
    "local",
    "fhevento",
    "evento"
})
@XmlRootElement(name = "info-cambioestado-request")
public class InfoCambioestadoRequest {

    protected int operacion;
    protected int viaje;
    @XmlElement(required = true)
    protected String local;
    @XmlElement(required = true)
    protected String fhevento;
    protected int evento;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     */
    public int getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     */
    public void setOperacion(int value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad viaje.
     * 
     */
    public int getViaje() {
        return viaje;
    }

    /**
     * Define el valor de la propiedad viaje.
     * 
     */
    public void setViaje(int value) {
        this.viaje = value;
    }

    /**
     * Obtiene el valor de la propiedad local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define el valor de la propiedad local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Obtiene el valor de la propiedad fhevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFhevento() {
        return fhevento;
    }

    /**
     * Define el valor de la propiedad fhevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFhevento(String value) {
        this.fhevento = value;
    }

    /**
     * Obtiene el valor de la propiedad evento.
     * 
     */
    public int getEvento() {
        return evento;
    }

    /**
     * Define el valor de la propiedad evento.
     * 
     */
    public void setEvento(int value) {
        this.evento = value;
    }

}
