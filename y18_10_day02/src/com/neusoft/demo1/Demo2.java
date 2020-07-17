package com.neusoft.demo1;

import javax.swing.*;
import java.awt.*;

public class Demo2 {
    public static void main(String[] args) {
        JFrame jflogin = new JFrame("用户登录界面");
        Container conn = jflogin.getContentPane();   //得到窗口的容器
        conn.setLayout(null);   //设置布局方式为空 也就是绝对布局
        JTextField UserName = new JTextField("");     //创建一个标签 并设置初始内容
        JTextField LPassword = new JTextField("");
        UserName.setBounds(60, 20, 240, 30);
        LPassword.setBounds(60, 60, 240, 30);
        JLabel Name = new JLabel("用户名:");
        JLabel Password = new JLabel("密  码:");
        JButton Login = new JButton("登入");    //创建一个按钮
        Name.setBounds(10, 20, 100, 30);    //设置大小和位置
        Password.setBounds(10, 60, 100, 30);    //设置大小和位置
        Login.setBounds(150, 120, 75, 30);    //设置按钮的大小和位置

        conn.add(UserName);
        conn.add(LPassword);
        conn.add(Name);   //添加到容器
        conn.add(Password);   //添加到容器
        conn.add(Login);
        jflogin.setBounds(800, 300, 400, 200);  //设置窗口的属性 窗口位置以及窗口的大小
        jflogin.setVisible(true);//设置窗口可见
        jflogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //设置关闭方式 如果不设置的话 似乎关闭窗口之后不会退出程序
    }
}