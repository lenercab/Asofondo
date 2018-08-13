/**
 * IdP_MunicipioExp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class IdP_MunicipioExp  implements java.io.Serializable {
    private java.lang.String businessKey;  // attribute

    private java.lang.String SCodigoActualDANE;  // attribute

    public IdP_MunicipioExp() {
    }

    public IdP_MunicipioExp(
           java.lang.String businessKey,
           java.lang.String SCodigoActualDANE) {
           this.businessKey = businessKey;
           this.SCodigoActualDANE = SCodigoActualDANE;
    }


    /**
     * Gets the businessKey value for this IdP_MunicipioExp.
     * 
     * @return businessKey
     */
    public java.lang.String getBusinessKey() {
        return businessKey;
    }


    /**
     * Sets the businessKey value for this IdP_MunicipioExp.
     * 
     * @param businessKey
     */
    public void setBusinessKey(java.lang.String businessKey) {
        this.businessKey = businessKey;
    }


    /**
     * Gets the SCodigoActualDANE value for this IdP_MunicipioExp.
     * 
     * @return SCodigoActualDANE
     */
    public java.lang.String getSCodigoActualDANE() {
        return SCodigoActualDANE;
    }


    /**
     * Sets the SCodigoActualDANE value for this IdP_MunicipioExp.
     * 
     * @param SCodigoActualDANE
     */
    public void setSCodigoActualDANE(java.lang.String SCodigoActualDANE) {
        this.SCodigoActualDANE = SCodigoActualDANE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdP_MunicipioExp)) return false;
        IdP_MunicipioExp other = (IdP_MunicipioExp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessKey==null && other.getBusinessKey()==null) || 
             (this.businessKey!=null &&
              this.businessKey.equals(other.getBusinessKey()))) &&
            ((this.SCodigoActualDANE==null && other.getSCodigoActualDANE()==null) || 
             (this.SCodigoActualDANE!=null &&
              this.SCodigoActualDANE.equals(other.getSCodigoActualDANE())));
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
        if (getBusinessKey() != null) {
            _hashCode += getBusinessKey().hashCode();
        }
        if (getSCodigoActualDANE() != null) {
            _hashCode += getSCodigoActualDANE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdP_MunicipioExp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "IdP_MunicipioExp"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("businessKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "businessKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SCodigoActualDANE");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SCodigoActualDANE"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
