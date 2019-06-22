package com.yrs.strategy;

import java.lang.annotation.*;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:40 2019/6/22
 * @Modified By:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface StrategyInfo {
    int type() default 0;
}
