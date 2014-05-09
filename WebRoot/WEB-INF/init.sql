insert into sys_privilege values('1','双击打开【文档管理】的权限。','文档管理',null);
insert into sys_privilege values('11','在【文档管理】中，执行【新建】操作的权限。','新建','1');
insert into sys_privilege values('12','在【文档管理】中，执行【上传】操作的权限。','上传','1');
insert into sys_privilege values('2','双击打开【用户权限】的权限。','用户权限',null);
insert into sys_privilege values('3','双击打开【系统设置】的权限。','系统设置',null);
insert into sys_privilege values('4','双击打开【回收站】的权限。','回收站',null);

insert into sys_group values('1','系统管理员，具有所有权限。','Y','系统管理员');

insert into r_privilege_group values(1,1);
insert into r_privilege_group values(1,2);
insert into r_privilege_group values(1,3);
insert into r_privilege_group values(1,4);
insert into r_privilege_group values(1,11);
insert into r_privilege_group values(1,12);

insert into r_department_group values(1,(select id from obpm.t_department where name like '%信息%'));


insert into SYS_OPERATION values(1,'允许打开文件夹/在线预览文件','打开');
insert into SYS_OPERATION values(2,'允许下载文件','下载');
insert into SYS_OPERATION values(3,'允许打印文件','打印');
insert into SYS_OPERATION values(4,'允许修改文件','修改');
insert into SYS_OPERATION values(5,'允许设置文件','设置');
insert into SYS_OPERATION values(6,'允许删除文件（放入回收站）','删除');
insert into SYS_OPERATION values(7,'允许从回收站还原文件','还原');
