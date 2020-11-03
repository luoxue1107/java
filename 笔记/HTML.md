# HTML

**什么时HTML**

HTML 指的是超文本标记语言 (Hyper Text Markup Language)

HTML 不是一种编程语言，而是一种标记语言 (markup language)

标记语言是一套标记标签 (markup tag)

HTML 使用标记标签来描述网页

**HTML 元素**

HTML 元素指的是从开始标签（start tag）到结束标签（end tag）的所有代码。

## **标签**

### **基本**

<!DOCTYPE> 		定义文档类型。

<html>			定义 HTML 文档。

<title>			定义文档的标题。

<body>			定义文档的主体。

<h1> to <h6>		定义 HTML 标题。

<p>				定义段落。

<br>			定义简单的折行。

<hr>			定义水平线。

<!--...-->			定义注释。

### **格式**

<acronym>		定义只取首字母的缩写。

<abbr>			定义缩写。

<address>		定义文档作者或拥有者的联系信息。

<b>				定义粗体文本。

<bdi>			定义文本的文本方向，使其脱离其周围文本的方向设置。

<bdo>			定义文字方向。

<big>			定义大号文本。

<blockquote>		定义长的引用。

<center>			不赞成使用。定义居中文本。

<cite>			定义引用(citation)。

<code>			定义计算机代码文本。

<del>			定义被删除文本。

<dfn>			定义定义项目。

<em>			定义强调文本。

<font>			不赞成使用。定义文本的字体、尺寸和颜色

<i>				定义斜体文本。

<ins>			定义被插入文本。

<kbd>			定义键盘文本。

<mark>			定义有记号的文本。

<meter>			定义预定义范围内的度量。

<pre>			定义预格式文本。

<progress>		定义任何类型的任务的进度。

<q>				定义短的引用。

<rp>			定义若浏览器不支持 ruby 元素显示的内容。

<rt>				定义 ruby 注释的解释。

<ruby>			定义 ruby 注释。

<s>				不赞成使用。定义加删除线的文本。

<samp>			定义计算机代码样本。

<small>			定义小号文本。

<strike>			不赞成使用。定义加删除线文本。

<strong>			定义语气更为强烈的强调文本。

<sup>			定义上标文本。

<sub>			定义下标文本。

<time>			定义日期/时间。

<tt>				定义打字机文本。

<u>				不赞成使用。定义下划线文本。

<var>			定义文本的变量部分。

<wbr>			定义可能的换行符。

### **引用（Quotation）**

<q> 用于短的引用

浏览器通常会为 <q> 元素包围引号。

<blockquote> 元素定义被引用的节

浏览器通常会对 <blockquote> 元素进行缩进处理。

<abbr> 元素定义缩写或首字母缩略语

对缩写进行标记能够为浏览器、翻译系统以及搜索引擎提供有用的信息。

<dfn> 元素定义项目或缩写的定义

\1. 如果设置了 <dfn> 元素的 title 属性，则定义项目：

<p><dfn title="World Health Organization">WHO</dfn> 成立于 1948 年。</p>

\2. 如果 <dfn> 元素包含具有标题的 <abbr> 元素，则 title 定义项目：

<p><dfn><abbr title="World Health Organization">WHO</abbr></dfn> 成立于 1948 年。</p>

\3. 否则，<dfn> 文本内容即是项目，并且父元素包含定义。

<p><dfn>WHO</dfn> World Health Organization 成立于 1948 年。</p>

也可使用 <abbr> 代替

<address> 元素定义文档或文章的联系信息（作者/拥有者）

此元素通常以斜体显示。大多数浏览器会在此元素前后添加折行。

<cite> 元素定义著作的标题

浏览器通常会以斜体显示 <cite> 元素。

<bdo> 元素定义双流向覆盖（bi-directional override）

<bdo> 元素用于覆盖当前文本方向,如果您的浏览器支持 bdo，则文本将从右向左进行书写 (rtl)

### **计算机代码格式**

通常，HTML 使用可变的字母尺寸，以及可变的字母间距。

在显示计算机代码示例时，并不需要如此。

<kbd>, <samp>, 以及 <code> 元素全都支持固定的字母尺寸和间距。

<kbd> 元素定义键盘输入格式

<samp> 元素定义计算机输出示例

