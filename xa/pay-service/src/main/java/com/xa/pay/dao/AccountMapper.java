package com.xa.pay.dao;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
	int updateMoney(@Param("id") Long Id, @Param("money") double money);
}
