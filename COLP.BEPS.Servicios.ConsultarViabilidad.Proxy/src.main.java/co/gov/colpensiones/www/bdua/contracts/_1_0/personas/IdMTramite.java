/**
 * IdMTramite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class IdMTramite  implements java.io.Serializable {
    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBeps m_CiudadanoBeps;

    public IdMTramite() {
    }

    public IdMTramite(
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBeps m_CiudadanoBeps) {
           this.m_CiudadanoBeps = m_CiudadanoBeps;
    }


    /**
     * Gets the m_CiudadanoBeps value for this IdMTramite.
     * 
     * @return m_CiudadanoBeps
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBeps getM_CiudadanoBeps() {
        return m_CiudadanoBeps;
    }


    /**
     * Sets the m_CiudadanoBeps value for this IdMTramite.
     * 
     * @param m_CiudadanoBeps
     */
    public void setM_CiudadanoBeps(co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBeps m_CiudadanoBeps) {
        this.m_CiudadanoBeps = m_CiudadanoBeps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdMTramite)) return false;
        IdMTramite other = (IdMTramite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.m_CiudadanoBeps==null && other.getM_CiudadanoBeps()==null) || 
             (this.m_CiudadanoBeps!=null &&
              this.m_CiudadanoBeps.equals(other.getM_CiudadanoBeps())));
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
        if (getM_CiudadanoBeps() != null) {
            _hashCode += getM_CiudadanoBeps().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdMTramite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "idMTramite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_CiudadanoBeps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_CiudadanoBeps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanoBeps"));
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
