/**
 * M_CiudadanoBDUA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class M_CiudadanoBDUA  implements java.io.Serializable {
    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoDocumento idP_TipoDocumento;

    private java.lang.String SNumeroIdentificacion;

    private java.lang.String SPrimerApellido;

    private java.lang.String SSegundoApellido;

    private java.lang.String SPrimerNombre;

    private java.lang.String SSegundoNombre;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_Sexo idP_Sexo;

    private java.lang.String DFechaNacimiento;

    private java.lang.String estadoCedula;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_RegimenAfiliacion idP_RegimenAfiliacion;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_EPS idP_EPS;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_InformacionBDUA m_InformacionBDUA;

    private java.lang.String DFechaAfiliacionEntidad;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoAfiliado idP_TipoAfiliado;

    private java.lang.String codigoEstadoConsulta;

    private java.lang.String descripcionEstadoConsulta;

    public M_CiudadanoBDUA() {
    }

    public M_CiudadanoBDUA(
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoDocumento idP_TipoDocumento,
           java.lang.String SNumeroIdentificacion,
           java.lang.String SPrimerApellido,
           java.lang.String SSegundoApellido,
           java.lang.String SPrimerNombre,
           java.lang.String SSegundoNombre,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_Sexo idP_Sexo,
           java.lang.String DFechaNacimiento,
           java.lang.String estadoCedula,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_RegimenAfiliacion idP_RegimenAfiliacion,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_EPS idP_EPS,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_InformacionBDUA m_InformacionBDUA,
           java.lang.String DFechaAfiliacionEntidad,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoAfiliado idP_TipoAfiliado,
           java.lang.String codigoEstadoConsulta,
           java.lang.String descripcionEstadoConsulta) {
           this.idP_TipoDocumento = idP_TipoDocumento;
           this.SNumeroIdentificacion = SNumeroIdentificacion;
           this.SPrimerApellido = SPrimerApellido;
           this.SSegundoApellido = SSegundoApellido;
           this.SPrimerNombre = SPrimerNombre;
           this.SSegundoNombre = SSegundoNombre;
           this.idP_Sexo = idP_Sexo;
           this.DFechaNacimiento = DFechaNacimiento;
           this.estadoCedula = estadoCedula;
           this.idP_RegimenAfiliacion = idP_RegimenAfiliacion;
           this.idP_EPS = idP_EPS;
           this.m_InformacionBDUA = m_InformacionBDUA;
           this.DFechaAfiliacionEntidad = DFechaAfiliacionEntidad;
           this.idP_TipoAfiliado = idP_TipoAfiliado;
           this.codigoEstadoConsulta = codigoEstadoConsulta;
           this.descripcionEstadoConsulta = descripcionEstadoConsulta;
    }


    /**
     * Gets the idP_TipoDocumento value for this M_CiudadanoBDUA.
     * 
     * @return idP_TipoDocumento
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoDocumento getIdP_TipoDocumento() {
        return idP_TipoDocumento;
    }


    /**
     * Sets the idP_TipoDocumento value for this M_CiudadanoBDUA.
     * 
     * @param idP_TipoDocumento
     */
    public void setIdP_TipoDocumento(co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoDocumento idP_TipoDocumento) {
        this.idP_TipoDocumento = idP_TipoDocumento;
    }


    /**
     * Gets the SNumeroIdentificacion value for this M_CiudadanoBDUA.
     * 
     * @return SNumeroIdentificacion
     */
    public java.lang.String getSNumeroIdentificacion() {
        return SNumeroIdentificacion;
    }


    /**
     * Sets the SNumeroIdentificacion value for this M_CiudadanoBDUA.
     * 
     * @param SNumeroIdentificacion
     */
    public void setSNumeroIdentificacion(java.lang.String SNumeroIdentificacion) {
        this.SNumeroIdentificacion = SNumeroIdentificacion;
    }


    /**
     * Gets the SPrimerApellido value for this M_CiudadanoBDUA.
     * 
     * @return SPrimerApellido
     */
    public java.lang.String getSPrimerApellido() {
        return SPrimerApellido;
    }


    /**
     * Sets the SPrimerApellido value for this M_CiudadanoBDUA.
     * 
     * @param SPrimerApellido
     */
    public void setSPrimerApellido(java.lang.String SPrimerApellido) {
        this.SPrimerApellido = SPrimerApellido;
    }


    /**
     * Gets the SSegundoApellido value for this M_CiudadanoBDUA.
     * 
     * @return SSegundoApellido
     */
    public java.lang.String getSSegundoApellido() {
        return SSegundoApellido;
    }


    /**
     * Sets the SSegundoApellido value for this M_CiudadanoBDUA.
     * 
     * @param SSegundoApellido
     */
    public void setSSegundoApellido(java.lang.String SSegundoApellido) {
        this.SSegundoApellido = SSegundoApellido;
    }


    /**
     * Gets the SPrimerNombre value for this M_CiudadanoBDUA.
     * 
     * @return SPrimerNombre
     */
    public java.lang.String getSPrimerNombre() {
        return SPrimerNombre;
    }


    /**
     * Sets the SPrimerNombre value for this M_CiudadanoBDUA.
     * 
     * @param SPrimerNombre
     */
    public void setSPrimerNombre(java.lang.String SPrimerNombre) {
        this.SPrimerNombre = SPrimerNombre;
    }


    /**
     * Gets the SSegundoNombre value for this M_CiudadanoBDUA.
     * 
     * @return SSegundoNombre
     */
    public java.lang.String getSSegundoNombre() {
        return SSegundoNombre;
    }


    /**
     * Sets the SSegundoNombre value for this M_CiudadanoBDUA.
     * 
     * @param SSegundoNombre
     */
    public void setSSegundoNombre(java.lang.String SSegundoNombre) {
        this.SSegundoNombre = SSegundoNombre;
    }


    /**
     * Gets the idP_Sexo value for this M_CiudadanoBDUA.
     * 
     * @return idP_Sexo
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_Sexo getIdP_Sexo() {
        return idP_Sexo;
    }


    /**
     * Sets the idP_Sexo value for this M_CiudadanoBDUA.
     * 
     * @param idP_Sexo
     */
    public void setIdP_Sexo(co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_Sexo idP_Sexo) {
        this.idP_Sexo = idP_Sexo;
    }


    /**
     * Gets the DFechaNacimiento value for this M_CiudadanoBDUA.
     * 
     * @return DFechaNacimiento
     */
    public java.lang.String getDFechaNacimiento() {
        return DFechaNacimiento;
    }


    /**
     * Sets the DFechaNacimiento value for this M_CiudadanoBDUA.
     * 
     * @param DFechaNacimiento
     */
    public void setDFechaNacimiento(java.lang.String DFechaNacimiento) {
        this.DFechaNacimiento = DFechaNacimiento;
    }


    /**
     * Gets the estadoCedula value for this M_CiudadanoBDUA.
     * 
     * @return estadoCedula
     */
    public java.lang.String getEstadoCedula() {
        return estadoCedula;
    }


    /**
     * Sets the estadoCedula value for this M_CiudadanoBDUA.
     * 
     * @param estadoCedula
     */
    public void setEstadoCedula(java.lang.String estadoCedula) {
        this.estadoCedula = estadoCedula;
    }


    /**
     * Gets the idP_RegimenAfiliacion value for this M_CiudadanoBDUA.
     * 
     * @return idP_RegimenAfiliacion
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_RegimenAfiliacion getIdP_RegimenAfiliacion() {
        return idP_RegimenAfiliacion;
    }


    /**
     * Sets the idP_RegimenAfiliacion value for this M_CiudadanoBDUA.
     * 
     * @param idP_RegimenAfiliacion
     */
    public void setIdP_RegimenAfiliacion(co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_RegimenAfiliacion idP_RegimenAfiliacion) {
        this.idP_RegimenAfiliacion = idP_RegimenAfiliacion;
    }


    /**
     * Gets the idP_EPS value for this M_CiudadanoBDUA.
     * 
     * @return idP_EPS
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_EPS getIdP_EPS() {
        return idP_EPS;
    }


    /**
     * Sets the idP_EPS value for this M_CiudadanoBDUA.
     * 
     * @param idP_EPS
     */
    public void setIdP_EPS(co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_EPS idP_EPS) {
        this.idP_EPS = idP_EPS;
    }


    /**
     * Gets the m_InformacionBDUA value for this M_CiudadanoBDUA.
     * 
     * @return m_InformacionBDUA
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_InformacionBDUA getM_InformacionBDUA() {
        return m_InformacionBDUA;
    }


    /**
     * Sets the m_InformacionBDUA value for this M_CiudadanoBDUA.
     * 
     * @param m_InformacionBDUA
     */
    public void setM_InformacionBDUA(co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_InformacionBDUA m_InformacionBDUA) {
        this.m_InformacionBDUA = m_InformacionBDUA;
    }


    /**
     * Gets the DFechaAfiliacionEntidad value for this M_CiudadanoBDUA.
     * 
     * @return DFechaAfiliacionEntidad
     */
    public java.lang.String getDFechaAfiliacionEntidad() {
        return DFechaAfiliacionEntidad;
    }


    /**
     * Sets the DFechaAfiliacionEntidad value for this M_CiudadanoBDUA.
     * 
     * @param DFechaAfiliacionEntidad
     */
    public void setDFechaAfiliacionEntidad(java.lang.String DFechaAfiliacionEntidad) {
        this.DFechaAfiliacionEntidad = DFechaAfiliacionEntidad;
    }


    /**
     * Gets the idP_TipoAfiliado value for this M_CiudadanoBDUA.
     * 
     * @return idP_TipoAfiliado
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoAfiliado getIdP_TipoAfiliado() {
        return idP_TipoAfiliado;
    }


    /**
     * Sets the idP_TipoAfiliado value for this M_CiudadanoBDUA.
     * 
     * @param idP_TipoAfiliado
     */
    public void setIdP_TipoAfiliado(co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdP_TipoAfiliado idP_TipoAfiliado) {
        this.idP_TipoAfiliado = idP_TipoAfiliado;
    }


    /**
     * Gets the codigoEstadoConsulta value for this M_CiudadanoBDUA.
     * 
     * @return codigoEstadoConsulta
     */
    public java.lang.String getCodigoEstadoConsulta() {
        return codigoEstadoConsulta;
    }


    /**
     * Sets the codigoEstadoConsulta value for this M_CiudadanoBDUA.
     * 
     * @param codigoEstadoConsulta
     */
    public void setCodigoEstadoConsulta(java.lang.String codigoEstadoConsulta) {
        this.codigoEstadoConsulta = codigoEstadoConsulta;
    }


    /**
     * Gets the descripcionEstadoConsulta value for this M_CiudadanoBDUA.
     * 
     * @return descripcionEstadoConsulta
     */
    public java.lang.String getDescripcionEstadoConsulta() {
        return descripcionEstadoConsulta;
    }


    /**
     * Sets the descripcionEstadoConsulta value for this M_CiudadanoBDUA.
     * 
     * @param descripcionEstadoConsulta
     */
    public void setDescripcionEstadoConsulta(java.lang.String descripcionEstadoConsulta) {
        this.descripcionEstadoConsulta = descripcionEstadoConsulta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof M_CiudadanoBDUA)) return false;
        M_CiudadanoBDUA other = (M_CiudadanoBDUA) obj;
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
            ((this.idP_Sexo==null && other.getIdP_Sexo()==null) || 
             (this.idP_Sexo!=null &&
              this.idP_Sexo.equals(other.getIdP_Sexo()))) &&
            ((this.DFechaNacimiento==null && other.getDFechaNacimiento()==null) || 
             (this.DFechaNacimiento!=null &&
              this.DFechaNacimiento.equals(other.getDFechaNacimiento()))) &&
            ((this.estadoCedula==null && other.getEstadoCedula()==null) || 
             (this.estadoCedula!=null &&
              this.estadoCedula.equals(other.getEstadoCedula()))) &&
            ((this.idP_RegimenAfiliacion==null && other.getIdP_RegimenAfiliacion()==null) || 
             (this.idP_RegimenAfiliacion!=null &&
              this.idP_RegimenAfiliacion.equals(other.getIdP_RegimenAfiliacion()))) &&
            ((this.idP_EPS==null && other.getIdP_EPS()==null) || 
             (this.idP_EPS!=null &&
              this.idP_EPS.equals(other.getIdP_EPS()))) &&
            ((this.m_InformacionBDUA==null && other.getM_InformacionBDUA()==null) || 
             (this.m_InformacionBDUA!=null &&
              this.m_InformacionBDUA.equals(other.getM_InformacionBDUA()))) &&
            ((this.DFechaAfiliacionEntidad==null && other.getDFechaAfiliacionEntidad()==null) || 
             (this.DFechaAfiliacionEntidad!=null &&
              this.DFechaAfiliacionEntidad.equals(other.getDFechaAfiliacionEntidad()))) &&
            ((this.idP_TipoAfiliado==null && other.getIdP_TipoAfiliado()==null) || 
             (this.idP_TipoAfiliado!=null &&
              this.idP_TipoAfiliado.equals(other.getIdP_TipoAfiliado()))) &&
            ((this.codigoEstadoConsulta==null && other.getCodigoEstadoConsulta()==null) || 
             (this.codigoEstadoConsulta!=null &&
              this.codigoEstadoConsulta.equals(other.getCodigoEstadoConsulta()))) &&
            ((this.descripcionEstadoConsulta==null && other.getDescripcionEstadoConsulta()==null) || 
             (this.descripcionEstadoConsulta!=null &&
              this.descripcionEstadoConsulta.equals(other.getDescripcionEstadoConsulta())));
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
        if (getIdP_Sexo() != null) {
            _hashCode += getIdP_Sexo().hashCode();
        }
        if (getDFechaNacimiento() != null) {
            _hashCode += getDFechaNacimiento().hashCode();
        }
        if (getEstadoCedula() != null) {
            _hashCode += getEstadoCedula().hashCode();
        }
        if (getIdP_RegimenAfiliacion() != null) {
            _hashCode += getIdP_RegimenAfiliacion().hashCode();
        }
        if (getIdP_EPS() != null) {
            _hashCode += getIdP_EPS().hashCode();
        }
        if (getM_InformacionBDUA() != null) {
            _hashCode += getM_InformacionBDUA().hashCode();
        }
        if (getDFechaAfiliacionEntidad() != null) {
            _hashCode += getDFechaAfiliacionEntidad().hashCode();
        }
        if (getIdP_TipoAfiliado() != null) {
            _hashCode += getIdP_TipoAfiliado().hashCode();
        }
        if (getCodigoEstadoConsulta() != null) {
            _hashCode += getCodigoEstadoConsulta().hashCode();
        }
        if (getDescripcionEstadoConsulta() != null) {
            _hashCode += getDescripcionEstadoConsulta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(M_CiudadanoBDUA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "M_CiudadanoBDUA"));
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
        elemField.setFieldName("estadoCedula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EstadoCedula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_RegimenAfiliacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdP_RegimenAfiliacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "IdP_RegimenAfiliacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_EPS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdP_EPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "IdP_EPS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_InformacionBDUA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "M_InformacionBDUA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "M_InformacionBDUA"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaAfiliacionEntidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaAfiliacionEntidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anySimpleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_TipoAfiliado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdP_TipoAfiliado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "IdP_TipoAfiliado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEstadoConsulta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEstadoConsulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionEstadoConsulta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionEstadoConsulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
