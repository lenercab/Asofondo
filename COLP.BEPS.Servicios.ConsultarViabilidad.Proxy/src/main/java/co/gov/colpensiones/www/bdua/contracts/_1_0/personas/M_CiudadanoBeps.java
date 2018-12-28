/**
 * M_CiudadanoBeps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class M_CiudadanoBeps  implements java.io.Serializable {
    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoDocumento idP_TipoDocumento;

    private java.lang.String SNumeroIdentificacion;

    private java.lang.String SPrimerApellido;

    private java.lang.String SSegundoApellido;

    private java.lang.String SPrimerNombre;

    private java.lang.String SSegundoNombre;

    private java.lang.String SParticula;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_MunicipioExp idP_MunicipioExp;

    private java.lang.String DFechaExpedicion;

    private java.lang.String estadoCedula;

    private java.lang.String SNumeroResolucion;

    private java.lang.String SAnoResolucion;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_Sexo idP_Sexo;

    private java.lang.String DFechaNacimiento;

    private java.lang.String departamento_Nacimiento;

    private java.lang.String municipio_Nacimiento;

    private java.lang.String DFechaDefuncion;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.P_ViabilidadBEPS p_ViabilidadBEPS;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.InformacionViablidad informacionViablidad;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.CausalesNoViabilidad[] causalesNoViabilidadBEPS;

    public M_CiudadanoBeps() {
    }

    public M_CiudadanoBeps(
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoDocumento idP_TipoDocumento,
           java.lang.String SNumeroIdentificacion,
           java.lang.String SPrimerApellido,
           java.lang.String SSegundoApellido,
           java.lang.String SPrimerNombre,
           java.lang.String SSegundoNombre,
           java.lang.String SParticula,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_MunicipioExp idP_MunicipioExp,
           java.lang.String DFechaExpedicion,
           java.lang.String estadoCedula,
           java.lang.String SNumeroResolucion,
           java.lang.String SAnoResolucion,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_Sexo idP_Sexo,
           java.lang.String DFechaNacimiento,
           java.lang.String departamento_Nacimiento,
           java.lang.String municipio_Nacimiento,
           java.lang.String DFechaDefuncion,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.P_ViabilidadBEPS p_ViabilidadBEPS,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.InformacionViablidad informacionViablidad,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.CausalesNoViabilidad[] causalesNoViabilidadBEPS) {
           this.idP_TipoDocumento = idP_TipoDocumento;
           this.SNumeroIdentificacion = SNumeroIdentificacion;
           this.SPrimerApellido = SPrimerApellido;
           this.SSegundoApellido = SSegundoApellido;
           this.SPrimerNombre = SPrimerNombre;
           this.SSegundoNombre = SSegundoNombre;
           this.SParticula = SParticula;
           this.idP_MunicipioExp = idP_MunicipioExp;
           this.DFechaExpedicion = DFechaExpedicion;
           this.estadoCedula = estadoCedula;
           this.SNumeroResolucion = SNumeroResolucion;
           this.SAnoResolucion = SAnoResolucion;
           this.idP_Sexo = idP_Sexo;
           this.DFechaNacimiento = DFechaNacimiento;
           this.departamento_Nacimiento = departamento_Nacimiento;
           this.municipio_Nacimiento = municipio_Nacimiento;
           this.DFechaDefuncion = DFechaDefuncion;
           this.p_ViabilidadBEPS = p_ViabilidadBEPS;
           this.informacionViablidad = informacionViablidad;
           this.causalesNoViabilidadBEPS = causalesNoViabilidadBEPS;
    }


    /**
     * Gets the idP_TipoDocumento value for this M_CiudadanoBeps.
     * 
     * @return idP_TipoDocumento
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoDocumento getIdP_TipoDocumento() {
        return idP_TipoDocumento;
    }


    /**
     * Sets the idP_TipoDocumento value for this M_CiudadanoBeps.
     * 
     * @param idP_TipoDocumento
     */
    public void setIdP_TipoDocumento(co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoDocumento idP_TipoDocumento) {
        this.idP_TipoDocumento = idP_TipoDocumento;
    }


    /**
     * Gets the SNumeroIdentificacion value for this M_CiudadanoBeps.
     * 
     * @return SNumeroIdentificacion
     */
    public java.lang.String getSNumeroIdentificacion() {
        return SNumeroIdentificacion;
    }


    /**
     * Sets the SNumeroIdentificacion value for this M_CiudadanoBeps.
     * 
     * @param SNumeroIdentificacion
     */
    public void setSNumeroIdentificacion(java.lang.String SNumeroIdentificacion) {
        this.SNumeroIdentificacion = SNumeroIdentificacion;
    }


    /**
     * Gets the SPrimerApellido value for this M_CiudadanoBeps.
     * 
     * @return SPrimerApellido
     */
    public java.lang.String getSPrimerApellido() {
        return SPrimerApellido;
    }


    /**
     * Sets the SPrimerApellido value for this M_CiudadanoBeps.
     * 
     * @param SPrimerApellido
     */
    public void setSPrimerApellido(java.lang.String SPrimerApellido) {
        this.SPrimerApellido = SPrimerApellido;
    }


    /**
     * Gets the SSegundoApellido value for this M_CiudadanoBeps.
     * 
     * @return SSegundoApellido
     */
    public java.lang.String getSSegundoApellido() {
        return SSegundoApellido;
    }


    /**
     * Sets the SSegundoApellido value for this M_CiudadanoBeps.
     * 
     * @param SSegundoApellido
     */
    public void setSSegundoApellido(java.lang.String SSegundoApellido) {
        this.SSegundoApellido = SSegundoApellido;
    }


    /**
     * Gets the SPrimerNombre value for this M_CiudadanoBeps.
     * 
     * @return SPrimerNombre
     */
    public java.lang.String getSPrimerNombre() {
        return SPrimerNombre;
    }


    /**
     * Sets the SPrimerNombre value for this M_CiudadanoBeps.
     * 
     * @param SPrimerNombre
     */
    public void setSPrimerNombre(java.lang.String SPrimerNombre) {
        this.SPrimerNombre = SPrimerNombre;
    }


    /**
     * Gets the SSegundoNombre value for this M_CiudadanoBeps.
     * 
     * @return SSegundoNombre
     */
    public java.lang.String getSSegundoNombre() {
        return SSegundoNombre;
    }


    /**
     * Sets the SSegundoNombre value for this M_CiudadanoBeps.
     * 
     * @param SSegundoNombre
     */
    public void setSSegundoNombre(java.lang.String SSegundoNombre) {
        this.SSegundoNombre = SSegundoNombre;
    }


    /**
     * Gets the SParticula value for this M_CiudadanoBeps.
     * 
     * @return SParticula
     */
    public java.lang.String getSParticula() {
        return SParticula;
    }


    /**
     * Sets the SParticula value for this M_CiudadanoBeps.
     * 
     * @param SParticula
     */
    public void setSParticula(java.lang.String SParticula) {
        this.SParticula = SParticula;
    }


    /**
     * Gets the idP_MunicipioExp value for this M_CiudadanoBeps.
     * 
     * @return idP_MunicipioExp
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_MunicipioExp getIdP_MunicipioExp() {
        return idP_MunicipioExp;
    }


    /**
     * Sets the idP_MunicipioExp value for this M_CiudadanoBeps.
     * 
     * @param idP_MunicipioExp
     */
    public void setIdP_MunicipioExp(co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_MunicipioExp idP_MunicipioExp) {
        this.idP_MunicipioExp = idP_MunicipioExp;
    }


    /**
     * Gets the DFechaExpedicion value for this M_CiudadanoBeps.
     * 
     * @return DFechaExpedicion
     */
    public java.lang.String getDFechaExpedicion() {
        return DFechaExpedicion;
    }


    /**
     * Sets the DFechaExpedicion value for this M_CiudadanoBeps.
     * 
     * @param DFechaExpedicion
     */
    public void setDFechaExpedicion(java.lang.String DFechaExpedicion) {
        this.DFechaExpedicion = DFechaExpedicion;
    }


    /**
     * Gets the estadoCedula value for this M_CiudadanoBeps.
     * 
     * @return estadoCedula
     */
    public java.lang.String getEstadoCedula() {
        return estadoCedula;
    }


    /**
     * Sets the estadoCedula value for this M_CiudadanoBeps.
     * 
     * @param estadoCedula
     */
    public void setEstadoCedula(java.lang.String estadoCedula) {
        this.estadoCedula = estadoCedula;
    }


    /**
     * Gets the SNumeroResolucion value for this M_CiudadanoBeps.
     * 
     * @return SNumeroResolucion
     */
    public java.lang.String getSNumeroResolucion() {
        return SNumeroResolucion;
    }


    /**
     * Sets the SNumeroResolucion value for this M_CiudadanoBeps.
     * 
     * @param SNumeroResolucion
     */
    public void setSNumeroResolucion(java.lang.String SNumeroResolucion) {
        this.SNumeroResolucion = SNumeroResolucion;
    }


    /**
     * Gets the SAnoResolucion value for this M_CiudadanoBeps.
     * 
     * @return SAnoResolucion
     */
    public java.lang.String getSAnoResolucion() {
        return SAnoResolucion;
    }


    /**
     * Sets the SAnoResolucion value for this M_CiudadanoBeps.
     * 
     * @param SAnoResolucion
     */
    public void setSAnoResolucion(java.lang.String SAnoResolucion) {
        this.SAnoResolucion = SAnoResolucion;
    }


    /**
     * Gets the idP_Sexo value for this M_CiudadanoBeps.
     * 
     * @return idP_Sexo
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_Sexo getIdP_Sexo() {
        return idP_Sexo;
    }


    /**
     * Sets the idP_Sexo value for this M_CiudadanoBeps.
     * 
     * @param idP_Sexo
     */
    public void setIdP_Sexo(co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_Sexo idP_Sexo) {
        this.idP_Sexo = idP_Sexo;
    }


    /**
     * Gets the DFechaNacimiento value for this M_CiudadanoBeps.
     * 
     * @return DFechaNacimiento
     */
    public java.lang.String getDFechaNacimiento() {
        return DFechaNacimiento;
    }


    /**
     * Sets the DFechaNacimiento value for this M_CiudadanoBeps.
     * 
     * @param DFechaNacimiento
     */
    public void setDFechaNacimiento(java.lang.String DFechaNacimiento) {
        this.DFechaNacimiento = DFechaNacimiento;
    }


    /**
     * Gets the departamento_Nacimiento value for this M_CiudadanoBeps.
     * 
     * @return departamento_Nacimiento
     */
    public java.lang.String getDepartamento_Nacimiento() {
        return departamento_Nacimiento;
    }


    /**
     * Sets the departamento_Nacimiento value for this M_CiudadanoBeps.
     * 
     * @param departamento_Nacimiento
     */
    public void setDepartamento_Nacimiento(java.lang.String departamento_Nacimiento) {
        this.departamento_Nacimiento = departamento_Nacimiento;
    }


    /**
     * Gets the municipio_Nacimiento value for this M_CiudadanoBeps.
     * 
     * @return municipio_Nacimiento
     */
    public java.lang.String getMunicipio_Nacimiento() {
        return municipio_Nacimiento;
    }


    /**
     * Sets the municipio_Nacimiento value for this M_CiudadanoBeps.
     * 
     * @param municipio_Nacimiento
     */
    public void setMunicipio_Nacimiento(java.lang.String municipio_Nacimiento) {
        this.municipio_Nacimiento = municipio_Nacimiento;
    }


    /**
     * Gets the DFechaDefuncion value for this M_CiudadanoBeps.
     * 
     * @return DFechaDefuncion
     */
    public java.lang.String getDFechaDefuncion() {
        return DFechaDefuncion;
    }


    /**
     * Sets the DFechaDefuncion value for this M_CiudadanoBeps.
     * 
     * @param DFechaDefuncion
     */
    public void setDFechaDefuncion(java.lang.String DFechaDefuncion) {
        this.DFechaDefuncion = DFechaDefuncion;
    }


    /**
     * Gets the p_ViabilidadBEPS value for this M_CiudadanoBeps.
     * 
     * @return p_ViabilidadBEPS
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.P_ViabilidadBEPS getP_ViabilidadBEPS() {
        return p_ViabilidadBEPS;
    }


    /**
     * Sets the p_ViabilidadBEPS value for this M_CiudadanoBeps.
     * 
     * @param p_ViabilidadBEPS
     */
    public void setP_ViabilidadBEPS(co.gov.colpensiones.www.bdua.contracts._1_0.personas.P_ViabilidadBEPS p_ViabilidadBEPS) {
        this.p_ViabilidadBEPS = p_ViabilidadBEPS;
    }


    /**
     * Gets the informacionViablidad value for this M_CiudadanoBeps.
     * 
     * @return informacionViablidad
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.InformacionViablidad getInformacionViablidad() {
        return informacionViablidad;
    }


    /**
     * Sets the informacionViablidad value for this M_CiudadanoBeps.
     * 
     * @param informacionViablidad
     */
    public void setInformacionViablidad(co.gov.colpensiones.www.bdua.contracts._1_0.personas.InformacionViablidad informacionViablidad) {
        this.informacionViablidad = informacionViablidad;
    }


    /**
     * Gets the causalesNoViabilidadBEPS value for this M_CiudadanoBeps.
     * 
     * @return causalesNoViabilidadBEPS
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.CausalesNoViabilidad[] getCausalesNoViabilidadBEPS() {
        return causalesNoViabilidadBEPS;
    }


    /**
     * Sets the causalesNoViabilidadBEPS value for this M_CiudadanoBeps.
     * 
     * @param causalesNoViabilidadBEPS
     */
    public void setCausalesNoViabilidadBEPS(co.gov.colpensiones.www.bdua.contracts._1_0.personas.CausalesNoViabilidad[] causalesNoViabilidadBEPS) {
        this.causalesNoViabilidadBEPS = causalesNoViabilidadBEPS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof M_CiudadanoBeps)) return false;
        M_CiudadanoBeps other = (M_CiudadanoBeps) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idP_TipoDocumento==null && other.getIdP_TipoDocumento()==null) || 
             (this.idP_TipoDocumento!=null &&
              this.idP_TipoDocumento.equals(other.getIdP_TipoDocumento()))) &&
            ((this.SNumeroIdentificacion==null && other.getSNumeroIdentificacion()==null) || 
             (this.SNumeroIdentificacion!=null &&
              this.SNumeroIdentificacion.equals(other.getSNumeroIdentificacion()))) &&
            ((this.SPrimerApellido==null && other.getSPrimerApellido()==null) || 
             (this.SPrimerApellido!=null &&
              this.SPrimerApellido.equals(other.getSPrimerApellido()))) &&
            ((this.SSegundoApellido==null && other.getSSegundoApellido()==null) || 
             (this.SSegundoApellido!=null &&
              this.SSegundoApellido.equals(other.getSSegundoApellido()))) &&
            ((this.SPrimerNombre==null && other.getSPrimerNombre()==null) || 
             (this.SPrimerNombre!=null &&
              this.SPrimerNombre.equals(other.getSPrimerNombre()))) &&
            ((this.SSegundoNombre==null && other.getSSegundoNombre()==null) || 
             (this.SSegundoNombre!=null &&
              this.SSegundoNombre.equals(other.getSSegundoNombre()))) &&
            ((this.SParticula==null && other.getSParticula()==null) || 
             (this.SParticula!=null &&
              this.SParticula.equals(other.getSParticula()))) &&
            ((this.idP_MunicipioExp==null && other.getIdP_MunicipioExp()==null) || 
             (this.idP_MunicipioExp!=null &&
              this.idP_MunicipioExp.equals(other.getIdP_MunicipioExp()))) &&
            ((this.DFechaExpedicion==null && other.getDFechaExpedicion()==null) || 
             (this.DFechaExpedicion!=null &&
              this.DFechaExpedicion.equals(other.getDFechaExpedicion()))) &&
            ((this.estadoCedula==null && other.getEstadoCedula()==null) || 
             (this.estadoCedula!=null &&
              this.estadoCedula.equals(other.getEstadoCedula()))) &&
            ((this.SNumeroResolucion==null && other.getSNumeroResolucion()==null) || 
             (this.SNumeroResolucion!=null &&
              this.SNumeroResolucion.equals(other.getSNumeroResolucion()))) &&
            ((this.SAnoResolucion==null && other.getSAnoResolucion()==null) || 
             (this.SAnoResolucion!=null &&
              this.SAnoResolucion.equals(other.getSAnoResolucion()))) &&
            ((this.idP_Sexo==null && other.getIdP_Sexo()==null) || 
             (this.idP_Sexo!=null &&
              this.idP_Sexo.equals(other.getIdP_Sexo()))) &&
            ((this.DFechaNacimiento==null && other.getDFechaNacimiento()==null) || 
             (this.DFechaNacimiento!=null &&
              this.DFechaNacimiento.equals(other.getDFechaNacimiento()))) &&
            ((this.departamento_Nacimiento==null && other.getDepartamento_Nacimiento()==null) || 
             (this.departamento_Nacimiento!=null &&
              this.departamento_Nacimiento.equals(other.getDepartamento_Nacimiento()))) &&
            ((this.municipio_Nacimiento==null && other.getMunicipio_Nacimiento()==null) || 
             (this.municipio_Nacimiento!=null &&
              this.municipio_Nacimiento.equals(other.getMunicipio_Nacimiento()))) &&
            ((this.DFechaDefuncion==null && other.getDFechaDefuncion()==null) || 
             (this.DFechaDefuncion!=null &&
              this.DFechaDefuncion.equals(other.getDFechaDefuncion()))) &&
            ((this.p_ViabilidadBEPS==null && other.getP_ViabilidadBEPS()==null) || 
             (this.p_ViabilidadBEPS!=null &&
              this.p_ViabilidadBEPS.equals(other.getP_ViabilidadBEPS()))) &&
            ((this.informacionViablidad==null && other.getInformacionViablidad()==null) || 
             (this.informacionViablidad!=null &&
              this.informacionViablidad.equals(other.getInformacionViablidad()))) &&
            ((this.causalesNoViabilidadBEPS==null && other.getCausalesNoViabilidadBEPS()==null) || 
             (this.causalesNoViabilidadBEPS!=null &&
              java.util.Arrays.equals(this.causalesNoViabilidadBEPS, other.getCausalesNoViabilidadBEPS())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdP_TipoDocumento() != null) {
            _hashCode += getIdP_TipoDocumento().hashCode();
        }
        if (getSNumeroIdentificacion() != null) {
            _hashCode += getSNumeroIdentificacion().hashCode();
        }
        if (getSPrimerApellido() != null) {
            _hashCode += getSPrimerApellido().hashCode();
        }
        if (getSSegundoApellido() != null) {
            _hashCode += getSSegundoApellido().hashCode();
        }
        if (getSPrimerNombre() != null) {
            _hashCode += getSPrimerNombre().hashCode();
        }
        if (getSSegundoNombre() != null) {
            _hashCode += getSSegundoNombre().hashCode();
        }
        if (getSParticula() != null) {
            _hashCode += getSParticula().hashCode();
        }
        if (getIdP_MunicipioExp() != null) {
            _hashCode += getIdP_MunicipioExp().hashCode();
        }
        if (getDFechaExpedicion() != null) {
            _hashCode += getDFechaExpedicion().hashCode();
        }
        if (getEstadoCedula() != null) {
            _hashCode += getEstadoCedula().hashCode();
        }
        if (getSNumeroResolucion() != null) {
            _hashCode += getSNumeroResolucion().hashCode();
        }
        if (getSAnoResolucion() != null) {
            _hashCode += getSAnoResolucion().hashCode();
        }
        if (getIdP_Sexo() != null) {
            _hashCode += getIdP_Sexo().hashCode();
        }
        if (getDFechaNacimiento() != null) {
            _hashCode += getDFechaNacimiento().hashCode();
        }
        if (getDepartamento_Nacimiento() != null) {
            _hashCode += getDepartamento_Nacimiento().hashCode();
        }
        if (getMunicipio_Nacimiento() != null) {
            _hashCode += getMunicipio_Nacimiento().hashCode();
        }
        if (getDFechaDefuncion() != null) {
            _hashCode += getDFechaDefuncion().hashCode();
        }
        if (getP_ViabilidadBEPS() != null) {
            _hashCode += getP_ViabilidadBEPS().hashCode();
        }
        if (getInformacionViablidad() != null) {
            _hashCode += getInformacionViablidad().hashCode();
        }
        if (getCausalesNoViabilidadBEPS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCausalesNoViabilidadBEPS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCausalesNoViabilidadBEPS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(M_CiudadanoBeps.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "M_CiudadanoBeps"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_TipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdP_TipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "IdP_TipoDocumento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNumeroIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SNumeroIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPrimerApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SPrimerApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSegundoApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSegundoApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPrimerNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SPrimerNombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSegundoNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSegundoNombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SParticula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SParticula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_MunicipioExp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdP_MunicipioExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "IdP_MunicipioExp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaExpedicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaExpedicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anySimpleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCedula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EstadoCedula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNumeroResolucion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SNumeroResolucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAnoResolucion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAnoResolucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_Sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdP_Sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "IdP_Sexo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anySimpleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departamento_Nacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Departamento_Nacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipio_Nacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "municipio_Nacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaDefuncion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaDefuncion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anySimpleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p_ViabilidadBEPS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "P_ViabilidadBEPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "P_ViabilidadBEPS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacionViablidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InformacionViablidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "informacionViablidad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causalesNoViabilidadBEPS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CausalesNoViabilidadBEPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "CausalesNoViabilidad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CausalesNoViabilidad"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
