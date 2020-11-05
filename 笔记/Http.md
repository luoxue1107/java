# **B/S与C/S架构**

#### B/S框架

B是英文单词“Browser”的首字母，即浏览器的意思；S是英文单词“Server”的首字母，即服务器的意思。B/S就是“Browser/Server”的缩写，即“浏览器/服务器”模式。

C/S框架

C是英文单词“Client”的首字母，即客户端的意思，C/S就是“Client/Server”的缩写，即“客户端/服务器”模式

#### **C/S与B/S的区别**

1．硬件环境不同

C/S 一般建立在专用的网络上, 小范围里的网络环境, 局域网之间再通过专门服务器提供连接和数据交换服务. 

B/S 建立在广域网之上的, 不必是专门的网络硬件环境,例如电话上网, 租用设备. 信息管理. 有比C/S更强的适应范围, 一般只要有操作系统和浏览器就行

2．对安全要求不同 

C/S 一般面向相对固定的用户群, 对信息安全的控制能力很强. 一般高度机密的信息系统采用C/S 结构适宜. 可以通过B/S发布部分可公开信息. 

B/S 建立在广域网之上, 对安全的控制能力相对弱, 面向是不可知的用户群.

3．对程序架构不同 

C/S 程序可以更加注重流程, 可以对权限多层次校验, 对系统运行速度可以较少考虑. 

B/S 对安全以及访问速度的多重的考虑, 建立在需要更加优化的基础之上. 比C/S有更高的要求 B/S结构的程序架构是发展的趋势, 从MS的.Net系列的BizTalk 2000 Exchange 2000等, 全面支持网络的构件搭建的系统. SUN 和IBM推的JavaBean 构件技术等,使 B/S更加成熟.

4．软件重用不同 

C/S 程序可以不可避免的整体性考虑, 构件的重用性不如在B/S要求下的构件的重用性好. 

B/S 对的多重结构,要求构件相对独立的功能. 能够相对较好的重用.

5．系统维护不同 

系统维护在是软件生存周期中,开销大, -------重要 

C/S 程序由于整体性, 必须整体考察, 处理出现的问题以及系统升级. 升级难. 可能是再做一个全新的系统 

B/S 构件组成,方面构件个别的更换,实现系统的无缝升级. 系统维护开销减到最小.用户从网上自己下载安装就可以实现升级.

6．处理问题不同 

C/S 程序可以处理用户面固定, 并且在相同区域, 安全要求高需求, 与操作系统相关. 应该都是相同的系统 

B/S 建立在广域网上, 面向不同的用户群, 分散地域, 这是C/S无法作到的. 与操作系统平台关系最小.

7．用户接口不同 

C/S 多是建立的Window平台上,表现方法有限,对程序员普遍要求较高 

B/S 建立在浏览器上, 有更加丰富和生动的表现方式与用户交流. 并且大部分难度减低,减低开发成本.

8．信息流不同 

C/S 程序一般是典型的中央集权的机械式处理, 交互性相对低 

B/S 信息流向可变化, B-B B-C B-G等信息、流向的变化, 更象交易中心

![img](./img\CS_BS01.png)

![img](./img\CS_BS02.png)

# **http**

HTTP协议（HyperText Transfer Protocol，超文本传输协议）是因特网上应用最为广泛的一种网络传输协议，所有的WWW文件都必须遵守这个标准。

HTTP是一个基于TCP/IP通信协议来传递数据（HTML 文件, 图片文件, 查询结果等）。

#### **HTTP 工作原理**

HTTP协议工作于客户端-服务端架构上。浏览器作为HTTP客户端通过URL向HTTP服务端即WEB服务器发送所有请求。

Web服务器有：Apache服务器，IIS服务器（Internet Information Services）等。

Web服务器根据接收到的请求后，向客户端发送响应信息。

HTTP默认端口号为80，但是你也可以改为8080或者其他端口。

#### **HTTP三点注意事项：**

HTTP是无连接：无连接的含义是限制每次连接只处理一个请求。服务器处理完客户的请求，并收到客户的应答后，即断开连接。采用这种方式可以节省传输时间。

HTTP是媒体独立的：这意味着，只要客户端和服务器知道如何处理的数据内容，任何类型的数据都可以通过HTTP发送。客户端以及服务器指定使用适合的MIME-type内容类型。

HTTP是无状态：HTTP协议是无状态协议。无状态是指协议对于事务处理没有记忆能力。缺少状态意味着如果后续处理需要前面的信息，则它必须重传，这样可能导致每次连接传送的数据量增大。另一方面，在服务器不需要先前信息时它的应答就较快。

##### **CGI**

CGI(Common Gateway Interface) 是 HTTP 服务器与你的或其它机器上的程序进行“交谈”的一种工具，其程序须运行在网络服务器上。

绝大多数的 CGI 程序被用来解释处理来自表单的输入信息，并在服务器产生相应的处理，或将相应的信息反馈给浏览器。CGI 程序使网页具有交互功能。

浏览器显示的内容都有 HTML、XML、GIF、Flash 等，浏览器是通过 MIME Type 区分它们，决定用什么内容什么形式来显示。

##### **MIME Type**

MIME Type 是该资源的媒体类型，MIME Type 不是个人指定的，是经过互联网（IETF）组织协商，以 RFC（是一系列以编号排定的文件，几乎所有的互联网标准都有收录在其中） 的形式作为建议的标准发布在网上的，大多数的 Web 服务器和用户代理都会支持这个规范 (顺便说一句，Email 附件的类型也是通过 MIME Type 指定的)。

