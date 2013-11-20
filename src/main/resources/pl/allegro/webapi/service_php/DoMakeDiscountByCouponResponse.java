/**
 * DoMakeDiscountByCouponResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoMakeDiscountByCouponResponse  implements java.io.Serializable {
    private pl.allegro.webapi.service_php.ItemDiscountCouponStruct itemDiscountCoupon;

    public DoMakeDiscountByCouponResponse() {
    }

    public DoMakeDiscountByCouponResponse(
           pl.allegro.webapi.service_php.ItemDiscountCouponStruct itemDiscountCoupon) {
           this.itemDiscountCoupon = itemDiscountCoupon;
    }


    /**
     * Gets the itemDiscountCoupon value for this DoMakeDiscountByCouponResponse.
     * 
     * @return itemDiscountCoupon
     */
    public pl.allegro.webapi.service_php.ItemDiscountCouponStruct getItemDiscountCoupon() {
        return itemDiscountCoupon;
    }


    /**
     * Sets the itemDiscountCoupon value for this DoMakeDiscountByCouponResponse.
     * 
     * @param itemDiscountCoupon
     */
    public void setItemDiscountCoupon(pl.allegro.webapi.service_php.ItemDiscountCouponStruct itemDiscountCoupon) {
        this.itemDiscountCoupon = itemDiscountCoupon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMakeDiscountByCouponResponse)) return false;
        DoMakeDiscountByCouponResponse other = (DoMakeDiscountByCouponResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemDiscountCoupon==null && other.getItemDiscountCoupon()==null) || 
             (this.itemDiscountCoupon!=null &&
              this.itemDiscountCoupon.equals(other.getItemDiscountCoupon())));
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
        if (getItemDiscountCoupon() != null) {
            _hashCode += getItemDiscountCoupon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoMakeDiscountByCouponResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMakeDiscountByCouponResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDiscountCoupon");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemDiscountCoupon"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemDiscountCouponStruct"));
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
