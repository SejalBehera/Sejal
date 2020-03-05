package in.nit.dao;

import java.util.List;

import in.nit.model.Document;

public interface IDocumentDao {
	public List<Object[]>getFileIdAndNames();
	Integer saveDocument(Document doc);
	public Document getOneDocument(Integer id);

}
