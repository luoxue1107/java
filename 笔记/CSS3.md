# **CSS3**

CSS3 被划分为模块。

其中最重要的 CSS3 模块包括：

选择器

框模型

背景和边框

文本效果

2D/3D 转换

动画

多列布局

用户界面

##  **边框**

### **边框图片**

border-image

属性是一个简写属性，用于设置以下属性

可用值:

border-image-source		用在边框的图片的路径。	

border-image-slice		图片边框向内偏移。	

border-image-width		图片边框的宽度。	

border-image-outset		边框图像区域超出边框的量。	

border-image-repeat		图像边框是否应平铺(repeated)、铺满(rounded)或拉伸(stretched)。

### **圆角边框**

border-radius

设置所有四个 border-*-radius 属性的简写属性。

该属性允许您为元素添加圆角边框

语法:border-radius: 1-4 length|% / 1-4 length|%;

​	按此顺序设置每个 radii 的四个值。如果省略 bottom-left，则与 top-right 相同。如果省略 bottom-right，则与 top-left 相同。如果省略 top-right，则与 top-left 相同。

### **边框阴影**

box-shadow 

属性向框添加一个或多个阴影。

语法:box-shadow: h-shadow v-shadow blur spread color inset;

box-shadow 向框添加一个或多个阴影。该属性是由逗号分隔的阴影列表，每个阴影由 2-4 个长度值、可选的颜色值以及可选的 inset 关键词来规定。省略长度的值是 0。

可用值:

h-shadow		必需。水平阴影的位置。允许负值。	

v-shadow		必需。垂直阴影的位置。允许负值。

blur			可选。模糊距离

spread		可选。阴影的尺寸。	

color			可选。阴影的颜色。请参阅 CSS 颜色值。

inset			可选。将外部阴影 (outset) 改为内部阴影。

**背景**

​		

### **背景图片大小**

background-size

规定背景图片的尺寸。

语法:background-size: length|percentage|cover|contain;

可用值:

length	

设置背景图像的高度和宽度。

第一个值设置宽度，第二个值设置高度。

如果只设置一个值，则第二个值会被设置为 "auto"。

percentage	

以父元素的百分比来设置背景图像的宽度和高度。

第一个值设置宽度，第二个值设置高度。

如果只设置一个值，则第二个值会被设置为 "auto"。

cover	

把背景图像扩展至足够大，以使背景图像完全覆盖背景区域。

背景图像的某些部分也许无法显示在背景定位区域中。

contain

把图像图像扩展至最大尺寸，以使其宽度和高度完全适应内容区域。

### **背景图片定位**

background-origin

规定背景图片的定位区域。

规定 background-position 属性相对于什么位置来定位。

如果背景图像的 background-attachment 属性为 "fixed"，则该属性没有效果。

语法:background-origin: padding-box|border-box|content-box;

可用值:

padding-box	背景图像相对于内边距框来定位。	

border-box	背景图像相对于边框盒来定位。	

content-box	背景图像相对于内容框来定位。

### **规定背景绘制区域**

background-clip	

规定背景的绘制区域。	

可用值:

padding-box	背景图像相对于内边距框来定位。	

border-box	背景图像相对于边框盒来定位。	

content-box	背景图像相对于内容框来定位。

## **文本效果**

可用属性:

hanging-punctuation		规定标点字符是否位于线框之外。	

punctuation-trim		规定是否对标点字符进行修剪。	

text-align-last			设置如何对齐最后一行或紧挨着强制换行符之前的行。	

text-emphasis			向元素的文本应用重点标记以及重点标记的前景色。	

text-justify		规定当 text-align 设置为 "justify" 时所使用的对齐方	法。	

text-outline			规定文本的轮廓。	

text-overflow		规定当文本溢出包含元素时发生的事情。	

text-shadow		向文本添加阴影。	

语法:text-shadow: h-shadow v-shadow blur color;

text-wrap			规定文本的换行规则。	

word-break		规定非中日韩文本的换行规则。	

word-wrap			允许对长的不可分割的单词进行分割并换行到下一行。

### **字体**

**@font-face 规则**

在 CSS3 之前，web 设计师必须使用已在用户计算机上安装好的字体。

通过 CSS3，web 设计师可以使用他们喜欢的任意字体。

当您找到或购买到希望使用的字体时，可将该字体文件存放到 web 服务器上，它会在需要时被自动下载到用户的计算机上。

您“自己的”的字体是在 CSS3 @font-face 规则中定义的。

在新的 @font-face 规则中，您必须首先定义字体的名称（比如 myFirstFont），然后指向该字体文件。

如需为 HTML 元素使用字体，请通过 font-family 属性来引用字体的名称 (myFirstFont)：

