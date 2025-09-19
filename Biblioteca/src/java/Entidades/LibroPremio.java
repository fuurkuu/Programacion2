/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
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
 * @author anton
 */
@Entity
@Table(name = "libro_premios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LibroPremio.findAll", query = "SELECT l FROM LibroPremio l")
    , @NamedQuery(name = "LibroPremio.findById", query = "SELECT l FROM LibroPremio l WHERE l.id = :id")})
public class LibroPremio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "libro_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Libro libroId;
    @JoinColumn(name = "premio_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Premio premioId;

    public LibroPremio() {
    }

    public LibroPremio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Libro getLibroId() {
        return libroId;
    }

    public void setLibroId(Libro libroId) {
        this.libroId = libroId;
    }

    public Premio getPremioId() {
        return premioId;
    }

    public void setPremioId(Premio premioId) {
        this.premioId = premioId;
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
        if (!(object instanceof LibroPremio)) {
            return false;
        }
        LibroPremio other = (LibroPremio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.LibroPremio[ id=" + id + " ]";
    }
    
}
