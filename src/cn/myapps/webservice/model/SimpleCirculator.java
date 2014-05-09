/**
 * SimpleCirculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.model;

public class SimpleCirculator  implements java.io.Serializable {
    private java.util.Calendar ccTime;

    private java.util.Calendar deadline;

    private java.lang.String docId;

    private java.lang.String flowstatertId;

    private java.lang.String formId;

    private java.lang.String name;

    private java.lang.String nodertId;

    private boolean read;

    private java.util.Calendar readTime;

    private java.lang.String summary;

    private java.lang.String userId;

    public SimpleCirculator() {
    }

    public SimpleCirculator(
           java.util.Calendar ccTime,
           java.util.Calendar deadline,
           java.lang.String docId,
           java.lang.String flowstatertId,
           java.lang.String formId,
           java.lang.String name,
           java.lang.String nodertId,
           boolean read,
           java.util.Calendar readTime,
           java.lang.String summary,
           java.lang.String userId) {
           this.ccTime = ccTime;
           this.deadline = deadline;
           this.docId = docId;
           this.flowstatertId = flowstatertId;
           this.formId = formId;
           this.name = name;
           this.nodertId = nodertId;
           this.read = read;
           this.readTime = readTime;
           this.summary = summary;
           this.userId = userId;
    }


    /**
     * Gets the ccTime value for this SimpleCirculator.
     * 
     * @return ccTime
     */
    public java.util.Calendar getCcTime() {
        return ccTime;
    }


    /**
     * Sets the ccTime value for this SimpleCirculator.
     * 
     * @param ccTime
     */
    public void setCcTime(java.util.Calendar ccTime) {
        this.ccTime = ccTime;
    }


    /**
     * Gets the deadline value for this SimpleCirculator.
     * 
     * @return deadline
     */
    public java.util.Calendar getDeadline() {
        return deadline;
    }


    /**
     * Sets the deadline value for this SimpleCirculator.
     * 
     * @param deadline
     */
    public void setDeadline(java.util.Calendar deadline) {
        this.deadline = deadline;
    }


    /**
     * Gets the docId value for this SimpleCirculator.
     * 
     * @return docId
     */
    public java.lang.String getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this SimpleCirculator.
     * 
     * @param docId
     */
    public void setDocId(java.lang.String docId) {
        this.docId = docId;
    }


    /**
     * Gets the flowstatertId value for this SimpleCirculator.
     * 
     * @return flowstatertId
     */
    public java.lang.String getFlowstatertId() {
        return flowstatertId;
    }


    /**
     * Sets the flowstatertId value for this SimpleCirculator.
     * 
     * @param flowstatertId
     */
    public void setFlowstatertId(java.lang.String flowstatertId) {
        this.flowstatertId = flowstatertId;
    }


    /**
     * Gets the formId value for this SimpleCirculator.
     * 
     * @return formId
     */
    public java.lang.String getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this SimpleCirculator.
     * 
     * @param formId
     */
    public void setFormId(java.lang.String formId) {
        this.formId = formId;
    }


    /**
     * Gets the name value for this SimpleCirculator.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SimpleCirculator.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nodertId value for this SimpleCirculator.
     * 
     * @return nodertId
     */
    public java.lang.String getNodertId() {
        return nodertId;
    }


    /**
     * Sets the nodertId value for this SimpleCirculator.
     * 
     * @param nodertId
     */
    public void setNodertId(java.lang.String nodertId) {
        this.nodertId = nodertId;
    }


    /**
     * Gets the read value for this SimpleCirculator.
     * 
     * @return read
     */
    public boolean isRead() {
        return read;
    }


    /**
     * Sets the read value for this SimpleCirculator.
     * 
     * @param read
     */
    public void setRead(boolean read) {
        this.read = read;
    }


    /**
     * Gets the readTime value for this SimpleCirculator.
     * 
     * @return readTime
     */
    public java.util.Calendar getReadTime() {
        return readTime;
    }


    /**
     * Sets the readTime value for this SimpleCirculator.
     * 
     * @param readTime
     */
    public void setReadTime(java.util.Calendar readTime) {
        this.readTime = readTime;
    }


    /**
     * Gets the summary value for this SimpleCirculator.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this SimpleCirculator.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the userId value for this SimpleCirculator.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SimpleCirculator.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleCirculator)) return false;
        SimpleCirculator other = (SimpleCirculator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ccTime==null && other.getCcTime()==null) || 
             (this.ccTime!=null &&
              this.ccTime.equals(other.getCcTime()))) &&
            ((this.deadline==null && other.getDeadline()==null) || 
             (this.deadline!=null &&
              this.deadline.equals(other.getDeadline()))) &&
            ((this.docId==null && other.getDocId()==null) || 
             (this.docId!=null &&
              this.docId.equals(other.getDocId()))) &&
            ((this.flowstatertId==null && other.getFlowstatertId()==null) || 
             (this.flowstatertId!=null &&
              this.flowstatertId.equals(other.getFlowstatertId()))) &&
            ((this.formId==null && other.getFormId()==null) || 
             (this.formId!=null &&
              this.formId.equals(other.getFormId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nodertId==null && other.getNodertId()==null) || 
             (this.nodertId!=null &&
              this.nodertId.equals(other.getNodertId()))) &&
            this.read == other.isRead() &&
            ((this.readTime==null && other.getReadTime()==null) || 
             (this.readTime!=null &&
              this.readTime.equals(other.getReadTime()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getCcTime() != null) {
            _hashCode += getCcTime().hashCode();
        }
        if (getDeadline() != null) {
            _hashCode += getDeadline().hashCode();
        }
        if (getDocId() != null) {
            _hashCode += getDocId().hashCode();
        }
        if (getFlowstatertId() != null) {
            _hashCode += getFlowstatertId().hashCode();
        }
        if (getFormId() != null) {
            _hashCode += getFormId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNodertId() != null) {
            _hashCode += getNodertId().hashCode();
        }
        _hashCode += (isRead() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReadTime() != null) {
            _hashCode += getReadTime().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleCirculator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:model.webservice.myapps.cn", "SimpleCirculator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowstatertId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowstatertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formId"));
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
        elemField.setFieldName("nodertId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("read");
        elemField.setXmlName(new javax.xml.namespace.QName("", "read"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
