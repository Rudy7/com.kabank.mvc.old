package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.domain.LottoBean;

public interface LottoDAO {
	public LottoBean selectLottoById(Command cmd);
}