<code> 元素定义编程代码示例 ,不保留多余的空格和折行, 如需解决该问题，您必须在 <pre> 元素中包围代码

<var> 元素定义数学变量

### **表单**

<form>			定义供用户输入的 HTML 表单。

<input>			定义输入控件。

<textarea>		定义多行的文本输入控件。

<button>			定义按钮。

<select>			定义选择列表（下拉列表）。

<optgroup>		定义选择列表中相关选项的组合。

<option>			定义选择列表中的选项。

<label>			定义 input 元素的标注。

<fieldset>			定义围绕表单中元素的边框。

<legend>			定义 fieldset 元素的标题。

<isindex>			不赞成使用。定义与文档相关的可搜索索引。

<datalist>			定义下拉列表。

<keygen>			定义生成密钥。

<output>			定义输出的一些类型。

### **框架**

<frame>			定义框架集的窗口或框架。

<frameset>		定义框架集。

<noframes>		定义针对不支持框架的用户的替代内容。

<iframe>			定义内联框架。

### **图像**

<img>			定义图像。

<map>			定义图像映射。

<area>			定义图像地图内部的区域。

<canvas>			定义图形。

<figcaption>		定义 figure 元素的标题。

<figure>			定义媒介内容的分组，以及它们的标题。

### **音频/视频**

<audio>			定义声音内容。

<source>			定义媒介源。

<track>			定义用在媒体播放器中的文本轨道。

<video>			定义视频。

### **链接**

<a>				定义锚。

<link>			定义文档与外部资源的关系。

<nav>			定义导航链接。

### **列表**

<ul>				定义无序列表。

<ol>				定义有序列表。

<li>				定义列表的项目。

<dir>			不赞成使用。定义目录列表。

<dl>				定义定义列表。

<dt>			定义定义列表中的项目。

<dd>			定义定义列表中项目的描述。

<menu>			定义命令的菜单/列表。

<menuitem>		定义用户可以从弹出菜单调用的命令/菜单项目。

<command>		定义命令按钮。

### **表格**

<table>			定义表格

<caption>			定义表格标题。

<th>			定义表格中的表头单元格。

<tr>				定义表格中的行。

<td>			定义表格中的单元。

<thead>			定义表格中的表头内容。

<tbody>			定义表格中的主体内容。

<tfoot>			定义表格中的表注内容（脚注）。

<col>			定义表格中一个或多个列的属性值。

<colgroup>		定义表格中供格式化的列组。

### **样式/节**

<style>			定义文档的样式信息。

<div>			定义文档中的节。

<span>			定义文档中的节。

<header>			定义 section 或 page 的页眉。

<footer>			定义 section 或 page 的页脚。

<section>			定义 section。

<article>			定义文章。

<aside>			定义页面内容之外的内容。

<details>			定义元素的细节。

<dialog>			定义对话框或窗口。

<summary>		为 <details> 元素定义可见的标题。

### **元信息**

<head>			定义关于文档的信息。

<meta>			定义关于 HTML 文档的元信息。

<base>			定义页面中所有链接的默认地址或默认目标。

<basefont>		不赞成使用。定义页面中文本的默认字体、颜色或尺寸。

### **编程**

<script>			定义客户端脚本。

<noscript>		定义针对不支持客户端脚本的用户的替代内容。

<applet>			不赞成使用。定义嵌入的 applet。

<embed>			为外部应用程序（非 HTML）定义容器。

<object>			定义嵌入的对象。

<param>			定义对象的参数。

### **属性**

**全局属性**

accesskey			规定激活元素的快捷键。

class				规定元素的一个或多个类名（引用样式表中的类）。

contenteditable		规定元素内容是否可编辑。

contextmenu		规定元素的上下文菜单。上下文菜单在用户点击元素时显示。

data-*			用于存储页面或应用程序的私有定制数据。

dir				规定元素中内容的文本方向。

draggable			规定元素是否可拖动。

dropzone			规定在拖动被拖动数据时是否进行复制、移动或链接。

hidden			规定元素仍未或不再相关。

id				规定元素的唯一 id。

lang				规定元素内容的语言。

spellcheck			规定是否对元素进行拼写和语法检查。

style				规定元素的行内 CSS 样式。

tabindex			规定元素的 tab 键次序。

title				规定有关元素的额外信息。

translate			规定是否应该翻译元素内容。

