/**
 * DoSearchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.allegro.webapi.service_php;

public class DoSearchResponse  implements java.io.Serializable {
    private int searchCount;

    private int searchCountFeatured;

    private pl.allegro.webapi.service_php.SearchResponseType[] searchArray;

    private java.lang.String[] searchExcludedWords;

    private pl.allegro.webapi.service_php.CategoriesStruct[] searchCategories;

    public DoSearchResponse() {
    }

    public DoSearchResponse(
           int searchCount,
           int searchCountFeatured,
           pl.allegro.webapi.service_php.SearchResponseType[] searchArray,
           java.lang.String[] searchExcludedWords,
           pl.allegro.webapi.service_php.CategoriesStruct[] searchCategories) {
           this.searchCount = searchCount;
           this.searchCountFeatured = searchCountFeatured;
           this.searchArray = searchArray;
           this.searchExcludedWords = searchExcludedWords;
           this.searchCategories = searchCategories;
    }


    /**
     * Gets the searchCount value for this DoSearchResponse.
     * 
     * @return searchCount
     */
    public int getSearchCount() {
        return searchCount;
    }


    /**
     * Sets the searchCount value for this DoSearchResponse.
     * 
     * @param searchCount
     */
    public void setSearchCount(int searchCount) {
        this.searchCount = searchCount;
    }


    /**
     * Gets the searchCountFeatured value for this DoSearchResponse.
     * 
     * @return searchCountFeatured
     */
    public int getSearchCountFeatured() {
        return searchCountFeatured;
    }


    /**
     * Sets the searchCountFeatured value for this DoSearchResponse.
     * 
     * @param searchCountFeatured
     */
    public void setSearchCountFeatured(int searchCountFeatured) {
        this.searchCountFeatured = searchCountFeatured;
    }


    /**
     * Gets the searchArray value for this DoSearchResponse.
     * 
     * @return searchArray
     */
    public pl.allegro.webapi.service_php.SearchResponseType[] getSearchArray() {
        return searchArray;
    }


    /**
     * Sets the searchArray value for this DoSearchResponse.
     * 
     * @param searchArray
     */
    public void setSearchArray(pl.allegro.webapi.service_php.SearchResponseType[] searchArray) {
        this.searchArray = searchArray;
    }


    /**
     * Gets the searchExcludedWords value for this DoSearchResponse.
     * 
     * @return searchExcludedWords
     */
    public java.lang.String[] getSearchExcludedWords() {
        return searchExcludedWords;
    }


    /**
     * Sets the searchExcludedWords value for this DoSearchResponse.
     * 
     * @param searchExcludedWords
     */
    public void setSearchExcludedWords(java.lang.String[] searchExcludedWords) {
        this.searchExcludedWords = searchExcludedWords;
    }


    /**
     * Gets the searchCategories value for this DoSearchResponse.
     * 
     * @return searchCategories
     */
    public pl.allegro.webapi.service_php.CategoriesStruct[] getSearchCategories() {
        return searchCategories;
    }


    /**
     * Sets the searchCategories value for this DoSearchResponse.
     * 
     * @param searchCategories
     */
    public void setSearchCategories(pl.allegro.webapi.service_php.CategoriesStruct[] searchCategories) {
        this.searchCategories = searchCategories;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSearchResponse)) return false;
        DoSearchResponse other = (DoSearchResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.searchCount == other.getSearchCount() &&
            this.searchCountFeatured == other.getSearchCountFeatured() &&
            ((this.searchArray==null && other.getSearchArray()==null) || 
             (this.searchArray!=null &&
              java.util.Arrays.equals(this.searchArray, other.getSearchArray()))) &&
            ((this.searchExcludedWords==null && other.getSearchExcludedWords()==null) || 
             (this.searchExcludedWords!=null &&
              java.util.Arrays.equals(this.searchExcludedWords, other.getSearchExcludedWords()))) &&
            ((this.searchCategories==null && other.getSearchCategories()==null) || 
             (this.searchCategories!=null &&
              java.util.Arrays.equals(this.searchCategories, other.getSearchCategories())));
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
        _hashCode += getSearchCount();
        _hashCode += getSearchCountFeatured();
        if (getSearchArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchExcludedWords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchExcludedWords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchExcludedWords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchCategories(), i);
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
        new org.apache.axis.description.TypeDesc(DoSearchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSearchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "searchCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchCountFeatured");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "searchCountFeatured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "searchArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SearchResponseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchExcludedWords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "searchExcludedWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "searchCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesStruct"));
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
