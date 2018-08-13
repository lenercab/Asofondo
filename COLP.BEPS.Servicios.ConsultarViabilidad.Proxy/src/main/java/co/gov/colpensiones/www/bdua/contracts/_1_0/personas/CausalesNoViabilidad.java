/**
 * CausalesNoViabilidad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class CausalesNoViabilidad  implements java.io.Serializable {
    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.CausalNoViabilidadBEPS causalNoViabilidadBEPS;

    public CausalesNoViabilidad() {
    }

    public CausalesNoViabilidad(
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.CausalNoViabilidadBEPS causalNoViabilidadBEPS) {
           this.causalNoViabilidadBEPS = causalNoViabilidadBEPS;
    }


    /**
     * Gets the causalNoViabilidadBEPS value for this CausalesNoViabilidad.
     * 
     * @return causalNoViabilidadBEPS
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.CausalNoViabilidadBEPS getCausalNoViabilidadBEPS() {
        return causalNoViabilidadBEPS;
    }


    /**
     * Sets the causalNoViabilidadBEPS value for this CausalesNoViabilidad.
     * 
     * @param causalNoViabilidadBEPS
     */
    public void setCausalNoViabilidadBEPS(co.gov.colpensiones.www.bdua.contracts._1_0.personas.CausalNoViabilidadBEPS causalNoViabilidadBEPS) {
        this.causalNoViabilidadBEPS = causalNoViabilidadBEPS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CausalesNoViabilidad)) return false;
        CausalesNoViabilidad other = (CausalesNoViabilidad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causalNoViabilidadBEPS==null && other.getCausalNoViabilidadBEPS()==null) || 
             (this.causalNoViabilidadBEPS!=null &&
              this.causalNoViabilidadBEPS.equals(other.getCausalNoViabilidadBEPS())));
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
        if (getCausalNoViabilidadBEPS() != null) {
            _hashCode += getCausalNoViabilidadBEPS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CausalesNoViabilidad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "CausalesNoViabilidad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causalNoViabilidadBEPS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CausalNoViabilidadBEPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "CausalNoViabilidadBEPS"));
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
