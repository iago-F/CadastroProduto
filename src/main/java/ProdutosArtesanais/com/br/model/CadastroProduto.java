package ProdutosArtesanais.com.br.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
public class CadastroProduto {

    @Id // ele identifica a Entidade
    @GeneratedValue(strategy= GenerationType.IDENTITY) //estrategia
    private Long id;
    private String produto;
    private String descricao;
    private String instrucao;
    @NumberFormat(pattern="#,##0.00")
    private BigDecimal valor;
    @Enumerated(EnumType.STRING)//salva no db como String
    private DisponibilidadeCadastro diponibilidade;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CadastroProduto that = (CadastroProduto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
