package br.com.rsi.html;

public class CorpoHtml {

	public static String bodyHTML(String resultado) {
		// embed the image and get the content id

		StringBuffer msgs = new StringBuffer();
		msgs.append("<!DOCTYPE html>");
		msgs.append("<html>");
		msgs.append("<head>");
		msgs.append("<meta charset=\"utf-8\">");
		msgs.append("</head>");	

		msgs.append("<body style=\"background:#fff;font-family:Courier, monospace; \">");
		msgs.append("<h3> <img\r\n" + 
				"		// src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrXewSUEjnq1gdmLpd8V5_0s_stmlTEQA8NVmLMVNSo7AhRJtfVw'\r\n" + 
				"		// width='213' height='59' align='BASELINE' />&ensp;  Monitor! <h3> ");
		msgs.append("<div>");
		msgs.append("<table border='1'>");
		msgs.append("<tr style=\"background-color:#93a6ad;\"><td>&ensp; ALTERAÇÃO &ensp;  &ensp;</td>");
		msgs.append("<td>&ensp; SIGLA &ensp;  &ensp;</td>");
		msgs.append("<td>&ensp; &ensp; SISTEMA &ensp;  &ensp;</td>");
		msgs.append("<td>&ensp; COMMIT &ensp;  &ensp; &ensp;</td>");
		msgs.append("<td>&ensp; COMMIT_ANT &ensp;  &ensp;</td></tr>");
		msgs.append(resultado);
		msgs.append("</table>");

		msgs.append("</div>  " + "</body>");

		msgs.append("</html>");

		return msgs.toString();

	}

}