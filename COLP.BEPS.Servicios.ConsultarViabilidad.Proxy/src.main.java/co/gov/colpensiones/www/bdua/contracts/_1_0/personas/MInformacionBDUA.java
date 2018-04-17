/**
 * MInformacionBDUA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class MInformacionBDUA  implements java.io.Serializable {
    private java.lang.Boolean BRequiereSeguridad;

    private java.util.Calendar DFechaConsulta;

    private java.util.Calendar DFechaCorteBDEX;

    private java.util.Calendar DFechaCorteEvol;

    private java.util.Calendar DFechaCorteSAT;

    private java.lang.String idP_EstadoBDEX;

    private java.lang.String idP_EstadoEvol;

    private java.lang.String idP_EstadoMipres;

    public MInformacionBDUA() {
    }

    public MInformacionBDUA(
           java.lang.Boolean BRequiereSeguridad,
           java.util.Calendar DFechaConsulta,
           java.util.Calendar DFechaCorteBDEX,
           java.util.Calendar DFechaCorteEvol,
           java.util.Calendar DFechaCorteSAT,
           java.lang.String idP_EstadoBDEX,
           java.lang.String idP_EstadoEvol,
           java.lang.String idP_EstadoMipres) {
           this.BRequiereSeguridad = BRequiereSeguridad;
           this.DFechaConsulta = DFechaConsulta;
           this.DFechaCorteBDEX = DFechaCorteBDEX;
           this.DFechaCorteEvol = DFechaCorteEvol;
           this.DFechaCorteSAT = DFechaCorteSAT;
           this.idP_EstadoBDEX = idP_EstadoBDEX;
           this.idP_EstadoEvol = idP_EstadoEvol;
           this.idP_EstadoMipres = idP_EstadoMipres;
    }


    /**
     * Gets the BRequiereSeguridad value for this MInformacionBDUA.
     * 
     * @return BRequiereSeguridad
     */
    public java.lang.Boolean getBRequiereSeguridad() {
        return BRequiereSeguridad;
    }


    /**
     * Sets the BRequiereSeguridad value for this MInformacionBDUA.
     * 
     * @param BRequiereSeguridad
     */
    public void setBRequiereSeguridad(java.lang.Boolean BRequiereSeguridad) {
        this.BRequiereSeguridad = BRequiereSeguridad;
    }


    /**
     * Gets the DFechaConsulta value for this MInformacionBDUA.
     * 
     * @return DFechaConsulta
     */
    public java.util.Calendar getDFechaConsulta() {
        return DFechaConsulta;
    }


    /**
     * Sets the DFechaConsulta value for this MInformacionBDUA.
     * 
     * @param DFechaConsulta
     */
    public void setDFechaConsulta(java.util.Calendar DFechaConsulta) {
        this.DFechaConsulta = DFechaConsulta;
    }


    /**
     * Gets the DFechaCorteBDEX value for this MInformacionBDUA.
     * 
     * @return DFechaCorteBDEX
     */
    public java.util.Calendar getDFechaCorteBDEX() {
        return DFechaCorteBDEX;
    }


    /**
     * Sets the DFechaCorteBDEX value for this MInformacionBDUA.
     * 
     * @param DFechaCorteBDEX
     */
    public void setDFechaCorteBDEX(java.util.Calendar DFechaCorteBDEX) {
        this.DFechaCorteBDEX = DFechaCorteBDEX;
    }


    /**
     * Gets the DFechaCorteEvol value for this MInformacionBDUA.
     * 
     * @return DFechaCorteEvol
     */
    public java.util.Calendar getDFechaCorteEvol() {
        return DFechaCorteEvol;
    }


    /**
     * Sets the DFechaCorteEvol value for this MInformacionBDUA.
     * 
     * @param DFechaCorteEvol
     */
    public void setDFechaCorteEvol(java.util.Calendar DFechaCorteEvol) {
        this.DFechaCorteEvol = DFechaCorteEvol;
    }


    /**
     * Gets the DFechaCorteSAT value for this MInformacionBDUA.
     * 
     * @return DFechaCorteSAT
     */
    public java.util.Calendar getDFechaCorteSAT() {
        return DFechaCorteSAT;
    }


    /**
     * Sets the DFechaCorteSAT value for this MInformacionBDUA.
     * 
     * @param DFechaCorteSAT
     */
    public void setDFechaCorteSAT(java.util.Calendar DFechaCorteSAT) {
        this.DFechaCorteSAT = DFechaCorteSAT;
    }


    /**
     * Gets the idP_EstadoBDEX value for this MInformacionBDUA.
     * 
     * @return idP_EstadoBDEX
     */
    public java.lang.String getIdP_EstadoBDEX() {
        return idP_EstadoBDEX;
    }


    /**
     * Sets the idP_EstadoBDEX value for this MInformacionBDUA.
     * 
     * @param idP_EstadoBDEX
     */
    public void setIdP_EstadoBDEX(java.lang.String idP_EstadoBDEX) {
        this.idP_EstadoBDEX = idP_EstadoBDEX;
    }


    /**
     * Gets the idP_EstadoEvol value for this MInformacionBDUA.
     * 
     * @return idP_EstadoEvol
     */
    public java.lang.String getIdP_EstadoEvol() {
        return idP_EstadoEvol;
    }


    /**
     * Sets the idP_EstadoEvol value for this MInformacionBDUA.
     * 
     * @param idP_EstadoEvol
     */
    public void setIdP_EstadoEvol(java.lang.String idP_EstadoEvol) {
        this.idP_EstadoEvol = idP_EstadoEvol;
    }


    /**
     * Gets the idP_EstadoMipres value for this MInformacionBDUA.
     * 
     * @return idP_EstadoMipres
     */
    public java.lang.String getIdP_EstadoMipres() {
        return idP_EstadoMipres;
    }


    /**
     * Sets the idP_EstadoMipres value for this MInformacionBDUA.
     * 
     * @param idP_EstadoMipres
     */
    public void setIdP_EstadoMipres(java.lang.String idP_EstadoMipres) {
        this.idP_EstadoMipres = idP_EstadoMipres;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MInformacionBDUA)) return false;
        MInformacionBDUA other = (MInformacionBDUA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BRequiereSeguridad==null && other.getBRequiereSeguridad()==null) || 
             (this.BRequiereSeguridad!=null &&
              this.BRequiereSeguridad.equals(other.getBRequiereSeguridad()))) &&
            ((this.DFechaConsulta==null && other.getDFechaConsulta()==null) || 
             (this.DFechaConsulta!=null &&
              this.DFechaConsulta.equals(other.getDFechaConsulta()))) &&
            ((this.DFechaCorteBDEX==null && other.getDFechaCorteBDEX()==null) || 
             (this.DFechaCorteBDEX!=null &&
              this.DFechaCorteBDEX.equals(other.getDFechaCorteBDEX()))) &&
            ((this.DFechaCorteEvol==null && other.getDFechaCorteEvol()==null) || 
             (this.DFechaCorteEvol!=null &&
              this.DFechaCorteEvol.equals(other.getDFechaCorteEvol()))) &&
            ((this.DFechaCorteSAT==null && other.getDFechaCorteSAT()==null) || 
             (this.DFechaCorteSAT!=null &&
              this.DFechaCorteSAT.equals(other.getDFechaCorteSAT()))) &&
            ((this.idP_EstadoBDEX==null && other.getIdP_EstadoBDEX()==null) || 
             (this.idP_EstadoBDEX!=null &&
              this.idP_EstadoBDEX.equals(other.getIdP_EstadoBDEX()))) &&
            ((this.idP_EstadoEvol==null && other.getIdP_EstadoEvol()==null) || 
             (this.idP_EstadoEvol!=null &&
              this.idP_EstadoEvol.equals(other.getIdP_EstadoEvol()))) &&
            ((this.idP_EstadoMipres==null && other.getIdP_EstadoMipres()==null) || 
             (this.idP_EstadoMipres!=null &&
              this.idP_EstadoMipres.equals(other.getIdP_EstadoMipres())));
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
        if (getBRequiereSeguridad() != null) {
            _hashCode += getBRequiereSeguridad().hashCode();
        }
        if (getDFechaConsulta() != null) {
            _hashCode += getDFechaConsulta().hashCode();
        }
        if (getDFechaCorteBDEX() != null) {
            _hashCode += getDFechaCorteBDEX().hashCode();
        }
        if (getDFechaCorteEvol() != null) {
            _hashCode += getDFechaCorteEvol().hashCode();
        }
        if (getDFechaCorteSAT() != null) {
            _hashCode += getDFechaCorteSAT().hashCode();
        }
        if (getIdP_EstadoBDEX() != null) {
            _hashCode += getIdP_EstadoBDEX().hashCode();
        }
        if (getIdP_EstadoEvol() != null) {
            _hashCode += getIdP_EstadoEvol().hashCode();
        }
        if (getIdP_EstadoMipres() != null) {
            _hashCode += getIdP_EstadoMipres().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MInformacionBDUA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mInformacionBDUA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRequiereSeguridad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BRequiereSeguridad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaConsulta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaConsulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaCorteBDEX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaCorteBDEX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaCorteEvol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaCorteEvol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFechaCorteSAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DFechaCorteSAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_EstadoBDEX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idP_EstadoBDEX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_EstadoEvol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idP_EstadoEvol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idP_EstadoMipres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idP_EstadoMipres"));
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
