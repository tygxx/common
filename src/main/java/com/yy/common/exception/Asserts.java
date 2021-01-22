package com.yy.common.exception;

import com.yy.common.api.IErrorCode;

/*
 *@Description: 断言处理类，用于抛出各种API异常
 *@ClassAuthor: tengYong
 *@Date: 2021-01-21 13:58:01
*/
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
