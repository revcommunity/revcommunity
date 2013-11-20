/**
 * DoSendRefundFormsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoSendRefundFormsResponse  implements java.io.Serializable {
    private pl.allegro.webapi.service_php.SendRefundFormResultStruct[] sendRefundFormsResultsArr;

    public DoSendRefundFormsResponse() {
    }

    public DoSendRefundFormsResponse(
           pl.allegro.webapi.service_php.SendRefundFormResultStruct[] sendRefundFormsResultsArr) {
           this.sendRefundFormsResultsArr = sendRefundFormsResultsArr;
    }


    /**
     * Gets the sendRefundFormsResultsArr value for this DoSendRefundFormsResponse.
     * 
     * @return sendRefundFormsResultsArr
     */
    public pl.allegro.webapi.service_php.SendRefundFormResultStruct[] getSendRefundFormsResultsArr() {
        return sendRefundFormsResultsArr;
    }


    /**
     * Sets the sendRefundFormsResultsArr value for this DoSendRefundFormsResponse.
     * 
     * @param sendRefundFormsResultsArr
     */
    public void setSendRefundFormsResultsArr(pl.allegro.webapi.service_php.SendRefundFormResultStruct[] sendRefundFormsResultsArr) {
        this.sendRefundFormsResultsArr = sendRefundFormsResultsArr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSendRefundFormsResponse)) return false;
        DoSendRefundFormsResponse other = (DoSendRefundFormsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sendRefundFormsResultsArr==null && other.getSendRefundFormsResultsArr()==null) || 
             (this.sendRefundFormsResultsArr!=null &&
              java.util.Arrays.equals(this.sendRefundFormsResultsArr, other.getSendRefundFormsResultsArr())));
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
        if (getSendRefundFormsResultsArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSendRefundFormsResultsArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSendRefundFormsResultsArr(), i);
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
        new org.apache.axis.description.TypeDesc(DoSendRefundFormsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendRefundFormsResultsArr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sendRefundFormsResultsArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendRefundFormResultStruct"));
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
