package com.aika.testng;

import org.junit.Before;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @Author: Aikachin
 * @Description:
 * @Date: Created in 16:57 2017/10/31 0031.
 * @Modified by :
 */
public class tesDouban {

    @Before
    public void testBefore() {
        Reporter.log("--开始执行类：" + this.getClass().getName());
    }

    @Test
    public void tesdd() {
        Reporter.log("开始执行TestCase：" + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
        Reporter.log("TestCase通过：" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
