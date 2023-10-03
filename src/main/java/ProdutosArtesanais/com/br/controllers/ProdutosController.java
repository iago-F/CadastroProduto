package ProdutosArtesanais.com.br.controllers;
import ProdutosArtesanais.com.br.model.CadastroProduto;
import ProdutosArtesanais.com.br.model.DisponibilidadeCadastro;
import ProdutosArtesanais.com.br.repository.cadastroproduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/Produto")
 class ProdutosController {

    @Autowired
    private cadastroproduto cadastro;




    @RequestMapping("/index")
    public ModelAndView index() {

        ModelAndView mv = new ModelAndView("CadastroProduto");


        return mv;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView salvar(CadastroProduto cadastroproduto) {


        cadastro.save(cadastroproduto);
        ModelAndView mv = new ModelAndView("CadastroProduto");
        mv.addObject("mensagem","Produto salvo com sucesso");

        return mv;



    }

    @ModelAttribute("disponibilidade")
    public List<DisponibilidadeCadastro> disponibilidade(){

        return Arrays.asList(DisponibilidadeCadastro.values());
    }




}
