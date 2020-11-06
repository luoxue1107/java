# MySQL数据库

## 概述

```
数据库是一个长期存储在计算机内的、有组织的、有共享的、统一管理的数据集合.
在数据库中的数据我们可以用二维表格的形式理解,例如
表格中一列的标题我们称之为字段
表格中一行数据我们称之为一条记录
```

```
数据库由3部分组成
数据库：用于存储数据
数据库管理系统：用户管理数据库的软件
数据库应用程序：为了提高数据库系统的管理能力使用的数据库管理的补充
```

![](./img/sql01.png)

## SQL操作

连接数据库

```sql
mysql 命令格式： mysql -h 主机地址 -u 用户名 －p用户密码           
#注意用户名前可以有空格也可以没有空格，但是密码前必须没有空格，否则让你重新输入密。本地连接数据
#本地连接
mysql -uroot -p
```

如果刚安装好 MYSQL，超级用户 root 是没有密码的，故直接回车即可进入到 MYSQL

修改用户密码

```sql
mysqladmin 命令用于修改用户密码。

mysqladmin 命令格式：mysqladmin -u 用户名 -p 旧密码 password 新密码

1, 给 root 加个密码 123456
首先进入目录 mysql\bin，然后键入以下命令：
mysqladmin -u root -password 123456
注：因为开始时 root 没有密码，所以-p 旧密码一项就可以省略了。

2. 再将 root 的密码改为 67890
mysqladmin -u root -p 123456 password 67890
```

 grant on：新增用户

```sql
#grant on 命令格式：grant select on 数据库.* to 用户名@登录主机 identified by “密码”;
grant select,insert,update,delete on *.* to [email=test1@”%]test1@”%[/email]” Identified by “abc”;
#增加一个用户 test2 密码为 abc，让他只可以在 localhost 上登录，并可以对数据库 mydb
#进行查询、插入、修改、删除的操作（localhost 指本地主机，即 MYSQL 数据库所在的那台主
#机），这样用户即使用知道 test2 的密码，他也无法从 internet 上直接访问数据库，只能通过
#MYSQL 主机上的 web 页来访问了。
grant select,insert,update,delete on mydb.* to [email=test2@localhost]test2@localhost[/email] identified by
“abc”;
如果你不想 test2 有密码，可以再打一个命令将密码消掉。
grant select,insert,update,delete on mydb.* to [email=test2@localhost]test2@localhost[/email] identified by “”;

```

常用代码

create：创建数据库

```sql
# create 命令格式：create database <数据库名>;
create database xhkdb;

#创建数据库并分配用户：
GRANT SELECT,INSERT,UPDATE,DELETE,CREATE,DROP,ALTER ON 数据库名.* TO数据库名@localhost IDENTIFIED BY '密码';
SET PASSWORD FOR '数据库名'@'localhost' = OLD_PASSWORD('密码');
注意：中文 “密码”和“数据库”是户自己需要设置的。

#创建数据库
create database 数据库名 default character set utf8;



```

```

```

