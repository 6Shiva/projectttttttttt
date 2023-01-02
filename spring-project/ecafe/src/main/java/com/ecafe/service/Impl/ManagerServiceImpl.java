package com.ecafe.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.Offer;
import com.ecafe.repository.CafeItemRepository;
import com.ecafe.service.IManagerService;
@Service
public class ManagerServiceImpl implements IManagerService{
	@Autowired
	private CafeItemRepository repo;

	@Override
	public CafeItem addItem(CafeItem cafeitem) {
		// TODO Auto-generated method stub
		CafeItem save=this.repo.save(cafeitem);
		return save;
	}

	@Override
	public CafeItem updateItem(CafeItem cafeitem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CafeCombo updateCombo(CafeCombo cafecombo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CafeItem deleteItem(CafeItem cafeItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CafeCombo deleteCombo(CafeCombo cafecombo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offer updateOffer(Offer updateoffer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offer removeOffer(Offer removeoffer) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
