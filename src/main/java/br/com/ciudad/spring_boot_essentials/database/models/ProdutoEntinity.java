package br.com.ciudad.spring_boot_essentials.database.models;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProdutoEntinity {
    private Integer id;
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;
}