媒体类型通常通过 HTTP 协议，由 Web 服务器告知浏览器的，更准确地说，是通过 Content-Type 来表示的。例如：Content-Type：text/HTML。

通常只有一些卓哉互联网上获得广泛应用的格式才会获得一个 MIME Type，如果是某个客户端自己定义的格式，一般只能以 application/x- 开头。

#### **HTTP 协议的 8 种请求类型:**

HTTP 协议中共定义了八种方法或者叫“动作”来表明对 Request-URI 指定的资源的不同操作方式，具体介绍如下：

 OPTIONS：返回服务器针对特定资源所支持的HTTP请求方法。也可以利用向Web服务器发送'*'的请求来测试服务器的功能性。

 HEAD：向服务器索要与GET请求相一致的响应，只不过响应体将不会被返回。这一方法可以在不必传输整个响应内容的情况下，就可以获取包含在响应消息头中的元信息。

 GET：向特定的资源发出请求。

 POST：向指定资源提交数据进行处理请求（例如提交表单或者上传文件）。数据被包含在请求体中。POST请求可能会导致新的资源的创建和/或已有资源的修改。

 PUT：向指定资源位置上传其最新内容。

 DELETE：请求服务器删除 Request-URI 所标识的资源。

 TRACE：回显服务器收到的请求，主要用于测试或诊断。

 CONNECT：HTTP/1.1 协议中预留给能够将连接改为管道方式的代理服务器。

虽然 HTTP 的请求方式有 8 种，但是我们在实际应用中常用的也就是 get 和 post，其他请求方式也都可以通过这两种方式间接的来实现。

#### **HTTP响应头信息:**

Allow	

服务器支持哪些请求方法（如GET、POST等）。

Content-Encoding	

文档的编码（Encode）方法。只有在解码之后才可以得到Content-Type头指定的内容类型。利用gzip压缩文档能够显著地减少HTML文档的下载时间。Java的GZIPOutputStream可以很方便地进行gzip压缩，但只有Unix上的Netscape和Windows上的IE 4、IE 5才支持它。因此，Servlet应该通过查看Accept-Encoding头（即request.getHeader("Accept-Encoding")）检查浏览器是否支持gzip，为支持gzip的浏览器返回经gzip压缩的HTML页面，为其他浏览器返回普通页面。

Content-Length	

