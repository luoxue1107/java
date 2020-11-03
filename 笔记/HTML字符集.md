**HTML字符集**

如需正确地显示 HTML 页面，浏览器必须知道使用何种字符集。

万维网早期使用的字符集是 ASCII。ASCII 支持 0-9 的数字，大写和小写英文字母表，以及一些特殊字符。

完整的 ASCII 参考手册

由于很多国家使用的字符并不属于 ASCII，现代浏览器的默认字符集是 ISO-8859-1。

完整的 ISO-8859-1 参考手册

如果网页使用不同于 ISO-8859-1 的字符集，就应该在 <meta> 标签进行指定。

**ISO 字符集**

ISO 字符集是国际标准组织 (ISO) 针对不同的字母表/语言定义的标准字符集。

下面列出了世界各地使用的不同字符集：

字符集	描述	使用范围

ISO-8859-1	Latin alphabet part 1	

北美、西欧、拉丁美洲、加勒比海、加拿大、非洲

ISO-8859-2	Latin alphabet part 2	

东欧

ISO-8859-3	Latin alphabet part 3	

SE Europe、世界语、其他杂项

ISO-8859-4	Latin alphabet part 4	

斯堪的纳维亚/波罗的海（以及其他没有包括在 ISO-8859-1 中的部分）

ISO-8859-5	Latin/Cyrillic part 5	

使用古代斯拉夫语字母表的语言，比如保加利亚语、白俄罗斯文、俄罗斯语、马其顿语

ISO-8859-6	Latin/Arabic part 6	

使用阿拉伯字母的语言

ISO-8859-7	Latin/Greek part 7	

现代希腊语，以及有希腊语衍生的数学符号

ISO-8859-8	Latin/Hebrew part 8	

使用希伯来语的语言

ISO-8859-9	Latin 5 part 9	

土耳其语

ISO-8859-10	Latin 6	

拉普兰语、日耳曼语、爱斯基摩北欧语

ISO-8859-15	Latin 9 (aka Latin 0)	

与 ISO 8859-1 类似，欧元符号和其他一些字符取代了一些较少使用的符号

ISO-2022-JP	Latin/Japanese part 1	

日本语

ISO-2022-JP-2	Latin/Japanese part 2	

日本语

ISO-2022-KR	Latin/Korean part 1	

韩语

**7 比特 可显示的 ASCII 代码**

结果	描述	实体编号

 	space			&#32;

!	exclamation mark	&#33;

"	quotation mark		&#34;

\#	number sign		&#35;

$	dollar sign	&#36;

%	percent sign		&#37;

&	ampersand		&#38;

'	apostrophe		&#39;

(	left parenthesis		&#40;

)	right parenthesis	&#41;

*	asterisk			&#42;

+	plus sign			&#43;

,	comma			&#44;

-	hyphen			&#45;

.	period			&#46;

/	slash				&#47;

0	digit 0			&#48;

1	digit 1			&#49;

2	digit 2			&#50;

3	digit 3			&#51;

4	digit 4			&#52;

5	digit 5			&#53;

6	digit 6			&#54;

7	digit 7			&#55;

8	digit 8			&#56;

9	digit 9			&#57;

:	colon			&#58;

;	semicolon			&#59;

<	less-than			&#60;

=	equals-to			&#61;

\>	greater-than		&#62;

?	question mark		&#63;

@	at sign			&#64;

A	uppercase A		&#65;

B	uppercase B		&#66;

C	uppercase C		&#67;

D	uppercase D		&#68;

E	uppercase E		&#69;

F	uppercase F		&#70;

G	uppercase G		&#71;

H	uppercase H		&#72;

I	uppercase I		&#73;

J	uppercase J		&#74;

K	uppercase K		&#75;

L	uppercase L		&#76;

M	uppercase M		&#77;

N	uppercase N		&#78;

O	uppercase O		&#79;

P	uppercase P		&#80;

Q	uppercase Q		&#81;

R	uppercase R		&#82;

S	uppercase S		&#83;

T	uppercase T		&#84;

U	uppercase U		&#85;

V	uppercase V		&#86;

W	uppercase W		&#87;

X	uppercase X		&#88;

Y	uppercase Y		&#89;

Z	uppercase Z		&#90;

[	left square bracket	&#91;

\	backslash			&#92;

]	right square bracket	&#93;

^	caret	&#94;

_	underscore		&#95;

`	grave accent		&#96;

a	lowercase a		&#97;

b	lowercase b		&#98;

c	lowercase c		&#99;

d	lowercase d		&#100;

e	lowercase e		&#101;

f	lowercase f		&#102;

g	lowercase g		&#103;

h	lowercase h		&#104;

i	lowercase i		&#105;

j	lowercase j		&#106;

k	lowercase k		&#107;

l	lowercase l		&#108;

m	lowercase m		&#109;

n	lowercase n		&#110;

o	lowercase o		&#111;

p	lowercase p		&#112;

q	lowercase q		&#113;

r	lowercase r		&#114;

s	lowercase s		&#115;

t	lowercase t		&#116;

u	lowercase u		&#117;

v	lowercase v		&#118;

w	lowercase w		&#119;

x	lowercase x		&#120;

y	lowercase y		&#121;

z	lowercase z		&#122;

{	left curly brace		&#123;

|	vertical bar		&#124;

}	right curly brace		&#125;

~	tilde				&#126;

7 比特 设备控制 ASCII代码

ASCII设备控制代码最初被设计为用来控制诸如打印机和磁带驱动器之类的硬件设备。在HTML文档中这些代码不会起任何作用。

结果	描述	实体编号

NUL	null character		&#00;

SOH	start of header		&#01;

STX	start of text		&#02;

ETX	end of text		&#03;

EOT	end of transmission	&#04;

ENQ	enquiry			&#05;

ACK	acknowledge		&#06;

BEL	bell (ring)			&#07;

BS	backspace			&#08;

HT	horizontal tab		&#09;

LF	line feed			&#10;

VT	vertical tab		&#11;

FF	form feed			&#12;

CR	carriage return		&#13;

SO	shift out			&#14;

SI	shift in			&#15;

DLE	data link escape		&#16;

DC1	device control 1		&#17;

DC2	device control 2		&#18;

DC3	device control 3		&#19;

DC4	device control 4		&#20;

NAK	negative acknowledge	&#21;

SYN	synchronize		&#22;

ETB	end transmission block	&#23;

CAN	cancel			&#24;

EM	end of medium		&#25;

SUB	substitute			&#26;

ESC	escape			&#27;

FS	file separator		&#28;

GS	group separator		&#29;

RS	record separator	&#30;

US	unit separator		&#31;

DEL	delete (rubout)		&#127;