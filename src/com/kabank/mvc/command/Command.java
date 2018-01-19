package com.kabank.mvc.command;

import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.Action;
import com.kabank.mvc.util.Enums.Table;

import lombok.Data;

@Data
public class Command{
	protected String cmd,dir,page,view,colum,data;
	protected Action action;
	protected Table table;
	protected MemberBean member;
	protected AccountBean account;
}