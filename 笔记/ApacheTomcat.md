进入tomcat下的bin目录（本人电脑的路径为D:\JavaEE\apache-tomcat-9.0.8\bin），执行“service.bat install” 。（附：service卸载命令：service.bat remove）

端口被占用了，可以打开 "cmd" 命令符界面，然后输入"netstat -a" 命令查看一下。

修改tomcat的访问端口：找到tomcat安装目录下的conf文件夹里的server.xml文件，找到以下内容，将其中的 port="8080"改为 port="9090"然后保存即可。