## **事件**

### **Window 事件属性**

针对 window 对象触发的事件（应用到 <body> 标签）：

onafterprint		文档打印之后运行的脚本。

onbeforeprint		文档打印之前运行的脚本。

onbeforeunload		文档卸载之前运行的脚本。

onerror			在错误发生时运行的脚本。

onhaschange		当文档已改变时运行的脚本。

onload			页面结束加载之后触发。

onmessage		在消息被触发时运行的脚本。

onoffline			当文档离线时运行的脚本。

ononline			当文档上线时运行的脚本。

onpagehide		当窗口隐藏时运行的脚本。

onpageshow		当窗口成为可见时运行的脚本。

onpopstate		当窗口历史记录改变时运行的脚本。

onredo			当文档执行撤销（redo）时运行的脚本。

onresize			当浏览器窗口被调整大小时触发。

onstorage			在 Web Storage 区域更新后运行的脚本。

onundo			在文档执行 undo 时运行的脚本。

onunload			一旦页面已下载时触发（或者浏览器窗口已被关闭）。

### **Form 事件**

由 HTML 表单内的动作触发的事件（应用到几乎所有 HTML 元素，但最常用在 form 元素中）：

onblur			元素失去焦点时运行的脚本。

onchange			在元素值被改变时运行的脚本。

oncontextmenu		当上下文菜单被触发时运行的脚本。

onfocus			当元素获得焦点时运行的脚本。

onformchange		在表单改变时运行的脚本。

onforminput		当表单获得用户输入时运行的脚本。

oninput			当元素获得用户输入时运行的脚本。

oninvalid			当元素无效时运行的脚本。

onreset			当表单中的重置按钮被点击时触发。HTML5 中不支持。

onselect			在元素中文本被选中后触发。

onsubmit			在提交表单时触发。

### **Keyboard 事件**

onkeydown		在用户按下按键时触发。

onkeypress		在用户敲击按钮时触发。

onkeyup			当用户释放按键时触发。

### **Mouse 事件**

由鼠标或类似用户动作触发的事件：

onclick			元素上发生鼠标点击时触发。

ondblclick			元素上发生鼠标双击时触发。

ondrag			元素被拖动时运行的脚本。

ondragend			在拖动操作末端运行的脚本。

ondragenter		当元素元素已被拖动到有效拖放区域时运行的脚本。

ondragleave		当元素离开有效拖放目标时运行的脚本。

ondragover		当元素在有效拖放目标上正在被拖动时运行的脚本。

ondragstart		在拖动操作开端运行的脚本。

ondrop			当被拖元素正在被拖放时运行的脚本。

onmousedown		当元素上按下鼠标按钮时触发。

onmousemove		当鼠标指针移动到元素上时触发。

onmouseout		当鼠标指针移出元素时触发。

onmouseover		当鼠标指针移动到元素上时触发。

onmouseup		当在元素上释放鼠标按钮时触发。

onmousewheel		当鼠标滚轮正在被滚动时运行的脚本。

onscroll			当元素滚动条被滚动时运行的脚本。

### **Media 事件**

由媒介（比如视频、图像和音频）触发的事件（适用于所有 HTML 元素，但常见于媒介元素中，比如 <audio>、<embed>、<img>、<object> 以及 <video>）:

onabort			在退出时运行的脚本。

oncanplay			当文件就绪可以开始播放时运行的脚本（缓冲已足够开始时）。

oncanplaythrough	当媒介能够无需因缓冲而停止即可播放至结尾时运行的脚本。

ondurationchange	当媒介长度改变时运行的脚本。

onemptied	script	当发生故障并且文件突然不可用时运行的脚本（比如连接意外断开时）。

onended	script	当媒介已到达结尾时运行的脚本（可发送类似“感谢观看”之类的消息）。

onerror			当在文件加载期间发生错误时运行的脚本。

onloadeddata		当媒介数据已加载时运行的脚本。

onloadedmetadata	当元数据（比如分辨率和时长）被加载时运行的脚本。

onloadstart		在文件开始加载且未实际加载任何数据前运行的脚本。

onpause			当媒介被用户或程序暂停时运行的脚本。

onplay			当媒介已就绪可以开始播放时运行的脚本。

onplaying			当媒介已开始播放时运行的脚本。

