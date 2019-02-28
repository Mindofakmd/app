package com.zyf.app.model;

import java.util.List;

public class TempBean {
    private  String key;
    private List<String> cols;
    private List<Object> vals;
    private List<String> typs;

    public List<String> getCols() {
        return cols;
    }

    public void setCols(List<String> cols) {
        this.cols = cols;
    }

    public List<Object> getVals() {
        return vals;
    }

    public void setVals(List<Object> vals) {
        this.vals = vals;
    }

    public List<String> getTyps() {
        return typs;
    }

    public void setTyps(List<String> typs) {
        this.typs = typs;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
