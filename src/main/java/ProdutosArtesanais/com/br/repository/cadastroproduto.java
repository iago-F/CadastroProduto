package ProdutosArtesanais.com.br.repository;

import ProdutosArtesanais.com.br.model.CadastroProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cadastroproduto extends JpaRepository<CadastroProduto, Long> {
}
