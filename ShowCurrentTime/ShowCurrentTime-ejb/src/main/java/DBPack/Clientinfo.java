/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBPack;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vlad
 */
@Entity
@Table(name = "clientinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientinfo.findAll", query = "SELECT c FROM Clientinfo c"),
    @NamedQuery(name = "Clientinfo.findById", query = "SELECT c FROM Clientinfo c WHERE c.id = :id"),
    @NamedQuery(name = "Clientinfo.findByIp", query = "SELECT c FROM Clientinfo c WHERE c.ip = :ip"),
    @NamedQuery(name = "Clientinfo.findByCurrenttime", query = "SELECT c FROM Clientinfo c WHERE c.currenttime = :currenttime"),
    @NamedQuery(name = "Clientinfo.findByUseragent", query = "SELECT c FROM Clientinfo c WHERE c.useragent = :useragent")})
public class Clientinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "ip")
    private String ip;
    @Size(max = 255)
    @Column(name = "currenttime")
    private String currenttime;
    @Size(max = 255)
    @Column(name = "useragent")
    private String useragent;

    public Clientinfo() {
    }

    public Clientinfo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCurrenttime() {
        return currenttime;
    }

    public void setCurrenttime(String currenttime) {
        this.currenttime = currenttime;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
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
        if (!(object instanceof Clientinfo)) {
            return false;
        }
        Clientinfo other = (Clientinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DBPack.Clientinfo[ id=" + id + " ]";
    }
    
}
