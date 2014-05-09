/**
 * SimpleRelationHIS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.model;

public class SimpleRelationHIS  extends cn.myapps.base.dao.ValueObject  implements java.io.Serializable {
    private java.util.Calendar actiontime;

    private java.lang.Object[] actorhiss;

    private java.lang.String attitude;

    private java.lang.String auditor;

    private java.lang.String docid;

    private java.lang.String endnodeid;

    private java.lang.String endnodename;

    private java.lang.String flowOperation;

    private java.lang.String flowStateId;

    private java.lang.String flowid;

    private java.lang.String flowname;

    private boolean ispassed;

    private java.util.Calendar processtime;

    private int reminderCount;

    private java.lang.String startnodeid;

    private java.lang.String startnodename;

    private java.lang.Object[] userIdList;

    public SimpleRelationHIS() {
    }

    public SimpleRelationHIS(
           java.lang.String applicationid,
           java.lang.String domainid,
           java.lang.String id,
           boolean lazyLoad,
           java.lang.String sortId,
           int version,
           java.util.Calendar actiontime,
           java.lang.Object[] actorhiss,
           java.lang.String attitude,
           java.lang.String auditor,
           java.lang.String docid,
           java.lang.String endnodeid,
           java.lang.String endnodename,
           java.lang.String flowOperation,
           java.lang.String flowStateId,
           java.lang.String flowid,
           java.lang.String flowname,
           boolean ispassed,
           java.util.Calendar processtime,
           int reminderCount,
           java.lang.String startnodeid,
           java.lang.String startnodename,
           java.lang.Object[] userIdList) {
        super(
            applicationid,
            domainid,
            id,
            lazyLoad,
            sortId,
            version);
        this.actiontime = actiontime;
        this.actorhiss = actorhiss;
        this.attitude = attitude;
        this.auditor = auditor;
        this.docid = docid;
        this.endnodeid = endnodeid;
        this.endnodename = endnodename;
        this.flowOperation = flowOperation;
        this.flowStateId = flowStateId;
        this.flowid = flowid;
        this.flowname = flowname;
        this.ispassed = ispassed;
        this.processtime = processtime;
        this.reminderCount = reminderCount;
        this.startnodeid = startnodeid;
        this.startnodename = startnodename;
        this.userIdList = userIdList;
    }


    /**
     * Gets the actiontime value for this SimpleRelationHIS.
     * 
     * @return actiontime
     */
    public java.util.Calendar getActiontime() {
        return actiontime;
    }


    /**
     * Sets the actiontime value for this SimpleRelationHIS.
     * 
     * @param actiontime
     */
    public void setActiontime(java.util.Calendar actiontime) {
        this.actiontime = actiontime;
    }


    /**
     * Gets the actorhiss value for this SimpleRelationHIS.
     * 
     * @return actorhiss
     */
    public java.lang.Object[] getActorhiss() {
        return actorhiss;
    }


    /**
     * Sets the actorhiss value for this SimpleRelationHIS.
     * 
     * @param actorhiss
     */
    public void setActorhiss(java.lang.Object[] actorhiss) {
        this.actorhiss = actorhiss;
    }


    /**
     * Gets the attitude value for this SimpleRelationHIS.
     * 
     * @return attitude
     */
    public java.lang.String getAttitude() {
        return attitude;
    }


    /**
     * Sets the attitude value for this SimpleRelationHIS.
     * 
     * @param attitude
     */
    public void setAttitude(java.lang.String attitude) {
        this.attitude = attitude;
    }


    /**
     * Gets the auditor value for this SimpleRelationHIS.
     * 
     * @return auditor
     */
    public java.lang.String getAuditor() {
        return auditor;
    }


    /**
     * Sets the auditor value for this SimpleRelationHIS.
     * 
     * @param auditor
     */
    public void setAuditor(java.lang.String auditor) {
        this.auditor = auditor;
    }


    /**
     * Gets the docid value for this SimpleRelationHIS.
     * 
     * @return docid
     */
    public java.lang.String getDocid() {
        return docid;
    }


    /**
     * Sets the docid value for this SimpleRelationHIS.
     * 
     * @param docid
     */
    public void setDocid(java.lang.String docid) {
        this.docid = docid;
    }


    /**
     * Gets the endnodeid value for this SimpleRelationHIS.
     * 
     * @return endnodeid
     */
    public java.lang.String getEndnodeid() {
        return endnodeid;
    }


    /**
     * Sets the endnodeid value for this SimpleRelationHIS.
     * 
     * @param endnodeid
     */
    public void setEndnodeid(java.lang.String endnodeid) {
        this.endnodeid = endnodeid;
    }


    /**
     * Gets the endnodename value for this SimpleRelationHIS.
     * 
     * @return endnodename
     */
    public java.lang.String getEndnodename() {
        return endnodename;
    }


    /**
     * Sets the endnodename value for this SimpleRelationHIS.
     * 
     * @param endnodename
     */
    public void setEndnodename(java.lang.String endnodename) {
        this.endnodename = endnodename;
    }


    /**
     * Gets the flowOperation value for this SimpleRelationHIS.
     * 
     * @return flowOperation
     */
    public java.lang.String getFlowOperation() {
        return flowOperation;
    }


    /**
     * Sets the flowOperation value for this SimpleRelationHIS.
     * 
     * @param flowOperation
     */
    public void setFlowOperation(java.lang.String flowOperation) {
        this.flowOperation = flowOperation;
    }


    /**
     * Gets the flowStateId value for this SimpleRelationHIS.
     * 
     * @return flowStateId
     */
    public java.lang.String getFlowStateId() {
        return flowStateId;
    }


    /**
     * Sets the flowStateId value for this SimpleRelationHIS.
     * 
     * @param flowStateId
     */
    public void setFlowStateId(java.lang.String flowStateId) {
        this.flowStateId = flowStateId;
    }


    /**
     * Gets the flowid value for this SimpleRelationHIS.
     * 
     * @return flowid
     */
    public java.lang.String getFlowid() {
        return flowid;
    }


    /**
     * Sets the flowid value for this SimpleRelationHIS.
     * 
     * @param flowid
     */
    public void setFlowid(java.lang.String flowid) {
        this.flowid = flowid;
    }


    /**
     * Gets the flowname value for this SimpleRelationHIS.
     * 
     * @return flowname
     */
    public java.lang.String getFlowname() {
        return flowname;
    }


    /**
     * Sets the flowname value for this SimpleRelationHIS.
     * 
     * @param flowname
     */
    public void setFlowname(java.lang.String flowname) {
        this.flowname = flowname;
    }


    /**
     * Gets the ispassed value for this SimpleRelationHIS.
     * 
     * @return ispassed
     */
    public boolean isIspassed() {
        return ispassed;
    }


    /**
     * Sets the ispassed value for this SimpleRelationHIS.
     * 
     * @param ispassed
     */
    public void setIspassed(boolean ispassed) {
        this.ispassed = ispassed;
    }


    /**
     * Gets the processtime value for this SimpleRelationHIS.
     * 
     * @return processtime
     */
    public java.util.Calendar getProcesstime() {
        return processtime;
    }


    /**
     * Sets the processtime value for this SimpleRelationHIS.
     * 
     * @param processtime
     */
    public void setProcesstime(java.util.Calendar processtime) {
        this.processtime = processtime;
    }


    /**
     * Gets the reminderCount value for this SimpleRelationHIS.
     * 
     * @return reminderCount
     */
    public int getReminderCount() {
        return reminderCount;
    }


    /**
     * Sets the reminderCount value for this SimpleRelationHIS.
     * 
     * @param reminderCount
     */
    public void setReminderCount(int reminderCount) {
        this.reminderCount = reminderCount;
    }


    /**
     * Gets the startnodeid value for this SimpleRelationHIS.
     * 
     * @return startnodeid
     */
    public java.lang.String getStartnodeid() {
        return startnodeid;
    }


    /**
     * Sets the startnodeid value for this SimpleRelationHIS.
     * 
     * @param startnodeid
     */
    public void setStartnodeid(java.lang.String startnodeid) {
        this.startnodeid = startnodeid;
    }


    /**
     * Gets the startnodename value for this SimpleRelationHIS.
     * 
     * @return startnodename
     */
    public java.lang.String getStartnodename() {
        return startnodename;
    }


    /**
     * Sets the startnodename value for this SimpleRelationHIS.
     * 
     * @param startnodename
     */
    public void setStartnodename(java.lang.String startnodename) {
        this.startnodename = startnodename;
    }


    /**
     * Gets the userIdList value for this SimpleRelationHIS.
     * 
     * @return userIdList
     */
    public java.lang.Object[] getUserIdList() {
        return userIdList;
    }


    /**
     * Sets the userIdList value for this SimpleRelationHIS.
     * 
     * @param userIdList
     */
    public void setUserIdList(java.lang.Object[] userIdList) {
        this.userIdList = userIdList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleRelationHIS)) return false;
        SimpleRelationHIS other = (SimpleRelationHIS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actiontime==null && other.getActiontime()==null) || 
             (this.actiontime!=null &&
              this.actiontime.equals(other.getActiontime()))) &&
            ((this.actorhiss==null && other.getActorhiss()==null) || 
             (this.actorhiss!=null &&
              java.util.Arrays.equals(this.actorhiss, other.getActorhiss()))) &&
            ((this.attitude==null && other.getAttitude()==null) || 
             (this.attitude!=null &&
              this.attitude.equals(other.getAttitude()))) &&
            ((this.auditor==null && other.getAuditor()==null) || 
             (this.auditor!=null &&
              this.auditor.equals(other.getAuditor()))) &&
            ((this.docid==null && other.getDocid()==null) || 
             (this.docid!=null &&
              this.docid.equals(other.getDocid()))) &&
            ((this.endnodeid==null && other.getEndnodeid()==null) || 
             (this.endnodeid!=null &&
              this.endnodeid.equals(other.getEndnodeid()))) &&
            ((this.endnodename==null && other.getEndnodename()==null) || 
             (this.endnodename!=null &&
              this.endnodename.equals(other.getEndnodename()))) &&
            ((this.flowOperation==null && other.getFlowOperation()==null) || 
             (this.flowOperation!=null &&
              this.flowOperation.equals(other.getFlowOperation()))) &&
            ((this.flowStateId==null && other.getFlowStateId()==null) || 
             (this.flowStateId!=null &&
              this.flowStateId.equals(other.getFlowStateId()))) &&
            ((this.flowid==null && other.getFlowid()==null) || 
             (this.flowid!=null &&
              this.flowid.equals(other.getFlowid()))) &&
            ((this.flowname==null && other.getFlowname()==null) || 
             (this.flowname!=null &&
              this.flowname.equals(other.getFlowname()))) &&
            this.ispassed == other.isIspassed() &&
            ((this.processtime==null && other.getProcesstime()==null) || 
             (this.processtime!=null &&
              this.processtime.equals(other.getProcesstime()))) &&
            this.reminderCount == other.getReminderCount() &&
            ((this.startnodeid==null && other.getStartnodeid()==null) || 
             (this.startnodeid!=null &&
              this.startnodeid.equals(other.getStartnodeid()))) &&
            ((this.startnodename==null && other.getStartnodename()==null) || 
             (this.startnodename!=null &&
              this.startnodename.equals(other.getStartnodename()))) &&
            ((this.userIdList==null && other.getUserIdList()==null) || 
             (this.userIdList!=null &&
              java.util.Arrays.equals(this.userIdList, other.getUserIdList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getActiontime() != null) {
            _hashCode += getActiontime().hashCode();
        }
        if (getActorhiss() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActorhiss());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActorhiss(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttitude() != null) {
            _hashCode += getAttitude().hashCode();
        }
        if (getAuditor() != null) {
            _hashCode += getAuditor().hashCode();
        }
        if (getDocid() != null) {
            _hashCode += getDocid().hashCode();
        }
        if (getEndnodeid() != null) {
            _hashCode += getEndnodeid().hashCode();
        }
        if (getEndnodename() != null) {
            _hashCode += getEndnodename().hashCode();
        }
        if (getFlowOperation() != null) {
            _hashCode += getFlowOperation().hashCode();
        }
        if (getFlowStateId() != null) {
            _hashCode += getFlowStateId().hashCode();
        }
        if (getFlowid() != null) {
            _hashCode += getFlowid().hashCode();
        }
        if (getFlowname() != null) {
            _hashCode += getFlowname().hashCode();
        }
        _hashCode += (isIspassed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProcesstime() != null) {
            _hashCode += getProcesstime().hashCode();
        }
        _hashCode += getReminderCount();
        if (getStartnodeid() != null) {
            _hashCode += getStartnodeid().hashCode();
        }
        if (getStartnodename() != null) {
            _hashCode += getStartnodename().hashCode();
        }
        if (getUserIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserIdList(), i);
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
        new org.apache.axis.description.TypeDesc(SimpleRelationHIS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:model.webservice.myapps.cn", "SimpleRelationHIS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actiontime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actiontime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actorhiss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actorhiss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endnodeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endnodeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endnodename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endnodename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowStateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowStateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ispassed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ispassed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reminderCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startnodeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startnodeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startnodename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startnodename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
