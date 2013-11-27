/**
 * DoGetRefundTransactionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoGetRefundTransactionsResponse  implements java.io.Serializable {
    private int refundFormsCount;

    private pl.allegro.webapi.service_php.RefundFormDataStruct[] refundFormsList;

    public DoGetRefundTransactionsResponse() {
    }

    public DoGetRefundTransactionsResponse(
           int refundFormsCount,
           pl.allegro.webapi.service_php.RefundFormDataStruct[] refundFormsList) {
           this.refundFormsCount = refundFormsCount;
           this.refundFormsList = refundFormsList;
    }


    /**
     * Gets the refundFormsCount value for this DoGetRefundTransactionsResponse.
     * 
     * @return refundFormsCount
     */
    public int getRefundFormsCount() {
        return refundFormsCount;
    }


    /**
     * Sets the refundFormsCount value for this DoGetRefundTransactionsResponse.
     * 
     * @param refundFormsCount
     */
    public void setRefundFormsCount(int refundFormsCount) {
        this.refundFormsCount = refundFormsCount;
    }


    /**
     * Gets the refundFormsList value for this DoGetRefundTransactionsResponse.
     * 
     * @return refundFormsList
     */
    public pl.allegro.webapi.service_php.RefundFormDataStruct[] getRefundFormsList() {
        return refundFormsList;
    }


    /**
     * Sets the refundFormsList value for this DoGetRefundTransactionsResponse.
     * 
     * @param refundFormsList
     */
    public void setRefundFormsList(pl.allegro.webapi.service_php.RefundFormDataStruct[] refundFormsList) {
        this.refundFormsList = refundFormsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetRefundTransactionsResponse)) return false;
        DoGetRefundTransactionsResponse other = (DoGetRefundTransactionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.refundFormsCount == other.getRefundFormsCount() &&
            ((this.refundFormsList==null && other.getRefundFormsList()==null) || 
             (this.refundFormsList!=null &&
              java.util.Arrays.equals(this.refundFormsList, other.getRefundFormsList())));
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
        _hashCode += getRefundFormsCount();
        if (getRefundFormsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefundFormsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefundFormsList(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetRefundTransactionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundTransactionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundFormsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundFormsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundFormsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundFormsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundFormDataStruct"));
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