# **TCP\IP网络通信协议**

#### 什么是 TCP/IP？

TCP/IP 是供已连接因特网的计算机进行通信的通信协议。

TCP/IP 指传输控制协议/网际协议（Transmission Control Protocol / Internet Protocol）。

TCP/IP 定义了电子设备（比如计算机）如何连入因特网，以及数据如何在它们之间传输的标准。

#### **在 TCP/IP 中包含一系列用于处理数据通信的协议：**

TCP (传输控制协议) - 应用程序之间通信

UDP (用户数据报协议) - 应用程序之间的简单通信

IP (网际协议) - 计算机之间的通信

ICMP (因特网消息控制协议) - 针对错误和状态

DHCP (动态主机配置协议) - 针对动态寻址

#### **TCP - 传输控制协议**

TCP 用于从应用程序到网络的数据传输控制。

TCP 负责在数据传送之前将它们分割为 IP 包，然后在它们到达的时候将它们重组。

**IP - 网际协议（Internet Protocol）**

IP 负责计算机之间的通信。

IP 负责在因特网上发送和接收数据包。

**HTTP - 超文本传输协议(Hyper Text Transfer Protocol)**

HTTP 负责 web 服务器与 web 浏览器之间的通信。

HTTP 用于从 web 客户端（浏览器）向 web 服务器发送请求，并从 web 服务器向 web 客户端返回内容（网页）。

**HTTPS - 安全的 HTTP（HTTP Secure）**

HTTPS 负责在 web 服务器和 web 浏览器之间的安全通信。

作为有代表性的应用，HTTPS 会用于处理信用卡交易和其他的敏感数据。

**SSL - 安全套接字层（Secure Sockets Layer）**

SSL 协议用于为安全数据传输加密数据。

**SMTP - 简易邮件传输协议（Simple Mail Transfer Protocol）**

SMTP 用于电子邮件的传输。

**MIME - 多用途因特网邮件扩展（Multi-purpose Internet Mail Extensions）**

MIME 协议使 SMTP 有能力通过 TCP/IP 网络传输多媒体文件，包括声音、视频和二进制数据。

**IMAP - 因特网消息访问协议（Internet Message Access Protocol）**

IMAP 用于存储和取回电子邮件。

**POP - 邮局协议（Post Office Protocol）**

POP 用于从电子邮件服务器向个人电脑下载电子邮件。

**FTP - 文件传输协议（File Transfer Protocol）**

FTP 负责计算机之间的文件传输。

**NTP - 网络时间协议（Network Time Protocol）**

NTP 用于在计算机之间同步时间（钟）。

**DHCP - 动态主机配置协议（Dynamic Host Configuration Protocol）**

DHCP 用于向网络中的计算机分配动态 IP 地址。

**SNMP - 简单网络管理协议（Simple Network Management Protocol）**

SNMP 用于计算机网络的管理。

**LDAP - 轻量级的目录访问协议（Lightweight Directory Access Protocol）**

LDAP 用于从因特网搜集关于用户和电子邮件地址的信息。

**ICMP - 因特网消息控制协议（Internet Control Message Protocol）**

ICMP 负责网络中的错误处理。

**ARP - 地址解析协议（Address Resolution Protocol）**

ARP - 用于通过 IP 来查找基于 IP 地址的计算机网卡的硬件地址。

**RARP - 反向地址转换协议（Reverse Address Resolution Protocol）**

RARP 用于通过 IP 查找基于硬件地址的计算机网卡的 IP 地址。

**BOOTP - 自举协议（Boot Protocol）**

BOOTP 用于从网络启动计算机。

**PPTP - 点对点隧道协议（Point to Point Tunneling Protocol）**

PPTP 用于私人网络之间的连接（隧道）。

#### **网际互联及OSI七层模型：**

物理层、数据链路层、网络层、传输层、会话层、表示层、应用层

![img](.\img\TOP_IP01.png)

==========================================

##### **物理层**

作用：定义一些电器，机械，过程和规范，如集线器；

PDU(协议数据单元)：bit/比特

设备：集线器HUB;

注意：没有寻址的概念；

==========================================

##### **数据链路层**

作用：定义如何格式化数据，支持错误检测；

典型协议：以太网，帧中继（古董级VPN）

PDU：frame（帧）设备：以太网交换机；

备注：交换机通过MAC地址转发数据，逻辑链路控制；

==========================================

##### **网络层**

作用：定义一个逻辑的寻址，选择最佳路径传输，路由数据包；

典型协议：IP，IPX，ICMP,ARP(IP->MAC),IARP;

PDU:packet/数据包；

设备：路由器

备注：实现寻址

=========================================

##### **传输层：**

作用：提供可靠和尽力而为的传输；

典型协议：TCP,UDP,SPX,port(65535个端口),EIGRP,OSPF,

PDU:fragment 段；

无典型设备；

备注：负责网络传输和会话建立；

==========================================

##### **会话层：**

作用：控制会话，建立管理终止应用程序会话；

典型协议：NFS, SQL, ASP, PHP, JSP, RSVP(资源源预留协议), windows， 

备注：负责会话建立；

==========================================

##### **表示层：**

作用：格式化数据；

典型协议：ASCII, JPEG. PNG, MP3. WAV, AVI, 

备注：可以提供加密服务；

==========================================

##### **应用层：**

作用：控制应用程序；

典型协议：telnet, ssh, http, ftp, smtp, rip, BGP, 

备注：为应用程序提供网络服务；