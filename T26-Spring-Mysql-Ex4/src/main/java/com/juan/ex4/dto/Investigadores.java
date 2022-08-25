// Generated with g9.

package com.juan.ex4.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="investigadores")
public class Investigadores implements Serializable {

    /** Primary key. */
    protected static final String PK = "dni";

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
    @Column(unique=true, nullable=false, length=8)
    private String dni;
    @Column(length=255)
    private String nomApels;
    @Column(name="id_facultad")
    private int idFacultad;
    @Column(name="FOREIGN")
    private String foreign;

    /** Default constructor. */
    public Investigadores() {
        super();
    }

    /**
     * Access method for dni.
     *
     * @return the current value of dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter method for dni.
     *
     * @param aDni the new value for dni
     */
    public void setDni(String aDni) {
        dni = aDni;
    }

    /**
     * Access method for nomApels.
     *
     * @return the current value of nomApels
     */
    public String getNomApels() {
        return nomApels;
    }

    /**
     * Setter method for nomApels.
     *
     * @param aNomApels the new value for nomApels
     */
    public void setNomApels(String aNomApels) {
        nomApels = aNomApels;
    }

    /**
     * Access method for idFacultad.
     *
     * @return the current value of idFacultad
     */
    public int getIdFacultad() {
        return idFacultad;
    }

    /**
     * Setter method for idFacultad.
     *
     * @param aIdFacultad the new value for idFacultad
     */
    public void setIdFacultad(int aIdFacultad) {
        idFacultad = aIdFacultad;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign() {
        return foreign;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign(String aForeign) {
        foreign = aForeign;
    }

    /**
     * Compares the key for this instance with another Investigadores.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Investigadores and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Investigadores)) {
            return false;
        }
        Investigadores that = (Investigadores) other;
        Object myDni = this.getDni();
        Object yourDni = that.getDni();
        if (myDni==null ? yourDni!=null : !myDni.equals(yourDni)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Investigadores.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Investigadores)) return false;
        return this.equalKeys(other) && ((Investigadores)other).equalKeys(this);
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
        if (getDni() == null) {
            i = 0;
        } else {
            i = getDni().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[Investigadores |");
        sb.append(" dni=").append(getDni());
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
        ret.put("dni", getDni());
        return ret;
    }

}
