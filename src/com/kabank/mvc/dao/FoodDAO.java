package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;

public interface FoodDAO {
	public String selectFoodById(Command cmd);
}
