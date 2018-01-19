package com.kabank.mvc.daoImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.dao.AccountDAO;
import com.kabank.mvc.dao.LottoDAO;
import com.kabank.mvc.domain.LottoBean;

public class LottoDAOImpl implements LottoDAO{
	public static LottoDAO getInstance() {
		return new LottoDAOImpl();
	}
	private LottoDAOImpl() {

	}
	@Override
	public LottoBean selectLottoById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
}
