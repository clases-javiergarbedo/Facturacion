/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacion;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Javier
 */
@Entity
@Table(name = "fact_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FactDetalle.findAll", query = "SELECT f FROM FactDetalle f"),
    @NamedQuery(name = "FactDetalle.findById", query = "SELECT f FROM FactDetalle f WHERE f.id = :id"),
    @NamedQuery(name = "FactDetalle.findByFactCabId", query = "SELECT f FROM FactDetalle f WHERE f.factCabId = :factCabId"),
    @NamedQuery(name = "FactDetalle.findByCantidad", query = "SELECT f FROM FactDetalle f WHERE f.cantidad = :cantidad"),
    @NamedQuery(name = "FactDetalle.findByPrecioUnit", query = "SELECT f FROM FactDetalle f WHERE f.precioUnit = :precioUnit"),
    @NamedQuery(name = "FactDetalle.findByIva", query = "SELECT f FROM FactDetalle f WHERE f.iva = :iva")})
public class FactDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fact_cab_id")
    private int factCabId;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio_unit")
    private BigDecimal precioUnit;
    @Column(name = "iva")
    private BigDecimal iva;
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Producto productoId;

    public FactDetalle() {
    }

    public FactDetalle(Integer id) {
        this.id = id;
    }

    public FactDetalle(Integer id, int factCabId, int cantidad, BigDecimal precioUnit) {
        this.id = id;
        this.factCabId = factCabId;
        this.cantidad = cantidad;
        this.precioUnit = precioUnit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFactCabId() {
        return factCabId;
    }

    public void setFactCabId(int factCabId) {
        this.factCabId = factCabId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(BigDecimal precioUnit) {
        this.precioUnit = precioUnit;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FactDetalle)) {
            return false;
        }
        FactDetalle other = (FactDetalle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "facturacion.FactDetalle[ id=" + id + " ]";
    }
    
}
