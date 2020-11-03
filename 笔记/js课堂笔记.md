## **DOM**

getElementById()			返回带有指定 ID 的元素。

getElementsByTagName()		返回包含带有指定标签名称的所有元素的节点列表（集合/节点数组）。

getElementsByClassName()	返回包含带有指定类名的所有元素的节点列表。

appendChild()			把新的子节点添加到指定节点。

removeChild()			删除子节点。

replaceChild()			替换子节点。

insertBefore()			在指定的子节点前面插入新的子节点。

createAttribute()		创建属性节点。

createElement()			创建元素节点。

createTextNode()		创建文本节点。

getAttribute()			返回指定的属性值。

setAttribute()			把指定属性设置或修改为指定的值。

DOMContentLoaded 		事件 网页打开即执行

innerHTML - 节点（元素）的文本值

parentNode - 节点（元素）的父节点

childNodes - 节点（元素）的子节点

attributes - 节点（元素）的属性节点

nodeName 属性规定节点的名称

nodeValue 属性规定节点的值

nodeType 属性返回节点的类型

返回类型 元素1	 属性 2 	文本 3	注释 8 	文档 9

## **改变 HTML 样式**

节点.style.样式 

## **创建新的 HTML 元素**

.createElement(""); 建立元素

.createTextNode(""); 指定节点中 建立文本 text

.appendChild() 原节点中后面加 一个字节点

.insertBefore(节点,文本) 用这个方法创建元素 也是可用的

删除HTML元素

removeChild(child)

setinterval 	定时器

focus() 		焦点

alert() 		警告 浏览器警告窗

trim()		修剪空格

append 		追加

BOM