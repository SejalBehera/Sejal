package in.nit.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import in.nit.model.ShipmentTypeModel;

public class ShipmentTypeExcelView extends AbstractXlsxView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.addHeader("content-Disposition","attachment;filename=shipment.xlxs");
		Sheet s=workbook.createSheet("SHIPMENT TYPES");
		//construct --ROW--0
		setHeader(s);
		//read model data
		List<ShipmentTypeModel> list=(List<ShipmentTypeModel>)model.get("list");
			setBody(s,list);
		}
	private void setHeader(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("ID");
		r.createCell(1).setCellValue("MODE");
		r.createCell(2).setCellValue("CODE");
		r.createCell(3).setCellValue("ENABLED");
		r.createCell(4).setCellValue("GRADE");
		r.createCell(5).setCellValue("NOTE");
	}
	
	private void setBody(Sheet s,List<ShipmentTypeModel> list) {
		int count=1;
		for(ShipmentTypeModel st:list) {
		Row r=s.createRow(count++);
		r.createCell(0).setCellValue(st.getShipId());
		r.createCell(1).setCellValue(st.getShipMode());
		r.createCell(2).setCellValue(st.getShipCode());
		r.createCell(3).setCellValue(st.getEnbShip());
		r.createCell(4).setCellValue(st.getShipGrade());
		r.createCell(5).setCellValue(st.getShipDesc());
		}
	}

}
