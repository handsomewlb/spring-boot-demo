DROP TABLE IF EXISTS TEST_USER;
CREATE TABLE TEST_USER
(
   `ID` bigint(19) not null AUTO_INCREMENT comment 'id',
   `USER_NAME` varchar(16) DEFAULT null comment '用户名',
   `PASSWORD` varchar(32) DEFAULT null comment '密码',
   `STATUS` tinyint(1) DEFAULT 1 comment '状态(0:无效，1:有效)',
   primary key (ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';


INSERT INTO TEST_USER (USER_NAME,PASSWORD,STATUS) VALUES ('admin','admin',1);