#language: pt
#encoding: utf-8
#autor: Bruno Mesquita

@cenario
Funcionalidade: Acessando ambiente e adicionando uma customização

#	Contexto: não há necessidade de um contexto para as tarefas 
			
			Esquema do Cenario: Cadastro customizado
				Quando o usuario altera o tema para "Bootstap V4"
				E clica no botao "addRecordBT"
				E preenche os dados de customizacao
					|Name							| <Nome>								|
					|Lastname			  	| <UltimoNome>					|
					|ContactFirstName	| <ContatoNome>				  |
					|Phone						| 51 9999-9999					|
					|AddressLine1			| Av Assis Brasil, 3970	|
				  |AddressLine2			| Torre D								|
					|City							| Porto Alegre					|
					|State						| RS										|
					|PostalCode				| 91000-000							|
					|Country					| Brasil								|
					|fromEmployeer		| 51								    |
					|CreditLimit			| 200										|
				E clica no botao "buttonSave"
				Entao o usuario valida a mensagem de "mensagemSucesso"
				Mas o usuario clica no link "buttonGoBack"
				E pesquisa o item cadastrado "<Nome>"
				E clica no checkbox para selecionar o item de pesquisa
				E clica no botao "buttonDelete"
				E valida a mensagem, confirma a exclusao
				Entao o usuario valida a mensagem "mensagemAlertaConfirm" 
				
			Exemplos:
			|Nome             |UltimoNome|ContatoNome   |
			|Teste Mesquita   |Teste    |Bruno Mesquita |
#			|Teste Mesquita2  |Teste2   |Bruno Mesquita2|
#			|Mesquita         |Teste    |Bruno Leite    |
#			|Junior Cigano    |Cigano   |Juninho        |
				
				
			#Falhas encontradas:
			#Tentar deletar sem retirar o foco no campo de pesquisa
			#Não cadastra se o nome e o Contato forem iguais
			
				
				
				