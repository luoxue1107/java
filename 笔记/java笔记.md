# **java**

java之父 James Gosling （詹姆斯 高斯林）

java是Sun 公司1995年堆出的制作出来

2009年 被Oracle收购

java环境搭建

JDk java Development Kit java开发工具包

JRE java Runtime Environment java运行化境

JVM Java Virtual Machine java 虚拟机

Java的配置 环境变量 %JAVA_HOME%\bin Java -version

 

## **编写原程序 、编译原程序 、运行**

 

\1. class(克拉斯)类 public公共的 static静态 void返回值 main法 args参数 （;）结束语句

\2. 公共的 类 类名{

公共的 静态 返回值 main方法（参数） {

System.out.println或者（print）（"...."）;

}

}

java 关键字

被Java 所征用的单词

Java模拟器 下载软件 eclipse （伊克莉丝）

 

##  **注释的方法**

1.//是单行注释

2./*开始 */结束 多行注释

3./**开始*结束 文档注释 可写入javadoc

 

 

## **命令符里的快捷键**

切换盘符 C:

显示文件列表 dir（directory）

进去目录 cd （change directory）

返回上级目录 cd ..

返回根目录 cd\

创建子目录 md （make directory）

删除目录 rd （remove directory）

删除文件 del （delete）

改变文件名称 ren （rename）

清理屏幕 cls （clean screen）

打开记事本 notepad

退出exit

 

 

## **命名规则**

变量名 首字母 可以用 字母 .下换线"_"."$" 可以用

其余部分 可以用 数字. 字母 .下划线"_" ."$" 这些都可以

命名写法

1.驼峰 命名法

又称“骆驼式命名法”，混合使用大小写字母来构成变量和函数的名字。

比如“int myAge”

2.匈牙利 命名法

开头字母用变量类型的缩写，其余部分变量的英文或者英文的缩写，要求单词第一个字母大写。

比如 int iMyAge；“i”是int类型的缩写；

3.帕斯卡 命名法

它又叫大驼峰式命名法。每个单词的第一个字母都是大写。

比如 int MyAge；

## **命名规范**

类名由一个或多个单词组成，每个单词首字母大写；

函数名、变量名由一个或多个单词组成，首单词字母小写。拼接字母大写；

包名全小写，只可以使用特殊字符“.”，并且不以“.”开头或结尾；

常量全大写，多个单词用"_"连接；

 

## **运算符**

1.赋值

"=" 等号右面给左面的 变量名 = 表达式

2.算数

“+”加 "-"减 "*"乘 "/"除 “%” 取余

3.关系运算符

<， >，== ，!= ，>=，<=

## **注意：== 和 equals 的区别**

== 对于基本类型来说是值比较，对于引用类型来说是比较的是引用；而 equals 默认情况下是引用比较，只是很多类重新了 equals 方法，比如 String、Integer 等把它变成了值比较，所以一般情况下 equals 比较的是值是否相等。

**转义字符**

\n	 换行符

\t	缩进（制表位）

\\	反斜线

\’	单引号

\a	响铃

\b 	退格

\v	纵向制表

\f	换页

\r	回车

## **三目运算 （三元运算）**

布尔类型表达式 “？”

True正确的 取值 1 false不正确 取值2

值1：值2

例子

Int i = 10>5 ? 1:2;

## **逻辑运算符**

（&&）与

多选多 多个要求都需要 满足要求

（||）或

多选一 多个要求中 有一个满足就可以

（！）非

取其反值 对的是取出来的值 就是 错的

按位运算符

**按位与（&）**

计算方法：

参加运算的两个数，换算为二进制（0、1）后，进行与运算。只有当 相应位上**全部为**1时取1， **存在**0时为0。

**按位或（|）**

计算方法：

参加运算的两个数，换算为二进制（0、1）后，进行或运算。只要当 相应位上**存在**1时取1， **全部为**0时为0。

**按位同或（⊙）**

计算方法：

参加运算的两个数，换算为二进制（0、1）后，进行异或运算。只有当 相应位上的数字**相同**时取1， 不相同为0。

**按位异或（^）**

计算方法：

参加运算的两个数，换算为二进制（0、1）后，进行异或运算。只有当 相应位上的数字**不相同**时取1， 相同为0。

**按位取反（～）**

计算方法：

参加运算的两个数，换算为二进制（0、1）后， 0变1， 1变0。

**逻辑左右移**

<<：是逻辑左移，右边补0，符号位和其他位一样要移动。

例如： 3 << 2，则是将数字3左移2位

计算过程：3 << 2

首先把3转换为二进制数字0000 0000 0000 0000 0000 0000 0000 0011，然后把该数字高位（左侧）的两个零移出，其他的数字都朝左平移2位，最后在低位（右侧）的两个空位补零。则得到的最终结果是0000 0000 0000 0000 0000 0000 0000 1100，则转换为十进制是12.数学意义：

在数字没有溢出的前提下，对于正数和负数，左移一位都相当于乘以2的1次方，左移n位就相当于乘以2的n次方 

 

对于：>>>

 无符号右移，忽略符号位，空位都以0补齐

value >>> num   --  num 指定要移位值value 移动的位数。

无符号右移的规则只记住一点：忽略了符号位扩展，0补最高位 无符号右移运算符>>> 只是对32位和64位的值有意义

**录入数字的准备代码：**

import java.util.Scanner；也可以import java.util*;这是把所以的工具包都进行引入；

Scanner input = new Scanner (System.*in*);

正式录入 代码 ： 数据类型 名称 =input.nextInt();

录入小数 .nextDouble

录入首个字符next().charAt(0);括号里的零可以变化

 

 

 

## **数据类型**

### 1.整数

byte 字节型 一个字节  -2^7~2^7-1

 十进制取值：-128~127

short 短整型 两个字节  -2^15~2^15-1

int 整型   四个字节  -2^31~2^31-1

十进制取值：-2147483648~2147483647  

long 长整型 八个字节  -2^63~2^63-1

  超过整数范围的值需要在数值 后加一个“L”意思是这个值的超过int范围 到达long类型

扩展：程序运行过程中，瞬时空间（局部变量表-Slot 槽）

也就是说 这个槽的范围是 整型的取值范围 如果超过槽的范围 到长整型的范围了就需要把你输入的值后加上“L”就是一个槽不够用了 需要在绑定一个槽 用两个槽装这个值；

 

### 2.浮点型 （小数型）

float 32位单精度浮点型 

负数取值-3.4E+38~-1.4E-45  正数取值1.4E-45~3.4E+38

 

double 64位双精度浮点型

负数取值-1.7E+308~-4.9E-324 正数取值 4.9E-324~1.7E+308

（2E3E等价于 2乘10的3次方  E 等于10）

注意：

java默认的小数范围是 double 如果要用float类型 需要在值的后面加“F”

近似值：

float  32bit 1bit符合位 8bits指数位 23bits尾数位

Double 62bit 1bit符号位 11bits指数位 52bits尾数位

### 3.布尔型

 boolean 取值是 true/false

### 4字符串

 String 取值 万能字符型

注意：字符串进行比较需要有“变量名1.equals（变量名2）”

### 5.字符型

char 取值 0~65535 英文对应的ASCCI编码 中文或其他语言是Unicode编码

每个符都有整数表现形式

![img](.\img\asccii表.jpg)

## **内存的的大小**

从小到大

bit（位）->Byte（字节）->KB->MB->GB->TB->PB->EB->ZB->YB->BB->NB->DB->CB->XB

## **二进制的算法**

Byte==8bit

列如：

十进制1  二进制0000 0001

十进制2  二进制0000 0010

十进制3  二进制0000 0011

以此类推

每位代表的具体值：

128 64 32 16 8 4 2 1

0 0 0 0 0 0 0 0

具体的二进制  ：

 

 

## **类型转换**

整数长度足够 转换得到的数据是完整的

列：int i=100； byte b =（byte）i；//b = 100

整数长度不够 转换的数据会被截断

列：int i=10000； byte b = （byte）i；//b=16（符号位变化 可能变成负数）

小数强转整数得到的数据会被截断

列；double i=2.5； int b=（int）i；//i=2（小数位舍去）

字符转换整数 数据是完整的 但是负数转换字符是不会显示的 因为字符的取值是在正数范围内

列；  char c =65； int i = c ；//  i = 65

如果： char  c =-65； int  i  =  c ；// i会是空白 或者”?”

Boolean的取值为true/false， 所以不可以与其他类型转换

 

 

 

## **If语句【如果语句】**

如果 条件 成立会显示代码里的内容 条件不成立 会不显示代码里的 内容

如果条件括号里的条件是 字符 用 （名称。equals（“字符”））来写

列子：if （条件）{

代码

}

if else语句

如果 条件 成立 就会启动 代码一 否则 会启动 代码二

列子：if（条件）{代码1

}else{代码2

}

多重if语句

如果这个第一个 条件 不成立 可以去看下一个 条件二 如果条件二也不成立 可以一直写下去 多重if没有限制可以 一直 写下去

列子：if（条件一）{

代码一} else if （条件二） {

代码二}else if （条件三）{

代码三}

 

 

## **switch语句**

switch (mingci){

case “条件”:

操作;

//break 这里是停止语句 意思是在这里可以停止了不用再看下面的了

default :

System.*out*.println("不给任何奖励");

switch 语句 的条件是注定的 你输入的值 要跟它的跟条件相同 才可以 成立

而 多重 if 语句 的条件可以取一个范围 只要 你输入的值在这个范围之内就可以成立

 

## **成员变量和局部变量**

作用区域不同

成员变量的作用区域 在整个类内部都可以

局部变量的作用区域 仅限于定义它的方法

//成员变量 叫全局变量 在方法外面 定义的变量本类跟其他类都可以访问这个变量

//局部变量 在一个方法里面定义的变量 只可以在这个方法里面运用 在这个方法外是没有用的

初始值的不同

java会给成员变了一个初始值

//成员变量就算不给其赋值 它也会被java给予一个初始值

java不会给局部变量赋予初始值

//局部变量需要自行去进行赋值

在同一个方法中，不允许有同名的局部变量。 在不同的方法中，可以有同名局部变量

在同一个类中，成员变量和局部变量同名时，局部变量具有优先级

 

 

 

 

 

## **循环结构**

循环结条件 操作

while循环 是你先判断 再执行

列子

while（条件）{

循环操作

}

名称++； 每次递增 不加 会死循环

do while循环 是先执行 再判断

列子

do{

循环操作

}while（条件）

for 循环

次数是可以固定 编写比较简介

for（参数初始化；条件；更新循环变量）{

循环操作

}

增强for循环

只用于遍历集合或数组

语法

​	for (元素类型 变量 : 集合或数组){

​			//操作

​		} 新循环并非新的语法，而是在编译过程中，编译器会将新循环转换为迭代器模式



## **循环操作符**

for循环里也可以加上

if（判断条件）{break

}来进行有条件的 停止

For循环里也可以加上

If（判断条件）{continue

}来进行判断性的重复 循环操作

 

## **数组**

数组是一个变量，储存相同数据类型的一组数据

声明一个变量就是在内存空间中划出一块适合的空间

声明一个数组就是在内存空间中划出一串连续的空间

数组的基本要素

1.标识符：数组的名称，用于区分不同的数组

2.数组元素：向数组中存放的数据

3.元素下标：对数组元素进行编号，从0开始，数组中每个元素都可以通过下标来访问

4.元素类型：数组元素的数据类型

数组的写法一

数据类型[]数据名称=new 数据类型[分多少]；

数据名称[编号0]=[值1]

数据名称[编号1]＝[值2]

等等等。。

方法二

类型[]名称=new 类型[]{值1，值2，值3，。。。}

这里不用写编号 这里 计算机会给值 编号

数组的扩容

三种方法 从繁到简

1.循环将原数组的所有值 逐一赋值给新数组；

2.System.arraycopy(原数组名，原数组初始下标，新数组名，新数组初始下标，被复制的原数组长度);

3.录入工具 java.util.Arrays.copyOf；(原数组名，新数组长度)

 

 

地址的替换

数组作为引用类型之一，其变量值储存的是数组的地址。

完成元素复制后，需要将新数组地址，赋值给原数组进行替换其地址。

可变长参数

概念：可接受多个同类型实参，个数不限，使用方法与数组相同。

语法：数据类型...参数名 注意:必须定义在形参列表的最后，并且只能有一个。

**排序**

　一、所谓[排序](https://baike.baidu.com/item/排序/1066239)，就是使一串记录，按照其中的某个或某些关键字的大小，递增或递减的排列起来的操作。排序算法，就是如何使得记录按照要求排列的方法。排序算法在很多领域得到相当地重视，尤其是在大量数据的处理方面。一个优秀的算法可以节省大量的资源。在各个领域中考虑到数据的各种限制和规范，要得到一个符合实际的优秀算法，得经过大量的推理和分析。

　　二、排序算法可以分为**内部排序**和**外部排序**。

　　　　内部排序是数据记录在内存中进行排序。

　　　　外部排序是因排序的数据很大，一次不能容纳全部的排序记录，在排序过程中需要访问外存。

　　　　常见的内部排序算法有：冒泡排序、选择排序、插入排序、希尔排序等。

![img](D:\Items\笔记\img\table.png)

1）**冒泡排序**

![img](D:\Items\笔记\img\maopao.gif)

a、冒泡排序，是通过每一次遍历获取最大/最小值

b、将最大值/最小值放在尾部/头部

c、然后除开最大值/最小值，剩下的数据在进行遍历获取最大/最小值

d、代码实现

```java
public static void main(String[] args) {
    int arr[] = {8, 5, 3, 2, 4};
    //冒泡
    for (int i = 0; i < arr.length; i++) {
        //外层循环，遍历次数
        for (int j = 0; j < arr.length - i - 1; j++) {
            //内层循环，升序（如果前一个值比后一个值大，则交换）                //内层循环一次，获取一个最大值
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

```

2）**选择排序**

![img](D:\Items\笔记\img\xuanze.gif)

　　a、将第一个值看成最小值

　　b、然后和后续的比较找出最小值和下标

　　c、交换本次遍历的起始值和最小值

　　d、说明：每次遍历的时候，将前面找出的最小值，看成一个有序的列表，后面的看成无序的列表，然后每次遍历无序列表找出最小值。

　　e、代码实现

```java
public static void main(String[] args) {
    int arr[] = {6, 5, 3, 2, 4};
    //选择
    for (int i = 0; i < arr.length; i++) {
        //默认第一个是最小的。
        int min = arr[i];
        //记录最小的下标
        int index = i;
        //通过与后面的数据进行比较得出，最小值和下标 
        for (int j = i + 1; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
                index = j;
            }
        }
        //然后将最小值与本次循环的，开始值交换
        int temp = arr[i];
        arr[i] = min;
        arr[index] = temp;
        //说明：将i前面的数据看成一个排好的队列，i后面的看成一个无序队列。每次只需要找无需的最小值，做替换
    }
}
```

3）**插入排序**

![img](D:\Items\笔记\img\charu.gif)

　a、默认从第二个数据开始比较。

　　b、如果第二个数据比第一个小，则交换。然后在用第三个数据比较，如果比前面小，则插入（狡猾）。否则，退出循环

　　c、说明：默认将第一数据看成有序列表，后面无序的列表循环每一个数据，如果比前面的数据小则插入（交换）。否则退出。

　　d、代码实现

```java
public static void main(String[] args) {
    int arr[] = {7, 5, 3, 2, 4};
    //插入排序
    for (int i = 1; i < arr.length; i++) {
        //外层循环，从第二个开始比较
        for (int j = i; j > 0; j--) {
            //内存循环，与前面排好序的数据比较，如果后面的数据小于前面的则交换
            if (arr[j] < arr[j - 1]) {                    
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];                   
                arr[j] = temp;
                                     } else {                    //如果不小于，说明插入完毕，退出内层循环
                break; 
            }
        }
    }
}
```

4）**希尔排序**（插入排序变种版）

![img](D:\Items\笔记\img\xier.gif)

a、基本上和插入排序一样的道理

　　b、不一样的地方在于，每次循环的步长，通过减半的方式来实现

　　c、说明：基本原理

和插入排序类似，不一样的地方在于。通过间隔多个数据来进行插入排序。

　　d、代码实现

```java
public static void main(String[] args) {
    int arr[] = {7, 5, 3, 2, 4};
    //希尔排序（插入排序变种版）
    for (int i = arr.length / 2; i > 0; i /= 2) {
        //i层循环控制步长
        for (int j = i; j < arr.length; j++) {
            //j控制无序端的起始位置
            for (int k = j; k > 0  && k - i >= 0; k -= i) {                    if (arr[k] < arr[k - i]) {                        int temp = arr[k - i];
                                                                       arr[k - i] = arr[k];
                                                                     arr[k] = temp;
                                                                   } else {
                break;
            }                                               
         }
        }
        //j,k为插入排序，不过步长为i 
    }
}
```



　　5）**快速排序**

![img](D:\Items\笔记\img\kuaisu.gif)

a、确认列表第一个数据为中间值，第一个值看成空缺（低指针空缺）。

　　b、然后在剩下的队列中，看成有左右两个指针（高低）。

　　c、开始高指针向左移动，如果遇到小于中间值的数据，则将这个数据赋值到低指针空缺，并且将高指针的数据看成空缺值（高指针空缺）。然后先向右移动一下低指针，并且切换低指针移动。

　　d、当低指针移动到大于中间值的时候，赋值到高指针空缺的地方。然后先高指针向左移动，并且切换高指针移动。重复c、d操作。

　　e、直到高指针和低指针相等时退出，并且将中间值赋值给对应指针位置。

　　f、然后将中间值的左右两边看成行的列表，进行快速排序操作。

　　g、代码实现

```java
 public static void main(String[] args) {
     int arr[] = {7, 5, 3, 2, 4, 1, 8, 9, 6};
     //快速排序
     int low = 0;
     int high = arr.length - 1;
     quickSort(arr, low, high);
 }
public static void quickSort(int[] arr, int low, int high) {        //如果指针在同一位置(只有一个数据时)，退出
    if (high - low < 1) {
        return;
    }
    //标记，从高指针开始，还是低指针（默认高指针）
    boolean flag = true;
    //记录指针的其实位置
    int start = low;
    int end = high;
    //默认中间值为低指针的第一个值
    int midValue = arr[low];
    while (true) {
        //高指针移动
        if (flag) {
            //如果列表右方的数据大于中间值，则向左移动                
           
            if (arr[high] > midValue) {
                high--; 
            } else if (arr[high] < midValue) {
                //如果小于，则覆盖最开始的低指针值，并且移动低指针，标志位改成从低指针开始移动
                arr[low] = arr[high];
                low++;
                flag = false;
            }
        } else {
            //如果低指针数据小于中间值，则低指针向右移动
            if (arr[low] < midValue) {
                low++;
            } else if (arr[low] > midValue) {
                //如果低指针的值大于中间值，则覆盖高指针停留时的数据，并向左移动高指针。切换为高指针移动
                arr[high] = arr[low];
                high--;
                flag = true; 
            }
        }
        //当两个指针的位置相同时，则找到了中间值的位置，并退出循环           
        if (low == high) {
            arr[low] = midValue;
            break;
        }
    }
    //然后出现有，中间值左边的小于中间值。右边的大于中间值。        //然后在对左右两边的列表在进行快速排序
    quickSort(arr, start, low -1);
    quickSort(arr, low + 1, end);
}
```

　6）**归并排序**

![img](D:\Items\笔记\img\bingui.gif)

　　a、将列表按照对等的方式进行拆分

　　b、拆分小最小快的时候，在将最小块按照原来的拆分，进行合并

　　c、合并的时候，通过左右两块的左边开始比较大小。小的数据放入新的块中

　　d、说明：简单一点就是先对半拆成最小单位，然后将两半数据合并成一个有序的列表。

　　e、代码实现

```java
public static void main(String[] args) {
    int arr[] = {7, 5, 3, 2, 4, 1，6};
    //归并排序
    int start = 0;
    int end = arr.length - 1;
    mergeSort(arr, start, end);    }
public static void mergeSort(int[] arr, int start, int end) {
    //判断拆分的不为最小单位
    if (end - start > 0) {
        //再一次拆分，知道拆成一个一个的数据            
        mergeSort(arr, start, (start + end) / 2);            
        mergeSort(arr, (start + end) / 2 + 1, end);          
        //记录开始/结束位置
        int left = start;
        int right = (start + end) / 2 + 1;
        //记录每个小单位的排序结果
        int index = 0;
        int[] result = new int[end - start + 1];            
        //如果查分后的两块数据，都还存在
        while (left <= (start + end) / 2 && right <= end) {          //比较两块数据的大小，然后赋值，并且移动下标               
            if (arr[left] <= arr[right]) {                   
                result[index] = arr[left];                   
                left++;
            } else { 
                result[index] = arr[right];                 
                right++;
            }
            //移动单位记录的下标
            index++;
        }
        //当某一块数据不存在了时
        while (left <= (start + end) / 2 || right <= end) {                //直接赋值到记录下标
            if (left <= (start + end) / 2) {                    
                result[index] = arr[left];                    
                left++;
            
           } else {
                result[index] = arr[right];                       
                right++;
            } 
            index++;
        }
        //最后将新的数据赋值给原来的列表，并且是对应分块后的下标。            
        for (int i = start; i <= end; i++) {
            arr[i] = result[i - start];
        }
    }
}
```

## 自动数组排序

Import java.util.Arrays; 运用工具

Arrays.sort(名称)；

## 二维数组

概念：一维数组中的一维数组；数组值的元素，还是数组。

高维数组存着低维数组的地址 低维数组中存着值

语法：

\1. 数据类型[][]数组名=new 数据类型[高维长度][低维长度]；

\2. 数据类型[][]数组名={{高维0},{高维1},{高维2},{高维3}}

总结：

数组的概念

一组连续的储存空间，储存多个相同数据类型的值。

数组的遍历：

从头到尾，逐一对数组的每个元素进行访问。

数组的应用;

数组复制、数组扩容、数组参数、数组返回值、二维数组。

 

 

## **嵌套循环**

也叫 二重循环，指一个循环体内又包含另一个完整的循环结构

while(循环条件一){

循环操作

while(条件二){操作二

}

}

 

do{操作一

do{操作二

}while(条件二)

}while(条件一)

 

for(条件一){操作一

for(条件二){操作二

}

}

各种循环可以互相嵌套

 

while(条件一){操作一

for（条件二）{操作二

}

}

外层循环变量变化一次，内层循环变量要变化“一遍”！！！ 这句话特别关键

理解 意思是 外层的值变化一次 被包裹的 内层值 需要从最低值到最高值循环 （或者最高值到最低值）一遍

这个代码 可以特别直观的 理解 这里的 i 是 外层值， b是内层值

```java
for (int i=1;i<=9;i++){

for (int b=1;b<=i;b++){

System.*out*.print("\t"+b+"x"+i);

} System.*out*.println();

}
```

 

## **函数**

概念：实现特定功能的一段代码，可反复使用

有需要用函数 需要用函数名加括号 列；数名（）

函数调用时，会优先执行函数的内部代码；执行完毕后，返回到函数调用处，继续向下执行。

### 1.参数与实参

Public static void 函数名（形式参数）形式参数等于“局部变量声明”

形参中可以声明多个变量变量名之间需要加上逗号“，”进行分割

带入函数时括号里的值叫实式参数 可以进行输入值 来赋予函数中的形参一个值让其函数调用正常运行

形参中创建了多个变量时 实参中输入值的时就需要输入值的时候用逗号进行分割。

### 2.返回值

Public static 返回值类型 函数名（形参）{ //不需要返回值 写void

函数主体

return 返回值；}//return 在这里是表示结束当前函数，并且伴随的返回的值，换回到函数调用处。 在void用return 时结束函数的意思

 

返回值 调用需要建立一个变量进行接受 返回来的值

调用语法 变量 = 函数名（）

接受返回值 函数调用的表达式，最终即代表了所返回的结果。

返回值类型 定义时，即约定了返回值的结果类型。

返回值 与返回值类型匹配的具体结果。在return关键字的后面追加具体值。

返回值函数语句 只能有一个返回值 进行返回

注意事项 :

一个类中可以定义多个函数，函数之间属于并列关系，不可嵌套！

一个函数只做一件事。（单一只能原则）

函数可以多级调用 函数一调用函数二在调用三等等。。。

### 3.递归

递归就是有固定的规律 ，函数中自己调用自己。

递：是递进的意思 进行每一次推进，计算比上一次简单，直到简单到无需继续推进，就能够获得结果。 也叫“达到出口”

归：是回归的意思 进行出口的结果，逐层回归，并依次计算每一层的解决，直至最顶层。

如何使用递归

当你需要解决的问题可拆分成多个有规律的小问题，大问题解决比较复杂困难，就可以使用递归

无穷递归

当函数自己调用自己时，如果没有正确的出口条件，则会产生

无穷递归。

### 4.函数的总结

函数的概念：

实现特定功能的一段代码，可以反复使用。

函数的定义：

Public static void 函数名（）{函数主体}

函数的组成：

形参列表 实参列表 返回值类型 返回值 函数名 函数主题。

函数的调用：

函数名（实参。。。）

函数的好处：

减少冗余 提高复用性 可读性 可维护性 方便分工合作。

递归

将大的问题拆分成多个小问题，大小问题的解决方法相同，有着固定规律，函数中自己调用自己。

**JVM栈空间（局部变量）跟Heap堆空间（对象、数组）**

JVM栈； 基本类型的赋值等价与“值”的复制，一方的改变，不会影响另一方。

Heap堆； 存的是引用类型的值需要用地址进行引用其中的值。

引用类型的赋值等价于“地址”的复制，一方改变，会影响Heap堆空间中存的共享值。

 

 

![img](.\img\wps2.jpeg)

 

《栈与堆分区》

![img](.\img\wps3.jpeg)

 

## **类和对象**

什么是程序

程序是为了虚拟现实世界，解决现实问题而使用计算机语言编写的指令集合。

面向对象思想（Object Oriented Programming）

一切客观存在的事物都是对象。万物皆对象。

任何对象，一定具有自己的特征和行为。

语法：

类名 对象名 = new 类名(); 建立对象

对象名.属性名 = 值；给属性赋值

对象名.属性名；访问属性

对象名.方法名(实参);方法的调用

类的方法里没有形参调用中就不用写

类和对象的关系

类：定义了对象应具有的特征和行为。类是对象的模板。

对象：拥有多个特征和行为的实体，对象是类的实例。

### 方法重载

重载（Overload）:一个类的定义多个相同名称的方法。

要求：方法名称相同，参数列表不同，与访问修饰符、返回值类型无关。

 

 

对象创建过程

1.内存中开辟对象空间

2.为各个属性赋初始值

3.执行构造方法中的代码

4.将对象的地址赋值给变量

### 构造方法

类中的特殊方法，主要用于创建对象。

特点

1.命名与类名相同。

2.没有返回值类型。

3.建立对象时，触发构造方法的调用不可通过句点手动调用。

4.如果没有在类中显示定义构造方法，则编译器默认提供无参构造方法。

5.构造方法也可以重载。

### This关键字

第一种：调用实例属性.实力方法。如：this.属性名this.方法名()

第二种：调用本类值的其他构造方法。如：this() this(实参)

注意：调用构造方法需要把代码写到第一行；

### 封装

概念：尽可能隐藏对象的内部现实细节，控制对象的修改及访问的权限。

访问修饰符；private（可将属性修饰为私有，仅本类可见）

### 命名规范

在类中 用实例方法 使用私有属性 没有返回值 方法名前要加set

在类中 用实例方法 使用私有属性 有返回值 方法名前要加get

类的组成：私有属性 公共访问方法 无参构造方法叫做实体类

实体类：Entity 作用：储存数据

### 继承

程序中的继承，是类与类之间特征和行为的一种赠与或获得；

两个类之间的继承关系，必须满足“is a”的关系；

继承分成两个类父类与子类，子类继承父类；

功能越精细，重合点越多就是父类；

功能越粗糙，重合点越少就是object类；

父类的抽取

可根据程序需要使用到的多个具体类，进行共性抽取，进而定义父类；

在一组相同或类似的类中，抽取出共性的特征和行为，定义在父类中，实现重用。

语法；

Class子类名extends父类名{}

一个类只能有一个直接父类，但是可以多级继承，属性和方法逐级叠加。

“类的构造方法”和“（private）私有的的属性、方法”是不可继承；

父子类不在同一个package（包）内时，default修饰的属性和方法是你可继承的；

### 方法的重写（覆盖）

当父类提供的方法无法满足子类的需求时，可在子类中定义和父类相同的方法进行覆盖（override）也叫重写。

原则：

方法名称、参数列表、返回值类型必须与父类相同；

访问修饰符可与父类相同或是比父类更宽泛；

### super关键字

在子类中，可直接访问从父类继承到的属性和方法，但如果父子类的属性或方法名存在重名（属性遮蔽、方法覆盖）时，需要加以分区，才可专项访问。

语法：super.父类属性或方法名；

在子类构造方法的首行使用super()或者super(实参)，调用父类构造方法，如果你不写调用父类构造方法 它会默认提供为super()。

在同一个子类构造方法中super()、this()不可同时存在。

 

### 修饰符

如果要用某个包内的类需要进行导包：import。包名.类名；

public（公共的）：修饰的属性和方法是都可见；

private(私有的)：修饰符的属性和方法只能“本类”可见；

Default：修饰符的属性和方法是只能“在同package（包）下、本类”可见；

protected（受保护的）：修饰的属性和方法是只能“本类、同package（包）、非同包子类（父类在包内，子类不在包内，子类是可以进行导包应用包内的其它类）”可见；

### 多态

概念：

父类引用指向子类对象，从而产生多种形态。

二者具有或间接的继承关系，父类引用可指向子类的对象，即形成多态。

父类引用仅可调用父类所声明的属性和方法，不可调用子类独有的属性和方法。

多态的使用

使用父类作为方法形参实现多态，使方法参数的类型更为宽泛；

实际运行中，依旧遵循这覆盖原则，如果子类覆盖了父类的方法，那么就会执行子类中覆盖后的方法，否则会执行父类中的方法。

使用父类作为方法返回值实现多态，使方法可以返回不同子类对象；

拆箱与装箱

父类引用中保存真实子类对象，称为向上类型；（即多态核心概念）

将父类引用中的真实子类对象，强转回子类本身类型，称为向下转型；

### Instance of关键字

向下转型前，应判断引用中的对象真实类型，保证类型转换的正确性。

语法 ：引用 instance of 类型//返回布尔类型结果；

### abstract修饰类

被abstract修饰的类称之为抽象类；

抽象类是不完整的类 不够具体的类，抽象类的对象无法独立存在，所以不能new对象；

作用； 可被子类继承。提供共性属性和方法，

可声明为引用，强制使用多态。

### abstract修饰方法

抽象父类，可作有子类的组成部分，依附于子类对象存在，由“父类共性”加“子类独有”组成完整的子类对象。

被abstract修改的方法，成为抽象方法，只有方法声明，没有方法实现（{}的部分）。

意为不完整的方法，必须包含在抽象类中。

产生继承关系后，子类必须覆盖父类中的所有抽象方法，否则子类还会是抽象类。

抽象类中不一定有抽象方法，但是有抽象方法的类一定是抽象类。

 

### static修饰

Static修饰的成员为静态成员，无需建立对象，可直接通过类名

问。

静态方法允许直接访问静态成员，不能直接访问非静态成员，不允许使用this或super关键字；

静态方法可以继承，不可以覆盖、没有多态。

### 类加载

JVM首次用到某类时，需要通过CLASS PATH查找该类的.class文件。

将.class文件中对类的描述信息加载到内存中，进行保存。

类加载时，触发静态代码块的执行（近一次）；执行地位在静态属性初始化之后。

可为静态属性赋值，或必要的初始行为。

### final关键字

Final修饰的类是不会被继承；

final修饰的方法不可以被覆盖；

Final修饰的变量 变量值不可变 称之为常量；

final修饰的基本类型 基本值不可改变；

Final修饰的引用类型 地址不可变 其中的值可以变；

Final修饰的实例属性 需要在构造方法执行结束之前进行赋值；

Final修饰的静态属性 需要在静态代码块之前赋值；

### Java中方法调用，两种

\1. 静态分派

静态方法中，允许参数列表不同的重名方法，指静态方法直接的重载；

\2. 动态分派

在具有继承关系的情况下，调用实例方法时，自低向上查找可用方法版本，指实例方法的覆盖。

### 方法调用的五个指令

\1. invoke spacial 调用私有方法或构造方法

\2. invoke interface 调用接口方法

3.invoke static 调用静态方法

4.invoke dynamic 调用动态链接方法

5.invoke virtual 调用虚方法（父类定义的 被子类覆盖的方法）

### **Class文件反编译**

Java -verbose:class 文件名；

Javap -verbose class文件名>文件名.bytcodc

 

### **接口（interface）**

接口的特点；

不能建立对象；

可以作为引用类型；

具有Object类中所以定义的方法；

所以属性都是公开静态常量，隐式使用public static final 修饰；

所以属性都是公开抽象方法，隐式使用public abstract修饰；

没有构造方法、动态代码块、静态代码块；

接口时一种能力 接口中的方法是一种规定；

应用接口需要在类名后加上“implements”加接口名，如果一个类要应用多个接口，可以直接在上个接口名后加“,”分割再写接口名；

因为接口的方法都是public的修饰的所以继承的时都时public修饰的方法；

接口引用跟父类一样，接口也可以引用实现类对象；

接口也可以成为的方法形参 和返回值类型。

接口也可继承接口中的行为（方法）。

类与类叫单继承；类与接口叫多实现；接口与接口叫多继承；

将多个常用于量表示状态或固定值的变量，以静态常量的形式定义在接口中统一管理，提高代码可读性。

jdk8以后 接口里用abstract修饰的方法是可以有方法体的 可以被重写；

jdk8以后 接口里用static修饰的方法是可以有方法体的 不可以被重写；

 

### **枚举 （enum）**

可以规范取值的类型 规定什么值 就只能取什么值

enum 枚举名{

“值”,”值”,”值”

}

接口回调：先有接口的使用者，后有接口的实现者。

接口的好处；

程序的耦合度降低；

跟自然的使用多态；

设计接口与实现类完全分离；

更容易构建程序框架；

更容易更换具体实现类；

enum 定义的枚举类默认继承了 java.lang.Enum 类，并实现了 java.lang.Seriablizable 和 java.lang.Comparable 两个接口。

values(), ordinal() 和 valueOf() 方法位于 java.lang.Enum 类中：

- values() 返回枚举类中所有的值。
- ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
- valueOf()方法返回指定字符串值的枚举常量。

### **内部类**

在一个类的内部再定义一个完整的类；

编译之后可生成独立的字节码文件；

内部类可直接访问外部类的私有成员，而不破坏封装；

可为外部类提供必要的内部功能组件；

成员内部类

在类的内部定义，与实例变量、实例方法同级别的类；

外部类 外对象名 = new 外部类（）；

内部类 内对象名 = 外名.new.外部类（）；

当外部类、内部类重名属性时，会优先访问内部类属性。

如果内部类访问外部类属性 需要在属性名前加（外类名.this）

内部类不可定义静态成员；

#### 静态内部类

不依赖外部类对象，可直接建立或通过类名访问；

外部类.内部类.方法或属性；

只能直接访问外部类的静态成员；

#### 局部内部类

定义在外部类方法中，作用范围和创建对象继仅限当前方法；

局部内部类访问外部类当前方法中的局部变量时，因无法保障变量的生命周期与自身相同。变量必须修饰为常量（final）；

#### 匿名内部类

没有类名的局部内部类，一切特征都与局部类相同；

必须继承一个父类或实现一个接口；

定义类，实现类，创建对象的语法都合并到一起，并且只能建立一个对象；



### **Object类**

超类，基类。所以的类直接或间接父类，位于继承树的最顶层；

如果类有没有继承别的类 那么这个类就会默认继承object类；

Object类中的方法，是所以对象都具有的方法；

Object类中的方法

get Class()方法；

放回引用中储存的时间对象类型；

hash Code()方法；

返回该对象的十进制的哈希码值；

根据对象地址 字符串 数字 计算出来的整数类型的数值；

哈希码并不唯一，可保证相同对象返回相同哈希码；

to String()方法；

返回该对象的字符串表现形式；

equals()方法

默认实现连个对象地址的比较；

可进行覆盖比较两个对象的内容是否相同；

 

### Finalize()方法

当对象被判定为垃圾时，由JVM自动调用此方法，用以标记垃圾对象进行回收；

垃圾对象：没有有效引用指向此对象时为垃圾对象；

自动回收机制：JVM的内存耗尽，一次性回收所以垃圾对象；

手动回收机制：使用System . gc();通知进行垃圾回收；

**包装类与常用转型方法**

8种包装类提供不同类型间的转换方式；

Number父类中提供的六个共性方法；

parse XXX()静态方法；

value Of()静态方法；

需要保证类型的兼容，否则会出现异常；

自动装箱与拆箱 ，根据类型自动；

### **String类**

字符串是常量，创建之后不可改变；

字符串字面值储存在字符池中，可以共享；

String s=“Hello”；产生一个对象，把“Hello”存在池中；

String s= new String（“Hello”）；产生两个对象，一是把值存到池中 二是把值再存到对象里；

String Buffer() 和String Builder()可变字符串;

Big Decimal()精确计算小数;

Add加法，subtract减法，multiply乘法，divide除法；

### **生成字符串**

   char[] value = {'l', 'o', 'v', 'e'};        // 利用构造方法生成字符串        String string01 = new String(value);        System.out.println(string01);        // 利用valueOf法生成字符串        String string02 = String.valueOf(value);        System.out.println(string01);

### **比较字符串**

   String str01 = new String("ABC");        String str02 = new String("ABC");        // equals方法比较内容是否一致 内容一致返回true 内容不一致返回false        System.out.println(str01.equals(str02));        // compareTo方法比较内容是否一致 内容一致返回整数零 内容不一致返回非零整数        System.out.println(str01.compareTo(str02));         System.out.println(str01 == str02);        // 问:new String("abc")在内存中创建了几个新对象        // 答:一个或者两个

**字符串的拼接**

  // 加号遇到字符串就不再是数学运算了而是字符串的拼接        int a = 10, b = 20 , c;        c = a + b;        System.out.println(c);        String str = "" + 50;        // instanceof 严格来说是Java中的一个双目运算符，用来测试一个对象是否为一个类的实例        System.out.println(str instanceof String);        // concat方法代表字符串的拼接        String d = "a".concat("b");        System.out.println(d);

**判断一个字符串里是否包含另一个字符串 返回boolean true false**

 // contains字符串中是否包含另外一个字符串返回值为布尔类型        String str01 = "我爱你中国";        // true        System.out.println(str01.contains("我爱你"));        // false        System.out.println(str01.contains("伟大"));

**判断一个字符串里是否包含另一个字符串 返回一个索引 没有返回 -1**

public void test03() {        // indexOf字符串中是否包含另外一个字符串第一次出现的index        String str01 = "abcbcbe";        // 1        System.out.println(str01.indexOf("bc"));        // -1        System.out.println(str01.indexOf("d"));        // 3        System.out.println(str01.lastIndexOf("bc"));

 String str01 = "abcbcbe";        // charAt根据indexh获取该位置上字符的值        System.out.println(str01.charAt(3));        // length获取字字符串长度        System.out.println(str01.length());        System.out.println(str01.charAt(30));

**字符串中的字符大小写转换**

​        String str01 = "LovE";        String str02 = "lOVe";        String str03 = toLowerCase(str01);        String str04 = toUpperCase(str02);        System.out.println(str03);        System.out.println(str04);

**跟上面同理**

System.out.println(Character.toLowerCase('A'));        System.out.println(Character.toLowerCase(65));        System.out.println(Character.toUpperCase(97));        System.out.println(Character.toUpperCase('a'));

**字符串转编码集**

String str01 = "我爱你中国";        try {            byte[] bytesUtf8 = str01.getBytes("UTF-8");            String str02 = new String(bytesUtf8, "GBK");            System.out.println(str02);            byte[] gbks = str02.getBytes("GBK");            String str03 = new String(gbks, "UTF-8");            System.out.println(str03);        } catch (UnsupportedEncodingException e) {            e.printStackTrace();        }

### **字符串截取**

 String str01 = "abcdefgh";        // 字符串截取cdefgh        System.out.println(str01.substring(2));        // 前包后不包 cde        System.out.println(str01.substring(2, 5));

### **字符串替换**

 String str01 = "abcdabcd";        String str02 = "abcdabed";        // 字符串替换        // ahcdahcd        System.out.println(str01.replace("b", "h"));        // ahcdabcd        System.out.println(str01.replaceFirst("b", "h"));         // ahdabed        System.out.println(str02.replaceAll("bc", "h"));

**按字符截取 返回值存到字符串数组里**

 String str01 = "2020-09-01";        String[] strings = str01.split("-");        for (String text : strings) {            System.out.println(text);        }

**测试字符串是否以指定的后缀结尾或开头 返回true false**

 String str01 = "ABC.jpg";        System.out.println(str01.startsWith("A"));        System.out.println(str01.endsWith("jpg"));

**去掉字符串的首尾的空白**

 String str01 = "  ABC  ";        System.out.println(str01);        System.out.println(str01.length());        String str02 = str01.trim();



### **String 常用API**

   length()----可以获取字符串的长度(字符的个数)

​	indexOf(int ch)----字符在此字符串第一次出现的位置，找不到返回-1

​	indexOf(int ch,int fromIndex)----从fromIndex开始第一次出现ch的位置

​		  indexOf(String str)----字符串在此字符串第一次出现的位置，找不到返回-1

​	indexOf(String str,int fromIndex)----从fromIndex开始第一次出现str的位置

​	lastIndexOf(int ch);----字符在此字符串最后一次出现的位置，找不到返回-1

​	lastIndexOf(int ch,int endIndex);----从头开始到指定位置，返回字符最后

​		  	一次出现的位置

​	lastIndexOf(String str);----字符串在此字符串最后一次出现的位置，找不到返回-1

​	 lastIndexOf(String str,int endIndex);----从头开始到指定位置，返回字符串最后

​		  	一次出现的位置

​	substring(int beginIndex);----从指定位置开始截取，一直截取到末尾

​	substring(int beginIndex,int endIndex);----从指定位置开始截取，一直截取到

​		  	指定位置("含头不含尾")

   replace(String oldStr,String newStr);----将某个字符串全部替换为另一个字符串

​	replace(char oldChar,char newChar);----将某个字符全部替换为另一个字符

   startsWith(String str)----判断字符串是否以str开头

​	  endsWith(String str)----判断字符串是否以str结尾

​	concat(String str)----此字符串后面拼接str

​	equals(String str)----判断字符串的样子一样不？？？

​	trim()-----去掉字符串的首尾的空白

​	toUpperCase()----把字符串里的字母全都变成大写

​	toLowerCase()----把字符串里的字母全都变成小写

​	charAt(int index)----返回index上的字符

​	valueOf(Object obj)----把参数转换成String类型

​	toCharArray()----把字符串转换字符数组 

### **StringBuilder及其API** 

​	StringBuilder封装可变字符串

​	和String类型的区别

  	  String类型的对象不能更改， 如果更改，会创建新的对象

  	  StringBuilder的对象是可以改变的，是对这个对象本身进行修改，可长可短

  	  StringBuilder:效率高，速度快，线程不安全

  	常用方法：

  	   append(String str)-----在对象后拼接str,返回此对象

  	   delete(int startIndex,int endsIndex)

  	   insert(int index,Object obj)---将obj插入到index上

  	   reverse()--------将字符串反转。

  	   toString()-------将StringBuilder对象转换成String对象

### String 、StingBuffer、StringBuilder的区别

String 声明的是不可变的对象，每次操作都会生成新的 String 对象，然后将指针指向新的 String 对象

而 StringBuffer、StringBuilder 可以在原有对象的基础上进行操作，所以在经常改变字符串内容的情况下最好不要使用 String。

StringBuffer 和 StringBuilder 最大的区别在于，StringBuffer 是线程安全的，

而 StringBuilder 是非线程安全的，但 StringBuilder 的性能却高于 StringBuffer，所以在单线程环境下推荐使用 StringBuilder，多线程环境下推荐使用 StringBuffer。

### **克隆（clone）**

**1.为什么要使用克隆？**

想对一个对象进行处理，又想保留原有的数据进行接下来的操作，就需要克隆了，Java语言中克隆针对的是类的实例。

**2.如何实现对象克隆？**

有两种方式：

1). 实现Cloneable接口并重写Object类中的clone()方法；

2). 实现Serializable接口，通过对象的序列化和反序列化实现克隆，可以实现真正的深度克隆；

**3深拷贝和浅拷贝区别是什么？**

浅拷贝只是复制了对象的引用地址，两个对象指向同一个内存地址，所以修改其中任意的值，另一个值都会随之变化，这就是浅拷贝（例：assign()）

深拷贝是将对象及值复制过来，两个对象修改其中任意的值另一个值不会改变，这就是深拷贝（例：JSON.parse()和JSON.stringify()，但是此方法无法复制函数类型）

## **集合框架**

对象的容器，存储对象的对象，可代替数组；

函数接口 使用@FunctionalInterface修饰并且只有一个方法的接口我们称之为函数式接口

### Collection体系集合

代表一组任意类型的对象，无序，无下标；

Boolean add（object o）;添加一个对象

Boolean add All（Collection c）；将一个集合中的所以对象添加到此对象中；

Void clear()；清空集合中的所以对象；

Boolean contains(Object o);检查此类中是否包含o对象

Boolean equals(Object o);比较此集合是否与指定对象相等

Boolean is Empty();判断此集合是否为空

Boolean remove(object o);此集合中移除o这个对象

Int size();返回此集合的元素个数

Object[] to Array();将集合传换为数组

###  **List接口**

list 储存数据是有序可重复的，因为底层使用的数组储存，是有元素下标的（index）的，所以有序指的就是按照新增顺序储存

List sub List（int from Index， int to Index）返回from到to之间的数组；

### Array List实现类

数组结构实现；查询快；增删慢

线程不安全

新增数据和删除数据比较慢，但是查询与修改速度快 因为是线性储存；

### Linked List实现类

用法 跟Array List一样

就是查询慢； 增删快；

多一些对象一个元素（First）和最后一个元素（Last）的快速访问；

新增数据与删除数据比较快，查询与修改速度慢 因为是双向链表结构；

### **Set接口**

无序 无下标 元素不可重复；

全继承成Collection

### Hash Set实现元素不重复；

当元素哈希码相同时会进行equals比较进行确认，结果为true为重复不可存入；

无序不可重复 无序指 储存时顺序和录入后排列的顺序不符；不可重复指存入元素不可重复；

### Tree Set

基本排序实现元素不重复；

实现了Sorted Set接口，对集合元素自动排序；

元素对象的类型必须实现Comparable接口的指定排序规则；

通过Compare To方法确定是否为重复元素；

### Linked Hash Set

链表实现的Hash Set，按照链表进行储存，即可保存元素的插入顺序；

无序不可重复 无序指的是储存时的顺序和录入后的顺序不一样 不可以重复指的是元素不可以重复  可以按照添加的顺序储存； 

### Map接口（映射）

用来 储存任意 键 值 对（Key—Value）

键 无序、无下标、不允许重复（唯一）；

值：无序、无下标、可以重复；

Map就是entry<k,v>类型的数组链表；

主要方法

V put(K key,V Value);将对象存到集合中，关联键值。Key重复则覆盖原值；

Object get（Object key）；根据key获取对应值；

Set<K> key set(K key);返回所以键的值；

Collection<V> values();返回包含所有值的Collaboration集合；

Set<Map.Entry<K,V>> entry set

### Hash Map类

线程不安全，运行效率快，允许用null 作为key或value；

### Hash table类

线程安全，效率慢，不允许null作为key或value；

Properties  可以“文件名.properties”来做出成表格录入KV

Hash table 的子类 要求K和V都时字符串类型 通常用于配置文件的读取；

### **Tree Map**

实现了Sorted Map接口，可对K自动排序；

### **队列（Queue）**

队列是常用的数据结构，可以将队列看成特殊的线性表，队列限制了对线性表的访问方式：只能从线性表的

​	一端添加(offer)元素，从另一端取出(poll)元素

​	队列遵循先进先出(FIFO)的原则

​	LinkedList实现了Queue接口

### **Map的遍历**

​	遍历所有的key

Set<Key> keySet()：该方法会将Map中所有的key存入一个Set集合后返回

​	遍历所有的key-value

​	Set<Entry<Key,Value>> entrySet()：该方法会将Map中的每一组key-value键值对

​	封装成一个Entry对象并存入到一个Set集合并返回

​	遍历所有的value(不常用)

Collection<V> values()：该方法会将Map中所有的value存入到一个集合中，因为value

​	可能会重复，所以使用Collection来存放，泛型就是Map中value的泛型

泛型（generic）

数化类型，类型安全的集合，强制集合元素的类型必须一致；

占位符”<类型>”

linkedList<integer>list  = new LinkedList<integer>();

public static <N extends A1 & Comparable>void m3(N n){}

### Collections工具

Collections.reverse();

元素的倒置

Collections.shuffle();

元素顺序随机打乱

Collections.sort();

元素排序

### **集合常用方法**

boolean add(E e)：将指定元素e添加到集合中，添加成功返回true

boolean contains(Object o)：判定o是否被包含在集合中，包含返回true

​	注：此处的包含是equals比较的结果，equals比较相同，则包含

int size()：获取集合中元素的个数

void clear()：清空集合

boolean isEmpty()：判断集合中是否不包含任何元素

boolean addAll(Collection c)：用于将c集合中的所有元素全部添加到当前集合中，如果当前

​		集合因为添加而发生元素的变化返回true，没变化返回false

boolean containsAll(Collection c)：用于判断当前集合是否包含指定集合中的所有元素，

​		如果包含则返回true，否则false

E get(int index)：通过下坐标访问对应的元素

E remove(int index)：移除下坐标所对应的元素，返回值类型是泛型规定的类型，值是移除的

​		那个元素

  boolean remove(Object o)：移除o  返回true/false

  removeAll(Collection c)：移除和c集合中的共同的元素

![img](.\img\集合.gif)

### **集合的三种遍历方法**

### 1.增强for循环

for (元素类型 变量 : 集合或数组){

​			//操作

​		}

### 2.迭代器(Iterator)

Iterator<泛型> iterator = 集合名.Iterator();

while（iteator.hasNext()）{

System.out.println(iterator.next());

}

### 3.基础for循环

　　for (int i = 0; i < 集合名.size(); i++) {           System.out.println(list.get(i));       　　}



## **迭代器(lterator)**

​	迭代器用于遍历当前集合元素

​	 迭代器的获取：

​	Collection的方法    Iterator c.iterator();

​	 Iterator是一个接口

​	 常用方法

boolean hasNext()：判断集合中是否还有下一个元素，有返回true

E next()：取出集合的下一个元素

void remove()：删除集合中迭代出来的元素

注：

​	在使用迭代器遍历集合，做删除操作时，不能使用集合的删除方法，否则会抛出异常

​	迭代器的删除方法是在元集合中删除元素

​	在调用remove方法前必须通过迭代器的next方法迭代过元素，那么删除的就是这个元素，

​	并且不能再次调用remove方法，除非再次调用next后方可再次调用remove方法

## **异常**

**常见的异常**

**NullPointerException：**

当应用程序试图访问空对象时，则抛出该异常。

**SQLException：**

提供关于数据库访问错误或其他错误信息的异常。

**IndexOutOfBoundsException：**

指示某排序索引（例如对数组、字符串或向量的排序）超出范围时抛出。 

**NumberFormatException：**

当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。

**FileNotFoundException：**

当试图打开指定路径名表示的文件失败时，抛出此异常。

**IOException：**

当发生某种I/O异常时，抛出此异常。此类是失败或中断的I/O操作生成的异常的通用类。

**ClassCastException：**

当试图将对象强制转换为不是实例的子类时，抛出该异常。

**ArrayStoreException：**

试图将错误类型的对象存储到一个对象数组时抛出的异常。

**IllegalArgumentException：**

抛出的异常表明向方法传递了一个不合法或不正确的参数。

**ArithmeticException：**

当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例。 

**NegativeArraySizeException：**

如果应用程序试图创建大小为负的数组，则抛出该异常。

**NoSuchMethodException：**

无法找到某一特定方法时，抛出该异常。

**SecurityException：**

由安全管理器抛出的异常，指示存在安全侵犯。

**UnsupportedOperationException：**

当不支持请求的操作时，抛出该异常。

**RuntimeExceptionRuntimeException：**

是那些可能在Java虚拟机正常运行期间抛出的异常的超类。

### **异常的抛出**

Throwable 

可抛出的，一切错误或异常的父类，lang包下；

Error

JVM、硬件、执行逻辑错误、不能手动处理；

Exception

程序在运行和配置中产生的问题。可处理；

Runtime Exception

运行时异常，可处理，可不处理；

Checked Exception

受查异常，必须处理 不处理运行不了；

手动抛出异常语法

Throw new 异常类型(“实际参数”);

产生异常的结果相当于遇到return语句，导致程序终止；

异常处理

Try{

可能出现的异常代码；

}catch（Exception e）{

处理的相关代码；

}finally{

无论是否异常都要执行；

}

注意；多重catch需要注意子类和父类的顺序；父类异常在最后；

 异常的声明与方法覆盖

方法覆盖

带有异常的声明的方法覆盖

方法名、参数列表、返回值类型必须和父类相同；

子类的访问修饰 符合父类 或是 比父类更宽；

子类和实现类中的方法，不能抛出比父类或接口的更多、更宽泛异常；

### **throw 和 throws 的区别**

throws是用来声明一个方法可能抛出的所有异常信息，throws是将异常声明但是不处理，而是将异常往上传，谁调用我就交给谁处理。而throw则是指抛出的一个具体的异常类型。

### **final、finally、finalize 有什么区别**

- final可以修饰类、变量、方法，修饰类表示该类不能被继承、修饰方法表示该方法不能被重写、修饰变量表示该变量是一个常量不能被重新赋值。
- finally一般作用在try-catch代码块中，在处理异常的时候，通常我们将一定要执行的代码方法finally代码块中，表示不管是否出现异常，该代码块都会执行，一般用来存放一些关闭资源的代码。
- finalize是一个方法，属于Object类的一个方法，而Object类是所有类的父类，该方法一般由垃圾回收器来调用，当我们调用System的gc()方法的时候，由垃圾回收器调用finalize(),回收垃圾。 

### **catch 可以省略的原因；**

更为严格的说法其实是：try只适合处理运行时异常，try+catch适合处理运行时异常+普通异常。也就是说，如果你只用try去处理普通异常却不加以catch处理，编译是通不过的，因为编译器硬性规定，普通异常如果选择捕获，则必须用catch显示声明以便进一步处理。而运行时异常在编译时没有如此规定，所以catch可以省略，你加上catch编译器也觉得无可厚非。

理论上，编译器看任何代码都不顺眼，都觉得可能有潜在的问题，所以你即使对所有代码加上try，代码在运行期时也只不过是在正常运行的基础上加一层皮。但是你一旦对一段代码加上try，就等于显示地承诺编译器，对这段代码可能抛出的异常进行捕获而非向上抛出处理。如果是普通异常，编译器要求必须用catch捕获以便进一步处理；如果运行时异常，捕获然后丢弃并且+finally扫尾处理，或者加上catch捕获以便进一步处理。

至于加上finally，则是在不管有没捕获异常，都要进行的“扫尾”处理。

## **单例模式**

 

### **饿汉单式**  

在类加载时就完成了初始化，但是加载比较慢，获取对象比较快。

public class Hungry {     /**   *是否 Lazy 初始化：否   *是否多线程安全：是   *实现难度：易   *描述：这种方式比较常用，但容易产生垃圾对象。   *优点：没有加锁，执行效率会提高。   *缺点：类加载时就初始化，浪费内存。   *它基于 classloder 机制避免了多线程的同步问题，   * 不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，   * 在单例模式中大多数都是调用 getInstance 方法，   * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，   * 这时候初始化 instance 显然没有达到 lazy loading 的效果。   */    // 实例化对象    private static Hungry instance = new Hungry();    // 私有化构造方法    private Hungry(){}    // 使用public修饰方法取出对象     public static Hungry getInstance() {        return instance;    } }

