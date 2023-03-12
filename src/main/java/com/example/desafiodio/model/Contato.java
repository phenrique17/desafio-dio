package com.example.desafiodio.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoContatoEnum tipo;

    private String numero;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Contato contato = (Contato) o;
        return id != null && Objects.equals(id, contato.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
