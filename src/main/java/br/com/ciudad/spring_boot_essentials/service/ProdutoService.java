package br.com.ciudad.spring_boot_essentials.service;

import br.com.ciudad.spring_boot_essentials.database.models.ProdutoEntinity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private static final List<ProdutoEntinity> PRODUTOS = List.of(
            ProdutoEntinity.builder()
                    .id(1)
                    .nome("Notebook")
                    .preco(new BigDecimal("5000"))
                    .quantidade(10)
                    .build(),

            ProdutoEntinity.builder()
                    .id(2)
                    .nome("Teclado")
                    .preco(new BigDecimal("7000"))
                    .quantidade(10)
                    .build(),

            ProdutoEntinity.builder()
                    .id(3)
                    .nome("Mouse")
                    .preco(new BigDecimal("500"))
                    .quantidade(10)
                    .build()
    );

    public List<ProdutoEntinity> findAll() {
        return new ArrayList<>(PRODUTOS);
    }
}