onprogress		当浏览器正在获取媒介数据时运行的脚本。

onratechange		每当回放速率改变时运行的脚本（比如当用户切换到慢动作或快进模式）。

onreadystatechange	每当就绪状态改变时运行的脚本（就绪状态监测媒介数据的状态）。

onseeked			当 seeking 属性设置为 false（指示定位已结束）时运行的脚本。

onseeking			当 seeking 属性设置为 true（指示定位是活动的）时运行的脚本。

onstalled			在浏览器不论何种原因未能取回媒介数据时运行的脚本。

onsuspend			在媒介数据完全加载之前不论何种原因终止取回媒介数据时运行的脚本。

ontimeupdate		当播放位置改变时（比如当用户快进到媒介中一个不同的位置时）运行的脚本。

onvolumechange	每当音量改变时（包括将音量设置为静音）时运行的脚本。

onwaiting			当媒介已停止播放但打算继续播放时（比如当媒介暂停已缓冲更多数据）运行脚本

## **HTML5视频与音频**

HTML5 DOM 为 <audio> 和 <video> 元素提供了方法、属性和事件。

这些方法、属性和事件允许您使用 JavaScript 来操作 <audio> 和 <video> 元素。

### **Audio/Video 方法**

addTextTrack()		向音频/视频添加新的文本轨道

canPlayType()		检测浏览器是否能播放指定的音频/视频类型

load()			重新加载音频/视频元素

play()			开始播放音频/视频

pause()			暂停当前播放的音频/视频

### **Audio/Video 属性**

audioTracks		返回表示可用音轨的 AudioTrackList 对象

autoplay			设置或返回是否在加载完成后随即播放音频/视频

buffered			返回表示音频/视频已缓冲部分的 TimeRanges 对象

controller			返回表示音频/视频当前媒体控制器的 MediaController 对象

controls			设置或返回音频/视频是否显示控件（比如播放/暂停等）

crossOrigin		设置或返回音频/视频的 CORS 设置

currentSrc			返回当前音频/视频的 URL

currentTime		设置或返回音频/视频中的当前播放位置（以秒计）

defaultMuted		设置或返回音频/视频默认是否静音

defaultPlaybackRate	设置或返回音频/视频的默认播放速度

duration			返回当前音频/视频的长度（以秒计）

ended			返回音频/视频的播放是否已结束

error				返回表示音频/视频错误状态的 MediaError 对象

loop				设置或返回音频/视频是否应在结束时重新播放

mediaGroup		设置或返回音频/视频所属的组合（用于连接多个音频/视频元素）

muted			设置或返回音频/视频是否静音

networkState		返回音频/视频的当前网络状态

paused			设置或返回音频/视频是否暂停

playbackRate		设置或返回音频/视频播放的速度

played			返回表示音频/视频已播放部分的 TimeRanges 对象

preload			设置或返回音频/视频是否应该在页面加载后进行加载

readyState		返回音频/视频当前的就绪状态

seekable			返回表示音频/视频可寻址部分的 TimeRanges 对象

seeking			返回用户是否正在音频/视频中进行查找

src				设置或返回音频/视频元素的当前来源

startDate			返回表示当前时间偏移的 Date 对象

textTracks			返回表示可用文本轨道的 TextTrackList 对象

videoTracks		返回表示可用视频轨道的 VideoTrackList 对象

volume			设置或返回音频/视频的音量

### **Audio/Video 事件**

abort			当音频/视频的加载已放弃时

canplay			当浏览器可以播放音频/视频时

canplaythrough		当浏览器可在不因缓冲而停顿的情况下进行播放时

durationchange		当音频/视频的时长已更改时

emptied			当目前的播放列表为空时

ended			当目前的播放列表已结束时

error				当在音频/视频加载期间发生错误时

loadeddata		当浏览器已加载音频/视频的当前帧时

loadedmetadata		当浏览器已加载音频/视频的元数据时

loadstart			当浏览器开始查找音频/视频时

pause			当音频/视频已暂停时

play				当音频/视频已开始或不再暂停时

playing			当音频/视频在已因缓冲而暂停或停止后已就绪时

progress			当浏览器正在下载音频/视频时

ratechange		当音频/视频的播放速度已更改时

seeked			当用户已移动/跳跃到音频/视频中的新位置时

