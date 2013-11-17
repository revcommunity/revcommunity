/**
 * DoSendRefundFormsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoSendRefundFormsRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private pl.allegro.webapi.service_php.SendRefundFormStruct[] sendRefundFormsDataArr;

    public DoSendRefundFormsRequest() {
    }

    public DoSendRefundFormsRequest(
           java.lang.String sessionHandle,
           pl.allegro.webapi.service_php.SendRefundFormStruct[] sendRefundFormsDataArr) {
           this.sessionHandle = sessionHandle;
           this.sendRefundFormsDataArr = sendRefundFormsDataArr;
    }


    /**
     * Gets the sessionHandle value for this DoSendRefundFormsRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoSendRefundFormsRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the sendRefundFormsDataArr value for this DoSendRefundFormsRequest.
     * 
     * @return sendRefundFormsDataArr
     */
    public pl.allegro.webapi.service_php.SendRefundFormStruct[] getSendRefundFormsDataArr() {
        return sendRefundFormsDataArr;
    }


    /**
     * Sets the sendRefundFormsDataArr value for this DoSendRefundFormsRequest.
     * 
     * @param sendRefundFormsDataArr
     */
    public void setSendRefundFormsDataArr(pl.allegro.webapi.service_php.SendRefundFormStruct[] sendRefundFormsDataArr) {
        this.sendRefundFormsDataArr = sendRefundFormsDataArr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSendRefundFormsRequest)) return false;
        DoSendRefundFormsRequest other = (DoSendRefundFormsRequest) obj;
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
            ((this.sendRefundFormsDataArr==null && other.getSendRefundFormsDataArr()==null) || 
             (this.sendRefundFormsDataArr!=null &&
              java.util.Arrays.equals(this.sendRefundFormsDataArr, other.getSendRefundFormsDataArr())));
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
        if (getSendRefundFormsDataArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSendRefundFormsDataArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSendRefundFormsDataArr(), i);
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
        new org.apache.axis.description.TypeDesc(DoSendRefundFormsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendRefundFormsDataArr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sendRefundFormsDataArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendRefundFormStruct"));
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
