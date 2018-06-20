/**
 * Causal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class Causal  implements java.io.Serializable {
    private java.lang.String codigoCausal;

    private java.lang.String descripcionCausal;

    public Causal() {
    }

    public Causal(
           java.lang.String codigoCausal,
           java.lang.String descripcionCausal) {
           this.codigoCausal = codigoCausal;
           this.descripcionCausal = descripcionCausal;
    }


    /**
     * Gets the codigoCausal value for this Causal.
     * 
     * @return codigoCausal
     */
    public java.lang.String getCodigoCausal() {
        return codigoCausal;
    }


    /**
     * Sets the codigoCausal value for this Causal.
     * 
     * @param codigoCausal
     */
    public void setCodigoCausal(java.lang.String codigoCausal) {
        this.codigoCausal = codigoCausal;
    }


    /**
     * Gets the descripcionCausal value for this Causal.
     * 
     * @return descripcionCausal
     */
    public java.lang.String getDescripcionCausal() {
        return descripcionCausal;
    }


    /**
     * Sets the descripcionCausal value for this Causal.
     * 
     * @param descripcionCausal
     */
    public void setDescripcionCausal(java.lang.String descripcionCausal) {
        this.descripcionCausal = descripcionCausal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Causal)) return false;
        Causal other = (Causal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoCausal==null && other.getCodigoCausal()==null) || 
             (this.codigoCausal!=null &&
              this.codigoCausal.equals(other.getCodigoCausal()))) &&
            ((this.descripcionCausal==null && other.getDescripcionCausal()==null) || 
             (this.descripcionCausal!=null &&
              this.descripcionCausal.equals(other.getDescripcionCausal())));
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
        if (getCodigoCausal() != null) {
            _hashCode += getCodigoCausal().hashCode();
        }
        if (getDescripcionCausal() != null) {
            _hashCode += getDescripcionCausal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Causal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "causal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCausal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCausal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionCausal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionCausal"));
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
