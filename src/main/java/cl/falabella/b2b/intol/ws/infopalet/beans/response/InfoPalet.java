
package cl.falabella.b2b.intol.ws.infopalet.beans.response;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for info-palet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="info-palet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero-palet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suborden" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numero-f12" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numero2-f12" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="fecha-f12" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo-documento" type="{http://b2b.falabella.com/schemas/ol/info-palet-response}tipo-documento"/>
 *         &lt;element name="ciudad-origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad-destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="peso-completo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="tipo-producto" type="{http://b2b.falabella.com/schemas/ol/info-palet-response}tipo-producto"/>
 *         &lt;element name="cantidad-m3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="cantidad-bultos" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="alto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ancho" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="tipo-documento-tributario" type="{http://b2b.falabella.com/schemas/ol/info-palet-response}tipo-documento-tributario"/>
 *         &lt;element name="tipo-contenido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monto-declarado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="destinatario" type="{http://b2b.falabella.com/schemas/ol/info-palet-response}destinatario"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "info-palet", propOrder = {
    "numeroPalet",
    "suborden",
    "numeroF12",
    "numero2F12",
    "fechaF12",
    "tipoDocumento",
    "ciudadOrigen",
    "ciudadDestino",
    "pesoCompleto",
    "tipoProducto",
    "cantidadM3",
    "cantidadBultos",
    "alto",
    "ancho",
    "largo",
    "tipoDocumentoTributario",
    "tipoContenido",
    "montoDeclarado",
    "destinatario",
    "region"
})
public class InfoPalet {

    @XmlElement(name = "numero-palet", required = true)
    protected String numeroPalet;
    @XmlElement(required = true, nillable = true)
    protected BigInteger suborden;
    @XmlElement(name = "numero-f12", required = true)
    protected BigInteger numeroF12;
    @XmlElement(name = "numero2-f12", required = true, nillable = true)
    protected BigInteger numero2F12;
    @XmlElement(name = "fecha-f12", required = true, nillable = true)
    protected String fechaF12;
    @XmlElement(name = "tipo-documento", required = true)
    protected TipoDocumento tipoDocumento;
    @XmlElement(name = "ciudad-origen", required = true, nillable = true)
    protected String ciudadOrigen;
    @XmlElement(name = "ciudad-destino", required = true, nillable = true)
    protected String ciudadDestino;
    @XmlElement(name = "peso-completo", required = true)
    protected BigDecimal pesoCompleto;
    @XmlElement(name = "tipo-producto", required = true, nillable = true)
    protected TipoProducto tipoProducto;
    @XmlElement(name = "cantidad-m3", required = true)
    protected BigDecimal cantidadM3;
    @XmlElement(name = "cantidad-bultos", required = true)
    protected BigInteger cantidadBultos;
    @XmlElement(required = true)
    protected BigDecimal alto;
    @XmlElement(required = true)
    protected BigDecimal ancho;
    @XmlElement(required = true)
    protected BigDecimal largo;
    @XmlElement(name = "tipo-documento-tributario", required = true, nillable = true)
    protected TipoDocumentoTributario tipoDocumentoTributario;
    @XmlElement(name = "tipo-contenido", required = true, nillable = true)
    protected String tipoContenido;
    @XmlElement(name = "monto-declarado", required = true)
    protected BigDecimal montoDeclarado;
    @XmlElement(required = true, nillable = true)
    protected Destinatario destinatario;
    @XmlElement(required = true, nillable = true)
    protected String region;

    /**
     * Gets the value of the numeroPalet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPalet() {
        return numeroPalet;
    }

    /**
     * Sets the value of the numeroPalet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPalet(String value) {
        this.numeroPalet = value;
    }

    /**
     * Gets the value of the suborden property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSuborden() {
        return suborden;
    }

    /**
     * Sets the value of the suborden property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSuborden(BigInteger value) {
        this.suborden = value;
    }

    /**
     * Gets the value of the numeroF12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroF12() {
        return numeroF12;
    }

    /**
     * Sets the value of the numeroF12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroF12(BigInteger value) {
        this.numeroF12 = value;
    }

    /**
     * Gets the value of the numero2F12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumero2F12() {
        return numero2F12;
    }

    /**
     * Sets the value of the numero2F12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumero2F12(BigInteger value) {
        this.numero2F12 = value;
    }

    /**
     * Gets the value of the fechaF12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaF12() {
        return fechaF12;
    }

    /**
     * Sets the value of the fechaF12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaF12(String value) {
        this.fechaF12 = value;
    }

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
     * Gets the value of the ciudadOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * Sets the value of the ciudadOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadOrigen(String value) {
        this.ciudadOrigen = value;
    }

    /**
     * Gets the value of the ciudadDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadDestino() {
        return ciudadDestino;
    }

    /**
     * Sets the value of the ciudadDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadDestino(String value) {
        this.ciudadDestino = value;
    }

    /**
     * Gets the value of the pesoCompleto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoCompleto() {
        return pesoCompleto;
    }

    /**
     * Sets the value of the pesoCompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoCompleto(BigDecimal value) {
        this.pesoCompleto = value;
    }

    /**
     * Gets the value of the tipoProducto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoProducto }
     *     
     */
    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Sets the value of the tipoProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoProducto }
     *     
     */
    public void setTipoProducto(TipoProducto value) {
        this.tipoProducto = value;
    }

    /**
     * Gets the value of the cantidadM3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidadM3() {
        return cantidadM3;
    }

    /**
     * Sets the value of the cantidadM3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidadM3(BigDecimal value) {
        this.cantidadM3 = value;
    }

    /**
     * Gets the value of the cantidadBultos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadBultos() {
        return cantidadBultos;
    }

    /**
     * Sets the value of the cantidadBultos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadBultos(BigInteger value) {
        this.cantidadBultos = value;
    }

    /**
     * Gets the value of the alto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlto() {
        return alto;
    }

    /**
     * Sets the value of the alto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlto(BigDecimal value) {
        this.alto = value;
    }

    /**
     * Gets the value of the ancho property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAncho() {
        return ancho;
    }

    /**
     * Sets the value of the ancho property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAncho(BigDecimal value) {
        this.ancho = value;
    }

    /**
     * Gets the value of the largo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLargo() {
        return largo;
    }

    /**
     * Sets the value of the largo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLargo(BigDecimal value) {
        this.largo = value;
    }

    /**
     * Gets the value of the tipoDocumentoTributario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoTributario }
     *     
     */
    public TipoDocumentoTributario getTipoDocumentoTributario() {
        return tipoDocumentoTributario;
    }

    /**
     * Sets the value of the tipoDocumentoTributario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoTributario }
     *     
     */
    public void setTipoDocumentoTributario(TipoDocumentoTributario value) {
        this.tipoDocumentoTributario = value;
    }

    /**
     * Gets the value of the tipoContenido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContenido() {
        return tipoContenido;
    }

    /**
     * Sets the value of the tipoContenido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContenido(String value) {
        this.tipoContenido = value;
    }

    /**
     * Gets the value of the montoDeclarado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoDeclarado() {
        return montoDeclarado;
    }

    /**
     * Sets the value of the montoDeclarado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoDeclarado(BigDecimal value) {
        this.montoDeclarado = value;
    }

    /**
     * Gets the value of the destinatario property.
     * 
     * @return
     *     possible object is
     *     {@link Destinatario }
     *     
     */
    public Destinatario getDestinatario() {
        return destinatario;
    }

    /**
     * Sets the value of the destinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destinatario }
     *     
     */
    public void setDestinatario(Destinatario value) {
        this.destinatario = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
