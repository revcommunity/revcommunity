/**
 * DoCancelRefundWarningsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoCancelRefundWarningsRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private pl.allegro.webapi.service_php.CancelRefundWarningStruct[] cancelRefundWarningsDataArr;

    public DoCancelRefundWarningsRequest() {
    }

    public DoCancelRefundWarningsRequest(
           java.lang.String sessionHandle,
           pl.allegro.webapi.service_php.CancelRefundWarningStruct[] cancelRefundWarningsDataArr) {
           this.sessionHandle = sessionHandle;
           this.cancelRefundWarningsDataArr = cancelRefundWarningsDataArr;
    }


    /**
     * Gets the sessionHandle value for this DoCancelRefundWarningsRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoCancelRefundWarningsRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the cancelRefundWarningsDataArr value for this DoCancelRefundWarningsRequest.
     * 
     * @return cancelRefundWarningsDataArr
     */
    public pl.allegro.webapi.service_php.CancelRefundWarningStruct[] getCancelRefundWarningsDataArr() {
        return cancelRefundWarningsDataArr;
    }


    /**
     * Sets the cancelRefundWarningsDataArr value for this DoCancelRefundWarningsRequest.
     * 
     * @param cancelRefundWarningsDataArr
     */
    public void setCancelRefundWarningsDataArr(pl.allegro.webapi.service_php.CancelRefundWarningStruct[] cancelRefundWarningsDataArr) {
        this.cancelRefundWarningsDataArr = cancelRefundWarningsDataArr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCancelRefundWarningsRequest)) return false;
        DoCancelRefundWarningsRequest other = (DoCancelRefundWarningsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            ((this.cancelRefundWarningsDataArr==null && other.getCancelRefundWarningsDataArr()==null) || 
             (this.cancelRefundWarningsDataArr!=null &&
              java.util.Arrays.equals(this.cancelRefundWarningsDataArr, other.getCancelRefundWarningsDataArr())));
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        if (getCancelRefundWarningsDataArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCancelRefundWarningsDataArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCancelRefundWarningsDataArr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCancelRefundWarningsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundWarningsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelRefundWarningsDataArr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "cancelRefundWarningsDataArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundWarningStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
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
