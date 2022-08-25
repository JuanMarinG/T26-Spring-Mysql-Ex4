// Generated with g9.

package com.juan.ex4.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="reserva")
public class Reserva implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    @Column(name="id_investigador", length=8)
    private String idInvestigador;
    @Column(name="id_equipo", length=4)
    private String idEquipo;
    @Column(name="FOREIGN1")
    private String foreign1;
    @Column(name="FOREIGN2")
    private String foreign2;

    /** Default constructor. */
    public Reserva() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for idInvestigador.
     *
     * @return the current value of idInvestigador
     */
    public String getIdInvestigador() {
        return idInvestigador;
    }

    /**
     * Setter method for idInvestigador.
     *
     * @param aIdInvestigador the new value for idInvestigador
     */
    public void setIdInvestigador(String aIdInvestigador) {
        idInvestigador = aIdInvestigador;
    }

    /**
     * Access method for idEquipo.
     *
     * @return the current value of idEquipo
     */
    public String getIdEquipo() {
        return idEquipo;
    }

    /**
     * Setter method for idEquipo.
     *
     * @param aIdEquipo the new value for idEquipo
     */
    public void setIdEquipo(String aIdEquipo) {
        idEquipo = aIdEquipo;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign1() {
        return foreign1;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign1(String aForeign1) {
        foreign1 = aForeign1;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign2() {
        return foreign2;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign(String aForeign2) {
        foreign2 = aForeign2;
    }

    /**
     * Compares the key for this instance with another Reserva.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Reserva and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Reserva)) {
            return false;
        }
        Reserva that = (Reserva) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Reserva.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Reserva)) return false;
        return this.equalKeys(other) && ((Reserva)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Reserva |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
