升级系统和软件
yum -y update
关闭防火墙
systemctl stop firewalld
systemctl disable firewalld
编辑/etc/selinux/config文件中将
SELINUX=enforcing修改为
SELINUX=disabled
保存后执行
setenforce 0
	
系统环境
系统版本

[root@n1 ~]# cat /etc/redhat-release

CentOS Linux release 7.7.1908 (Core)

安装nginx
安装依赖

[root@n1 ~]# yum -y install gcc gcc-c++
[root@n1 ~]# yum -y install zlib zlib-devel openssl openssl-devel pcre-devel
[root@n1 ~]# yum -y install vim net-tools man wget
yum -y install gcc gcc-c++ zlib zlib-devel openssl openssl-devel pcre-devel vim net-tools man wget epel-release
 
gcc gcc-c++编译环境
gzip    模块需要 zlib 库
rewrite 模块需要 pcre 库
ssl     功能需要openssl库
下载安装包

[root@n1 ~]# wget http://nginx.org/download/nginx-1.16.1.tar.gz
[root@n1 ~]# tar -zxvf nginx-1.16.1.tar.gz
[root@n1 ~]# cd nginx-1.16.1/
添加nginx组，用户

[root@n1 nginx-1.16.1]# groupadd nginx
[root@n1 nginx-1.16.1]# useradd nginx -g nginx -s /sbin/nologin -M
对nginx进行配置

[root@n1 nginx-1.16.1]# ./configure --user=nginx --group=nginx --prefix=/usr/local/nginx --with-http_stub_status_module --with-http_ssl_module --with-http_realip_module --with-http_gzip_static_module
#查看是否配置成功（$? 是显示最后命令的退出状态，0表示没有错误，其他表示有错误）

[root@n1 nginx-1.16.1]# echo $?

0

编译安装

[root@n1 nginx-1.16.1]# make && make install
[root@n1 nginx-1.16.1]# echo $?
0
查看nginx版本号

[root@n1 ~]# /usr/local/nginx/sbin/nginx -v
nginx version: nginx/1.16.1
检查配置文件语法是否正确

[root@n1 ~]# /usr/local/nginx/sbin/nginx -t
nginx: the configuration file /usr/local/nginx/conf/nginx.conf syntax is ok
nginx: configuration file /usr/local/nginx/conf/nginx.conf test is successful
启动nginx

[root@n1 ~]# /usr/local/nginx/sbin/nginx
/usr/local/nginx/sbin/nginx -s reload                 重新载入配置文件
/usr/local/nginx/sbin/nginx -s stop                   快速关闭 Nginx
/usr/local/nginx/sbin/nginx -s quit                   关闭Nginx
 查看端口

​  ​

客户端访问：

​  ​

编写启动脚本
[root@n1 ~]# vim  /usr/lib/systemd/system/nginx.service

[Unit]
Description=nginx
After=network.target remote-fs.target nss-lookup.target
 
[Service]
Type=forking
PIDFile=/usr/local/nginx/logs/nginx.pid
ExecStartPost=/bin/sleep 0.1
ExecStartPre=/usr/local/nginx/sbin/nginx -t -c /usr/local/nginx/conf/nginx.conf
ExecStart=/usr/local/nginx/sbin/nginx -c /usr/local/nginx/conf/nginx.conf
ExecReload=/bin/kill -s HUP $MAINPID
ExecStop=/bin/kill -s QUIT $MAINPID
PrivateTmp=true
 
[Install]
WantedBy=multi-user.target
使用：

systemctl start|stop|reload|restart|status nginx.service
开机自启：
systemctl enable nginx.service
关闭开机自启：
systemctl disable nginx.service