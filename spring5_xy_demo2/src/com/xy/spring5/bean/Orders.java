package com.xy.spring5.bean;

public class Orders {
    private String oname;

    //无参数构造

    public Orders(){
        System.out.println("第一步，执行无参构造创建Bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，调用set方法设置属性值");
    }


    //创建执行初始化的方法
    public void initMethod(){
        System.out.println("第三步，执行初始化的方法");
    }


    //创建执行销毁的方法
    public void destroytMethod(){
        System.out.println("第五步，执行销毁的方法");
    }
}
