package com.example.demo;

public class TranseModel {

    private String label;
    private String value;
    private String children;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TranseModel{" +
                "label='" + label + '\'' +
                ", value='" + value + '\'' +
                ", children='" + children + '\'' +
                '}';
    }
}
