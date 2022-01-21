package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import paths.addRecordPath;
import paths.pathConstruct;
import utils.utils;

public class addRecordPage{
	addRecordPath addPath = new addRecordPath();
	
	@FindBy(xpath = "//*[@id=\"switch-version-select\"]")
	private WebElement selectBootstrap;
	
	@FindBy(xpath = "//*[@id=\"switch-version-select\"]/option[4]")
	private WebElement optionSelectBoostrap;
		
	@FindBy(xpath = "//*[@id=\"field-customerName\"]")
	private WebElement Name;
	
	@FindBy(xpath = "//*[@id=\"field-contactLastName\"]")
	private WebElement Lastname;
	
	@FindBy(xpath = "//*[@id=\"field-contactFirstName\"]")
	private WebElement ContactFirstName;
	
	@FindBy(xpath = "//*[@id=\"field-phone\"]")
	private WebElement Phone;
	
	@FindBy(xpath = "//*[@id=\"field-addressLine1\"]")
	private WebElement AddressLine1;
	
	@FindBy(xpath = "//*[@id=\"field-addressLine2\"]")
	private WebElement AddressLine2;
	
	@FindBy(xpath = "//*[@id=\"field-city\"]")
	private WebElement City;
	
	@FindBy(xpath = "//*[@id=\"field-state\"]")
	private WebElement State;
	
	@FindBy(xpath = "//*[@id=\"field-postalCode\"]")
	private WebElement PostalCode;
	
	@FindBy(xpath = "//*[@id=\"field-country\"]")
	private WebElement Country;
	
	@FindBy(xpath = "//*[@id=\"field-salesRepEmployeeNumber\"]")
	private WebElement fromEmployeer;
	
	@FindBy(xpath = "//*[@id=\"field-creditLimit\"]")
	private WebElement CreditLimit;
	
	@FindBy(xpath = "//*[@id=\"field-deleted\"]")
	private WebElement inputDeleted;
		
	@FindBy(xpath = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[3]/input")
	private WebElement searchName;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/thead/tr[2]/td[2]/div[2]/a")
	private WebElement refresh;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/thead/tr[1]/th[1]")
	private WebElement Delfocus;
	
	
	public void acaoClick (String var) throws Exception {
		if(addPath.listPath.isEmpty()) {
			addPath.addListPath();
		}
		
		if(var.equals("Bootstap V4")) {
			selectBootstrap.click();
			optionSelectBoostrap.click();
			Thread.sleep(2000);
			
		}else {
			for (pathConstruct path : addPath.listPath) {
				if (path.getName().equals(var)) {
		    		WebElement botaoClick = utils.mudando(path.getPath());
		    		botaoClick.click();
		    		Thread.sleep(2000);
		        	break;
		        }
		    }
		}
	}
	
	public void preencherDados(String columns, String Value) throws Exception{
		
		switch (columns) {
			case "Name":
				Name.sendKeys(Value);
				break;
			
			case "Lastname":
				Lastname.sendKeys(Value);			
				break;
				
			case "ContactFirstName":
				ContactFirstName.sendKeys(Value);
				break;
				
			case "Phone":
				Phone.sendKeys(Value);
				break;
				
			case "AddressLine1":
				AddressLine1.sendKeys(Value);
				break;
				
			case "AddressLine2":
				AddressLine2.sendKeys(Value);
				break;
				
			case "City":
				City.sendKeys(Value);
				break;
				
			case "State":
				State.sendKeys(Value);
				break;
				
			case "PostalCode":
				PostalCode.sendKeys(Value);
				break;
	
			case "Country":
				Country.sendKeys(Value);
				break;
				
			case "fromEmployeer":
				fromEmployeer.sendKeys(Value);
				break;
				
			case "CreditLimit":
				CreditLimit.sendKeys(Value);
				break;
				
			case "searchName":
				searchName.sendKeys(Value);
//				Robot robot = new Robot();
//				robot.keyPress(KeyEvent.VK_ENTER);
				Delfocus.click();
				Thread.sleep(2000);
				break;
		}
	}

	public void validaMensagens(String mensagem) throws Exception {
		if(addPath.listPathMsg.isEmpty()) {
			addPath.addListPathMsg();
		}
		
		for (pathConstruct path : addPath.listPathMsg) {
			if (path.getName().equals(mensagem)) {
				WebElement mensagemAlerta = utils.mudando(path.getPath());
				mensagemAlerta.isDisplayed();
				if(mensagem.equals("testeS")) {
					acaoClick("buttonDeleteConfirm");
				}
	    		Thread.sleep(2000);
	        	break;
		        	
	        }
	    }
		
	}

}
