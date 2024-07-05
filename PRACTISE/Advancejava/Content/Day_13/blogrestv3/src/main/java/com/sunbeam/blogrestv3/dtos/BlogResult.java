package com.sunbeam.blogrestv3.dtos;


enum BlogStatus
{
    success,error
}
public class BlogResult<T>{
    
    private BlogStatus status;
    private T data;
    private String message;
   
    public BlogResult() {
    }

    public BlogResult(BlogStatus status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public BlogStatus getStatus() {
        return status;
    }

    public void setStatus(BlogStatus status) {
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

    public static<T> BlogResult<T> success(T data)
    {
        BlogResult<T> res= new BlogResult<T>(BlogStatus.success,data,null);
        return res;
    }

    public static <T> BlogResult<T> error(String message)
    {
        BlogResult<T>res= new BlogResult<>(BlogStatus.error,null,message);
        return res;
    }

    
    

    
 
    

    




}
