/**
 * SimpleUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.model;

public class SimpleUser  implements java.io.Serializable {
    private java.lang.String defaultDepartmentName;

    private java.lang.String domainName;

    private java.lang.String email;

    private java.lang.String id;

    private java.lang.String loginno;

    private java.lang.String loginpwd;

    private java.lang.String name;

    private java.lang.String telephone;

    public SimpleUser() {
    }

    public SimpleUser(
           java.lang.String defaultDepartmentName,
           java.lang.String domainName,
           java.lang.String email,
           java.lang.String id,
           java.lang.String loginno,
           java.lang.String loginpwd,
           java.lang.String name,
           java.lang.String telephone) {
           this.defaultDepartmentName = defaultDepartmentName;
           this.domainName = domainName;
           this.email = email;
           this.id = id;
           this.loginno = loginno;
           this.loginpwd = loginpwd;
           this.name = name;
           this.telephone = telephone;
    }


    /**
     * Gets the defaultDepartmentName value for this SimpleUser.
     * 
     * @return defaultDepartmentName
     */
    public java.lang.String getDefaultDepartmentName() {
        return defaultDepartmentName;
    }


    /**
     * Sets the defaultDepartmentName value for this SimpleUser.
     * 
     * @param defaultDepartmentName
     */
    public void setDefaultDepartmentName(java.lang.String defaultDepartmentName) {
        this.defaultDepartmentName = defaultDepartmentName;
    }


    /**
     * Gets the domainName value for this SimpleUser.
     * 
     * @return domainName
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this SimpleUser.
     * 
     * @param domainName
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the email value for this SimpleUser.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SimpleUser.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the id value for this SimpleUser.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SimpleUser.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the loginno value for this SimpleUser.
     * 
     * @return loginno
     */
    public java.lang.String getLoginno() {
        return loginno;
    }


    /**
     * Sets the loginno value for this SimpleUser.
     * 
     * @param loginno
     */
    public void setLoginno(java.lang.String loginno) {
        this.loginno = loginno;
    }


    /**
     * Gets the loginpwd value for this SimpleUser.
     * 
     * @return loginpwd
     */
    public java.lang.String getLoginpwd() {
        return loginpwd;
    }


    /**
     * Sets the loginpwd value for this SimpleUser.
     * 
     * @param loginpwd
     */
    public void setLoginpwd(java.lang.String loginpwd) {
        this.loginpwd = loginpwd;
    }


    /**
     * Gets the name value for this SimpleUser.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SimpleUser.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the telephone value for this SimpleUser.
     * 
     * @return telephone
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this SimpleUser.
     * 
     * @param telephone
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleUser)) return false;
        SimpleUser other = (SimpleUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defaultDepartmentName==null && other.getDefaultDepartmentName()==null) || 
             (this.defaultDepartmentName!=null &&
              this.defaultDepartmentName.equals(other.getDefaultDepartmentName()))) &&
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
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
            ((this.telephone==null && other.getTelephone()==null) || 
             (this.telephone!=null &&
              this.telephone.equals(other.getTelephone())));
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
        if (getDefaultDepartmentName() != null) {
            _hashCode += getDefaultDepartmentName().hashCode();
        }
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
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
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:model.webservice.myapps.cn", "SimpleUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultDepartmentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultDepartmentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainName"));
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
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telephone"));
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
