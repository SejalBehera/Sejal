package in.nit.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import in.nit.model.UomTypeModel;
import in.nit.service.IUomTypeService;

@Controller
@RequestMapping("/uom")
public class UomTypeController {
	
	@Autowired
	private IUomTypeService service;
	
	@RequestMapping("/register")
	public String showRegPage() {
		return "UomTypeRegister";
		
	}
	
	@RequestMapping(value="/created",method = RequestMethod.POST)
	public String saveUom(@ModelAttribute UomTypeModel uomType,Model model) 
	{
		Integer id=service.saveUomType(uomType);
		String msg="UOM type '"+id+"' saved";
		model.addAttribute("msg",msg);
		return "UomTypeRegister";
		
	}
	
	@RequestMapping("/all")
	public String getAllShipmentTypes(Model model)
	{
	   List<UomTypeModel> list=service.getAllUomTypes();
	   model.addAttribute("list",list);
	   return "UomTypeData";
	}
	
	@RequestMapping("/delete")
	public String deleteUom(@RequestParam("uomid")Integer id,Model model) {
		service.deleteUomType(id);
		String message="Uom '"+id+"' deleted";
		model.addAttribute("message",message);
		
		List<UomTypeModel> list=service.getAllUomTypes();
		model.addAttribute("list",list);
		return "UomTypeData";
	
	}
	
	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("uomid")Integer id,Model model) {
		UomTypeModel st=service.getOneUomType(id);
		model.addAttribute("uomType",st);
		return "UomTypeEdit";
		
	}

	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateUom(@ModelAttribute UomTypeModel uomType,Model model) {
		service.updateUomType(uomType);
		String message="uomType'"+uomType.getUomId()+"'Updated";
		 model.addAttribute("message",message);
		 List<UomTypeModel> list=service.getAllUomTypes();
		 model.addAttribute("list",list);
		return "UomTypeData";
	}
	
	@RequestMapping("/view")
	public String showOneUom(@RequestParam("uomid")Integer id,Model model) {
		UomTypeModel st=service.getOneUomType(id);
		model.addAttribute("ob",st);
		return "UomTypeView";
	}
	
	/*@RequestMapping("/excel")
	//public ModelAndView showExcel() {
		public ModelAndView showExcel(@RequestParam(value="id",required=false)Integer id) {
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		//fetching data from db
		/*List<ShipmentTypeModel> list=service.getAllShipmentTypes();
		m.addObject("list",list);
		return m;
		
	/*if(id==null) {
		//export all rows
		List<ShipmentTypeModel> list=service.getAllShipmentTypes();
		m.addObject("list",list);
	}
	else {
		//export one row by id
		ShipmentTypeModel st=service.getOneShipmentType(id);
		m.addObject("list",Arrays.asList(st));
	}
	return m;
	}
	
	@RequestMapping("/pdf")
	//public ModelAndView showPdf() {
	public ModelAndView showPdf(@RequestParam(value="id",required=false)Integer id) {
     	ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypePdfView());
		//fetching data from db
		/*List<ShipmentTypeModel> list=service.getAllShipmentTypes();
		m.addObject("list",list);
		return m;*/
		
		/*if(id==null) {
			//export all rows
			List<ShipmentTypeModel> list=service.getAllShipmentTypes();
			m.addObject("list",list);
		}
		else {
			//export one row by id
			ShipmentTypeModel st=service.getOneShipmentType(id);
			m.addObject("list",Arrays.asList(st));
		}
		return m;
		
	}	
	
	@RequestMapping("/charts")
	public String showCharts() {
		List<Object[]> list=service.getShipmentModeCount();
		String path=context.getRealPath("/");
		util.generatePie(path,list);
		util.generateBar(path,list);
		return "ShipmentTypeCharts";
	}*/

	
}