<style>  <!--定义自己的字体--> @font-face { font-family: myFirstFont; src: url('Sansation_Light.ttf'),      url('Sansation_Light.eot'); /* IE9+ */ }  div { font-family:myFirstFont; } </style>

### **字体描述符**

@font-face里可用的属性 :

font-family  		必需。规定字体的名称。

name	

src				必需。定义字体文件的 URL。

URL	

font-stretch		可选。定义如何拉伸字体。默认是 "normal"。

可用值:

normal

condensed

ultra-condensed

extra-condensed

semi-condensed

expanded

semi-expanded

extra-expanded

ultra-expanded

font-style	可选。定义字体的样式。默认是 "normal"。

可用值:

ormal

italic

oblique

font-weight		可选。定义字体的粗细。默认是 "normal"。

可用值:

normal

bold

100

200

300

400

500

600

700

800

900

unicode-range			可选。定义字体支持的 UNICODE 字符范围。默认是 "U+0-10FFFF"。

可用值:	unicode-range	

## **2D 转换**

通过 CSS3 转换，我们能够对元素进行移动、缩放、转动、拉长或拉伸。

Internet Explorer 10、Firefox 以及 Opera 支持 transform 属性。

Chrome 和 Safari 需要前缀 -webkit-。

Internet Explorer 9 需要前缀 -ms-

### **transform 属性**

元素应用 2D 或 3D 转换。

该属性允许我们对元素进行旋转、缩放、移动或倾斜。

**语法:transform: none|transform-functions;**

none					定义不进行转换。	测试

matrix(n,n,n,n,n,n)		定义 2D 转换，使用六个值的矩阵。	测试

matrix3d(n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n)	定义 3D 转换，使用 16 个值的 4x4 矩阵。	

translate(x,y)			定义 2D 转换。	

translate3d(x,y,z)		定义 3D 转换。	

translateX(x)			定义转换，只是用 X 轴的值。	

translateY(y)			定义转换，只是用 Y 轴的值。	

translateZ(z)			定义 3D 转换，只是用 Z 轴的值。	

scale(x,y)				定义 2D 缩放转换。	

scale3d(x,y,z)			定义 3D 缩放转换。	

scaleX(x)				通过设置 X 轴的值来定义缩放转换。	

scaleY(y)				通过设置 Y 轴的值来定义缩放转换。	

scaleZ(z)				通过设置 Z 轴的值来定义 3D 缩放转换。	

rotate(angle)			定义 2D 旋转，在参数中规定角度。	

rotate3d(x,y,z,angle)		定义 3D 旋转。	

rotateX(angle)			定义沿着 X 轴的 3D 旋转。	

rotateY(angle)			定义沿着 Y 轴的 3D 旋转。	

rotateZ(angle)			定义沿着 Z 轴的 3D 旋转。	

skew(x-angle,y-angle)	定义沿着 X 和 Y 轴的 2D 倾斜转换。	

skewX(angle)			定义沿着 X 轴的 2D 倾斜转换。	

skewY(angle)			定义沿着 Y 轴的 2D 倾斜转换。	

perspective(n)			为 3D 转换元素定义透视视图。

## **3D 转换**

**转换属性**

**transform**

​			向元素应用 2D 或 3D 转换。	

**transform-origin**		

允许你改变被转换元素的位置

2D 转换元素能够改变元素 x 和 y 轴。3D 转换元素还能改变其 Z 轴。

为了更好地理解 transform-origin 属性，请查看这个演示。

Safari/Chrome 用户：为了更好地理解 transform-origin 属性用于 3D 转换的情况，请查看这个演示。

该属性必须与 transform 属性一同使用。

**语法: transform-origin: x-axis y-axis z-axis;**

**可用值:**

x-axis	

定义视图被置于 X 轴的何处。可能的值：left center right length %

y-axis	

定义视图被置于 Y 轴的何处。可能的值：top center bottom length %

z-axis	

定义视图被置于 Z 轴的何处。可能的值：length

**transform-style**

​	规定被嵌套元素如何在 3D 空间中显示

**语法:transform-style: flat|preserve-3d;**

**可用值:**

flat			子元素将不保留其 3D 位置。

preserve-3d	子元素将保留其 3D 位置。

**perspective**

​		规定 3D 元素的透视效果。

 	属性定义 3D 元素距视图的距离，以像素计。该属性允许您改变 3D 元素查看 3D 元素的视图。

当为元素定义 perspective 属性时，其子元素会获得透视效果，而不是元素本身。

请与 perspective-origin 属性一同使用该属性，这样您就能够改变 3D 元素的底部位置。

perspective 属性只影响 3D 转换元素。

**语法:perspective: number|none;**

**可用值:**

number	元素距离视图的距离，以像素计。

none		默认值。与 0 相同。不设置透视。

