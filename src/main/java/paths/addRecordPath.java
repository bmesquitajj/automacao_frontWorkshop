package paths;

import java.util.ArrayList;
import java.util.List;

public class addRecordPath {
	
	private String addRecordBT = "//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a";
	private String buttonSave = "//*[@id=\"form-button-save\"]";
	private String buttonGoBack = "//*[@id=\"report-success\"]/p/a[2]";
	private String buttonDelete = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a";
	private String buttonDeleteConfirm = "/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]";
	private String checkboxActions = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]/div/input";
	
	private String mensagemAlerta = "/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]";
	private String mensagemAlertaConfirm = "/html/body/div[3]/span[3]";
	private String mensagemSucesso = "//*[@id=\"report-success\"]/p";
	
	
	public List<pathConstruct> listPath = new ArrayList<>();
	public void addListPath() {
		listPath.add(new pathConstruct("addRecordBT", addRecordBT));
		listPath.add(new pathConstruct("buttonSave", buttonSave));
		listPath.add(new pathConstruct("buttonGoBack", buttonGoBack));
		listPath.add(new pathConstruct("buttonDelete", buttonDelete));
		listPath.add(new pathConstruct("buttonDeleteConfirm", buttonDeleteConfirm));
		listPath.add(new pathConstruct("checkboxActions", checkboxActions));
	}
	
	public List<pathConstruct> listPathMsg = new ArrayList<>();
	public void addListPathMsg() {
		listPathMsg.add(new pathConstruct("mensagemAlerta", mensagemAlerta));
		listPathMsg.add(new pathConstruct("mensagemAlertaConfirm", mensagemAlertaConfirm));
		listPathMsg.add(new pathConstruct("mensagemSucesso", mensagemSucesso));
	}
	
}