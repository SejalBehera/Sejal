package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IPurchaseOrderDao;
import in.nit.model.PurchaseOrder;
import in.nit.service.IPurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements IPurchaseOrderService {
	
	@Autowired
	private IPurchaseOrderDao dao;

	@Override
	@Transactional
	public Integer savePurchaseOrder(PurchaseOrder po) {
		return dao.savePurchaseOrder(po);
	}

	@Override
	@Transactional
	public List<PurchaseOrder> getAllPurchaseOrder() {
		List<PurchaseOrder> list=dao.getAllPurchaseOrder();
		Collections.sort(list,(o1,o2)->o1.getpOrderId()-o2.getpOrderId());
		return list;
	}

	@Override
	@Transactional
	public void deletePurchaseOrder(Integer id) {
		dao.deletePurchaseOrder(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return dao.getOnePurchaseOrder(id);
	}

	@Override
	@Transactional
	public void updatePurchaseOrder(PurchaseOrder ob) {
		dao.updatePurchaseOrder(ob);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Object[]> getPurchaseOrderCount() {
		return dao.getPurchaseOrderCount();
	}

}
