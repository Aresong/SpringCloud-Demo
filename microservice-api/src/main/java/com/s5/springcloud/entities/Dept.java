package com.s5.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: Aresong
 * @Date: 2019/7/23 0:05
 * @Version 1.0
 */

//全是lombok
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@Data
@Accessors(chain = true)//链式风格
public class Dept implements Serializable {//entities orm

    private static final long serialVersionUID = 5959487087109177528L;

    /**
     *  部门编码 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 数据库名称
     */
    private String dbSource;//来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

//    public static void main(String[] args){
//        Dept dept = new Dept();
//        dept.setDbSource("").setDeptName("").setDeptNo(1l);//链式风格
//    }
}
