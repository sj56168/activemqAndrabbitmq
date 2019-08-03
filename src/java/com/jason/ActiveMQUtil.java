package com.jason;

import cn.hutool.core.util.NetUtil;

import javax.swing.*;

/**
 * Created by 我不管我最帅 on 2019/5/28.
 */
public class ActiveMQUtil {
    public static void main(String[] args) {
        checkServer();
    }
    public static void checkServer() {
        if(NetUtil.isUsableLocalPort(8161)) {
            System.out.println("主要分支");
            JOptionPane.showMessageDialog(null, "ActiveMQ 服务器未启动 ");
            System.exit(1);
        }
    }
}
