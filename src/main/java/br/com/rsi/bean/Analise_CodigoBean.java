package br.com.rsi.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.rsi.dao.complementos.AnaliseCodigoHGDAO;
import br.com.rsi.domain.complementos.Automacao_Analise_Codigo;

/**
 * -Classe BEAN AnaliseCodigoHGBean.
 * 
 * @author helio.franca
 * @version v1.7
 * @since N/A
 *
 */

@ManagedBean
@SessionScoped
public class Analise_CodigoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Automacao_Analise_Codigo analise;
	private AnaliseCodigoHGDAO dao;
	private List<Automacao_Analise_Codigo> listaAnalise;
	List<Automacao_Analise_Codigo> listaResultado;
	private int total;
	String siglaAtual;

	/**
	 * Salvar um objeto AnaliseCodigoHGBean
	 */
	// -------------------------------------------------------------------------------------
	public void salvar() {
		try {
			dao.salvar(analise);
			Messages.addGlobalInfo(siglaAtual + " - Salva");
		} catch (Exception e) {
			Messages.addGlobalError("Não foi possível salvar a Silga:" + siglaAtual);
			System.out.println("Erro ao salvar --------------------------------------" + siglaAtual + e);
		}
	}

	/**
	 * Editar objeto AnaliseCodigoHGBean
	 */
	// -------------------------------------------------------------------------------------------
	public void editar() {
		try {
			analise = new Automacao_Analise_Codigo();
			dao = new AnaliseCodigoHGDAO();
			dao.editar(analise);
			Messages.addGlobalInfo("Editado com sucesso!!!");
		} catch (Exception e) {
			Messages.addGlobalError("Erro ao Editar ");
		}
	}

	/**
	 * Selecionar uma linha da tabela AnaliseCodigoHGBean
	 * @param evento - Seleciona um objeto durante o evento.
	 */
	// -------------------------------------------------------------------------------------------
	public void selecionarAnalise(ActionEvent evento) {
		try {
			analise = (Automacao_Analise_Codigo) evento.getComponent().getAttributes().get("meuSelect");
		} catch (Exception e) {
			Messages.addGlobalError("Erro ao Editar: ");
		}
	}

	/**
	 * Criar uma lista com os objetos AnaliseCodigoHGBean
	 */
	// ------------------------------------------------------------------------------------------------------------------------------------------------------
	public void listarInfos() {
		try {

			dao = new AnaliseCodigoHGDAO();
			List<Automacao_Analise_Codigo> listaAnaliseTemp = dao.listar();
			;
			listaAnalise = listaAnaliseTemp;
			total = listaAnalise.size();
			Messages.addGlobalInfo("Lista Atualizada!");

		} catch (Exception e) {
			// TODO: handle exception
			Messages.addGlobalError("Erro ao  Atualizar Lista.");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx ERRO:" + e.getMessage() + e.getCause());
		} finally {
		}
	}

	/**
	 * Captura a última data de Commit em controle git e carimba na analíse.
	 */

	/**
	 * Captura Resultados nulos e seta as regras de Alerta/LIBERADO
	 */
	// ------------------------------------------------------------------------------------------------------------------------------------------------------


	private void setNotaAnterior(String string) {
		// TODO Auto-generated method stub
		
	}



	// Get e Set
	// ------------------------------------------------------------------------------------------------------------------------------------------------------


	public int getTotal() {
		return total;
	}

	public Automacao_Analise_Codigo getAnalise() {
		return analise;
	}

	public void setAnalise(Automacao_Analise_Codigo analise) {
		this.analise = analise;
	}

	public List<Automacao_Analise_Codigo> getListaAnalise() {
		return listaAnalise;
	}

	public void setListaAnalise(List<Automacao_Analise_Codigo> listaAnalise) {
		this.listaAnalise = listaAnalise;
	}

	public List<Automacao_Analise_Codigo> getListaResultado() {
		return listaResultado;
	}

	public void setListaResultado(List<Automacao_Analise_Codigo> listaResultado) {
		this.listaResultado = listaResultado;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getSiglaAtual() {
		return siglaAtual;
	}

	public void setSiglaAtual(String siglaAtual) {
		this.siglaAtual = siglaAtual;
	}

}