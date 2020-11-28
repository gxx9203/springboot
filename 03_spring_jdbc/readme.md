1. 安装mysql 数据库

 sudo apt install mysql-server 

 2.  root 登录 

  sudo mysql -u root -p 

  回车，

  
  3.创建用户

// localhost 登录， 用户名 test  密码 123

mysql> create user 'test'@'localhost' identified by '123';
// 其他地址 登录

mysql>  create user 'test'@'%' identified by '123';


4. 授权
grant all privileges on *.* to 'test'@'localhost' ;


5. 使用test  登录，
 mysql -u root -p 
  输入密码

6.创建 db 
  create database test01;

7.创建table

 use test01;


 CREATE TABLE `User` (
  `name` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `age` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci


--------------------


