select * from member;
select * from tab;
desc member;
update member set addr = '서울' where id = '1234';

select * from member where id like '%홍%';
drop table member;

commit;
ROLLBACK;

insert into member(id,pass,name,addr) values('rudy','1234','한보람','인천');


select * from bank;

create sequence custom_num start with 1000;
create table bank(
	account_num varchar2(20) not null,
	money varchar2(20) default 0,
	id varchar2(20),
	custom_num number primary key,
	foreign key (id) references Member (id)
	on delete cascade
);
drop sequence custom_num;

drop table bank;

select * from bank;

insert into bank(custom_num, account_num, money, id)
values(custom_num.nextval, '1234-5678-1234', 0, 'rudy');  





