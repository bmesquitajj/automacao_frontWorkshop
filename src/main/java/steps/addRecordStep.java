package steps;

import static utils.utils.Na;
import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.addRecordPage;
import utils.utils;

public class addRecordStep {
	utils u = new utils();
	addRecordPage addRecordPage = new addRecordPage();
	
	@Quando("o usuario altera o tema para {string}") 
	public void oUsuarioAlteraOTemaPara(String string) throws Exception{
	   Na(addRecordPage.class).acaoClick(string);
	}
	

	@Quando("clica no botao {string}")
	public void clicaNoBotao(String string) throws Exception{ 
		Na(addRecordPage.class).acaoClick(string);
	}

	@Quando("preenche os dados de customizacao")
	public void preencheOsDadosDeCustomizacao(DataTable table) throws Exception{
		List<List<String>> rows = table.asLists(String.class);

		for (List<String> columns : rows) {
			Na(addRecordPage.class).preencherDados(columns.get(0), columns.get(1));
	    }
	}

	@Entao("o usuario valida a mensagem de {string}")
	public void oUsuarioValidaAMensagemDe(String string) throws Exception{
		Na(addRecordPage.class).validaMensagens(string);
	}

	@Entao("o usuario clica no link {string}")
	public void oUsuarioClicaNoLink(String string) throws Exception{
		Na(addRecordPage.class).acaoClick(string);
	}

	@Entao("pesquisa o item cadastrado {string}")
	public void pesquisaOItemCadastrado(String string) throws Exception{
		Na(addRecordPage.class).preencherDados("searchName", string);
	}

	@Entao("clica no checkbox para selecionar o item de pesquisa")
	public void clicaNoCheckboxParaSelecionarOItemDePesquisa() throws Exception{
		Na(addRecordPage.class).acaoClick("checkboxActions");
	}

	@Entao("valida a mensagem, confirma a exclusao")
	public void validaAMensagemConfirmaAExclusao() throws Exception{
		Na(addRecordPage.class).validaMensagens("mensagemAlerta");
	}

	@Entao("o usuario valida a mensagem {string}")
	public void oUsuarioValidaAMensagem(String string) throws Exception{
		Na(addRecordPage.class).validaMensagens(string);
	}
}
