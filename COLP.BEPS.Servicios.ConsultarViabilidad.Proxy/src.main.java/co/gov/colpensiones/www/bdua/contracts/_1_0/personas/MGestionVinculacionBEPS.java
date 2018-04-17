/**
 * MGestionVinculacionBEPS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class MGestionVinculacionBEPS  implements java.io.Serializable {
    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdMTramite idM_Tramite;

    private co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanosConsultados m_CiudadanosConsultados;

    public MGestionVinculacionBEPS() {
    }

    public MGestionVinculacionBEPS(
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdMTramite idM_Tramite,
           co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanosConsultados m_CiudadanosConsultados) {
           this.idM_Tramite = idM_Tramite;
           this.m_CiudadanosConsultados = m_CiudadanosConsultados;
    }


    /**
     * Gets the idM_Tramite value for this MGestionVinculacionBEPS.
     * 
     * @return idM_Tramite
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdMTramite getIdM_Tramite() {
        return idM_Tramite;
    }


    /**
     * Sets the idM_Tramite value for this MGestionVinculacionBEPS.
     * 
     * @param idM_Tramite
     */
    public void setIdM_Tramite(co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdMTramite idM_Tramite) {
        this.idM_Tramite = idM_Tramite;
    }


    /**
     * Gets the m_CiudadanosConsultados value for this MGestionVinculacionBEPS.
     * 
     * @return m_CiudadanosConsultados
     */
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanosConsultados getM_CiudadanosConsultados() {
        return m_CiudadanosConsultados;
    }


    /**
     * Sets the m_CiudadanosConsultados value for this MGestionVinculacionBEPS.
     * 
     * @param m_CiudadanosConsultados
     */
    public void setM_CiudadanosConsultados(co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanosConsultados m_CiudadanosConsultados) {
        this.m_CiudadanosConsultados = m_CiudadanosConsultados;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MGestionVinculacionBEPS)) return false;
        MGestionVinculacionBEPS other = (MGestionVinculacionBEPS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idM_Tramite==null && other.getIdM_Tramite()==null) || 
             (this.idM_Tramite!=null &&
              this.idM_Tramite.equals(other.getIdM_Tramite()))) &&
            ((this.m_CiudadanosConsultados==null && other.getM_CiudadanosConsultados()==null) || 
             (this.m_CiudadanosConsultados!=null &&
              this.m_CiudadanosConsultados.equals(other.getM_CiudadanosConsultados())));
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
        if (getIdM_Tramite() != null) {
            _hashCode += getIdM_Tramite().hashCode();
        }
        if (getM_CiudadanosConsultados() != null) {
            _hashCode += getM_CiudadanosConsultados().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MGestionVinculacionBEPS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mGestionVinculacionBEPS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idM_Tramite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idM_Tramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "idMTramite"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_CiudadanosConsultados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_CiudadanosConsultados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanosConsultados"));
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
