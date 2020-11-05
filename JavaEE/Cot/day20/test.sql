create table `tb_test_01` (
      `id` int(11) NULL comment '编号',
      `account` varchar(50) NOT NULL comment '账号',
      `password` varchar(50) NOt NULL DEFAULT '123456' comment '密码'
       );