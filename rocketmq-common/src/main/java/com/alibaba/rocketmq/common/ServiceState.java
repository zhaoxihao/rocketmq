/**
 * $Id: ServiceState.java 1831 2013-05-16 01:39:51Z shijia.wxr $
 */
package com.alibaba.rocketmq.common;

/**
 * 服务对象的状态，通常需要start，shutdown
 * 
 * @author vintage.wang@gmail.com shijia.wxr@taobao.com
 * 
 */
public enum ServiceState {
    CREATE_JUST,
    RUNNING,
    SHUTDOWN_ALREADY
}
