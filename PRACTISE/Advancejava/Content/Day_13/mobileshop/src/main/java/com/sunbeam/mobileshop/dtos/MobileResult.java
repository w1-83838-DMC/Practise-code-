package com.sunbeam.mobileshop.dtos;

enum MobileStatus
{
    success,error;

}
public class MobileResult<T>{
    private MobileStatus status;
    private T data;
    private String message;
    public MobileResult() {
    }
    public MobileResult(MobileStatus status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }
    public MobileStatus getStatus() {
        return status;
    }
    public void setStatus(MobileStatus status) {
        this.status = status;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public static<T> MobileResult<T> success(T data)
    {
        MobileResult<T> res= new MobileResult<T>(MobileStatus.success,data,null);
        return res;
    }

    public static<T> MobileResult<T> error(String message)
    {
        MobileResult<T> res= new MobileResult<>(MobileStatus.error,null,message);
        return res;

    }

    



}
