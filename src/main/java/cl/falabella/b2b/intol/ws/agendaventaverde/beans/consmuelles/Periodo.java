
package cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Periodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Periodo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoraDesde" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraHasta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Muelles" type="{http://b2b.falabella.com/schemas/ol/ventaverde-muelles}Muelles"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Periodo", propOrder = {
    "num",
    "horaDesde",
    "horaHasta",
    "muelles"
})
public class Periodo {

    @XmlElement(name = "Num")
    protected int num;
    @XmlElement(name = "HoraDesde", required = true)
    protected String horaDesde;
    @XmlElement(name = "HoraHasta", required = true)
    protected String horaHasta;
    @XmlElement(name = "Muelles", required = true)
    protected Muelles muelles;

    /**
     * Obtiene el valor de la propiedad num.
     * 
     */
    public int getNum() {
        return num;
    }

    /**
     * Define el valor de la propiedad num.
     * 
     */
    public void setNum(int value) {
        this.num = value;
    }

    /**
     * Obtiene el valor de la propiedad horaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraDesde() {
        return horaDesde;
    }

    /**
     * Define el valor de la propiedad horaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraDesde(String value) {
        this.horaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad horaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraHasta() {
        return horaHasta;
    }

    /**
     * Define el valor de la propiedad horaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraHasta(String value) {
        this.horaHasta = value;
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

}
