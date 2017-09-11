package com.xa.pay.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xa.order.service.OrderFacede;
import com.xa.pay.dao.AccountMapper;
import com.xa.pay.service.PayFacade;

@Service("payFacade")
public class PayFacadeImpl implements PayFacade {
	@Resource
	private AccountMapper accountMapper;
	@Resource
	private OrderFacede orderFacede;
	@Transactional(rollbackFor=Exception.class)
	public boolean pay() throws Exception {
		int updateState = orderFacede.updateState(2l, 1);
		int updateMoney = accountMapper.updateMoney(null, -3000);
		if (updateMoney != 1 || updateState != 1) {
			throw new Exception();
		}
		return true;
	}
}
