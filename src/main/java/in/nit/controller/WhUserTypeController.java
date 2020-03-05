package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Controller
@RequestMapping("/whu")
public class WhUserTypeController {

	@Autowired
	private IWhUserTypeService service;
	
	@RequestMapping("/reg")
	public String showRegPage() {
		return "WhUserTypeReg";
		
	}
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public String saveWhu(@ModelAttribute WhUserType whuType,Model model) 
	{
		Integer id=service.saveWhuType(whuType);
		String msg="WHUser type '"+id+"' created";
		model.addAttribute("message",msg);
		return "WhUserTypeReg";
		
	}
	
	@RequestMapping("/all")
	public String getAllShipmentTypes(Model model)
	{
	   List<WhUserType> list=service.getAllWhuTypes();
	   model.addAttribute("list",list);
	   return "WhUserTypeData";
	}
	
	@RequestMapping("/delete")
	public String deleteUom(@RequestParam("whuid")Integer id,Model model) {
		service.deleteWhuType(id);
		String message="WHUser is'"+id+"' deleted";
		model.addAttribute("message",message);
		
		List<WhUserType> list=service.getAllWhuTypes();
		model.addAttribute("list",list);
		return "WhUserTypeData";
	
	}

}