seeking			当用户开始移动/跳跃到音频/视频中的新位置时

stalled			当浏览器尝试获取媒体数据，但数据不可用时

suspend			当浏览器刻意不获取媒体数据时

timeupdate		当目前的播放位置已更改时

volumechange		当音量已更改时

waiting			当视频由于需要缓冲下一帧而停止

## **画布(Canvas)**

**描述**

HTML5 <canvas> 标签用于绘制图像（通过脚本，通常是 JavaScript）。

不过，<canvas> 元素本身并没有绘制能力（它仅仅是图形的容器） - 您必须使用脚本来完成实际的绘图任务。

getContext() 方法可返回一个对象，该对象提供了用于在画布上绘图的方法和属性。

本手册提供完整的 getContext("2d") 对象属性和方法，可用于在画布上绘制文本、线条、矩形、圆形等等。

### **颜色、样式和阴影**

**属性**

fillStyle				设置或返回用于填充绘画的颜色、渐变或模式

strokeStyle			设置或返回用于笔触的颜色、渐变或模式

shadowColor			设置或返回用于阴影的颜色

shadowBlur			设置或返回用于阴影的模糊级别

shadowOffsetX			设置或返回阴影距形状的水平距离

shadowOffsetY			设置或返回阴影距形状的垂直距离

**方法**

createLinearGradient()	创建线性渐变（用在画布内容上）

createPattern()			在指定的方向上重复指定的元素

createRadialGradient()	创建放射状/环形的渐变（用在画布内容上）

addColorStop()			规定渐变对象中的颜色和停止位置

### **线条样式**

**属性**

lineCap				设置或返回线条的结束端点样式

lineJoin				设置或返回两条线相交时，所创建的拐角类型

lineWidth				设置或返回当前的线条宽度

miterLimit				设置或返回最大斜接长度

### **矩形**

**方法**

rect()				创建矩形

fillRect()				绘制“被填充”的矩形

strokeRect()			绘制矩形（无填充）

clearRect()			在给定的矩形内清除指定的像素

**路径**

**方法**

fill()				填充当前绘图（路径）

stroke()			绘制已定义的路径

beginPath()		起始一条路径，或重置当前路径

moveTo()			把路径移动到画布中的指定点，不创建线条

closePath()		创建从当前点回到起始点的路径

lineTo()			添加一个新点，然后在画布中创建从该点到最后指定点的线条

clip()				从原始画布剪切任意形状和尺寸的区域

quadraticCurveTo()	创建二次贝塞尔曲线

bezierCurveTo()		创建三次方贝塞尔曲线

arc()				创建弧/曲线（用于创建圆形或部分圆）

arcTo()			创建两切线之间的弧/曲线

isPointInPath()		如果指定的点位于当前路径中，则返回 true，否则返回 false

### **转换**

**方法**

scale()			缩放当前绘图至更大或更小

rotate()			旋转当前绘图

translate()			重新映射画布上的 (0,0) 位置

transform()		替换绘图的当前转换矩阵

setTransform()		将当前转换重置为单位矩阵。然后运行 transform()

## **文本**

**属性**	

font				设置或返回文本内容的当前字体属性

textAlign			设置或返回文本内容的当前对齐方式

textBaseline		设置或返回在绘制文本时使用的当前文本基线

**方法**

fillText()			在画布上绘制“被填充的”文本

strokeText()		在画布上绘制文本（无填充）

measureText()		返回包含指定文本宽度的对象

### **图像绘制**

**方法**	

drawImage()		向画布上绘制图像、画布或视频

### **像素操作**

**属性**

width			返回 ImageData 对象的宽度

height			返回 ImageData 对象的高度

data				返回一个对象，其包含指定的 ImageData 对象的图像数据

**方法**	

createImageData()	创建新的、空白的 ImageData 对象

getImageData()		返回 ImageData 对象，该对象为画布上指定的矩形复制像素数据

putImageData()		把图像数据（从指定的 ImageData 对象）放回画布上

### **合成**

**属性**	

globalAlpha			设置或返回绘图的当前 alpha 或透明值

globalCompositeOperation	设置或返回新图像如何绘制到已有的图像上

### **其他**

方法

save()			保存当前环境的状态

restore()			返回之前保存过的路径状态和属性

createEvent()	 

getContext()	 

toDataURL()	