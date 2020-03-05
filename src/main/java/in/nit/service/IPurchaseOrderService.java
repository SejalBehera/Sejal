package in.nit.service;

import java.util.List;

import in.nit.model.PurchaseOrder;

public interface IPurchaseOrderService {
	
	Integer savePurchaseOrder(PurchaseOrder po);
	 List<PurchaseOrder> getAllPurchaseOrder();
		void deletePurchaseOrder(Integer id);
		
		PurchaseOrder getOnePurchaseOrder(Integer id);
		void updatePurchaseOrder(PurchaseOrder ob);
		public List<Object[]> getPurchaseOrderCount();



}
