select * from member;
select * from tab;
desc member;
update member set addr = '서울' where id = '1234';

select * from member where id like '%홍%';
drop table member;

commit;
ROLLBACK;

insert into member(id,pass,name,addr) values('rudy','1234','한보람','인천');

