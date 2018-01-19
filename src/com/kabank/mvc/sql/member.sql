select * from member;
select * from tab;
select * from bank;
select * from mobile;

desc member;
update member set addr = '서울' where id = '1234';

select * from member where id like '%홍%';
drop table member;
drop table bank;
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

delete from bank where id='hirato';
delete from bank where id='jyw4891';


insert into bank(custom_num, account_num, money, id)
values(custom_num.nextval, '7777-7777-7777', 0, 'jyw4891');  

insert into bank(custom_num, account_num, money, id)
values(custom_num.nextval, '7777-7777-7777', 0, 'jyw4891'); 

insert into member(id,pass,name,ssn,phone,email,profile,addr) values('hirato','1234','정용우','8411281234123','12341234','jyw11@naver.com','profile','인천 계양구');

select
	m.id as 아이디,
	m.pass as 비번,
	m.name as 이름,
	m.ssn as 주민번호,
	m.phone as 전화번호,
	m.email as 이메일,
	m.addr as 주소,
	m.profile as 프로필,
	a.custom_num as 고객번호,
	a.account_num as 계좌번호,
	a.money as 잔액
from member m, bank a where m.id = a.id
order by a.custom_num
;

<!-- a는 아티팩아이디 인조키 -->



