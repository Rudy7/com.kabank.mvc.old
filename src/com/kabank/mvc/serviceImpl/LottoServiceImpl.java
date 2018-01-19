package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.dao.AccountDAO;
import com.kabank.mvc.daoImpl.AccountDAOImpl;
import com.kabank.mvc.domain.LottoBean;
import com.kabank.mvc.service.LottoService;

public class LottoServiceImpl implements LottoService{
	public static LottoService getInstance() {
		return new LottoServiceImpl();
	}
	private LottoServiceImpl() {

	}
	@Override
	public LottoBean findLottoById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
