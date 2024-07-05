package com.sunbeam;

public class CapBean {
    private String userName;
    private String result;
    public CapBean()
    {

    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public void execute()
    {
        this.result=this.userName.toUpperCase();
    }


}
