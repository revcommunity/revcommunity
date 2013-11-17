/**
 * SellerShipmentDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class SellerShipmentDataStruct  implements java.io.Serializable {
    private int sellerId;

    private pl.allegro.webapi.service_php.SellerPaymentInfoStruct sellerPaymentInfo;

    private int sellerOtherShipmentIsActive;

    public SellerShipmentDataStruct() {
    }

    public SellerShipmentDataStruct(
           int sellerId,
           pl.allegro.webapi.service_php.SellerPaymentInfoStruct sellerPaymentInfo,
           int sellerOtherShipmentIsActive) {
           this.sellerId = sellerId;
           this.sellerPaymentInfo = sellerPaymentInfo;
           this.sellerOtherShipmentIsActive = sellerOtherShipmentIsActive;
    }


    /**
     * Gets the sellerId value for this SellerShipmentDataStruct.
     * 
     * @return sellerId
     */
    public int getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this SellerShipmentDataStruct.
     * 
     * @param sellerId
     */
    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the sellerPaymentInfo value for this SellerShipmentDataStruct.
     * 
     * @return sellerPaymentInfo
     */
    public pl.allegro.webapi.service_php.SellerPaymentInfoStruct getSellerPaymentInfo() {
        return sellerPaymentInfo;
    }


    /**
     * Sets the sellerPaymentInfo value for this SellerShipmentDataStruct.
     * 
     * @param sellerPaymentInfo
     */
    public void setSellerPaymentInfo(pl.allegro.webapi.service_php.SellerPaymentInfoStruct sellerPaymentInfo) {
        this.sellerPaymentInfo = sellerPaymentInfo;
    }


    /**
     * Gets the sellerOtherShipmentIsActive value for this SellerShipmentDataStruct.
     * 
     * @return sellerOtherShipmentIsActive
     */
    public int getSellerOtherShipmentIsActive() {
        return sellerOtherShipmentIsActive;
    }


    /**
     * Sets the sellerOtherShipmentIsActive value for this SellerShipmentDataStruct.
     * 
     * @param sellerOtherShipmentIsActive
     */
    public void setSellerOtherShipmentIsActive(int sellerOtherShipmentIsActive) {
        this.sellerOtherShipmentIsActive = sellerOtherShipmentIsActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellerShipmentDataStruct)) return false;
        SellerShipmentDataStruct other = (SellerShipmentDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sellerId == other.getSellerId() &&
            ((this.sellerPaymentInfo==null && other.getSellerPaymentInfo()==null) || 
             (this.sellerPaymentInfo!=null &&
              this.sellerPaymentInfo.equals(other.getSellerPaymentInfo()))) &&
            this.sellerOtherShipmentIsActive == other.getSellerOtherShipmentIsActive();
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
        _hashCode += getSellerId();
        if (getSellerPaymentInfo() != null) {
            _hashCode += getSellerPaymentInfo().hashCode();
        }
        _hashCode += getSellerOtherShipmentIsActive();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellerShipmentDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerShipmentDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerPaymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerPaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerPaymentInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerOtherShipmentIsActive");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerOtherShipmentIsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
