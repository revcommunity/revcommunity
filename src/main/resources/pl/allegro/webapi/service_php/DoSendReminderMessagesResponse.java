/**
 * DoSendReminderMessagesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoSendReminderMessagesResponse  implements java.io.Serializable {
    private pl.allegro.webapi.service_php.SendReminderMessageResultStruct[] sendReminderMessagesResultsArr;

    public DoSendReminderMessagesResponse() {
    }

    public DoSendReminderMessagesResponse(
           pl.allegro.webapi.service_php.SendReminderMessageResultStruct[] sendReminderMessagesResultsArr) {
           this.sendReminderMessagesResultsArr = sendReminderMessagesResultsArr;
    }


    /**
     * Gets the sendReminderMessagesResultsArr value for this DoSendReminderMessagesResponse.
     * 
     * @return sendReminderMessagesResultsArr
     */
    public pl.allegro.webapi.service_php.SendReminderMessageResultStruct[] getSendReminderMessagesResultsArr() {
        return sendReminderMessagesResultsArr;
    }


    /**
     * Sets the sendReminderMessagesResultsArr value for this DoSendReminderMessagesResponse.
     * 
     * @param sendReminderMessagesResultsArr
     */
    public void setSendReminderMessagesResultsArr(pl.allegro.webapi.service_php.SendReminderMessageResultStruct[] sendReminderMessagesResultsArr) {
        this.sendReminderMessagesResultsArr = sendReminderMessagesResultsArr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSendReminderMessagesResponse)) return false;
        DoSendReminderMessagesResponse other = (DoSendReminderMessagesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sendReminderMessagesResultsArr==null && other.getSendReminderMessagesResultsArr()==null) || 
             (this.sendReminderMessagesResultsArr!=null &&
              java.util.Arrays.equals(this.sendReminderMessagesResultsArr, other.getSendReminderMessagesResultsArr())));
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
        if (getSendReminderMessagesResultsArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSendReminderMessagesResultsArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSendReminderMessagesResultsArr(), i);
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
        new org.apache.axis.description.TypeDesc(DoSendReminderMessagesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendReminderMessagesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendReminderMessagesResultsArr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sendReminderMessagesResultsArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SendReminderMessageResultStruct"));
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