表示内容长度。只有当浏览器使用持久HTTP连接时才需要这个数据。如果你想要利用持久连接的优势，可以把输出文档写入 ByteArrayOutputStream，完成后查看其大小，然后把该值放入Content-Length头，最后通过byteArrayStream.writeTo(response.getOutputStream()发送内容。

Content-Type	

表示后面的文档属于什么MIME类型。Servlet默认为text/plain，但通常需要显式地指定为text/html。由于经常要设置Content-Type，因此HttpServletResponse提供了一个专用的方法setContentType。

Date	

当前的GMT时间。你可以用setDateHeader来设置这个头以避免转换时间格式的麻烦。

Expires	

应该在什么时候认为文档已经过期，从而不再缓存它？

Last-Modified	

文档的最后改动时间。客户可以通过If-Modified-Since请求头提供一个日期，该请求将被视为一个条件GET，只有改动时间迟于指定时间的文档才会返回，否则返回一个304（Not Modified）状态。Last-Modified也可用setDateHeader方法来设置。

Location	

表示客户应当到哪里去提取文档。Location通常不是直接设置的，而是通过HttpServletResponse的sendRedirect方法，该方法同时设置状态代码为302。

Refresh	

表示浏览器应该在多少时间之后刷新文档，以秒计。除了刷新当前文档之外，你还可以通过setHeader("Refresh", "5; URL=http://host/path")让浏览器读取指定的页面。

注意这种功能通常是通过设置HTML页面HEAD区的＜META HTTP-EQUIV="Refresh" CONTENT="5;URL=http://host/path"＞实现，这是因为，自动刷新或重定向对于那些不能使用CGI或Servlet的HTML编写者十分重要。但是，对于Servlet来说，直接设置Refresh头更加方便。

注意Refresh的意义是"N秒之后刷新本页面或访问指定页面"，而不是"每隔N秒刷新本页面或访问指定页面"。因此，连续刷新要求每次都发送一个Refresh头，而发送204状态代码则可以阻止浏览器继续刷新，不管是使用Refresh头还是＜META HTTP-EQUIV="Refresh" ...＞。

注意Refresh头不属于HTTP 1.1正式规范的一部分，而是一个扩展，但Netscape和IE都支持它。

Server	

服务器名字。Servlet一般不设置这个值，而是由Web服务器自己设置。

Set-Cookie	

设置和页面关联的Cookie。Servlet不应使用response.setHeader("Set-Cookie", ...)，而是应使用HttpServletResponse提供的专用方法addCookie。参见下文有关Cookie设置的讨论。

WWW-Authenticate	

客户应该在Authorization头中提供什么类型的授权信息？在包含401（Unauthorized）状态行的应答中这个头是必需的。例如，response.setHeader("WWW-Authenticate", "BASIC realm=＼"executives＼"")。

注意Servlet一般不进行这方面的处理，而是让Web服务器的专门机制来控制受密码保护页面的访问（例如.htaccess）

#### **HTTP状态码:**

当浏览者访问一个网页时，浏览者的浏览器会向网页所在服务器发出请求。当浏览器接收并显示网页前，此网页所在的服务器会返回一个包含HTTP状态码的信息头（server header）用以响应浏览器的请求。

HTTP状态码的英文为HTTP Status Code。

HTTP状态码由三个十进制数字组成，第一个十进制数字定义了状态码的类型，后两个数字没有分类的作用。HTTP状态码共分为5种类型：

1**	信息，服务器收到请求，需要请求者继续执行操作

2**	成功，操作被成功接收并处理

3**	重定向，需要进一步的操作以完成请求

4**	客户端错误，请求包含语法错误或无法完成请求

5**	服务器错误，服务器在处理请求的过程中发生了错误

详细状态码 查看"HTTP状态码" 笔记;

#### **HTTP content-type:**

Content-Type（内容类型），一般是指网页中存在的 Content-Type，用于定义网络文件的类型和网页的编码，决定浏览器将以什么形式、什么编码读取这个文件，这就是经常看到一些 PHP 网页点击的结果却是下载一个文件或一张图片的原因。

Content-Type 标头告诉客户端实际返回的内容的内容类型。

常见的媒体格式类型如下：

text/html ： HTML格式

text/plain ：纯文本格式

text/xml ： XML格式

image/gif ：gif图片格式

image/jpeg ：jpg图片格式

image/png：png图片格式

以application开头的媒体格式类型：

application/xhtml+xml ：XHTML格式

application/xml： XML数据格式

application/atom+xml ：Atom XML聚合格式

application/json： JSON数据格式

application/pdf：pdf格式

application/msword ： Word文档格式

application/octet-stream ： 二进制流数据（如常见的文件下载）

application/x-www-form-urlencoded ： <form encType=””>中默认的encType，form表单数据被编码为key/value格式发送到服务器（表单默认的提交数据的格式）

另外一种常见的媒体格式是上传文件之时使用的：

multipart/form-data ： 需要在表单中进行文件上传时，就需要使用该格式

## **HttpServlet**

Servlet 生命周期可被定义为从创建直到毁灭的整个过程。以下是 Servlet 遵循的过程：

Servlet 通过调用 init () 方法进行初始化。

Servlet 调用 service() 方法来处理客户端的请求。

Servlet 通过调用 destroy() 方法终止（结束）。

最后，Servlet 是由 JVM 的垃圾回收器进行垃圾回收的。

**init() 方法:**

init 方法被设计成只调用一次。它在第一次创建 Servlet 时被调用，在后续每次用户请求时不再调用。因此，它是用于一次性初始化，就像 Applet 的 init 方法一样。

**service() 方法:**

service() 方法是执行实际任务的主要方法。Servlet 容器（即 Web 服务器）调用 service() 方法来处理来自客户端（浏览器）的请求，并把格式化的响应写回给客户端。

每次服务器接收到一个 Servlet 请求时，服务器会产生一个新的线程并调用服务。service() 方法检查 HTTP 请求类型（GET、POST、PUT、DELETE 等），并在适当的时候调用 doGet、doPost、doPut，doDelete 等方法。

**destroy() 方法:**

destroy() 方法只会被调用一次，在 Servlet 生命周期结束时被调用。destroy() 方法可以让您的 Servlet 关闭数据库连接、停止后台线程、把 Cookie 列表或点击计数器写入到磁盘，并执行其他类似的清理活动。

#### **Servlet 表单数据**

**GET 方法**

GET 方法向页面请求发送已编码的用户信息

GET 方法是默认的从浏览器向 Web 服务器传递信息的方法，它会产生一个很长的字符串，出现在浏览器的地址栏中。如果您要向服务器传递的是密码或其他的敏感信息，请不要使用 GET 方法。GET 方法有大小限制：请求字符串中最多只能有 1024 个字符。

这些信息使用 QUERY_STRING 头传递，并可以通过 QUERY_STRING 环境变量访问，Servlet 使用 doGet() 方法处理这种类型的请求。

**POST 方法**

另一个向后台程序传递信息的比较可靠的方法是 POST 方法。POST 方法打包信息的方式与 GET 方法基本相同，但是 POST 方法不是把信息作为 URL 中 ? 字符后的文本字符串进行发送，而是把这些信息作为一个单独的消息。消息以标准输出的形式传到后台程序，您可以解析和使用这些标准输出。Servlet 使用 doPost() 方法处理这种类型的请求。

#### **Servlet 读取表单数据**

Servlet 处理表单数据，这些数据会根据不同的情况使用不同的方法自动解析：

getParameter()：您可以调用 request.getParameter() 方法来获取表单参数的值。

getParameterValues()：如果参数出现一次以上，则调用该方法，并返回多个值，例如复选框。

getParameterNames()：如果您想要得到当前请求中的所有参数的完整列表，则调用该方法。

如果表单提交的数据中有中文数据则需要转码：

String name =new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");

#### **HTTP头的操作**

#### **常用http请求头信息:**

**Accept**

​	这个头信息指定浏览器或其他客户端可以处理的 MIME 类型。值 image/png 或 image/jpeg 是最常见的两种可能值。

**Accept-Charset**

​	这个头信息指定浏览器可以用来显示信息的字符集。例如 ISO-8859-1。

**Accept-Encoding**

​	这个头信息指定浏览器知道如何处理的编码类型。值 gzip 或 compress 是最常见的两种可能值。

**Accept-Language**

​	这个头信息指定客户端的首选语言，在这种情况下，Servlet 会产生多种语言的结果。例如，en、en-us、ru 等。

**Authorization**

​	这个头信息用于客户端在访问受密码保护的网页时识别自己的身份。

**Connection**

​	这个头信息指示客户端是否可以处理持久 HTTP 连接。持久连接允许客户端或其他浏览器通过单个请求来检索多个文件。值 Keep-Alive 意味着使用了持续连接。

**Content-Length**

​	这个头信息只适用于 POST 请求，并给出 POST 数据的大小（以字节为单位）。

**Cookie**

​	这个头信息把之前发送到浏览器的 cookies 返回到服务器。

Host	这个头信息指定原始的 URL 中的主机和端口。

**If-Modified-Since**

​	这个头信息表示只有当页面在指定的日期后已更改时，客户端想要的页面。如果没有新的结果可以使用，服务器会发送一个 304 代码，表示 Not Modified 头信息。

**If-Unmodified-Since**

​	这个头信息是 If-Modified-Since 的对立面，它指定只有当文档早于指定日期时，操作才会成功。

**Referer**

​	这个头信息指示所指向的 Web 页的 URL。例如，如果您在网页 1，点击一个链接到网页 2，当浏览器请求网页 2 时，网页 1 的 URL 就会包含在 Referer 头信息中。

**User-Agent**

​	这个头信息识别发出请求的浏览器或其他客户端，并可以向不同类型的浏览器返回不同的内容

**读取 HTTP 请求头信息的方法:**

方法可用在 Servlet 程序中读取 HTTP 头。这些方法通过 HttpServletRequest 对象可用。

**Cookie[] getCookies()**

返回一个数组，包含客户端发送该请求的所有的 Cookie 对象。

**Enumeration getAttributeNames()**

返回一个枚举，包含提供给该请求可用的属性名称。

**Enumeration getHeaderNames()**

返回一个枚举，包含在该请求中包含的所有的头名。

**Enumeration getParameterNames()**

返回一个 String 对象的枚举，包含在该请求中包含的参数的名称。

**HttpSession getSession()**

返回与该请求关联的当前 session 会话，或者如果请求没有 session 会话，则创建一个。

**HttpSession getSession(boolean create)**

返回与该请求关联的当前 HttpSession，或者如果没有当前会话，且创建是真的，则返回一个新的 session 会话。

**Locale getLocale()**

基于 Accept-Language 头，返回客户端接受内容的首选的区域设置。

**Object getAttribute(String name)**

以对象形式返回已命名属性的值，如果没有给定名称的属性存在，则返回 null。

**ServletInputStream getInputStream()**

使用 ServletInputStream，以二进制数据形式检索请求的主体。

**String getAuthType()**

返回用于保护 Servlet 的身份验证方案的名称，例如，"BASIC" 或 "SSL"，如果JSP没有受到保护则返回 null。

**String getCharacterEncoding()**

返回请求主体中使用的字符编码的名称。

**String getContentType()**

返回请求主体的 MIME 类型，如果不知道类型则返回 null。

**String getContextPath()**

返回指示请求上下文的请求 URI 部分。

**String getHeader(String name)**

以字符串形式返回指定的请求头的值。

**String getMethod()**

返回请求的 HTTP 方法的名称，例如，GET、POST 或 PUT。

**String getParameter(String name)**

以字符串形式返回请求参数的值，或者如果参数不存在则返回 null。

**String getPathInfo()**

当请求发出时，返回与客户端发送的 URL 相关的任何额外的路径信息。

**String getProtocol()**

返回请求协议的名称和版本。

**String getQueryString()**

返回包含在路径后的请求 URL 中的查询字符串。

**String getRemoteAddr()**

返回发送请求的客户端的互联网协议（IP）地址。

**String getRemoteHost()**

返回发送请求的客户端的完全限定名称。

**String getRemoteUser()**

如果用户已通过身份验证，则返回发出请求的登录用户，或者如果用户未通过身份验证，则返回 null。

**String getRequestURI()**

从协议名称直到 HTTP 请求的第一行的查询字符串中，返回该请求的 URL 的一部分。

**String getRequestedSessionId()**

返回由客户端指定的 session 会话 ID。

**String getServletPath()**

返回调用 JSP 的请求的 URL 的一部分。

**String[] getParameterValues(String name)**

返回一个字符串对象的数组，包含所有给定的请求参数的值，如果参数不存在则返回 null。

**boolean isSecure()**

返回一个布尔值，指示请求是否使用安全通道，如 HTTPS。

**int getContentLength()**

以字节为单位返回请求主体的长度，并提供输入流，或者如果长度未知则返回 -1。

**int getIntHeader(String name)**

返回指定的请求头的值为一个 int 值。

**int getServerPort()**

返回接收到这个请求的端口号。

**int getParameterMap()**

将参数封装成 Map 类型。

#### **常用http响应头信息:**

**Allow**

​	这个头信息指定服务器支持的请求方法（GET、POST 等）。

**Cache-Control**

​	这个头信息指定响应文档在何种情况下可以安全地缓存。可能的值有：public、private 或 no-cache 等。Public 意味着文档是可缓存，Private 意味着文档是单个用户私用文档，且只能存储在私有（非共享）缓存中，no-cache 意味着文档不应被缓存。

**Connection**

​	这个头信息指示浏览器是否使用持久 HTTP 连接。值 close 指示浏览器不使用持久 HTTP 连接，值 keep-alive 意味着使用持久连接。

**Content-Disposition**

​	这个头信息可以让您请求浏览器要求用户以给定名称的文件把响应保存到磁盘。

**Content-Encoding**

​	在传输过程中，这个头信息指定页面的编码方式。

**Content-Language**

​	这个头信息表示文档编写所使用的语言。例如，en、en-us、ru 等。

**Content-Length**

​	这个头信息指示响应中的字节数。只有当浏览器使用持久（keep-alive）HTTP 连接时才需要这些信息。

**Content-Type**

​	这个头信息提供了响应文档的 MIME（Multipurpose Internet Mail Extension）类型。

**Expires**

​	这个头信息指定内容过期的时间，在这之后内容不再被缓存。

**Last-Modified**

​	这个头信息指示文档的最后修改时间。然后，客户端可以缓存文件，并在以后的请求中通过 If-Modified-Since 请求头信息提供一个日期。

**Location**

​	这个头信息应被包含在所有的带有状态码的响应中。在 300s 内，这会通知浏览器文档的地址。浏览器会自动重新连接到这个位置，并获取新的文档。

**Refresh**

​	这个头信息指定浏览器应该如何尽快请求更新的页面。您可以指定页面刷新的秒数。

**Retry-After**

​	这个头信息可以与 503（Service Unavailable 服务不可用）响应配合使用，这会告诉客户端多久就可以重复它的请求。

**Set-Cookie**

​	这个头信息指定一个与页面关联的 cookie。

#### **设置 HTTP 响应报头的方法:**

可用于在 Servlet 程序中设置 HTTP 响应报头。这些方法通过 HttpServletResponse 对象可用。

**String encodeRedirectURL(String url)**

为 sendRedirect 方法中使用的指定的 URL 进行编码，或者如果编码不是必需的，则返回 URL 未改变。

**String encodeURL(String url)**

对包含 session 会话 ID 的指定 URL 进行编码，或者如果编码不是必需的，则返回 URL 未改变。

**boolean containsHeader(String name)**

返回一个布尔值，指示是否已经设置已命名的响应报头。

**boolean isCommitted()**

返回一个布尔值，指示响应是否已经提交。

**void addCookie(Cookie cookie)**

把指定的 cookie 添加到响应。

**void addDateHeader(String name, long date)**

添加一个带有给定的名称和日期值的响应报头。

**void addHeader(String name, String value)**

添加一个带有给定的名称和值的响应报头。

**void addIntHeader(String name, int value)**

添加一个带有给定的名称和整数值的响应报头。

**void flushBuffer()**

强制任何在缓冲区中的内容被写入到客户端。

**void reset()**

清除缓冲区中存在的任何数据，包括状态码和头。

**void resetBuffer()**

清除响应中基础缓冲区的内容，不清除状态码和头。

**void sendError(int sc)**

使用指定的状态码发送错误响应到客户端，并清除缓冲区。

**void sendError(int sc, String msg)**

使用指定的状态发送错误响应到客户端。

**void sendRedirect(String location)**

使用指定的重定向位置 URL 发送临时重定向响应到客户端。

**void setBufferSize(int size)**

为响应主体设置首选的缓冲区大小。

**void setCharacterEncoding(String charset)**

设置被发送到客户端的响应的字符编码（MIME 字符集）例如，UTF-8。

**void setContentLength(int len)**

设置在 HTTP Servlet 响应中的内容主体的长度，该方法设置 HTTP 	Content-Length 头。

**void setContentType(String type)**

如果响应还未被提交，设置被发送到客户端的响应的内容类型。

**void setDateHeader(String name, long date)**

设置一个带有给定的名称和日期值的响应报头。

**void setHeader(String name, String value)**

设置一个带有给定的名称和值的响应报头。

**void setIntHeader(String name, int value)**

设置一个带有给定的名称和整数值的响应报头。

**void setLocale(Locale loc)**

如果响应还未被提交，设置响应的区域。

**void setStatus(int sc)**

为该响应设置状态码。

 **HTTP 状态码**

HTTP 请求和 HTTP 响应消息的格式是类似的，结构如下：

初始状态行 + 回车换行符（回车+换行）

零个或多个标题行+回车换行符

一个空白行，即回车换行符

一个可选的消息主体，比如文件、查询数据或查询输出

#### **设置 HTTP 状态代码的方法:**

下面的方法可用于在 Servlet 程序中设置 HTTP 状态码。这些方法通过 HttpServletResponse 对象可用。

**public void setStatus ( int statusCode )**

该方法设置一个任意的状态码。setStatus 方法接受一个 int（状态码）作为参数。如果您的响应包含了一个特殊的状态码和文档，请确保在使用 PrintWriter 实际返回任何内容之前调用 setStatus。

**public void sendRedirect(String url)**

该方法生成一个 302 响应，连同一个带有新文档 URL 的 Location 头。

**public void sendError(int code, String message)**

该方法发送一个状态码（通常为 404），连同一个在 HTML 文档内部自动格式化并发送到客户端的短消息。

#### **Servlet 过滤器**

Servlet 过滤器可以动态地拦截请求和响应，以变换或使用包含在请求或响应中的信息。

可以将一个或多个 Servlet 过滤器附加到一个 Servlet 或一组 Servlet。Servlet 过滤器也可以附加到 JavaServer Pages (JSP) 文件和 HTML 页面。调用 Servlet 前调用所有附加的 Servlet 过滤器。

#### **Servlet 过滤器是可用于 Servlet 编程的 Java 类，可以实现以下目的：**

在客户端的请求访问后端资源之前，拦截这些请求。

在服务器的响应发送回客户端之前，处理这些响应。

根据规范建议的各种类型的过滤器：

身份验证过滤器（Authentication Filters）。

数据压缩过滤器（Data compression Filters）。

加密过滤器（Encryption Filters）。

触发资源访问事件过滤器。

图像转换过滤器（Image Conversion Filters）。

日志记录和审核过滤器（Logging and Auditing Filters）。

MIME-TYPE 链过滤器（MIME-TYPE Chain Filters）。

标记化过滤器（Tokenizing Filters）。

XSL/T 过滤器（XSL/T Filters），转换 XML 内容。

#### **Servlet 过滤器方法:**

过滤器是一个实现了 javax.servlet.Filter 接口的 Java 类。javax.servlet.Filter 接口定义了三个方法：

**public void doFilter (ServletRequest, ServletResponse, FilterChain)**

该方法完成实际的过滤操作，当客户端请求方法与过滤器设置匹配的URL时，Servlet容器将先调用过滤器的doFilter方法。FilterChain用户访问后续过滤器。

**public void init(FilterConfig filterConfig)**

web 应用程序启动时，web 服务器将创建Filter 的实例对象，并调用其init方法，读取web.xml配置，完成对象的初始化功能，从而为后续的用户请求作好拦截的准备工作（filter对象只会创建一次，init方法也只会执行一次）。开发人员通过init方法的参数，可获得代表当前filter配置信息的FilterConfig对象。

**public void destroy()**

Servlet容器在销毁过滤器实例前调用该方法，在该方法中释放Servlet过滤器占用的资源。

#### **web.xml配置各节点说明:**

**<filter>**

指定一个过滤器。

**<filter-name>**

用于为过滤器指定一个名字，该元素的内容不能为空。

**<filter-class>**

元素用于指定过滤器的完整的限定类名。

**<init-param>**

元素用于为过滤器指定初始化参数，它的子元素<param-name>指定参数的名字，<param-value>指定参数的值。

在过滤器中，可以使用FilterConfig接口对象来访问初始化参数。

**<filter-mapping>**

元素用于设置一个 Filter 所负责拦截的资源。一个Filter拦截的资源可通过两种方式来指定：Servlet 名称和资源访问的请求路径

**<filter-name>**

子元素用于设置filter的注册名称。该值必须是在<filter>元素中声明过的过滤器的名字

**<url-pattern>**

设置 filter 所拦截的请求路径(过滤器关联的URL样式)

**<servlet-name>**

指定过滤器所拦截的Servlet名称。

**<dispatcher>**

指定过滤器所拦截的资源被 Servlet 容器调用的方式，可以是REQUEST,INCLUDE,FORWARD和ERROR之一，默认REQUEST。用户可以设置多个<dispatcher>子元素用来指定 Filter 对资源的多种调用方式进行拦截。

**<dispatcher>**

子元素可以设置的值及其意义

**REQUEST：**

当用户直接访问页面时，Web容器将会调用过滤器。如果目标资源是通过RequestDispatcher的include()或forward()方法访问时，那么该过滤器就不会被调用。

**INCLUDE：**

如果目标资源是通过RequestDispatcher的include()方法访问时，那么该过滤器将被调用。除此之外，该过滤器不会被调用。

**FORWARD：**

如果目标资源是通过RequestDispatcher的forward()方法访问时，那么该过滤器将被调用，除此之外，该过滤器不会被调用。

**ERROR：**

如果目标资源是通过声明式异常处理机制调用时，那么该过滤器将被调用。除此之外，过滤器不会被调用。

### **Listener监听器**

listener也就是监听器，一个对象的监听另一个对象，当被监听的对象变化时，监听的对象会执行一系列动作。

主要由三部分构成：

事件源：被监听的对象

监听器：监听的对象，事件源的变化会触发监听器的响应行为

响应行为：监听器监听到事件源的状态变化时所执行的动作

在初始化时，需要将事件源和监听器进行绑定，也就是注册监听器

分类

按照被监听的对象划分

ServletContext域

HttpSession域

ServletContext域

按照被监听的内容划分

监听域对象的创建或销毁

监听域对象中的属性变化

主要包括:

ServletContextListener

ServletContextAttributeListener

HttpSessionListener

HttpSessionAttributeListener

ServletRequestListener

ServletRequestAttributeListener

此外还有两个与session中的绑定的对象相关的监听器（对象感知监听器）

HttpSessionBindingListener(绑定，解绑)

HttpSeesionActivationListener（钝化，活化）（序列化，反序列化）

**源码分析**

**ServletContextListener**

> ```java
> public interface ServletContextListener extends EventListener {    
>     public void contextInitialized(ServletContextEvent sce);
>     public void contextDestroyed(ServletContextEvent sce); }
> ```
>
> 

这个接口有两个方法，contextInitialized负责context的初始化，contextDestoryed负责context的销毁

**ServletContextAttributeListener**

```java
public interface ServletContextAttributeListener extends EventListener {     
public void attributeAdded(ServletContextAttributeEvent scae);
public voidattributeRemoved(ServletContextAttributeEvent scae);     
public void attributeReplaced(ServletContextAttributeEvent scae); 
}
```

attributeAdded属性的添加，attributeRemoved属性的删除，attributeReplaced属性的修改

**HttpSessionListener**

```java
public interface HttpSessionListener extends EventListener {  
   public void sessionCreated(HttpSessionEvent se);     
    
   public void sessionDestroyed(HttpSessionEvent se); 
}
```

sessionCreated主要是session的创建，sessionDestroyed主要是session的销毁

**HttpSessionAttributeListener**

```java
public interface HttpSessionAttributeListener extends EventListener {     public void attributeAdded(HttpSessionBindingEvent se);     public void attributeRemoved(HttpSessionBindingEvent se);     public void attributeReplaced(HttpSessionBindingEvent se); }
```

与上面类似，也是属性的添加，修改，删除

**ServletRequestListener**

```java
public interface ServletRequestListener extends EventListener {     public void requestDestroyed (ServletRequestEvent sre);     public void requestInitialized (ServletRequestEvent sre); }
```

servlet请求的初始化和销毁

```java
public interface ServletRequestAttributeListener extends EventListener {     public void attributeAdded(ServletRequestAttributeEvent srae);     public void attributeRemoved(ServletRequestAttributeEvent srae);     public void attributeReplaced(ServletRequestAttributeEvent srae); }
```

同上，请求属性的新增，修改，删除。

**HttpSessionBindingListener**

```java
public interface HttpSessionBindingListener extends EventListener {     public void valueBound(HttpSessionBindingEvent event);     public void valueUnbound(HttpSessionBindingEvent event); }
```

绑定和解绑

**HttpSessionActivationListener**

```java
public interface HttpSessionActivationListener extends EventListener {     public void sessionWillPassivate(HttpSessionEvent se);     public void sessionDidActivate(HttpSessionEvent se); }
```

激活和钝化

### servlet异常的处理

​	当一个 Servlet 抛出一个异常时，Web 容器在使用了 exception-type 元素的 **web.xml** 中搜索与抛出异常类型相匹配的配置。

您必须在 web.xml 中使用 **error-page** 元素来指定对特定**异常** 或 HTTP **状态码** 作出相应的 Servlet 调用。

Servlet ErrorHandler 与其他的 Servlet 的定义方式一样，且在 web.xml 中进行配置。

如果有错误状态代码出现，不管为 404（Not Found 未找到）或 403（Forbidden 禁止），则会调用 ErrorHandler 的 Servlet。

如果 Web 应用程序抛出 ServletException 或 IOException，那么 Web 容器会调用 ErrorHandler 的 Servlet。

#### 请求属性 - 错误/异常

以下是错误处理的 Servlet 可以访问的请求属性列表，用来分析错误/异常的性质。

| 序号 | 属性 & 描述                                                  |
| :--- | :----------------------------------------------------------- |
| 1    | **javax.servlet.error.status_code** 该属性给出状态码，状态码可被存储，并在存储为 java.lang.Integer 数据类型后可被分析。 |
| 2    | **javax.servlet.error.exception_type** 该属性给出异常类型的信息，异常类型可被存储，并在存储为 java.lang.Class 数据类型后可被分析。 |
| 3    | **javax.servlet.error.message** 该属性给出确切错误消息的信息，信息可被存储，并在存储为 java.lang.String 数据类型后可被分析。 |
| 4    | **javax.servlet.error.request_uri** 该属性给出有关 URL 调用 Servlet 的信息，信息可被存储，并在存储为 java.lang.String 数据类型后可被分析。 |
| 5    | **javax.servlet.error.exception** 该属性给出异常产生的信息，信息可被存储，并在存储为 java.lang.Throwable 数据类型后可被分析。 |
| 6    | **javax.servlet.error.servlet_name** 该属性给出 Servlet 的名称，名称可被存储，并在存储为 java.lang.String 数据类型后可被分析。 |

#### web配置文件里配置

```XMl
<!-- 异常报错页面 -->
<error-page>
  <!--  异常类型 -->
    <exception-type>
          javax.servlet.ServletException
    </exception-type >
  <!-- 指定异常页面 -->
    <location>/ErrorHandler</location>
</error-page>

<!-- 状态码 错误页面 -->
<error-page>
    <!--指定状态码-->
    <error-code>404</error-code>
  <!-- 指定异常页面 -->
    <location>/ErrorHandler</location>
</error-page>
```



### **Cookie**

服务器脚本向浏览器发送一组 Cookie。例如：姓名、年龄或识别号码等。

浏览器将这些信息存储在本地计算机上，以备将来使用。

当下一次浏览器向 Web 服务器发送任何请求时，浏览器会把这些 Cookie 信息发送到服务器，服务器将使用这些信息来识别用户。



**Servlet Cookie 处理需要对中文进行编码与解码，方法如下：**

**编码:**

```java
String   str   =   java.net.URLEncoder.encode("中文"，"UTF-8");            
```

**解码:**

```java
String   str   =   java.net.URLDecoder.decode("编码后的字符串","UTF-8");  
```



能够通过请求方法 request.getCookies() 访问 Cookie，该方法将返回一个 Cookie 对象的数组。

​	Set-Cookie 头包含了一个名称值对、一个 GMT 日期、一个路径和一个域。名称和值会被 URL 编码。expires 字段是一个指令，告诉浏览器在给定的时间和日期之后"忘记"该 Cookie。

​	如果浏览器被配置为存储 Cookie，它将会保留此信息直到到期日期。如果用户的浏览器指向任何匹配该 Cookie 的路径和域的页面，它会重新发送 Cookie 到服务器。

#### Servlet Cookie 方法

以下是在 Servlet 中操作 Cookie 时可使用的有用的方法列表。

| 序号 | 方法 & 描述                                                  |
| :--- | :----------------------------------------------------------- |
| 1    | **public void setDomain(String pattern)** 该方法设置 cookie 适用的域，例如 baidu.com。 |
| 2    | **public String getDomain()** 该方法获取 cookie 适用的域，例如 baidu.com。 |
| 3    | **public void setMaxAge(int expiry)** 该方法设置 cookie 过期的时间（以秒为单位）。如果不这样设置，cookie 只会在当前 session 会话中持续有效。 |
| 4    | **public int getMaxAge()** 该方法返回 cookie 的最大生存周期（以秒为单位），默认情况下，-1 表示 cookie 将持续下去，直到浏览器关闭。 |
| 5    | **public String getName()** 该方法返回 cookie 的名称。名称在创建后不能改变。 |
| 6    | **public void setValue(String newValue)** 该方法设置与 cookie 关联的值。 |
| 7    | **public String getValue()** 该方法获取与 cookie 关联的值。  |
| 8    | **public void setPath(String uri)** 该方法设置 cookie 适用的路径。如果您不指定路径，与当前页面相同目录下的（包括子目录下的）所有 URL 都会返回 cookie。 |
| 9    | **public String getPath()** 该方法获取 cookie 适用的路径。   |
| 10   | **public void setSecure(boolean flag)** 该方法设置布尔值，表示 cookie 是否应该只在加密的（即 SSL）连接上发送。 |
| 11   | **public void setComment(String purpose)** 设置cookie的注释。该注释在浏览器向用户呈现 cookie 时非常有用。 |
| 12   | **public String getComment()** 获取 cookie 的注释，如果 cookie 没有注释则返回 null。 |

#### **设置 Cookie:**

创建一个 Cookie 对象：

可以调用带有 cookie 名称和 cookie 值的 Cookie 构造函数，cookie 名称和 cookie 值都是字符串。

```java
Cookie cookie = new Cookie("key","value");
```

无论是名字还是值，都不应该包含空格或以下任何字符：

```java
[ ] ( ) = , " / ? @ : ;
```

设置最大生存周期：

您可以使用 setMaxAge 方法来指定 cookie 能够保持有效的时间（以秒为单位）。下面将设置一个最长有效期为 24 小时的 cookie。

```java
cookie.setMaxAge(60*60*24); 
```

发送 Cookie 到 HTTP 响应头：

您可以使用 response.addCookie 来添加 HTTP 响应头中的 Cookie.

```java
response.addCookie(cookie);
```



#### **读取 Cookie:**

要读取 Cookie，您需要通过调用 HttpServletRequest 的 getCookies( ) 方法创建一个 javax.servlet.http.Cookie 对象的数组。然后循环遍历数组，并使用 getName() 和 getValue() 方法来访问每个 cookie 和关联的值。

#### **删除 Cookie:**

想删除一个 cookie，那么您只需要按照以下三个步骤进行：

读取一个现有的 cookie，并把它存储在 Cookie 对象中。

使用 setMaxAge() 方法设置 cookie 的年龄为零，来删除现有的 cookie。

把这个 cookie 添加到响应头。

**Cookie 方法:**

**void setDomain(String pattern)**

该方法设置 cookie 适用的域

**String getDomain()**

该方法获取 cookie 适用的域

**void setMaxAge(int expiry)**

该方法设置 cookie 过期的时间（以秒为单位）。如果不这样设置，cookie 只会在当前 session 会话中持续有效。

​	

**int getMaxAge()**

该方法返回 cookie 的最大生存周期（以秒为单位），默认情况下，-1 表示 

cookie 将持续下去，直到浏览器关闭。

**String getName()**

该方法返回 cookie 的名称。名称在创建后不能改变。

**void setValue(String newValue)**

该方法设置与 cookie 关联的值。

**String getValue()**

该方法获取与 cookie 关联的值。

**void setPath(String uri)**

该方法设置 cookie 适用的路径。如果您不指定路径，与当前页面相同目录下的（包括子目录下的）所有 URL 都会返回 cookie。

**String getPath()**

该方法获取 cookie 适用的路径。

**void setSecure(boolean flag)**

该方法设置布尔值，表示 cookie 是否应该只在加密的（即 SSL）连接上发送。

**void setComment(String purpose)**

设置cookie的注释。该注释在浏览器向用户呈现 cookie 时非常有用。

**String getComment()**

获取 cookie 的注释，如果 cookie 没有注释则返回 null。





网址

potocol domain port  context path  file

 jetty 和tomcat7 启动端服务器 都可以

hosts

DNS 解析

HttpServlet类 和 父类GenericServlet类 

uri与url的区别

apache和tomcat有什么不同







postMan

tomcat

servlet生命周期  serioc只会初始化一次    初始化init  服务器停止进行销毁

请求与转发的特性

请求地址栏不会发生变化

用户一次请求

请求转发走 参数不会丢失

请求转发 无法跳转到服务器外的资源

请求转发 可以跳转到WEB-INF目录下的站点

访问成功返回状态码200

response sendRedirect 访问服务器外的网站 状态码是 302

destroy

session

filter

jsp