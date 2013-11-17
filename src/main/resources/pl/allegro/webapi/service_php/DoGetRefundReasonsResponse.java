/**
 * DoGetRefundReasonsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoGetRefundReasonsResponse  implements java.io.Serializable {
    private pl.allegro.webapi.service_php.RefundReasonStruct[] refundReasonsArr;

    public DoGetRefundReasonsResponse() {
    }

    public DoGetRefundReasonsResponse(
           pl.allegro.webapi.service_php.RefundReasonStruct[] refundReasonsArr) {
           this.refundReasonsArr = refundReasonsArr;
    }


    /**
     * Gets the refundReasonsArr value for this DoGetRefundReasonsResponse.
     * 
     * @return refundReasonsArr
     */
    public pl.allegro.webapi.service_php.RefundReasonStruct[] getRefundReasonsArr() {
        return refundReasonsArr;
    }


    /**
     * Sets the refundReasonsArr value for this DoGetRefundReasonsResponse.
     * 
     * @param refundReasonsArr
     */
    public void setRefundReasonsArr(pl.allegro.webapi.service_php.RefundReasonStruct[] refundReasonsArr) {
        this.refundReasonsArr = refundReasonsArr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetRefundReasonsResponse)) return false;
        DoGetRefundReasonsResponse other = (DoGetRefundReasonsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refundReasonsArr==null && other.getRefundReasonsArr()==null) || 
             (this.refundReasonsArr!=null &&
              java.util.Arrays.equals(this.refundReasonsArr, other.getRefundReasonsArr())));
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
        if (getRefundReasonsArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefundReasonsArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefundReasonsArr(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetRefundReasonsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundReasonsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundReasonsArr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundReasonsArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundReasonStruct"));
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
