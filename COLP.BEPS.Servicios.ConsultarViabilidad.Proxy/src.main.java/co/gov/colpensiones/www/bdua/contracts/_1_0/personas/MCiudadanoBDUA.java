/**
 * MCiudadanoBDUA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class MCiudadanoBDUA  implements java.io.Serializable {
    private java.util.Calendar DFechaAfiliacionEntidad;

    private java.util.Calendar DFechaNacimiento;

    private java.lang.String estadoCedula;

    private java.lang.String idP_EPS;

    private java.lang.String idP_RegimenAfiliacion;

    private java.lang.String idP_Sexo;

    private java.lang.String idP_TipoAfiliado;

    private java.lang.String idP_TipoDocumento;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.MInformacionBDUA m_InformacionBDUA;

    private java.lang.String SNumeroIdentificacion;

    private java.lang.String SPrimerApellido;

    private java.lang.String SPrimerNombre;

    private java.lang.String SSegundoApellido;

    private java.lang.String SSegundoNombre;

    public MCiudadanoBDUA() {
    }

    public MCiudadanoBDUA(
           java.util.Calendar DFechaAfiliacionEntidad,
           java.util.Calendar DFechaNacimiento,
           java.lang.String estadoCedula,
           java.lang.String idP_EPS,
           java.lang.String idP_RegimenAfiliacion,
           java.lang.String idP_Sexo,
           java.lang.String idP_TipoAfiliado,
           java.lang.String idP_TipoDocumento,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.MInformacionBDUA m_InformacionBDUA,
           java.lang.String SNumeroIdentificacion,
           java.lang.String SPrimerApellido,
           java.lang.String SPrimerNombre,
           java.lang.String SSegundoApellido,
           java.lang.String SSegundoNombre) {
           this.DFechaAfiliacionEntidad = DFechaAfiliacionEntidad;
           this.DFechaNacimiento = DFechaNacimiento;
           this.estadoCedula = estadoCedula;
           this.idP_EPS = idP_EPS;
           this.idP_RegimenAfiliacion = idP_RegimenAfiliacion;
           this.idP_Sexo = idP_Sexo;
           this.idP_TipoAfiliado = idP_TipoAfiliado;
           this.idP_TipoDocumento = idP_TipoDocumento;
           this.m_InformacionBDUA = m_InformacionBDUA;
           this.SNumeroIdentificacion = SNumeroIdentificacion;
           this.SPrimerApellido = SPrimerApellido;
           this.SPrimerNombre = SPrimerNombre;
           this.SSegundoApellido = SSegundoApellido;
           this.SSegundoNombre = SSegundoNombre;
    }


    /**
     * Gets the DFechaAfiliacionEntidad value for this MCiudadanoBDUA.
     * 
     * @return DFechaAfiliacionEntidad
     */
    public java.util.Calendar getDFechaAfiliacionEntidad() {
        return DFechaAfiliacionEntidad;
    }


    /**
     * Sets the DFechaAfiliacionEntidad value for this MCiudadanoBDUA.
     * 
     * @param DFechaAfiliacionEntidad
     */
    public void setDFechaAfiliacionEntidad(java.util.Calendar DFechaAfiliacionEntidad) {
        this.DFechaAfiliacionEntidad = DFechaAfiliacionEntidad;
    }


    /**
     * Gets the DFechaNacimiento value for this MCiudadanoBDUA.
     * 
     * @return DFechaNacimiento
     */
    public java.util.Calendar getDFechaNacimiento() {
        return DFechaNacimiento;
    }


    /**
     * Sets the DFechaNacimiento value for this MCiudadanoBDUA.
     * 
     * @param DFechaNacimiento
     */
    public void setDFechaNacimiento(java.util.Calendar DFechaNacimiento) {
        this.DFechaNacimiento = DFechaNacimiento;
    }


    /**
     * Gets the estadoCedula value for this MCiudadanoBDUA.
     * 
     * @return estadoCedula
     */
    public java.lang.String getEstadoCedula() {
        return estadoCedula;
    }


    /**
     * Sets the estadoCedula value for this MCiudadanoBDUA.
     * 
     * @param estadoCedula
     */
    public void setEstadoCedula(java.lang.String estadoCedula) {
        this.estadoCedula = estadoCedula;
    }


    /**
     * Gets the idP_EPS value for this MCiudadanoBDUA.
     * 
     * @return idP_EPS
     */
    public java.lang.String getIdP_EPS() {
        return idP_EPS;
    }


    /**
     * Sets the idP_EPS value for this MCiudadanoBDUA.
     * 
     * @param idP_EPS
     */
    public void setIdP_EPS(java.lang.String idP_EPS) {
        this.idP_EPS = idP_EPS;
    }


    /**
     * Gets the idP_RegimenAfiliacion value for this MCiudadanoBDUA.
     * 
     * @return idP_RegimenAfiliacion
     */
    public java.lang.String getIdP_RegimenAfiliacion() {
        return idP_RegimenAfiliacion;
    }


    /**
     * Sets the idP_RegimenAfiliacion value for this MCiudadanoBDUA.
     * 
     * @param idP_RegimenAfiliacion
     */
    public void setIdP_RegimenAfiliacion(java.lang.String idP_RegimenAfiliacion) {
        this.idP_RegimenAfiliacion = idP_RegimenAfiliacion;
    }


    /**
     * Gets the idP_Sexo value for this MCiudadanoBDUA.
     * 
     * @return idP_Sexo
     */
    public java.lang.String getIdP_Sexo() {
        return idP_Sexo;
    }


    /**
     * Sets the idP_Sexo value for this MCiudadanoBDUA.
     * 
     * @param idP_Sexo
     */
    public void setIdP_Sexo(java.lang.String idP_Sexo) {
        this.idP_Sexo = idP_Sexo;
    }


    /**
     * Gets the idP_TipoAfiliado value for this MCiudadanoBDUA.
     * 
     * @return idP_TipoAfiliado
     */
    public java.lang.String getIdP_TipoAfiliado() {
        return idP_TipoAfiliado;
    }


    /**
     * Sets the idP_TipoAfiliado value for this MCiudadanoBDUA.
     * 
     * @param idP_TipoAfiliado
     */
    public void setIdP_TipoAfiliado(java.lang.String idP_TipoAfiliado) {
        this.idP_TipoAfiliado = idP_TipoAfiliado;
    }


    /**
     * Gets the idP_TipoDocumento value for this MCiudadanoBDUA.
     * 
     * @return idP_TipoDocumento
     */
    public java.lang.String getIdP_TipoDocumento() {
        return idP_TipoDocumento;
    }


    /**
     * Sets the idP_TipoDocumento value for this MCiudadanoBDUA.
     * 
     * @param idP_TipoDocumento
     */
    public void setIdP_TipoDocumento(java.lang.String idP_TipoDocumento) {
        this.idP_TipoDocumento = idP_TipoDocumento;
    }


    /**
     * Gets the m_InformacionBDUA value for this MCiudadanoBDUA.
     * 
     * @return m_InformacionBDUA
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.MInformacionBDUA getM_InformacionBDUA() {
        return m_InformacionBDUA;
    }


    /**
     * Sets the m_InformacionBDUA value for this MCiudadanoBDUA.
     * 
     * @param m_InformacionBDUA
     */
    public void setM_InformacionBDUA(co.gov.colpensiones.www.bdua.contracts._1_0.personas.MInformacionBDUA m_InformacionBDUA) {
        this.m_InformacionBDUA = m_InformacionBDUA;
    }


    /**
     * Gets the SNumeroIdentificacion value for this MCiudadanoBDUA.
     * 
     * @return SNumeroIdentificacion
     */
    public java.lang.String getSNumeroIdentificacion() {
        return SNumeroIdentificacion;
    }


    /**
     * Sets the SNumeroIdentificacion value for this MCiudadanoBDUA.
     * 
     * @param SNumeroIdentificacion
     */
    public void setSNumeroIdentificacion(java.lang.String SNumeroIdentificacion) {
        this.SNumeroIdentificacion = SNumeroIdentificacion;
    }


    /**
     * Gets the SPrimerApellido value for this MCiudadanoBDUA.
     * 
     * @return SPrimerApellido
     */
    public java.lang.String getSPrimerApellido() {
        return SPrimerApellido;
    }


    /**
     * Sets the SPrimerApellido value for this MCiudadanoBDUA.
     * 
     * @param SPrimerApellido
     */
    public void setSPrimerApellido(java.lang.String SPrimerApellido) {
        this.SPrimerApellido = SPrimerApellido;
    }


    /**
     * Gets the SPrimerNombre value for this MCiudadanoBDUA.
     * 
     * @return SPrimerNombre
     */
    public java.lang.String getSPrimerNombre() {
        return SPrimerNombre;
    }


    /**
     * Sets the SPrimerNombre value for this MCiudadanoBDUA.
     * 
     * @param SPrimerNombre
     */
    public void setSPrimerNombre(java.lang.String SPrimerNombre) {
        this.SPrimerNombre = SPrimerNombre;
    }


    /**
     * Gets the SSegundoApellido value for this MCiudadanoBDUA.
     * 
     * @return SSegundoApellido
     */
    public java.lang.String getSSegundoApellido() {
        return SSegundoApellido;
    }


    /**
     * Sets the SSegundoApellido value for this MCiudadanoBDUA.
     * 
     * @param SSegundoApellido
     */
    public void setSSegundoApellido(java.lang.String SSegundoApellido) {
        this.SSegundoApellido = SSegundoApellido;
    }


    /**
     * Gets the SSegundoNombre value for this MCiudadanoBDUA.
     * 
     * @return SSegundoNombre
     */
    public java.lang.String getSSegundoNombre() {
        return SSegundoNombre;
    }


    /**
     * Sets the SSegundoNombre value for this MCiudadanoBDUA.
     * 
     * @param SSegundoNombre
     */
    public void setSSegundoNombre(java.lang.String SSegundoNombre) {
        this.SSegundoNombre = SSegundoNombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MCiudadanoBDUA)) return false;
        MCiudadanoBDUA other = (MCiudadanoBDUA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DFechaAfiliacionEntidad==null && other.getDFechaAfiliacionEntidad()==null) || 
             (this.DFechaAfiliacionEntidad!=null &&
              this.DFechaAfiliacionEntidad.equals(other.getDFechaAfiliacionEntidad()))) &&
            ((this.DFechaNacimiento==null && other.getDFechaNacimiento()==null) || 
             (this.DFechaNacimiento!=null &&
              this.DFechaNacimiento.equals(other.getDFechaNacimiento()))) &&
            ((this.estadoCedula==null && other.getEstadoCedula()==null) || 
             (this.estadoCedula!=null &&
              this.estadoCedula.equals(other.getEstadoCedula()))) &&
            ((this.idP_EPS==null && other.getIdP_EPS()==null) || 
             (this.idP_EPS!=null &&
              this.idP_EPS.equals(other.getIdP_EPS()))) &&
            ((this.idP_RegimenAfiliacion==null && other.getIdP_RegimenAfiliacion()==null) || 
             (this.idP_RegimenAfiliacion!=null &&
              this.idP_RegimenAfiliacion.equals(other.getIdP_RegimenAfiliacion()))) &&
            ((this.idP_Sexo==null && other.getIdP_Sexo()==null) || 
             (this.idP_Sexo!=null &&
              this.idP_Sexo.equals(other.getIdP_Sexo()))) &&
            ((this.idP_TipoAfiliado==null && other.getIdP_TipoAfiliado()==null) || 
             (this.idP_TipoAfiliado!=null &&
              this.idP_TipoAfiliado.equals(other.getIdP_TipoAfiliado()))) &&
            ((this.idP_TipoDocumento==null && other.getIdP_TipoDocumento()==null) || 
             (this.idP_TipoDocumento!=null &&
              this.idP_TipoDocumento.equals(other.getIdP_TipoDocumento()))) &&
            ((this.m_InformacionBDUA==null && other.getM_InformacionBDUA()==null) || 
             (this.m_InformacionBDUA!=null &&
              this.m_InformacionBDUA.equals(other.getM_InformacionBDUA()))) &&
            ((this.SNumeroIdentificacion==null && other.getSNumeroIdentificacion()==null) || 
             (this.SNumeroIdentificacion!=null &&
              this.SNumeroIdentificacion.equals(other.getSNumeroIdentificacion()))) &&
            ((this.SPrimerApellido==null && other.getSPrimerApellido()==null) || 
             (this.SPrimerApellido!=null &&
              this.SPrimerApellido.equals(other.getSPrimerApellido()))) &&
            ((this.SPrimerNombre==null && other.getSPrimerNombre()==null) || 
             (this.SPrimerNombre!=null &&
              this.SPrimerNombre.equals(other.getSPrimerNombre()))) &&
            ((this.SSegundoApellido==null && other.getSSegundoApellido()==null) || 
             (this.SSegundoApellido!=null &&
              this.SSegundoApellido.equals(other.getSSegundoApellido()))) &&
            ((this.SSegundoNombre==null && other.getSSegundoNombre()==null) || 
             (this.SSegundoNombre!=null &&
              this.SSegundoNombre.equals(other.getSSegundoNombre())));
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
        if (getDFechaAfiliacionEntidad() != null) {
            _hashCode += getDFechaAfiliacionEntidad().hashCode();
        }
        if (getDFechaNacimiento() != null) {
            _hashCode += getDFechaNacimiento().hashCode();
        }
        if (getEstadoCedula() != null) {
            _hashCode += getEstadoCedula().hashCode();
        }
        if (getIdP_EPS() != null) {
            _hashCode += getIdP_EPS().hashCode();
        }
        if (getIdP_RegimenAfiliacion() != null) {
            _hashCode += getIdP_RegimenAfiliacion().hashCode();
        }
        if (getIdP_Sexo() != null) {
            _hashCode += getIdP_Sexo().hashCode();
        }
        if (getIdP_TipoAfiliado() != null) {
            _hashCode += getIdP_TipoAfiliado().hashCode();
        }
        if (getIdP_TipoDocumento() != null) {
            _hashCode += getIdP_TipoDocumento().hashCode();
        }
        if (getM_InformacionBDUA() != null) {
            _hashCode += getM_InformacionBDUA().hashCode();
        }
        if (getSNumeroIdentificacion() != null) {
            _hashCode += getSNumeroIdentificacion().hashCode();
        }
        if (getSPrimerApellido() != null) {
            _hashCode += getSPrimerApellido().hashCode();
        }
        if (getSPrimerNombre() != null) {
            _hashCode += getSPrimerNombre().hashCode();
        }
        if (getSSegundoApellido() != null) {
            _hashCode += getSSegundoApellido().hashCode();
        }
        if (getSSegundoNombre() != null) {
            _hashCode += getSSegundoNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MCiudadanoBDUA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanoBDUA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaAfiliacionEntidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaAfiliacionEntidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCedula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoCedula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_EPS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idP_EPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_RegimenAfiliacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idP_RegimenAfiliacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_Sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idP_Sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_TipoAfiliado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idP_TipoAfiliado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_TipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idP_TipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_InformacionBDUA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_InformacionBDUA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mInformacionBDUA"));
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
        elemField.setFieldName("SPrimerNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SPrimerNombre"));
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
        elemField.setFieldName("SSegundoNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSegundoNombre"));
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
