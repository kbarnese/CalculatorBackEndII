package com.barnese.jax;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Values {

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getValueIndex() {
        return valueIndex;
    }

    public void setValueIndex(String valueIndex) {
        this.valueIndex = valueIndex;
    }

    int value;
    String valueIndex;

    public Values(String valueIndex, int value){
        this.value = value;
        this.valueIndex = valueIndex;
    }
}
