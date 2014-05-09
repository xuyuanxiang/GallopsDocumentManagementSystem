/**
 * SimpleAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.model;

public class SimpleAdmin  implements java.io.Serializable {
    private java.lang.String[] applicationNames;

    private java.lang.String[] domainNames;

    private java.lang.String email;

    private java.lang.String id;

    private java.lang.String loginno;

    private java.lang.String loginpwd;

    private java.lang.String name;

    private int[] userType;

    public SimpleAdmin() {
    }

    public SimpleAdmin(
           java.lang.String[] applicationNames,
           java.lang.String[] domainNames,
           java.lang.String email,
           java.lang.String id,
           java.lang.String loginno,
           java.lang.String loginpwd,
           java.lang.String name,
           int[] userType) {
           this.applicationNames = applicationNames;
           this.domainNames = domainNames;
           this.email = email;
           this.id = id;
           this.loginno = loginno;
           this.loginpwd = loginpwd;
           this.name = name;
           this.userType = userType;
    }


    /**
     * Gets the applicationNames value for this SimpleAdmin.
     * 
     * @return applicationNames
     */
    public java.lang.String[] getApplicationNames() {
        return applicationNames;
    }


    /**
     * Sets the applicationNames value for this SimpleAdmin.
     * 
     * @param applicationNames
     */
    public void setApplicationNames(java.lang.String[] applicationNames) {
        this.applicationNames = applicationNames;
    }


    /**
     * Gets the domainNames value for this SimpleAdmin.
     * 
     * @return domainNames
     */
    public java.lang.String[] getDomainNames() {
        return domainNames;
    }


    /**
     * Sets the domainNames value for this SimpleAdmin.
     * 
     * @param domainNames
     */
    public void setDomainNames(java.lang.String[] domainNames) {
        this.domainNames = domainNames;
    }


    /**
     * Gets the email value for this SimpleAdmin.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SimpleAdmin.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the id value for this SimpleAdmin.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SimpleAdmin.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the loginno value for this SimpleAdmin.
     * 
     * @return loginno
     */
    public java.lang.String getLoginno() {
        return loginno;
    }


    /**
     * Sets the loginno value for this SimpleAdmin.
     * 
     * @param loginno
     */
    public void setLoginno(java.lang.String loginno) {
        this.loginno = loginno;
    }


    /**
     * Gets the loginpwd value for this SimpleAdmin.
     * 
     * @return loginpwd
     */
    public java.lang.String getLoginpwd() {
        return loginpwd;
    }


    /**
     * Sets the loginpwd value for this SimpleAdmin.
     * 
     * @param loginpwd
     */
    public void setLoginpwd(java.lang.String loginpwd) {
        this.loginpwd = loginpwd;
    }


    /**
     * Gets the name value for this SimpleAdmin.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SimpleAdmin.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the userType value for this SimpleAdmin.
     * 
     * @return userType
     */
    public int[] getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this SimpleAdmin.
     * 
     * @param userType
     */
    public void setUserType(int[] userType) {
        this.userType = userType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleAdmin)) return false;
        SimpleAdmin other = (SimpleAdmin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationNames==null && other.getApplicationNames()==null) || 
             (this.applicationNames!=null &&
              java.util.Arrays.equals(this.applicationNames, other.getApplicationNames()))) &&
            ((this.domainNames==null && other.getDomainNames()==null) || 
             (this.domainNames!=null &&
              java.util.Arrays.equals(this.domainNames, other.getDomainNames()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.loginno==null && other.getLoginno()==null) || 
             (this.loginno!=null &&
              this.loginno.equals(other.getLoginno()))) &&
            ((this.loginpwd==null && other.getLoginpwd()==null) || 
             (this.loginpwd!=null &&
              this.loginpwd.equals(other.getLoginpwd()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              java.util.Arrays.equals(this.userType, other.getUserType())));
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
        if (getApplicationNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomainNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLoginno() != null) {
            _hashCode += getLoginno().hashCode();
        }
        if (getLoginpwd() != null) {
            _hashCode += getLoginpwd().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUserType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserType(), i);
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
        new org.apache.axis.description.TypeDesc(SimpleAdmin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:model.webservice.myapps.cn", "SimpleAdmin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
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
        elemField.setFieldName("loginno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginpwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginpwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
