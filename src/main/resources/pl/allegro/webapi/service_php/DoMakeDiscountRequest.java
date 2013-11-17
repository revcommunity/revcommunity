/**
 * DoMakeDiscountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoMakeDiscountRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long dealId;

    private java.lang.Float discountAmount;

    private java.lang.Float discountPercentage;

    public DoMakeDiscountRequest() {
    }

    public DoMakeDiscountRequest(
           java.lang.String sessionHandle,
           long dealId,
           java.lang.Float discountAmount,
           java.lang.Float discountPercentage) {
           this.sessionHandle = sessionHandle;
           this.dealId = dealId;
           this.discountAmount = discountAmount;
           this.discountPercentage = discountPercentage;
    }


    /**
     * Gets the sessionHandle value for this DoMakeDiscountRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoMakeDiscountRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the dealId value for this DoMakeDiscountRequest.
     * 
     * @return dealId
     */
    public long getDealId() {
        return dealId;
    }


    /**
     * Sets the dealId value for this DoMakeDiscountRequest.
     * 
     * @param dealId
     */
    public void setDealId(long dealId) {
        this.dealId = dealId;
    }


    /**
     * Gets the discountAmount value for this DoMakeDiscountRequest.
     * 
     * @return discountAmount
     */
    public java.lang.Float getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this DoMakeDiscountRequest.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.lang.Float discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the discountPercentage value for this DoMakeDiscountRequest.
     * 
     * @return discountPercentage
     */
    public java.lang.Float getDiscountPercentage() {
        return discountPercentage;
    }


    /**
     * Sets the discountPercentage value for this DoMakeDiscountRequest.
     * 
     * @param discountPercentage
     */
    public void setDiscountPercentage(java.lang.Float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMakeDiscountRequest)) return false;
        DoMakeDiscountRequest other = (DoMakeDiscountRequest) obj;
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
            this.dealId == other.getDealId() &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.discountPercentage==null && other.getDiscountPercentage()==null) || 
             (this.discountPercentage!=null &&
              this.discountPercentage.equals(other.getDiscountPercentage())));
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
        _hashCode += new Long(getDealId()).hashCode();
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getDiscountPercentage() != null) {
            _hashCode += getDiscountPercentage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoMakeDiscountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMakeDiscountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "dealId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "discountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "discountPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
