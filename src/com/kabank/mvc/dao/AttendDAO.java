package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.domain.AttendBean;

public interface AttendDAO {
	public AttendBean selectAttendById(Command cmd);
}
