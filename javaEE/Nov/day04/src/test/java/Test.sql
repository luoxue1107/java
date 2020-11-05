CREATE TABLE `image`(
    `image_id` INT(11) AUTO_INCREMENT COMMENT '图片编号',
    `image_name` VARCHAR(50) NOT NULL COMMENT '图片名称',
    `image_date` DATE NOT NULL COMMENT'图片存入时间',
    `image_Url` VARCHAR(50) NOT NULL COMMENT'图片路径',
PRIMARY KEY(image_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;