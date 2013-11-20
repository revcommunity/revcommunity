/**
 * DoCancelRefundFormsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoCancelRefundFormsResponse  implements java.io.Serializable {
    private pl.allegro.webapi.service_php.CancelRefundFormResultStruct[] cancelRefundFormsResultsArr;

    public DoCancelRefundFormsResponse() {
    }

    public DoCancelRefundFormsResponse(
           pl.allegro.webapi.service_php.CancelRefundFormResultStruct[] cancelRefundFormsResultsArr) {
           this.cancelRefundFormsResultsArr = cancelRefundFormsResultsArr;
    }


    /**
     * Gets the cancelRefundFormsResultsArr value for this DoCancelRefundFormsResponse.
     * 
     * @return cancelRefundFormsResultsArr
     */
    public pl.allegro.webapi.service_php.CancelRefundFormResultStruct[] getCancelRefundFormsResultsArr() {
        return cancelRefundFormsResultsArr;
    }


    /**
     * Sets the cancelRefundFormsResultsArr value for this DoCancelRefundFormsResponse.
     * 
     * @param cancelRefundFormsResultsArr
     */
    public void setCancelRefundFormsResultsArr(pl.allegro.webapi.service_php.CancelRefundFormResultStruct[] cancelRefundFormsResultsArr) {
        this.cancelRefundFormsResultsArr = cancelRefundFormsResultsArr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCancelRefundFormsResponse)) return false;
        DoCancelRefundFormsResponse other = (DoCancelRefundFormsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelRefundFormsResultsArr==null && other.getCancelRefundFormsResultsArr()==null) || 
             (this.cancelRefundFormsResultsArr!=null &&
              java.util.Arrays.equals(this.cancelRefundFormsResultsArr, other.getCancelRefundFormsResultsArr())));
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
        if (getCancelRefundFormsResultsArr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCancelRefundFormsResultsArr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCancelRefundFormsResultsArr(), i);
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
        new org.apache.axis.description.TypeDesc(DoCancelRefundFormsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelRefundFormsResultsArr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "cancelRefundFormsResultsArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CancelRefundFormResultStruct"));
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
