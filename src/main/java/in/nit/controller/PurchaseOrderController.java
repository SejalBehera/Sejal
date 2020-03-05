package in.nit.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.PurchaseOrder;
import in.nit.service.IPurchaseOrderService;


	@Controller
	@RequestMapping("/porder")
	public class PurchaseOrderController {
		
		@Autowired
		private IPurchaseOrderService service;
		
		@RequestMapping("/reg")
		public String showRegPage(Model model) {
			model.addAttribute("purchaseOrder",new PurchaseOrder());
			return "PurchaseOrderReg";
			
		}
		
		@RequestMapping(value="/create",method = RequestMethod.POST)
		public String savePo(@ModelAttribute PurchaseOrder po,Model model) 
		{
			Integer id=service.savePurchaseOrder(po);
			String msg="Purchase Order '"+id+"' created";
			model.addAttribute("message",msg);
			model.addAttribute("purchaseOrder",new PurchaseOrder());
			return "PurchaseOrderReg";
			
		}
		
		@RequestMapping("/all")
		public String getAllpOrders(Model model)
		{
		   List<PurchaseOrder> list=service.getAllPurchaseOrder();
		   model.addAttribute("list",list);
		   return "PurchaseOrderData";
		}
		
		@RequestMapping("/delete")
		public String deletepOrder(@RequestParam("poid")Integer id,Model model) {
			service.deletePurchaseOrder(id);
			String message="PurchaseOrder is'"+id+"' deleted";
			model.addAttribute("message",message);
			
			List<PurchaseOrder> list=service.getAllPurchaseOrder();
			model.addAttribute("list",list);
		return "PurchaseOrderData";
		
		}
		
		@RequestMapping("/edit")
		public String showEditPage(@RequestParam("poid")Integer id,Model model) {
			PurchaseOrder po=service.getOnePurchaseOrder(id);
			model.addAttribute("purchaseOrder",po);
			return "PurchaseOrderEdit";
			
		}
		
		@RequestMapping(value="/update",method=RequestMethod.POST)
		public String updatePurchaseOrder(@ModelAttribute PurchaseOrder purchaseOrder,Model model) {
			service.updatePurchaseOrder(purchaseOrder);
			String message=" purchaseOrder'"+purchaseOrder.getpOrderId()+"'Updated";
			model.addAttribute("message",message);
			List< PurchaseOrder> list=service.getAllPurchaseOrder();
			model.addAttribute("list",list);
			return "PurchaseOrderData";
			
		}
		
		@RequestMapping("/view")
		public String showOnePurchaseOrder(@RequestParam("poid")Integer id,Model model) {
			 PurchaseOrder st=service.getOnePurchaseOrder(id);
			model.addAttribute("ob",st);
			return "PurchaseOrderView";
		}

}