perspective-origin	规定 3D 元素的底部位置。	

backface-visibility	定义元素在不面对屏幕时是否可见。	

**过渡**

**可用属性:**

**transition**	

简写属性，用于在一个属性中设置四个过渡属性。	

语法:transition: property duration timing-function delay;

始终设置 transition-duration 属性，否则时长为 0，就不会产生过渡效果。

**可用值:**

transition-property		规定设置过渡效果的 CSS 属性的名称。

transition-duration		规定完成过渡效果需要多少秒或毫秒。

transition-timing-function	规定速度效果的速度曲线。

transition-delay			定义过渡效果何时开始。

**transition-property**	

规定应用过渡的 CSS 属性的名称。

属性规定应用过渡效果的 CSS 属性的名称。（当指定的 CSS 属性改变时，过渡效果将开始）。

过渡效果通常在用户将鼠标指针浮动到元素上时发生。

**语法:transition-property: none|all|property;**

**可用值:**

none		没有属性会获得过渡效果。

all		所有属性都将获得过渡效果。

property	定义应用过渡效果的 CSS 属性名称列表，列表以逗号分隔。

​	

**transition-duration**

定义过渡效果花费的时间。默认是 0。

属性规定完成过渡效果需要花费的时间（以秒或毫秒计）。

**语法:transition-duration: time;**

**可用值:**

time	

规定完成过渡效果需要花费的时间（以秒或毫秒计）。

默认值是 0，意味着不会有效果。

**transition-timing-function**

​	规定过渡效果的时间曲线。默认是 "ease"。

该属性允许过渡效果随着时间来改变其速度。

**语法:transition-timing-function: linear|ease|ease-in|ease-out|ease-in-out|cubic-bezier(n,n,n,n);**

**可用值:**	

linear			规定以相同速度开始至结束的过渡效果（等于 		cubic-bezier(0,0,1,1)）。

ease				规定慢速开始，然后变快，然后慢速结束的过渡效果	（cubic-bezier(0.25,0.1,0.25,1)）。

ease-in			规定以慢速开始的过渡效果（等于 cubic-	bezier(0.42,0,1,1)）。

ease-out			规定以慢速结束的过渡效果（等于 cubic-bezier(0,0,0.58,1)）。

ease-in-out		规定以慢速开始和结束的过渡效果（等于 cubic-bezier(0.42,0,0.58,1)）。

cubic-bezier(n,n,n,n)	在 cubic-bezier 函数中定义自己的值。可能的值是 0 至 1 之间的数值。	

**transition-delay**

​	规定过渡效果何时开始。默认是 0。

**语法:transition-delay: time;**

**可用值:**

time	规定在过渡效果开始之前需要等待的时间，以秒或毫秒计。

**动画**

## **@keyframes 规则**

如需在 CSS3 中创建动画，您需要学习 @keyframes 规则。

@keyframes 规则用于创建动画。在 @keyframes 中规定某项 CSS 样式，	就能创建由当前样式逐渐改为新样式的动画效果。

当您在 @keyframes 中创建动画时，请把它捆绑到某个选择器，否则不会产生动画效果。

通过规定至少以下两项 CSS3 动画属性，即可将动画绑定到选择器：		

规定动画的名称, 规定动画的时长

**可用属性:**

**@keyframes**

通过 @keyframes 规则，您能够创建动画。

创建动画的原理是，将一套 CSS 样式逐渐变化为另一套样式。

在动画过程中，您能够多次改变这套 CSS 样式。

以百分比来规定改变发生的时间，或者通过关键词 "from" 和 "to"，等价于 0% 和 100%。

0% 是动画的开始时间，100% 动画的结束时间。

为了获得最佳的浏览器支持，您应该始终定义 0% 和 100% 选择器。

使用动画属性来控制动画的外观，同时将动画与选择器绑定。

**语法:@keyframes animationname {keyframes-selector {css-styles;}}**

animationname			必需。定义动画的名称。

keyframes-selector		必需。动画时长的百分比。

合法的值：0-100%

from（与 0% 相同）

to（与 100% 相同）

css-styles				必需。一个或多个合法的 CSS 样式属性。

**animation**

所有动画属性的简写属性，除了 animation-play-state 属性。

请始终规定 animation-duration 属性，否则时长为 0，就不会播放动画了。

**语法:animation: name duration timing-function delay iteration-count direction;**

**可用值:**

animation-name				规定需要绑定到选择器的 keyframe 名称。。

animation-duration			规定完成动画所花费的时间，以秒或毫秒计。

animation-timing-function		规定动画的速度曲线。

animation-delay				规定在动画开始之前的延迟。

animation-iteration-count		规定动画应该播放的次数。

animation-direction			规定是否应该轮流反向播放动画。

​	

**animation-name**

规定 @keyframes 动画的名称。

