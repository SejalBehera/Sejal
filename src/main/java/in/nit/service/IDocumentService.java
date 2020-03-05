package in.nit.service;

import java.util.List;

import in.nit.model.Document;

public interface IDocumentService {
	public List<Object[]>getFileIdAndNames();
	Integer saveDocument(Document doc);
	public Document getOneDocument(Integer id);

}
