package com.oak;

import lombok.val;
import lombok.var;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 季于东
 * @date 2020/11/25
 */
public class DemoTest {
    @Test
    public void demoTest() {
        //读取配置文件中的信息
        try {
            Properties pt = new Properties();
            val filePath = DemoTest.class.getClassLoader()
                    .getResource("dbb.properties").openStream();
            pt.load(filePath);
            var url = pt.getProperty("jdbc.url");
            var user = pt.getProperty("jdbc.username");
            var password = pt.getProperty("jdbc.password");
            var driver = pt.getProperty("jdbc.driver");
            System.out.println(user);
            System.out.println(url);
            System.out.println(password);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
