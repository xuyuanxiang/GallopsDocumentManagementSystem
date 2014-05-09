/**
 * SimpleDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.model;

public class SimpleDocument  implements java.io.Serializable {
    private java.lang.String id;

    private java.util.HashMap items;

    private java.lang.String stateLabel;

    public SimpleDocument() {
    }

    public SimpleDocument(
           java.lang.String id,
           java.util.HashMap items,
           java.lang.String stateLabel) {
           this.id = id;
           this.items = items;
           this.stateLabel = stateLabel;
    }


    /**
     * Gets the id value for this SimpleDocument.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SimpleDocument.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the items value for this SimpleDocument.
     * 
     * @return items
     */
    public java.util.HashMap getItems() {
        return items;
    }


    /**
     * Sets the items value for this SimpleDocument.
     * 
     * @param items
     */
    public void setItems(java.util.HashMap items) {
        this.items = items;
    }


    /**
     * Gets the stateLabel value for this SimpleDocument.
     * 
     * @return stateLabel
     */
    public java.lang.String getStateLabel() {
        return stateLabel;
    }


    /**
     * Sets the stateLabel value for this SimpleDocument.
     * 
     * @param stateLabel
     */
    public void setStateLabel(java.lang.String stateLabel) {
        this.stateLabel = stateLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleDocument)) return false;
        SimpleDocument other = (SimpleDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              this.items.equals(other.getItems()))) &&
            ((this.stateLabel==null && other.getStateLabel()==null) || 
             (this.stateLabel!=null &&
              this.stateLabel.equals(other.getStateLabel())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getItems() != null) {
            _hashCode += getItems().hashCode();
        }
        if (getStateLabel() != null) {
            _hashCode += getStateLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:model.webservice.myapps.cn", "SimpleDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
