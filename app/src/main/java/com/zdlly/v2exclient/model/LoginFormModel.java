package com.zdlly.v2exclient.model;

/**
 * Created by zdlly on 2017/4/16.
 */

public class LoginFormModel {

    private String nameKey;
    private String pswKey;
    private String once;

    public String getOnce() {
        return once;
    }

    public void setOnce(String once) {
        this.once = once;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public String getPswKey() {
        return pswKey;
    }

    public void setPswKey(String pswKey) {
        this.pswKey = pswKey;
    }
}