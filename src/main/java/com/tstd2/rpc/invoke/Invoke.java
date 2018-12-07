package com.tstd2.rpc.invoke;

/**
 * 具体的调用者
 */
public interface Invoke {

    Object invoke(Invocation invocation) throws Exception;

}