请始终规定 animation-duration 属性，否则时长为 0，就不会播放动画了。

**语法:animation-name: keyframename|none;**

**可用值:**

keyframename		规定需要绑定到选择器的 keyframe 的名称。

none				规定无动画效果（可用于覆盖来自级联的动画）。

​	

**animation-duration**

规定动画完成一个周期所花费的秒或毫秒。默认是 0。

**语法:animation-duration: time;**	

规定完成动画所花费的时间。默认值是 0，意味着没有动画效果。

**animation-timing-function**

规定动画的速度曲线。默认是 "ease"。

速度曲线定义动画从一套 CSS 样式变为另一套所用的时间。

速度曲线用于使变化更为平滑。

**语法:animation-timing-function: value;**

animation-timing-function 使用名为三次贝塞尔（Cubic Bezier）函数的数学函数，来生成速度曲线。

您能够在该函数中使用自己的值，也可以预定义的值：

linear 		动画从头到尾的速度是相同的。

ease			默认。动画以低速开始，然后加快，在结束前变慢。

ease-in		动画以低速开始。	

ease-out		动画以低速结束。	

ease-in-out	动画以低速开始和结束。

cubic-bezier(n,n,n,n)	在 cubic-bezier 函数中自己的值。可能的值是从 0 到 1 的数值。

**animation-delay**	

规定动画何时开始。默认是 0。

允许负值，-2s 使动画马上开始，但跳过 2 秒进入动画。

**语法:animation-delay: time;可选。定义动画开始前等待的时间，以秒或毫秒计。默认值是 0。**

​	

**animation-iteration-count**	

规定动画被播放的次数。默认是 1。

**语法:animation-iteration-count: n|infinite;**

**可用值:**

n		定义动画播放次数的数值。	

infinite	规定动画应该无限次播放。

​	

**animation-direction**

​	规定动画是否在下一周期逆向地播放。默认是 "normal"。

​	如果 animation-direction 值是 "alternate"，则动画会在奇数次数（1、3、5 等等）正常播放，而在偶数次数（2、4、6 等等）向后播放。

如果把动画设置为只播放一次，则该属性没有效果。

**语法:animation-direction: normal|alternate;**

**可用值****:**

normal	默认值。动画应该正常播放。

alternate	动画应该轮流反向播放。

**animation-play-state**

​	规定动画是否正在运行或暂停。默认是 "running"。	

您可以在 JavaScript 中使用该属性，这样就能在播放过程中暂停动画。

**语法:animation-play-state: paused|running;**

**可用值:**

paused	规定动画已暂停。	测试

running	规定动画正在播放。

**animation-fill-mode**

属性规定动画在播放之前或之后，其动画效果是否可见。

**其属性值是由逗号分隔的一个或多个填充模式关键词。**

**语法:**animation-fill-mode : none | forwards | backwards | both;

**可用值:**

none			不改变默认行为。

forwards		当动画完成后，保持最后一个属性值（在最后一个关键帧中定义）。

backwards		在 animation-delay 所指定的一段时间内，在动画显示之前，应用开始属性值（在第一个关键帧中定义）。

both			向前和向后填充模式都被应用。

**多列**

**column-count**

规定元素应该被分隔的列数。

**语法:column-count: number|auto;**	

**可用值:**

number	元素内容将被划分的最佳列数。

auto		由其他属性决定列数，比如 "column-width"。

**column-fill**

规定如何填充列。	

**column-gap**

​	规定列之间的间隔。	

**column-rule**

​	设置所有 column-rule-* 属性的简写属性。	

**column-rule-color**

​	规定列之间规则的颜色。	

**column-rule-style**

​	规定列之间规则的样式。	

**column-rule-width**

​	规定列之间规则的宽度。	

**column-span**

​	规定元素应该横跨的列数。	

**column-width**

​	规定列的宽度。	

**columns**

​	规定设置 column-width 和 column-count 的简写属性。

**用户界面**

**appearance**

​	允许您将元素设置为标准用户界面元素的外观	

**box-sizing**

允许您以确切的方式定义适应某个区域的具体内容。	

**icon**

​	为创作者提供使用图标化等价物来设置元素样式的能力。	

**nav-down**

​	规定在使用 arrow-down 导航键时向何处导航。	

**nav-index**

​	设置元素的 tab 键控制次序。	

**nav-left**

​	规定在使用 arrow-left 导航键时向何处导航。	

**nav-right**

​	规定在使用 arrow-right 导航键时向何处导航。	

**nav-up**

​	规定在使用 arrow-up 导航键时向何处导航。	

**outline-offset**

​	对轮廓进行偏移，并在超出边框边缘的位置绘制轮廓。	

**resize**

​	规定是否可由用户对元素的尺寸进行调整。