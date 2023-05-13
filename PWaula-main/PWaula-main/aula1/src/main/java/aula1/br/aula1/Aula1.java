package aula1.br.aula1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Aula1 {

  @RequestMapping(value = "/cadastra", method = RequestMethod.POST)
  public void doCadastra(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String nome = request.getParameter("nome");
    String idadeTexto = request.getParameter("idade");
    int idade = Integer.parseInt(idadeTexto);
    String cpfTexto = request.getParameter("cpf");
    int cpf = Integer.parseInt(cpfTexto);
    var prefs = request.getParameterValues("prefs");

    var writer = response.getWriter();
    writer.println(nome);
    writer.println(idade);
    for (var p : prefs)
      writer.println(p);

  }
}
