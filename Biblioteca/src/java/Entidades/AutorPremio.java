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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author anton
 */
@Entity
@Table(name = "autor_premio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AutorPremio.findAll", query = "SELECT a FROM AutorPremio a")
    , @NamedQuery(name = "AutorPremio.findByPremio", query = "SELECT ap FROM AutorPremio ap WHERE ap.premioId=:elPremio ORDER BY ap.anio")
    , @NamedQuery(name = "AutorPremio.findById", query = "SELECT a FROM AutorPremio a WHERE a.id = :id")
    , @NamedQuery(name = "AutorPremio.findByAnio", query = "SELECT a FROM AutorPremio a WHERE a.anio = :anio")})
public class AutorPremio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio")
    private int anio;
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Autor autorId;
    @JoinColumn(name = "premio_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Premio premioId;

    public AutorPremio() {
    }

    public AutorPremio(Integer id) {
        this.id = id;
    }

    public AutorPremio(Integer id, int anio) {
        this.id = id;
        this.anio = anio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Autor getAutorId() {
        return autorId;
    }

    public void setAutorId(Autor autorId) {
        this.autorId = autorId;
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
        if (!(object instanceof AutorPremio)) {
            return false;
        }
        AutorPremio other = (AutorPremio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.AutorPremio[ id=" + id + " ]";
    }
    
}
