/**
 * $Id: RemotingCommandType.java 1831 2013-05-16 01:39:51Z shijia.wxr $
 */
package com.alibaba.rocketmq.remoting.protocol;

/**
 * 命令类型，请求还是应答
 * 
 * @author vintage.wang@gmail.com shijia.wxr@taobao.com
 * 
 */
public enum RemotingCommandType {
    REQUEST_COMMAND,
    RESPONSE_COMMAND;
}
