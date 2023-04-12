package com.trx.pattern.proxy.dynamicproxy.GpProxy.proxy;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
