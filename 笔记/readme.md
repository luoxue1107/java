# express

[TOC]


#### 初始化express

```shell
sudo npm init --yes
sudo npm install express --save
sudo npm install body-parser --save 
```

#### 测试代码

```javascript
// 引入express
const express = require('express');

// 创建应用对象
const app = express();

// 创建路由规则
/**
 * @request 封装请求对象
 * @response 封装响应对象
 */
app.get('/', (request, response) => {
    // 响应消息内容
    response.send('桃李不言下自成蹊');
});
// 监听服务
app.listen(2020, () => {
    // 监听log日志
    console.log("服务已启动,{0.0.0.0:2020},请访问http://127.0.0.1:2020");
});
```

#### 启动服务

```shell
node server.js
```

