package com.zyf.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderZ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String uuid;//
    private String nodeId;//对应的节点id
    private String taskId;
    private String ordername;//指令 if or select or from or where
    private String colName;//字段
    private String relFlag;//是否包含等
    private String value;//值
    private String logicStr;//逻辑关系
    private String tableName;//表名
    private String javaType;//java类别

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getRelFlag() {
        return relFlag;
    }

    public void setRelFlag(String relFlag) {
        this.relFlag = relFlag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLogicStr() {
        return logicStr;
    }

    public void setLogicStr(String logicStr) {
        this.logicStr = logicStr;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }
}
