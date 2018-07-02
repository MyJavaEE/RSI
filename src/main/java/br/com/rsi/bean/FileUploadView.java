package br.com.rsi.bean;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.faces.bean.ManagedBean;

import org.omnifaces.util.Messages;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean
public class FileUploadView {

	// RFC
	// -----------------------------------------------------------------------------------
	public void handleFileUpload(FileUploadEvent event) {

		// Cria Pasta tempCarga caso não exista
		new File("C:\\TempCargaRFC").mkdir();

		try {
			// Cria um arquivo UploadFile, para receber o arquivo do evento
			UploadedFile arq = event.getFile();
			InputStream in = new BufferedInputStream(arq.getInputstream());
			// copiar para pasta do projeto
			File file = new File("C:/TempCargaRFC/" + arq.getFileName());
			// O método file.getAbsolutePath() fornece o caminho do arquivo criado
			// Pode ser usado para ligar algum objeto do banco ao arquivo enviado
			RFCBean.CAMINHO = file.getAbsolutePath();
			FileOutputStream fout = new FileOutputStream(file);

			while (in.available() != 0) {
				fout.write(in.read());
			}
			fout.close();
		} catch (Exception ex) {
			Messages.addGlobalError("Falha ao carregar arquivo:");
			ex.printStackTrace();
		}
		RFCBean bean = new RFCBean();
		bean.salvarPlanilha();
	}

	// Controle
	// ---------------------------------------------------------------------
	public void handleFileUploadControle(FileUploadEvent event) {
		new File("C:\\TempCargaRFC").mkdir();
		try {
			UploadedFile arq = event.getFile();
			InputStream in = new BufferedInputStream(arq.getInputstream());
			File file = new File("C:/TempCargaRFC/" + arq.getFileName());
			ControleSiglasBean.CAMINHO = file.getAbsolutePath();
			FileOutputStream fout = new FileOutputStream(file);
			while (in.available() != 0) {
				fout.write(in.read());
			}
			fout.close();
		} catch (Exception ex) {
			Messages.addGlobalError("Falha ao carregar arquivo:");
			ex.printStackTrace();
		}
		ControleSiglasBean bean = new ControleSiglasBean();
		bean.salvarPlanilha();
	}

	// Controle Git HK
	// -----------------------------------------------------------------------------
	public void handleFileUploadGit(FileUploadEvent event) {
		new File("C:\\TempCargaRFC").mkdir();
		try {
			UploadedFile arq = event.getFile();
			InputStream in = new BufferedInputStream(arq.getInputstream());
			File file = new File("C:/TempCargaRFC/" + arq.getFileName());
			ControleGitBean.CAMINHO = file.getAbsolutePath();
			FileOutputStream fout = new FileOutputStream(file);
			while (in.available() != 0) {
				fout.write(in.read());
			}
			fout.close();
		} catch (Exception ex) {
			Messages.addGlobalError("Falha ao carregar arquivo:");
			ex.printStackTrace();
		}
		ControleGitBean bean = new ControleGitBean();
		bean.salvarPlanilha();
	}

	// Controle Git Dev
	// -----------------------------------------------------------------------------
	public void handleFileUploadGitDev(FileUploadEvent event) {
		new File("C:\\TempCargaRFC").mkdir();
		try {
			UploadedFile arq = event.getFile();
			InputStream in = new BufferedInputStream(arq.getInputstream());
			File file = new File("C:/TempCargaRFC/" + arq.getFileName());
			ControleGitDevBean.CAMINHO = file.getAbsolutePath();
			FileOutputStream fout = new FileOutputStream(file);
			while (in.available() != 0) {
				fout.write(in.read());
			}
			fout.close();
		} catch (Exception ex) {
			Messages.addGlobalError("Falha ao carregar arquivo:");
			ex.printStackTrace();
		}
		ControleGitDevBean bean = new ControleGitDevBean();
		bean.salvarPlanilha();
	}
}