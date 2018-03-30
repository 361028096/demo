CREATE TABLE `person` (
  `id` varchar(64) NOT NULL COMMENT 'ID',
  `name` varchar(64) NOT NULL COMMENT '姓名',
  `due_time` date DEFAULT NULL COMMENT '时间',
  `instalment` int(11) DEFAULT NULL COMMENT '当前期数',
  `freeze_time` datetime DEFAULT NULL COMMENT '冻结时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `person` (`id`, `name`, `due_time`, `instalment`, `freeze_time`) VALUES ('1', 'test', '2017-12-29', 1, '2017-12-21 14:47:11');
INSERT INTO `person` (`id`, `name`, `due_time`, `instalment`, `freeze_time`) VALUES ('2', 'haha', '2017-12-29', 1, '2017-12-21 14:57:46');
