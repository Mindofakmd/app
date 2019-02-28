package com.zyf.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class NodeZ {
    private String nodeType;//节点类型 1、源节点 2、条件节点 3、数据处理节点 4、目标节点
    private String dataSourseId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String uuid;
    private String taskId;
    private Integer num;
    //对应源节点
    private List<OrderZ> orders;

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getDataSourseId() {
        return dataSourseId;
    }

    public void setDataSourseId(String dataSourseId) {
        this.dataSourseId = dataSourseId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public List<OrderZ> getOrders() {
        if(orders==null){
            orders = new ArrayList<>();
        }
        return orders;
    }

    public void setOrders(List<OrderZ> orders) {
        this.orders = orders;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
