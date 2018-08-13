/**
 * M_CiudadanosConsultados.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class M_CiudadanosConsultados  implements java.io.Serializable {
    private java.lang.String SCodigoRespBDUA;

    private java.lang.String SDescripcionRespBDUA;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_CiudadanoBDUA m_CiudadanoBDUA;

    private java.lang.String SCodigoRespRegistraduria;

    private java.lang.String SDescripcionRespRegistra;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_CiudadanoRegistraduria m_CiudadanoRegistraduria;

    public M_CiudadanosConsultados() {
    }

    public M_CiudadanosConsultados(
           java.lang.String SCodigoRespBDUA,
           java.lang.String SDescripcionRespBDUA,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_CiudadanoBDUA m_CiudadanoBDUA,
           java.lang.String SCodigoRespRegistraduria,
           java.lang.String SDescripcionRespRegistra,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_CiudadanoRegistraduria m_CiudadanoRegistraduria) {
           this.SCodigoRespBDUA = SCodigoRespBDUA;
           this.SDescripcionRespBDUA = SDescripcionRespBDUA;
           this.m_CiudadanoBDUA = m_CiudadanoBDUA;
           this.SCodigoRespRegistraduria = SCodigoRespRegistraduria;
           this.SDescripcionRespRegistra = SDescripcionRespRegistra;
           this.m_CiudadanoRegistraduria = m_CiudadanoRegistraduria;
    }


    /**
     * Gets the SCodigoRespBDUA value for this M_CiudadanosConsultados.
     * 
     * @return SCodigoRespBDUA
     */
    public java.lang.String getSCodigoRespBDUA() {
        return SCodigoRespBDUA;
    }


    /**
     * Sets the SCodigoRespBDUA value for this M_CiudadanosConsultados.
     * 
     * @param SCodigoRespBDUA
     */
    public void setSCodigoRespBDUA(java.lang.String SCodigoRespBDUA) {
        this.SCodigoRespBDUA = SCodigoRespBDUA;
    }


    /**
     * Gets the SDescripcionRespBDUA value for this M_CiudadanosConsultados.
     * 
     * @return SDescripcionRespBDUA
     */
    public java.lang.String getSDescripcionRespBDUA() {
        return SDescripcionRespBDUA;
    }


    /**
     * Sets the SDescripcionRespBDUA value for this M_CiudadanosConsultados.
     * 
     * @param SDescripcionRespBDUA
     */
    public void setSDescripcionRespBDUA(java.lang.String SDescripcionRespBDUA) {
        this.SDescripcionRespBDUA = SDescripcionRespBDUA;
    }


    /**
     * Gets the m_CiudadanoBDUA value for this M_CiudadanosConsultados.
     * 
     * @return m_CiudadanoBDUA
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_CiudadanoBDUA getM_CiudadanoBDUA() {
        return m_CiudadanoBDUA;
    }


    /**
     * Sets the m_CiudadanoBDUA value for this M_CiudadanosConsultados.
     * 
     * @param m_CiudadanoBDUA
     */
    public void setM_CiudadanoBDUA(co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_CiudadanoBDUA m_CiudadanoBDUA) {
        this.m_CiudadanoBDUA = m_CiudadanoBDUA;
    }


    /**
     * Gets the SCodigoRespRegistraduria value for this M_CiudadanosConsultados.
     * 
     * @return SCodigoRespRegistraduria
     */
    public java.lang.String getSCodigoRespRegistraduria() {
        return SCodigoRespRegistraduria;
    }


    /**
     * Sets the SCodigoRespRegistraduria value for this M_CiudadanosConsultados.
     * 
     * @param SCodigoRespRegistraduria
     */
    public void setSCodigoRespRegistraduria(java.lang.String SCodigoRespRegistraduria) {
        this.SCodigoRespRegistraduria = SCodigoRespRegistraduria;
    }


    /**
     * Gets the SDescripcionRespRegistra value for this M_CiudadanosConsultados.
     * 
     * @return SDescripcionRespRegistra
     */
    public java.lang.String getSDescripcionRespRegistra() {
        return SDescripcionRespRegistra;
    }


    /**
     * Sets the SDescripcionRespRegistra value for this M_CiudadanosConsultados.
     * 
     * @param SDescripcionRespRegistra
     */
    public void setSDescripcionRespRegistra(java.lang.String SDescripcionRespRegistra) {
        this.SDescripcionRespRegistra = SDescripcionRespRegistra;
    }


    /**
     * Gets the m_CiudadanoRegistraduria value for this M_CiudadanosConsultados.
     * 
     * @return m_CiudadanoRegistraduria
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_CiudadanoRegistraduria getM_CiudadanoRegistraduria() {
        return m_CiudadanoRegistraduria;
    }


    /**
     * Sets the m_CiudadanoRegistraduria value for this M_CiudadanosConsultados.
     * 
     * @param m_CiudadanoRegistraduria
     */
    public void setM_CiudadanoRegistraduria(co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_CiudadanoRegistraduria m_CiudadanoRegistraduria) {
        this.m_CiudadanoRegistraduria = m_CiudadanoRegistraduria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof M_CiudadanosConsultados)) return false;
        M_CiudadanosConsultados other = (M_CiudadanosConsultados) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SCodigoRespBDUA==null && other.getSCodigoRespBDUA()==null) || 
             (this.SCodigoRespBDUA!=null &&
              this.SCodigoRespBDUA.equals(other.getSCodigoRespBDUA()))) &&
            ((this.SDescripcionRespBDUA==null && other.getSDescripcionRespBDUA()==null) || 
             (this.SDescripcionRespBDUA!=null &&
              this.SDescripcionRespBDUA.equals(other.getSDescripcionRespBDUA()))) &&
            ((this.m_CiudadanoBDUA==null && other.getM_CiudadanoBDUA()==null) || 
             (this.m_CiudadanoBDUA!=null &&
              this.m_CiudadanoBDUA.equals(other.getM_CiudadanoBDUA()))) &&
            ((this.SCodigoRespRegistraduria==null && other.getSCodigoRespRegistraduria()==null) || 
             (this.SCodigoRespRegistraduria!=null &&
              this.SCodigoRespRegistraduria.equals(other.getSCodigoRespRegistraduria()))) &&
            ((this.SDescripcionRespRegistra==null && other.getSDescripcionRespRegistra()==null) || 
             (this.SDescripcionRespRegistra!=null &&
              this.SDescripcionRespRegistra.equals(other.getSDescripcionRespRegistra()))) &&
            ((this.m_CiudadanoRegistraduria==null && other.getM_CiudadanoRegistraduria()==null) || 
             (this.m_CiudadanoRegistraduria!=null &&
              this.m_CiudadanoRegistraduria.equals(other.getM_CiudadanoRegistraduria())));
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
        if (getSCodigoRespBDUA() != null) {
            _hashCode += getSCodigoRespBDUA().hashCode();
        }
        if (getSDescripcionRespBDUA() != null) {
            _hashCode += getSDescripcionRespBDUA().hashCode();
        }
        if (getM_CiudadanoBDUA() != null) {
            _hashCode += getM_CiudadanoBDUA().hashCode();
        }
        if (getSCodigoRespRegistraduria() != null) {
            _hashCode += getSCodigoRespRegistraduria().hashCode();
        }
        if (getSDescripcionRespRegistra() != null) {
            _hashCode += getSDescripcionRespRegistra().hashCode();
        }
        if (getM_CiudadanoRegistraduria() != null) {
            _hashCode += getM_CiudadanoRegistraduria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(M_CiudadanosConsultados.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "M_CiudadanosConsultados"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCodigoRespBDUA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCodigoRespBDUA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDescripcionRespBDUA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SDescripcionRespBDUA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_CiudadanoBDUA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "M_CiudadanoBDUA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "M_CiudadanoBDUA"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCodigoRespRegistraduria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCodigoRespRegistraduria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDescripcionRespRegistra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SDescripcionRespRegistra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_CiudadanoRegistraduria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "M_CiudadanoRegistraduria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "M_CiudadanoRegistraduria"));
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
