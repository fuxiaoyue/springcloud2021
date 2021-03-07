package com.guanghui.payment.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResult<T> {
    private int code;
    private String message;
    private T  data;

    public BaseResult(int code, String message){
        this(code,message,null);
    }
}
