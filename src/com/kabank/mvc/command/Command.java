package com.kabank.mvc.command;

import com.kabank.mvc.enums.Action;

public class Command{
	protected String cmd,dir,page,view,colum,data;
	protected Action action;
	
	public String getDir() {
		return dir;
	}
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getColum() {
		return colum;
	}
	public void setColum(String colum) {
		this.colum = colum;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = (page==null) ? "login": page; 
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	

}