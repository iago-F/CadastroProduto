package ProdutosArtesanais.com.br.model;

import lombok.Getter;
import lombok.Setter;

@Getter

    public enum DisponibilidadeCadastro {

        DISPONIVEL("disponivel"),
        ESGOTADO("esgotado");

        private final String descricao;

        DisponibilidadeCadastro(String descricao){

            this.descricao=descricao;
        }

//        public String getDescricao(){
//
//            return descricao ;
//        }

}


