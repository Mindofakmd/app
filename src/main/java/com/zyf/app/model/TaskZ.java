package com.zyf.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class TaskZ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String uuid;
    private String taskName;//任务名称
    private String ownner;//
    private String excuteType;//任务执行类别 比如每天几点执行或者间隔多久执行一次
    private String prop;//对应上面的类别的参数， 10点 或者 间隔 5 分钟

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getOwnner() {
        return ownner;
    }

    public void setOwnner(String ownner) {
        this.ownner = ownner;
    }

    public String getExcuteType() {
        return excuteType;
    }

    public void setExcuteType(String excuteType) {
        this.excuteType = excuteType;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public DataSourse getSourse() {
        return sourse;
    }

    public void setSourse(DataSourse sourse) {
        this.sourse = sourse;
    }

    public DataSourse getTarget() {
        return target;
    }

    public void setTarget(DataSourse target) {
        this.target = target;
    }

    public List<NodeZ> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeZ> nodes) {
        this.nodes = nodes;
    }

    private DataSourse sourse;

    private DataSourse target;

    private List<NodeZ> nodes;
}