### **懒汉单列**

在类加载的时候不被初始化

public class Lazy {     /**   *是否 Lazy 初始化：是   *是否多线程安全：否   *实现难度：易   *描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。   *这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。   */    // 实例化对象    private static Lazy instance = null;    // 私有化构造方法    private Lazy(){}    // 使用public修饰方法取出对象     public static Lazy getInstance() {        if (instance == null) {            instance = new Lazy();        }        return instance;    } }

饿汉模式是线程安全的，在类创建好一个静态对象提供给系统使用，懒汉模式在创建对象时不加上synchronized，会导致对象的访问不是线程安全的

## **hutool依赖**

根据身份证号码获取你的年龄 返回String类

 IdcardUtil.getAgeByIdCard(身份证号);

根据身份证号码获取你的性别 返回int 1或0  （1为男 0为女）       	   	IdcardUtil.getGenderByIdCard(身份证号);

根据身份证号码获取你的省份

IdcardUtil.getProvinceByIdCard(身份证号);

获取模拟中文姓名

ChineseNameGenerator.getInstance();

获取模拟中国身份证

ChineseIDCardNumberGenerator.getInstance();

获取模拟手机号

ChineseMobileNumberGenerator.getInstance()；

父类都是GenericGenerator；

### **commons.io**

获取文件后缀名

//返回String FilenameUtils.getExtension("路径"))

获取文件名或目录名

//返回String FilenameUtils.getName("路径")

判断文件后缀名与指定后缀一样

//返回Boolean 如果是目录则后缀为空  FilenameUtils.isExtension("文件路径", "后缀名")

计算路径下文件与目录

//计算文件大小 返回long 单位为字节 FileUtils.sizeOf(new File("文件路径"))； //计算目录文件大小 返回long 单位为字节 FileUtils.sizeOfDirectory(new File("目录路径"))；

查看指定路径下所有文件

//查看指定路径的所有文件 // EmptyFileFilter.NOT_EMPTY过滤器 DirectoryFileFilter.INSTANCE 下级文件 Collection<File> files = FileUtils.listFiles(new File("路径"), EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE); for (File file :        files) {    System.out.println(file.getAbsolutePath());  }

判断指定后缀查看文件

//查看后缀名为java的文件 Collection<File> files = FileUtils.listFiles(f, new SuffixFileFilter("后缀名"), DirectoryFileFilter.INSTANCE); for (File file :        files) {    System.out.println(file.getAbsolutePath()); } //可以同时查看class和java的文件 FileFilterUtils 判断条件 files = FileUtils.listFiles(f, new SuffixFileFilter("java"), new SuffixFileFilter("xml")); for (File file :        files) {    System.out.println(file.getAbsolutePath()); }

拷贝文件或目录

//拷贝文件 FileUtils.copyFile(new File("原文件路径"), new File("文件路径")); //拷贝文件到另一个目录 FileUtils.copyFile(new File("文件路径"), new File("目录路径")); //指定目录拷贝到另一个路径下 FileUtils.copyDirectoryToDirectory(new File("原目录路径"), new File("目录路径")); //把指定目录下的文件 拷贝到另一个目录下 FileUtils.copyDirectory(new File("原目录路径"), new File("目录路径"));

## **lamda表达式**

用更简单方式 实现匿名内部类

引用类型 变量名 = （参数）-> {方法体};

没有参数有返回值

Supplier<泛型>supplier =（）->{return 返回值；};方法为get（）；

一个参数有返回值

UnaryOperator<泛型> unaryOperator = （参数）->{ 方法体 return 返回}；方法为 apply（参数）；

两个参数有返回值

BinaryOperator<泛型> binaryOperator =（ 参数1，参数2）->{方法体 return}； 方法为apply （参数1，参数2）；

一个参数没有返回值

Consumer<泛型>consumer = （参数）->{代码块}；方法为accept（参数）；

数据类型转换

Function<原参数类型，转出参数类型> function = （参数）->{方法体}； 方法为apply（参数）；

### **Lamda语法有三种形式**

Lamda表达式，读作λ表达式，它实质属于函数式编程的概念，要理解函数式编程的产生目的，就要先理解匿名内部类。

(参数) ->单行语句；

(参数) ->{多行语句}；

(参数) ->表达式；

括号（）可以大致理解为就是方法，里面是参数变量，在上面的例子中()->System.out.println("Hello World!") 前面的()代表void lMethod()方法，它没有入参，所以为空，->后面是一个单行语句；

如果->后面是多行语句，需要用{ }装起来，每条语句后需要有分号;

->后面也可以是一个表达式，如：a+b等。

（参数）-> 单行语句；

interface MyInterface{     void lMethod(String str); } public class Main {     public static void test(MyInterface myInterface){        myInterface.lMethod("Hello World!");//设置参数内容    }     public static void main(String[] args) {        //首先在()中定义此表达式里面需要接收变量s，        //面的单行语句中就可以使用该变量了        test((s)->System.out.println(s));    } }

（参数）->(多行语句)；

interface MyInterface{     void lMethod(String str); } public class Main {     public static void test(MyInterface myInterface){        myInterface.lMethod("Hello World!");//设置参数内容    }     public static void main(String[] args) {        //首先在()中定义此表达式里面需要接收变量s，后面的多行语句中就可以使用该变量了。注意：多行语句别少“；”号        test((s)->{            s=s+s;            System.out.println(s);        });    } }

（参数）-> 表达式；

interface MyInterface{     int lMethod(int a,int b); } public class Main {     public static void test(MyInterface myInterface){        int result=myInterface.lMethod(1,2);//设置参数内容,接收返回参数        System.out.println(result);    }    public static void main(String[] args) {         test((x,y)-> x*y );//调用方法        //相当于 //        test((x,y)-> {return  x*y;});    } }

## **断言 （assert）**

断言就是预测值结果 和你预测的值是否一致 如果不一致会出现异常 断言的返回值为Boolean 方法为test；

## **流 （Stream）**

同步流 

Stream<泛型> stream= list.Stream;

异步流 

Stream<泛型> stream = list.paralleStream();

异步流

Stream<泛型> stream = list.paralleStream();

## **生成随机数方法**

Math.random 伪随机数生成 返回一个一小于1的随机数

```java
for (int j = 0; j < 4; j++) {
    // 伪随机数
    double random = Math.random();
    int num = (int) (random * 10);            
    System.out.print(num);
}
```

Random random= new Random();
  //  随机数对象 用random.nextInt(参数)方法 伪随机数 返回一个0到参数前一位 的随机数

```java
 // 伪随机数
    Random random = new Random();
for (int j = 0; j < 4; j++) {
    int i = random.nextInt(10);            
    System.out.print(i);
```

​    ThreadLocalRandom.current().nextInt(参数); 返回一个0到参数前一位 的随机数

```java
for (int i = 0; i < 4; i++) {
    int num = ThreadLocalRandom.current().nextInt(10);            System.out.print(num);
}
```



RandomStringUtils.randomNumeric(随机数长度)； 返回字符串类型随机数 注意：这个是commons lang3 依赖包里 没有依赖不可以

```java
   String num = RandomStringUtils.randomNumeric(4);        System.out.print(num);
```

**Optional**

```java
 
String str = "大帅哥";

// ofNullable 判空

Optional<String> optional = Optional.ofNullable(str);     

// orElse 如果ofNullable 非空则将ofNullable参数返回

// orElse 如果ofNullable 为空则将orElse参数返回
String orElse = optional.orElse("很帅");       

System.out.println(orElse);
```

判空 Optional<String> optional = Optional.ofNullable(值1);

String orElse = optional.orElse(值2); 如果值1 为空则返回值2

StringUtils.isEmpty(变量)判断是否为空 返回Boolean

## **加密与解密**

#### **AES加密与解密**

​	

```java
String code = "李丽丽";
// 密钥
byte[] key = new String("lihaozhelihaozhe").getBytes(); 	//构建
SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, key);
//加密
byte[] encrypt = aes.encrypt(code); 	System.out.println(new String(encrypt));
//解密
byte[] decrypt = aes.decrypt(encrypt); 	System.out.println(new String(decrypt));
//加密为16进制表示
String encryptHex = aes.encryptHex(code); 	System.out.println(encryptHex);
//解密为字符串
String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8); 	System.out.println(decryptStr);
```

```java
/**
* 将字符串使用ase算法加密并返回加密后字符串的十六进制字符串
*
* @param src 欲被加密的字符串
* @param key 秘钥 注意:要求秘钥为长度为十六个字符的字符串
* @return 加密后字符串的十六进制字符串
*/
public static String aesEncodeHexString(String src, String key) {
    return new SymmetricCrypto(
SymmetricAlgorithm.AES, new String(key).getBytes()).encryptHex(src);
}
/**
* 将使用ase算法加密后生产的十六进制字符串解密
*
* @param encryptHex 加密后生产的十六进制字符串解密
* @param key        秘钥 注意:秘钥为长度为十六个字符的远秘钥字符串  * @return 将加密后的字符串解密回来
*/
public static String aesDecodeHexString(String encryptHex, String key) {
    return new SymmetricCrypto(SymmetricAlgorithm.AES, new String(key).getBytes()).decryptStr(
        encryptHex,CharsetUtil.CHARSET_UTF_8);
}
```

**Base64解密与解密**

```java
// 获取Base64的加密对象
Encoder encoder = Base64.getEncoder();
// 获取Base64的解密对象
Decoder decoder = Base64.getDecoder();
String content = "Tom";
try {
    byte[] encode = encoder.encode(content.getBytes("UTF-8"));
    String encodeToString = encoder.encodeToString(content.getBytes("UTF-8"));
    
    System.out.println(new String(encode));
    System.out.println(encodeToString);
    byte[] decode1 = decoder.decode(encode);
    byte[] decode2 = decoder.decode(encodeToString);
    System.out.println(new String(decode1));
    System.out.println(new String(decode2));
} catch (UnsupportedEncodingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

**方法二**

```java

// base64 一般用于图片解析 将图片转为base64字符串后文件为增加三分之一的大小
String content = "Tom";
String encode = Base64.encode(content);
System.out.println(encode);
byte[] decode = Base64.decode(encode);
System.out.println(new String(decode));
```

**DES加密与解密**

```java
	String code = "李昊哲";
// 密钥
byte[] key = new String("lihaozhelihaozhelihaozhelihaozhelihaozhelihaozhelihaozhelihaozhe").getBytes();
SymmetricCrypto des
    = new SymmetricCrypto(SymmetricAlgorithm.DES, key);

byte[] encrypt = des.encrypt(code);
System.out.println(new String(encrypt));
byte[] decrypt = des.decrypt(encrypt);
System.out.println(new String(decrypt));
String encryptHex = des.encryptHex(code); 	
System.out.println(encryptHex);
String decryptStr = des.decryptStr(encryptHex); 	
System.out.println(decryptStr);

/**
* 将字符串使用des算法加密并返回加密后字符串的十六进制字符串
*
* @param src 欲被加密的字符串
* @param key 秘钥
* @return 加密后字符串的十六进制字符串
*/
public static String desEncodeHexString(String src, String key) {
    return new SymmetricCrypto(SymmetricAlgorithm.DESede, new String(key).getBytes()).encryptHex(src);
}
/**
* 将使用des算法加密后生产的十六进制字符串解密
*
* @param encryptHex 加密后生产的十六进制字符串解密
* @param key        原秘钥
* @return 将加密后的字符串解密回来
*/
public static String desDecodeHexString(
    String encryptHex, String key) {
    return new SymmetricCrypto(SymmetricAlgorithm.DESede, new 
String(key).getBytes()).decryptStr(
        encryptHex,CharsetUtil.CHARSET_UTF_8);
}

```



**MD5加密**

```java
Digester md5 = new Digester(DigestAlgorithm.MD5);
String content = "Tom";
String digestHex = md5.digestHex(content); 	System.out.println(digestHex);

/**
* 使用md5加密字符串
* @param data加密前的源字符串
* @return		加密后的字符串
*/
public static String digestHex(String data) {
    return new Digester(DigestAlgorithm.MD5).digestHex(data);
}
```

**UTF-8加密解密**

   

```java
     String content = "Tom";
        try {
            String encode = URLEncoder.encode(content, "UTF-8");
            System.out.println(encode);
            String decode = URLDecoder.decode(encode, "UTF-8");
            System.out.println(decode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
```

**秘钥编码集加密**

 

```java
  //创建秘钥 十六位位秘钥
String key = "lihaozhelihaozhe";
//输入字符串 和秘钥
String aesEncodeHexString = BaseCryptographyUtils.aesEncodeHexString("李昊哲", key);     
System.out.println(aesEncodeHexString);
//解加密 输入加密的字符串 和秘钥
String aesDecodeHexString = BaseCryptographyUtils.aesDecodeHexString(aesEncodeHexString, key);
System.out.println(aesDecodeHexString);
```

```java
  //创建秘钥 三十二位秘钥
String key = "lihaozhelihaozhelihaozhelihaozhelihaozhelihaozhelihaozhelihaozhe";
//输入字符串 和秘钥
String desEncodeHexString = BaseCryptographyUtils.desEncodeHexString("李昊哲", key);  System.out.println(desEncodeHexString);
//解加密 输入加密的字符串 和秘钥
String desDecodeHexString = BaseCryptographyUtils.desDecodeHexString(desEncodeHexString, key);
System.out.println(desDecodeHexString);
```

## **Date日期类**

计算机初始时间有两种

第一种是 标准时间	UTC 1900-01-01 00:00:00

第二种是 “民用”时间	CMT 1970-01-01 00:00:00 

System.currentTimeMillis()：

可以直接查询 1970年1月1日零时到现在的毫秒时间；

也可以newDate对象调setTime方法；

new Date(); new时间类的实例

### **Date类一些弃用的方法** 

long	getTime 	返回自CMT 初始时间 到现在时间的毫秒数

int	getYear	返回现在年份 要减去1900；

int	getMonth	返回现在月份 要加1；返回的是0~11；

int	getDate	返回是日；

int	getDay	返回是周；返回0~6 ，0代表周日；

int	getHours	返回是小时；

int	getMinutes	返回的是分钟；

int	getSeconds	返回的是秒；

### **时间格式化模板**

new SimpleDateFormat（“String 时间格式 ”）

使用给定模式 SimpleDateFormat并使用默认的 [**FORMAT**](https://www.matools.com/file/manual/jdk_api_1.8_google/java/util/Locale.Category.html#FORMAT)语言环境的默认日期格式符号；

String	format（Date date） 将date格式化成日期 返回时间字符串 

用的是DateFormat类里的方法

Date		parse（String 解析的字符串）从给定字符串的开始解析文本以生成日期。

### **比较日期的前后**

boolean	after(Date whan) 测试此日期是否在指定日期之后；

boolean	before(Date when) 测试此日期是否在指定日期之前；

### **时间时区**

String	toGMTString()  返回格林威标准时间，结果不依赖于当地时区

static TimeZone	getDefault() 	获取java虚拟机的默认时区信息

static TimeZone	getTimeZone(String ID)		获取ID给的地区或自定义ID的时区实例；

void		setTimeZone(TimeZone zone) 设置此DateFormat对象的日期时区

### **localDate时间类**

static LocalDate	localDate.now()	从默认时区的系统时钟获取当前日期。

static LocalDate	now（ZoneId	zone）从指定时区的系统时钟获取当前日期。

locaDate	plusDays(long daysToAdd) 返回指定天数的 LocalDate的副本

locaDate	plusMonths(long monthsToAdd) 返回这个 LocalDate的副本，其指定的时间段以月为单位

locaDate	plusWeeks(long weeksToAdd) 返回这个 LocalDate的副本，并以指定的周期添加周数

locaDate	plusYears(long yearsToAdd) 返回这个 LocalDate的副本，其中指定的时间段以添加的年数表示

locaDat	minusuYears(long YesrsToSubtract) 返回此 LocalDate的副本，以减去的年份为单位。其他跟plus一样；

LicalDate.of(传入时间)；自己设置日期

localDateTime.now() 返回当前日期加时间

DateTimeFormatter.ofPattern(时间格式模板)

LocaDateTime.paese(字符串时间,时间模板) 字符串时间解析为localDateTime

LocalDateTime.now(ZoneId zone)

从指定时区的系统时钟获取当前的日期时间。

ZoneOffset.of(偏移量)；使用ID获取 ZoneOffset的实例。

localDateTime与Date的转换

date.toInstant().atOffset（ZoneOffset.of(偏移量)) 返回一个OffsetDateTime 类型的实例

offsetDateTime.toLocalDate() 获得这个日期时间的 LocalDate部分。

offsetDateTime.toLocalTime() 获得这个日期时间的 LocalTime部分。

offsetDateTime.toLocalDateTime() 获得这个日期时间。

![img](.\img\dataformat.png)

## **类加载**

类加载机制的层次结构

启动Bootstrap类加载器>扩展Extension类加载器>系统System加载器；

java文件储存着程序逻辑，Java文件经过java编译器编译成扩展名为class文件，class文件里保存着java代码转换后的虚拟指令。

当需要使用某个类时，虚拟机将会加载它的class文件并创建对象，将class文件加载到虚拟机的内存中，这个过程称之为类的加载。

![img](.\img\1557295552295.png)

### 加载

类加载过程的一个阶段；通过一个类的完全限定查找此类字节码文件，并利用字节码文件创建一个Class对象；

### 验证

确保Class文件的字节流中包含信息符合当前虚拟机要求，并且不会危害虚拟机自身安全。

主要的四种验证：文件格式验证，原数据验证，字节码验证，符号引用验证。

### 准备

类变量（即static修饰的字段变量）分配内存并且设置该类变量的初始值即为0；

这里不包含final修饰的static，因为final在编译的时候就会分配了；

注意这里不会为实例化变量分配初始化，类变量会分配的方法区中，而实例变量是会随着对象一起分配的java堆中

### 解析

主要将常量池中的符号引用替换为直接引用的过程。符号引用就是一组符号来描述目标，可以是任何字面量，而直接引用就是直接指向目标的指针、相对偏移量或一个间接定位到目标的句柄。有类或接口的解析，字段解析，类方法解析，接口方法解析(这里涉及到字节码变量的引用，如需更详细了解，可参考《深入Java虚拟机》)。

### 初始化

类加载最后阶段，若该类具有超类，则对其进行初始化，执行静态初始化器和静态初始化成员变量(如前面只初始化了默认值的static变量将会在这个阶段赋值，成员变量也将被初始化)。

这便是类加载的5个过程，而类加载器的任务是根据一个类的全限定名来读取此类的二进制字节流到JVM中，然后转换为一个与目标类对应的java.lang.Class对象实例，在虚拟机提供了3种类加载器，引导（Bootstrap）类加载器、扩展（Extension）类加载器、系统（System）类加载器（也称应用类加载器），下面分别介绍

## **反射**

### **Class**

Class<T>	T.class;

获取该类的Class对象

Constructor<T>	 getConstructor(Class<?>...属性类型)

返回一个 对象的构造方法该对象 对象有属性 需要填属性类型；（注意要用包引用类型）

Field		getDeclaredField(String 底层属性名)

返回一个Field对象，它反射的指定的类对象中的公共的属性对象

Method	getMethod(String 底层方法名,Class<?>...属性类型)

返回一个 Method对象。 它反射的是指定类对象中的方法对象；

### **Constructor**

T	newInstance(Object...initargs)

使用此Constructor对象表示的构造方法，使用指定的初始化参数来创建和初始化构造方法的声明类的新实例对象。

### **Method**

void	setAccessible(boolean   b)

将私有的属性设置可访问的； 

这个方法在 AccessibleObject类中 Method类是继承的方法；

Object	invoke(Object obj,方法参数)

在指定 方法对象 上调用此 方法对象表示的底层方法；

### **Field**

void	set（Object 实例，Object	修改的值）

修改该Field对象表示的值

void get(Object 实例)

返回该Filed对象表示的值

## **流（IO）**

### **BIO**

**AIO**

内存与存储设备之间传输数据的通道；

流的分类

输入流 是将储存设备中的内容读入到内存中；

输出流 是将内存的内容存到储存设备中；

字符流 是以字符为单位，可以读写文本数据；

字节流 是以字节为单位，可能读写所以数据；

节点流 具有实际传输数据的读写功能；

过滤流 在节点流的基本之上增强功能；

 

### 字节流

Input Stream ；字节输入流

Output Stream；字节输出流

### File节点流

一次可以输出或输入多个字节； 输入字节如果达到了文件的尾部，则会返回-1；

### Buffered过滤流

把数据暂时储存到缓存空间内 刷新缓存（flush） 或关闭流（close）可以把数据输出到文件里；

### Object对象流

对象序列化必须实现serializable接口；

必须保证其所有属性均可序列化；

Transient修饰为临时属性，不参与序列化；

用循环输入会出现 读取到尾部文件的标志 异常

（EOF Exception）

### 字符流

Reader字符输出流；

Writer 字符输入流；

### 转换流

Output Stream Writer 转换字符输出流；

Input Stream Reader 转换字符输入流；

 

字符打印格式过滤流

Print Writer 输出格式流

Buffered Reader 输入缓冲流 中有一个read Line（）方法可以读一次行字符；

两者可以并用；

### File类

一个File代表一个盘符下的文件或文件夹；

可创建或修改一个物理盘符中的一个文件夹或文件；

一些常用方法：

createNewFile()//创建新文件；

Mkdir()//创建新目录；

Delete()//删除文件或文件夹；

void deleteOnExit();程序结束进行删除文件

Exists()//判断文件或文件夹是否存在；

getAbsolutePath()//获取文件的路径；

getName()//获取名字；

getParent()//获取文件所在的目录；

isDirectory()//是否是目录；

isFile()//是否是文件；

length()//获取文件长度；

listFiles()//显示目录中的所以内容；

renameTo()//修改文件名；

### **序列化与返序列化**

- 序列化：把Java对象转换为字节序列的过程。
- 反序列化：把字节序列恢复为Java对象的过程。

对象的序列化主要有两种用途：

- 把对象的字节序列永久地保存到硬盘上，通常存放在一个文件中；（持久化对象）
- 在网络上传送对象的字节序列。（网络传输对象）

**2 使用**

在Java中，如果一个对象要想实现序列化，必须要实现下面两个接口之一：

- Serializable 接口
- Externalizable 接口
- transients	修饰的属性值是短暂的 不会存储到文档里 所有反列化是不会 有值的

那这两个接口是如何工作的呢？两者又有什么关系呢？我们分别进行介绍。

### **2.1 Serializable 接口**

一个对象想要被序列化，那么它的类就要实现此接口或者它的子接口。

这个对象的所有属性（包括private属性、包括其引用的对象）都可以被序列化和反序列化来保存、传递。不想序列化的字段可以使用transient修饰。

由于Serializable对象完全以它存储的二进制位为基础来构造，因此并不会调用任何构造函数，因此Serializable类无需默认构造函数，但是当Serializable类的父类没有实现Serializable接口时，反序列化过程会调用父类的默认构造函数，因此该父类必需有默认构造函数，否则会抛异常。

使用transient关键字阻止序列化虽然简单方便，但被它修饰的属性被完全隔离在序列化机制之外，导致了在反序列化时无法获取该属性的值，而通过在需要序列化的对象的Java类里加入writeObject()方法与readObject()方法可以控制如何序列化各属性，甚至完全不序列化某些属性或者加密序列化某些属性。

### **2.2 Externalizable 接口**

它是Serializable接口的子类，用户要实现的writeExternal()和readExternal() 方法，用来决定如何序列化和反序列化。

因为序列化和反序列化方法需要自己实现，因此可以指定序列化哪些属性，而transient在这里无效。

对Externalizable对象反序列化时，会先调用类的无参构造方法，这是有别于默认反序列方式的。如果把类的不带参数的构造方法删除，或者把该构造方法的访问权限设置为private、默认或protected级别，会抛出java.io.InvalidException: no valid constructor异常，因此Externalizable对象必须有默认构造函数，而且必需是public的。

### **2.3 对比**

使用时，你只想隐藏一个属性，比如用户对象user的密码pwd，如果使用Externalizable，并除了pwd之外的每个属性都写在writeExternal()方法里，这样显得麻烦，可以使用Serializable接口，并在要隐藏的属性pwd前面加上transient就可以实现了。如果要定义很多的特殊处理，就可以使用Externalizable。

当然这里我们有一些疑惑，Serializable 中的writeObject()方法与readObject()方法科可以实现自定义序列化，而Externalizable 中的writeExternal()和readExternal() 方法也可以，他们有什么异同呢？

- readExternal(),writeExternal()两个方法，这两个方法除了方法签名和readObject(),writeObject()两个方法的方法签名不同之外，其方法体完全一样。
- 需要指出的是，当使用Externalizable机制反序列化该对象时，程序会使用public的无参构造器创建实例，然后才执行readExternal()方法进行反序列化，因此实现Externalizable的序列化类必须提供public的无参构造。
- 虽然实现Externalizable接口能带来一定的性能提升，但由于实现ExternaLizable接口导致了编程复杂度的增加，所以大部分时候都是采用实现Serializable接口方式来实现序列化。

### **NIO**

**1.阻塞与同步**

1）阻塞(Block)和非租塞(NonBlock):

阻塞和非阻塞是进程在访问数据的时候，数据是否准备就绪的一种处理方式，当数据没有准备的时候阻塞：往往需要等待缞冲区中的数据准备好过后才处理其他的事情，否則一直等待在那里。

非阻塞：当我们的进程访问我们的数据缓冲区的时候，如果数据没有准备好则直接返回，不会等待。如果数据已经准备好，也直接返回

2）同步(Synchronization)和异步(Async)的方式：

同步和异步都是基于应用程序私操作系统处理IO事件所采用的方式，比如同步：是应用程序要直接参与IO读写的操作。异步：所有的IO读写交给操作系统去处理，应用程序只需要等待通知。

同步方式在处理IO事件的时候，必须阻塞在某个方法上靣等待我们的IO事件完成(阻塞IO事件或者通过轮询IO事件的方式）.对于异步来说，所有的IO读写都交给了操作系统。这个时候，我们可以去做其他的事情，并不拓要去完成真正的IO操作，当操作完成IO后.会给我们的应用程序一个通知

同步：阻塞到IO事件，阻塞到read成则write。这个时候我们就完全不能做自己的事情，让读写方法加入到线程里面，然后阻塞线程来实现，对线程的性能开销比较大，

![img](.\img\clipboard.png)

**Charset**

//显示当前的默认字符编码集 System.out.println(java.nio.charset.Charset.defaultCharset()); //显示支持所有字符串编码集 System.out.println(java.nio.charset.Charset.availableCharsets());

**Files**

//Files创建文件 Path file = Files.createFile(Paths.get("src/main/resources/aa.txt")); //Files创建目录 Path directory = Files.createDirectories(Paths.get("src/main/resources/aa/bb")); //移动到指定目下并更名 Path move = Files.move(Paths.get("src/main/resources/aa.txt"), Paths.get("src/main/resources/aa/bb/cc.txt")); //删除指定文件 Files.delete(Paths.get("src/main/resources/aa/bb/cc.txt")); //拷贝文件 Files.copy(Paths.get("pom.xml"), Paths.get("pom.txt")); //拷贝目录 Files.copy(Paths.get("src/main/resources/aa/bb"), Paths.get("src/main/resources/aa/cc")); // 将文件以字符串的形式读出 bytes = Files.readAllBytes(Paths.get("pom.xml")); // 将文件当作行序列读入 lines = Files.readAllLines(Paths.get("pom.xml")); // 写出一个字符串到文件中 Files.write(Paths.get("src/main/resources/aa/cc/dd.txt"), "我爱你中国".getBytes("utf-8")); // 向指定文件中追加内容 注:这里加上APPEND表示追加字符串 Files.write(Paths.get("resources/aa/cc/dd.txt"), "\nlove".getBytes("utf-8"), StandardOpenOption.APPEND);

**Path**

路径隶属于文件系统，实际上它是存储和组织媒体文件的格式，通常在一块或多块硬盘设备上，以便于非常容易地检索。文件系统可以通过  java.nio.file.FileSystems 这个final 类来访问，通常我们用来获取它的实例然后做我们想做的事情。FileSystems 包含下面两个非常重要的方法，还有 newFileSystem() 方法，用来构建一个新的文件系统实例。

getDefault(): 这个静态方法会返回一个默认的FileSystem 给 JVM——通常是操作系统默认的文件系统。

getFileSystem(URI uri): 这个静态方法根据提供的可以匹配 URI 模式的一系列可用的文件系统提供者中返回一个文件系统。Path类可以操作任何类型的文件系统并可以使用任何存储的地方（java.nio.file.FileStore这个类会呈现潜在的存储）。通常情况下，Path类指向默认的操作系统的文件，但是在 NIO.2 中 彻底模块化了—— 可以是内存中数据，在互联网上，在虚拟文件系统的FileSystem 类的实现，这些都可以都可以完美的被NIO.2接受，NIO.2 提供了所有文件系统的功能，我们需要执行在文件，目录或是一个link 链接文件上。

//创建Path对象

Path path = Paths.get("index.html");

//定义一个绝对目录

Path path = Paths.get("C:/rafaelnadal/tournaments/2009/BNP.txt");

　//get()方法也支持把路径分割成一块一块的。NIO会重新组织路径。

Path path = Paths.get("C:/rafaelnadal/tournaments/2009", "BNP.txt"); Path path = Paths.get("C:", "rafaelnadal/tournaments/2009", "BNP.txt"); Path path = Paths.get("C:", "rafaelnadal", "tournaments", "2009", "BNP.txt");

　//定义一个从URI获取的路径

　　在一些情况下，你需要从URI中创建一个路径，你可以使用URI.create() 方法根据指定的字符串从URI中创建路径。

 Path path = Paths.get(URI.create("file:///rafaelnadal/tournaments/2009/BNP.txt")); Path path = Paths.get(URI.create("file:///C:/rafaelnadal/tournaments/2009/BNP.txt")); 

　你也可以使用FileSystems.getDefault().getPath() 方法来定义一个Path类

 … Path path = FileSystems.getDefault().getPath("/rafaelnadal/tournaments/2009", "BNP.txt"); Path path = FileSystems.getDefault().getPath("/rafaelnadal/tournaments/2009/BNP.txt"); Path path = FileSystems.getDefault().getPath("rafaelnadal/tournaments/2009", "BNP.txt"); Path path = FileSystems.getDefault().                         getPath("/rafaelnadal/tournaments/./2009","BNP.txt").normalize();

　获取系统的主目录的路径

　　当你想获取主目录的路径时，可以使用下面的代码：

返回的路径是C:\Users\{your user name}\downloads\game.exe

在Linux系统中，则返回/home/{your user name}/downloads/game.exe。

Path path = Paths.get(System.getProperty("user.home"), "downloads", "game.exe");

　获取路径的信息

　　当你定义完Path对象后，接下来会有一系列的方法用来访问文件的信息。首先定义一个Path实例：

Path path = Paths.get("C:", "rafaelnadal/tournaments/2009", "BNP.txt");

　　获取文件或目录的名字：

System.out.println("The file/directory indicated by path: " + path.getFileName());

　获取根目录

 System.out.println("Root of this path: " + path.getRoot()); 

　　获取路径的父目录

 System.out.println("Parent: " + path.getParent());

　获取路径名的元素

　　你可以使用 getNameCount()方法获取路径层级的个数，然后再使用getName()循环遍历每个元素的名字。

//output: 4 System.out.println("Number of name elements in path: " + path.getNameCount());  //output: rafaelnadal  tournaments  2009  BNP.txt for (int i = 0; i < path.getNameCount(); i++) {   System.out.println("Name element " + i + " is: " + path.getName(i)); }

　获取子路径

 System.out.println("Subpath (0,3): " + path.subpath(0, 3)); 

　Path的转换

　　在这节中，将会介绍怎样由一个Path对象转换成字符串，URI，绝对路径，相对路径以及File对象。

　　先定义一个Path实例：

Path path = Paths.get("/rafaelnadal/tournaments/2009", "BNP.txt");

　　转化成一个字符串

//output: \rafaelnadal\tournaments\2009\BNP.txt String path_to_string = path.toString(); System.out.println("Path to String: " + path_to_string);

　　转换成一个URI

//output: file:///C:/rafaelnadal/tournaments/2009/BNP.txt URI path_to_uri = path.toUri(); System.out.println("Path to URI: " + path_to_uri);

　　由相对路径转换成绝对路径

//output: C:\rafaelnadal\tournaments\2009\BNP.txt Path path_to_absolute_path = path.toAbsolutePath(); System.out.println("Path to absolute path: " + path_to_absolute_path.toString());

　　转换成真实路径

import java.io.IOException; … //output: C:\rafaelnadal\tournaments\2009\BNP.txt try {   Path real_path = path.toRealPath(LinkOption.NOFOLLOW_LINKS);   System.out.println("Path to real path: " + real_path); } catch (NoSuchFileException e) {   System.err.println(e); } catch (IOException e) {   System.err.println(e); }

　　转换成File对象

//output: BNP.txt File path_to_file = path.toFile();  //output: \rafaelnadal\tournaments\2009\BNP.txt Path file_to_path = path_to_file.toPath(); System.out.println("Path to file name: " + path_to_file.getName()); System.out.println("File to path: " + file_to_path.toString()); 

　　合并两个路径

　　合并两个路径的技术允许你先定义一个固定的根目录然后再附上局部的路径，在NIO.2 中，使用resolve() 方法来实现这一功能。

//define the fixed path Path base = Paths.get("C:/rafaelnadal/tournaments/2009");  //resolve BNP.txt file Path path_1 = base.resolve("BNP.txt"); //output: C:\rafaelnadal\tournaments\2009\BNP.txt System.out.println(path_1.toString());  //resolve AEGON.txt file Path path_2 = base.resolve("AEGON.txt"); //output: C:\rafaelnadal\tournaments\2009\AEGON.txt System.out.println(path_2.toString());

　还有一个方法用于兄弟路径，叫resolveSibling()，它会根据给定的路径去替换当前的路径。

//define the fixed path Path base = Paths.get("C:/rafaelnadal/tournaments/2009/BNP.txt");  //resolve sibling AEGON.txt file Path path = base.resolveSibling("AEGON.txt"); //output: C:\rafaelnadal\tournaments\2009\AEGON.txt System.out.println(path.toString());

　　在两个位置中构造一个路径

　　当你需要构造从一个位置到另一个位置的路径的时候，你可以使用relativize()方法。直接上代码。

Path path01 = Paths.get("BNP.txt"); Path path02 = Paths.get("AEGON.txt"); 

　在这种情况下，可以假设这两个txt文件在同一层目录下，这就意味着你你可以从一个文件导航到另一个文件根据目录的层级。

//output:  ..\AEGON.txt Path path01_to_path02 = path01.relativize(path02); System.out.println(path01_to_path02);  //output:  ..\BNP.txt Path path02_to_path01 = path02.relativize(path01); System.out.println(path02_to_path01);

　另一种情况是两个文件不在同一层的目录中，考虑下面的这个情况：

Path path01 = Paths.get("/tournaments/2009/BNP.txt"); Path path02 = Paths.get("/tournaments/2011");

　这两个路径都有一个共同的根元素：/tournaments， 从path01 导航到 path02，你需要向上两个目录层级然后再向下一个层级(..\..\2011)。从path02导航到path01，你需要向上一个层级然后向下两个层级，relativize()方法就是这样做的。

　　注意，如果只有一个path包含根元素，那么相对路径是不能构造的，必保证两个path包含根元素。即使这样，相对路径的构造是依赖于系统的。

//output:  ..\..\2011 Path path01_to_path02 = path01.relativize(path02); System.out.println(path01_to_path02);  //output:  ..\2009\BNP.txt Path path02_to_path01 = path02.relativize(path01); System.out.println(path02_to_path01);

　比较两个路径

　　两个路径是否相等可以通过不同的方式和目的去测试。你可以使用 Path.equals()方法，这个方法并不直接访问文件系统，所以没有强制要求文件必须存在，

也不会检查两个文件是否是同一个文件。在有的系统中，路径的比较会忽略大小写，有的则是大小写敏感的。下面的代码中表示的是同一个文件，但是并不相等。

Path path01 = Paths.get("/rafaelnadal/tournaments/2009/BNP.txt"); Path path02 = Paths.get("C:/rafaelnadal/tournaments/2009/BNP.txt");  if(path01.equals(path02)){     System.out.println("The paths are equal!"); } else {     System.out.println("The paths are not equal!"); //true }

　　有时候你想检查两个路径是否是同一个目录和文件，你可以很容易地使用java.nio.File.Files.isSameFile()方法，要注意，要保证路径是真实存在。

try {     boolean check = Files.isSameFile(path01, path02);     if(check){         System.out.println("The paths locate the same file!"); //true     } else {         System.out.println("The paths does not locate the same file!");     } } catch (IOException e) {     System.out.println(e.getMessage()); }

　因为Path实现了Comparable接口，所以你可以使用 compareTo()方法对路径进行比较，根据字典顺序进行比较。

//output: 24 int compare = path01.compareTo(path02); System.out.println(compare); 

还可以进行局部路径的比较。

boolean sw = path01.startsWith("/rafaelnadal/tournaments"); boolean ew = path01.endsWith("BNP.txt"); System.out.println(sw);  //output:  true System.out.println(ew);  //output:  true 

　遍历路径元素的名称

　　因为Path实现了Iterable接口，所以你可以得到一个对象然后新型循环遍历一个路径的信息。请看下面的代码。

Path path = Paths.get("C:", "rafaelnadal/tournaments/2009", "BNP.txt");  for (Path name : path) {     System.out.println(name); }

### **propertites解析**

propertites 存的跟 Map集合 比较像也是分 K值 指向 V值  key=value 

```java
public void test02(){
//this.getClass 拿到当前对象类getClassLoader 拿到类加载器get.ResourceAsStream获取源文件  返回一个输入流  name 相对路径
InputStream in = this.getClass().getClassLoader().getResourceAsStream("bean.propertites");
//解析properties文件类
Properties properties = new Properties();
try {
//从输入字节流读取属性列表（键和元素对）
    properties.load(in);
//使用此属性列表中指定的键搜索属性。
String userDao = properties.getProperty(UserDao.class.getSimpleName());           // 回与给定字符串名称的类或接口相关联的 类对象。
    Class<?> clazz = Class.forName(userDao);
    //对象的构造方法
    Constructor<?> constructor = clazz.getDeclaredConstructor();
    //允许调用私有。            
    constructor.setAccessible(true);
    //实例化对象
    UserDao uDao = (UserDao) constructor.newInstance();            uDao.insertUser();
} catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
    e.printStackTrace();
}
}
```

用hutool里的方法解析

```java
public void test03(){
    //hutool依赖包装的方法
    Props props = new Props("bean.properties");
    String property = props.getProperty(UserDao.class.getSimpleName());
    System.out.println(property);
}
```

用Hutool里的Spring中的PropertiesLoaderUtils工具

```java
public void test04(){
    // 通过Spring中的PropertiesLoaderUtils工具类进行获取
    try {
        Properties properties = PropertiesLoaderUtils.loadAllProperties("bean.properties");
        String userDao = properties.getProperty("UserDao");
        System.out.println(userDao);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

**XMl解析**

```java
//创建解析器
SAXReader saxReader = new SAXReader();
//创建文档对象
Document read = saxReader.read("src/resources/student.xml"); //获取根元素
Element rootElement = read.getRootElement();
//获取子元素
List<Element> elements = rootElement.elements();
```

创建XML文件 

```java
//创建一个空的文档
Document document = DocumentHelper.createDocument();;
//创建空文档对象的内容 root1根元素
Element root1 = document.addElement("root1");
//root2 root1 的子元素
Element element = root1.addElement("root2");
//子元素添属性值<root2 id="值"> 
element.addAttribute("id",e.attributeValue("id"));
//子元素在创建子元素 “名字”
Element element1 = element.addElement("名字");
//“名字”元素 里添加文本<名字>文本</名字> 
element1.setText(name.getText()); Element element2 = element.addElement("生日"); element2.setText(birthday.getText());
//xml文档写入 对象new OutputFormat().createPrettyPrint()格式化 
xmlWriter = new XMLWriter(
//写入文件 对象
    new FileOutputStream("src/resources/student02.xml"), //new OutputFormat().createPrettyPrint()格式化对象
    new OutputFormat().createPrettyPrint()
);
//写入 文档 
xmlWriter.write(document);
//刷新流 
xmlWriter.flush();
```

**dom4j解析**

 获取xml文件的URL

```java
URL url = this.getClass().getClassLoader().getResource("user.xml");
```

实例化SAXReader对象

```java
 SAXReader reader = new SAXReader();
```

通过SAXReader对象的read方法获取该xml文件的Document

```java
Document document = reader.read(url);
```

获取根元素(树根)

```
 Element root = document.getRootElement()
```

获取根元素下的直接子元素的迭代器

```java
 Iterator<Element> ei = root.elementIterator()
     while (ei.hasNext()) {
         Element element = ei.next();
         // getName获取元素名称
         System.out.print(element.getName());                // attributeValue获取元素属性
         System.out.print( element.attributeValue("uuid"));           
         //getTextTrim获取文本属性去空格
         System.out.print(element.getTextTrim());            }
```

**第二种方法**

 获取xml文件的URL

URL url = this.getClass().getClassLoader().getResource("user.xml");

实例化SAXReader对象

 SAXReader reader = new SAXReader();

通过SAXReader对象的read方法获取该xml文件的Document

Document document = reader.read(url);

获取根元素(树根)

 Element root = document.getRootElement()

获取根元素下的直接子元素的迭代器

```java
 
 Iterator<Element> ei = root.elementIterator();
 while (ei.hasNext()) {
     Element element = ei.next();
     // getName获取元素名称                
     System.out.print(element.getName() + "\t");                // 获取该元素的属性的迭代器
     Iterator<Attribute> ai = element.attributeIterator();                while (ai.hasNext()) {
         //获取属性
         Attribute attribute = ai.next();                    
         // 获取属性的名字
         String name = attribute.getName();                    System.out.print(element.attributeValue(name));                }
```

**xpath解析**

注意xpath解析需要  依赖于jaxen 否则会报错

 获取xml文件的URL

URL url = this.getClass().getClassLoader().getResource("user.xml");

实例化SAXReader对象

 SAXReader reader = new SAXReader();

通过SAXReader对象的read方法获取该xml文件的Document

Document document = reader.read(url);

```java
  //获取元素的节点集合  “//”根元素 “/”根元素的子标签

//selectNodes("//users/user[@status=0]")
//也可以判断指定属性的指定值 返回符合判断结果的节点
List<Node> list = document.selectNodes("//users/user");    //遍历节点集合
list.forEach(node -> {
    //valueOf("@指定属性名")
    System.out.println(node.getName()                +node.getStringValue()
                       + node.getText()  + node.valueOf("@mobile"));
});
// selectSingleNode获取符合表达式的第一个节点
Node node = document.selectSingleNode("//users/user")    System.out.println(node.getName() +             node.getStringValue() +              node.getText() +             node.valueOf("@mobile"));
```

**JSON解析**

 JSON.toJSONString()

JSONObject.parseArray(String str, .class)

## **进程与线程**

### 进程

程序是静止的，只有真正运行时的程序，才被称为进程；

单核CPU在任何时间点上，只能运行一个进程

宏观看是并行、微观看是串行；

一个进程由多个线程组成，彼此间完成不同的工作，交替执行，成为多线程；

### 线程的组成

三个部分CPU时间片、运行数据、线程逻辑代码；

CPU时间片；操作系统会为每个线程分配执行时间；

### 运行数据

堆空间线程之间可以共享；

栈空间线程之间都是独立；

### 线程的状态

常用方法

sleep（long ms“毫秒”）；//睡眠

yield（）；//放弃时间片

join（）；//终止线程 让其他线程插入 直到插入线程结束才可运行

线程等待分两种 Timed Waiting（有限期等待） Waiting（无限期等待）

线程安全问题

线程不安全

当多线程并发访问临界资源时，如果出现原子操作，可能会造成数据不一致；

临界资源；

共享资源，一次允许一个线程使用，才可以保证其中正确性；

原子操作；

不可分割的多步操坐，被视作一个整，其顺序和步骤不可打乱或缺省；

同步代码块

synchronized(临界资源对象){//对临界资源对象加锁

//原代码（原子操作）

}

每个对象都有一个互斥锁标记，用来分配给线程。

只有拥有对象互斥锁标记的线程，才能进入对改对象加锁的同步代码块；

线程退出同步代码块时，会释放相应的互斥锁标记；

同步方法

Synchronized 返回值 方法名（无参或有参）{

//对当前对象的方法加锁

操作代码

}

 

![img](.\img\wps4.jpeg)

 

《线程状态图》

 

### 死锁

当第一线程拥有A对象锁标记，等待B对象锁标记，同时第二个线程拥有B对象锁标记，并等待A对象锁标记时，产出死锁；

一个线程可以同时拥有多个对象的锁标记，当线程不退让时 就会产生死锁；

线程通信

### 等待

Public final void wait（）或wait（long timeout）；

必须在对obj加锁的同步代码块中。在一个线程中，调用obj.wait()时，此线程会释放拥有的所以锁标记。同时此线程因obj处在无限期等待状态中，释放锁，进入等待队列；

### 通知

Public final void notify（）或notifyAll（）；

必须在对obj加锁的同步代码块中。从obj的waiting中释放一个或全部线程。对自身没有任何影响；

### 线程池（Thread pool）

常用的线程池接口和类（所在包java.util.concurrent）

Executor；线程池的顶级接口；

Executor Service；线程池接口，可通过submit（Runnable task）方法类提交任务代码；

Executors工具类；通过此类可以获得一个线程池；

Callable接口 call（）方法有返回值 可用Future进行 返回值输出；

### Future接口

异步接收Executor Service.submit()所返回的结果，当中只包含call()的返回值；

方法V.get()以阻塞形式等待Future中的异步处理结果（call的返回值）

### 同步

形容一次方法调用，同步一旦开始，调用者必须等待该方法返回，才可继续；

### 异步

形容一次方法调用，异步一旦开始，像是一次消息传递，调用者告知之后立刻返回；两者竞争时间片，并发执行；

 

### Lock接口

Void lock()//获取锁，如果锁被占用，则等待；

Boolean try lock()//尝试获取锁，不堵塞；

Void unlock()//释放锁

### 重入锁

Reentrant Lock:lock接口的实现类，与synchronized一样具有相互锁功能；

### 读写锁

Reentrant Read Write Lock：

一种支持一写多读的同步锁，读写分离，可分别分配读锁、写锁。

支持多次分配读锁，使多个读操作可以并发执行；

在读操作远远多于写操作的环境中 可以保障线程安全的情况下提高运行效率；

 

### **线程安全集合**

Copy On Write Array List

线程安全的Array List，加强读写分离；

写有锁、读无锁，读写之间不堵塞，优先读写锁；

写入时，先copy一个容器副本、再添加一个新元素，最后替换引用；

使用方式与Array List无异；

 

Copy On Write Array Set

线程安全的Set，底部使用的Copy On Write Array List实现；

唯一不同在于，使用Add If Absent()添加元素，会遍历数组；

入存有元素，则不添加（扔掉副本）；

Concurrent Hash Map

初始容量默认为16段（Segment），使用分段锁设计；

不对整个Map加锁，而是为每个Segment加锁；

当多个对象存入同一个Segment时，才需要互斥；

最理想状态为16个对象分别存入16个Segment，并行数量16；

使用方式与Hash Map无异；

Queue接口（队列）

常用方法

添加元素 add(E e);抛异常, offer(E e);不会抛异常

Boolean返回值 顺序添加如果达到上限会返回false；

获得并移除元素 remove();抛异常, poll(); 不会抛异常

E类型返回值 如果没有元素 会返回null；

获得元素 element();抛异常, peek();不会抛异常

E类型返回值 如果没有元素 会返回null；

Concurrent Linked Queue

线程安全、可高效读写的队列，高并发下性能最好的队列；

无锁、CAS比较交换算法，修改的方法包含三个核心参数（V，E，N）；“V:要更新的变量 E:预期值 N:新值”

Blocking Queue接口（阻塞队列）

阻塞 添加put(E e) 移除take();

超时 添加offer(E e,timeout,unit) 移除poll(timeout,unit)

 

Array Blocking Queue实现类

数组结构实现，手动定义队列空间；

Linked Blocking Queue 实现类

链表结构实现，自动定义队列空间（上限为整型最大取值“Integer.MAX_VALUE” ）

 

## **网络编程**

### 网络的概念

为实现资源共享和信息传递，通过通信线路连接起来的若干主机（Host）；

互联网：（Internet）点与点相连；

万维网：（WWW — World Wide Web）端与端相连；

物联网：（IoT — Internet of things）物与物相连；

网络编程；让计算机与计算机之间建立连接、进行通信；

网络模型

OSI（Oper System Interconnection）开放式系统互联；

1. 应用层：网络服务与最终用户的一个接口。
2. 表示层：数据的表示、安全、压缩。
3. 会话层：建立、管理、终止会话。
4. 传输层：定义传输数据的协议端口号，以及流控和差错校验。
5. 网络层：进行逻辑地址寻址，实现不同网络之间的路径选择。
6. 数据链路层：建立逻辑连接、进行硬件地址寻址、差错校验等功能。
7. 物理层：建立、维护、断开物理连接。

![img](.\img\wps5.png)

 

《开放式互联网模型图》

 

 

 

TCP/IP模型

一组用与实现网络互连的通信协议，将协议分成四个层次；

 

![img](.\img\wps6.png)

 

TCP/UDP

TCP协议：Transmission Control Protocol 传输控制协议；

是一种面向连接的、可靠的、基于字符流的传输层通信协议。数据大小无限制，建立连接的过程需要三次沟通，断开连接的过程需要四次沟通；

UDP协议：User Datagram Protocol 用户数据报协议；

是一个无连接的传输层协议，提供面向事物的简单不可靠信息传送服务，每个包的大小64KB；

IP

IP协议：Internet Protocol Address 互联网协议地址/网际协议地址；

分配给互联网设备的数字标识（唯一的标识）；

IP地址分两种

IPV4:4字节32为整数，并分成4端8位的二进制，每8位整数可以转换为一个0~255的十进制整数；

IPV6：16字节128位整数，并分成8段十六进制数，每16位整数可以转换为一个0~65535的十进制数

工具

回环地址：直接IP名 或 local host 指本机，用来测试使用；

查看IP命令：ipconfig

测试IP命令：ping IP名

Port

端口号：在通信实体上进行网络通讯的程序标识（计算机唯一）；

端口分类：

共认端口：0~1023;

注册端口：1024~49151；

动态或私有端口：49152~52235；

常用端口；

My Sql数据库：3306

Oracle数据库:1521;

Tomcat服务器：8080；

SMTP邮件传输：25;

Web服务器:80;

FTP服务器:21;

IP地址 加Port端口号才可以 完成程序实现；

 

 

 

 

 

 

 

 

 

 

 