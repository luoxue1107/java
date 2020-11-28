yum -y update
yum -y install epel https://repo.mysql.com//mysql80-community-release-el7-3.noarch.rpm
yum makecache
yum -y install mysql-community-server
systemctl start mysqld
systemctl enable mysqld
grep 'temporary password' /var/log/mysqld.log
##使用初始密码登录
mysql -uroot -p
## 修改密码
set global validate_password.policy=0;

set global validate_password.length=4;

ALTER USER 'root'@'localhost' IDENTIFIED BY '123456';

flush privileges;

ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '123456';

flush privileges;

update mysql.user set host = '%',plugin='mysql_native_password' where user='root';

flush privileges;

exit

systemctl restart mysqld

## 使用新密码连接
mysql -h 你自己的IP地址 -uroot -p