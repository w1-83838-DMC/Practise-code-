package com.bank;

import java.io.FileOutputStream;

import org.springframework.stereotype.Component;


@Component
public class FileLoggerImpl implements Logger{

    private String logFilePath=" applog.txt";
        
    public void log(String message) {
       try(FileOutputStream fout= new FileOutputStream(logFilePath,true))
       {
            message+="\n";
            fout.write(message.getBytes());

       }catch(Exception e)
       {
            e.printStackTrace();
       }
    }

}
