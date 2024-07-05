package com.sunbeam.mobileshop.dtos;

enum UserStatus 
{
    success,error;
}
public class UserResult<T>{
    private UserStatus status;
    private T data;
    private String message;
   
   
    public UserResult() {
 
    }


    public UserResult(UserStatus status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }


    public UserStatus getStatus() {
        return status;
    }


    public void setStatus(UserStatus status) {
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


    @Override
    public String toString() {
        return "UserResult [status=" + status + ", data=" + data + ", message=" + message + "]";
    }

    public static <T> UserResult<T> success(T data)
    {
        UserResult<T> res= new UserResult<T>(UserStatus.success,data,null);
        return res;
    } 

    public static <T> UserResult<T> error(String message)
    {
        UserResult<T> res= new UserResult<T>(UserStatus.error,null,message);
        return res;
    }
    
 

}
