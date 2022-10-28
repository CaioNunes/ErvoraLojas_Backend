package com.rpglojas.models.security;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@EqualsAndHashCode
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USUARIO", uniqueConstraints = { @UniqueConstraint(columnNames = {"email"}) })
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "nome")
    private String nome;

    @NotBlank
    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "ativo")
    private boolean ativo;

    @NotBlank
    @Size(min = 6, max = 100)
    @Column(name = "senha")
    private String senha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;

    public Usuario(String nome, String email, String senha, boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

}
