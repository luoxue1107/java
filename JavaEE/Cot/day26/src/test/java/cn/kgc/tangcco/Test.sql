create  table  `student` (
    `id` int(11)  auto_increment comment '学生编号',
    `name` varchar(50) not null comment '姓名',
    `gender` varchar (10) comment'性别',
    `birthday` varchar (50) comment '生日',
    `cid` int(11)  comment 'cid',
    `class` varchar(255)  comment 'class',
    primary key(`id`)
    );
    insert into `student` values(2,'Tom','男','1998-10-11',1,'空');
--     private String name;
--     private String sex;
--     private Date birthday;
--     private Integer cid;
--     private String clazz;
)