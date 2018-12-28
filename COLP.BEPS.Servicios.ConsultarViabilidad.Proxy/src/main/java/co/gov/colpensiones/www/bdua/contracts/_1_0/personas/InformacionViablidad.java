/**
 * InformacionViablidad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class InformacionViablidad  implements java.io.Serializable {
    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.Causal[] listaCausalNoViabilidad;

    private java.lang.String viabilidad;

    public InformacionViablidad() {
    }

    public InformacionViablidad(
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.Causal[] listaCausalNoViabilidad,
           java.lang.String viabilidad) {
           this.listaCausalNoViabilidad = listaCausalNoViabilidad;
           this.viabilidad = viabilidad;
    }


    /**
     * Gets the listaCausalNoViabilidad value for this InformacionViablidad.
     * 
     * @return listaCausalNoViabilidad
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.Causal[] getListaCausalNoViabilidad() {
        return listaCausalNoViabilidad;
    }


    /**
     * Sets the listaCausalNoViabilidad value for this InformacionViablidad.
     * 
     * @param listaCausalNoViabilidad
     */
    public void setListaCausalNoViabilidad(co.gov.colpensiones.www.bdua.contracts._1_0.personas.Causal[] listaCausalNoViabilidad) {
        this.listaCausalNoViabilidad = listaCausalNoViabilidad;
    }


    /**
     * Gets the viabilidad value for this InformacionViablidad.
     * 
     * @return viabilidad
     */
    public java.lang.String getViabilidad() {
        return viabilidad;
    }


    /**
     * Sets the viabilidad value for this InformacionViablidad.
     * 
     * @param viabilidad
     */
    public void setViabilidad(java.lang.String viabilidad) {
        this.viabilidad = viabilidad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionViablidad)) return false;
        InformacionViablidad other = (InformacionViablidad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaCausalNoViabilidad==null && other.getListaCausalNoViabilidad()==null) || 
             (this.listaCausalNoViabilidad!=null &&
              java.util.Arrays.equals(this.listaCausalNoViabilidad, other.getListaCausalNoViabilidad()))) &&
            ((this.viabilidad==null && other.getViabilidad()==null) || 
             (this.viabilidad!=null &&
              this.viabilidad.equals(other.getViabilidad())));
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
        if (getListaCausalNoViabilidad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaCausalNoViabilidad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaCausalNoViabilidad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getViabilidad() != null) {
            _hashCode += getViabilidad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionViablidad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "informacionViablidad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaCausalNoViabilidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaCausalNoViabilidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "causal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "causal"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viabilidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viabilidad"));
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
