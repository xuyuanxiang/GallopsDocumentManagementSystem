/**
 * ValueObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.base.dao;

public abstract class ValueObject  implements java.io.Serializable {
    private java.lang.String applicationid;

    private java.lang.String domainid;

    private java.lang.String id;

    private boolean lazyLoad;

    private java.lang.String sortId;

    private int version;

    public ValueObject() {
    }

    public ValueObject(
           java.lang.String applicationid,
           java.lang.String domainid,
           java.lang.String id,
           boolean lazyLoad,
           java.lang.String sortId,
           int version) {
           this.applicationid = applicationid;
           this.domainid = domainid;
           this.id = id;
           this.lazyLoad = lazyLoad;
           this.sortId = sortId;
           this.version = version;
    }


    /**
     * Gets the applicationid value for this ValueObject.
     * 
     * @return applicationid
     */
    public java.lang.String getApplicationid() {
        return applicationid;
    }


    /**
     * Sets the applicationid value for this ValueObject.
     * 
     * @param applicationid
     */
    public void setApplicationid(java.lang.String applicationid) {
        this.applicationid = applicationid;
    }


    /**
     * Gets the domainid value for this ValueObject.
     * 
     * @return domainid
     */
    public java.lang.String getDomainid() {
        return domainid;
    }


    /**
     * Sets the domainid value for this ValueObject.
     * 
     * @param domainid
     */
    public void setDomainid(java.lang.String domainid) {
        this.domainid = domainid;
    }


    /**
     * Gets the id value for this ValueObject.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ValueObject.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the lazyLoad value for this ValueObject.
     * 
     * @return lazyLoad
     */
    public boolean isLazyLoad() {
        return lazyLoad;
    }


    /**
     * Sets the lazyLoad value for this ValueObject.
     * 
     * @param lazyLoad
     */
    public void setLazyLoad(boolean lazyLoad) {
        this.lazyLoad = lazyLoad;
    }


    /**
     * Gets the sortId value for this ValueObject.
     * 
     * @return sortId
     */
    public java.lang.String getSortId() {
        return sortId;
    }


    /**
     * Sets the sortId value for this ValueObject.
     * 
     * @param sortId
     */
    public void setSortId(java.lang.String sortId) {
        this.sortId = sortId;
    }


    /**
     * Gets the version value for this ValueObject.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ValueObject.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueObject)) return false;
        ValueObject other = (ValueObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationid==null && other.getApplicationid()==null) || 
             (this.applicationid!=null &&
              this.applicationid.equals(other.getApplicationid()))) &&
            ((this.domainid==null && other.getDomainid()==null) || 
             (this.domainid!=null &&
              this.domainid.equals(other.getDomainid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.lazyLoad == other.isLazyLoad() &&
            ((this.sortId==null && other.getSortId()==null) || 
             (this.sortId!=null &&
              this.sortId.equals(other.getSortId()))) &&
            this.version == other.getVersion();
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
        if (getApplicationid() != null) {
            _hashCode += getApplicationid().hashCode();
        }
        if (getDomainid() != null) {
            _hashCode += getDomainid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += (isLazyLoad() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSortId() != null) {
            _hashCode += getSortId().hashCode();
        }
        _hashCode += getVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValueObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dao.base.myapps.cn", "ValueObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lazyLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lazyLoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
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
