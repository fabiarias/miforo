package com.FazSoft.foro.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name="topics")
@Entity(name="Topic")
@Getter
@NoArgsConstructor
//Identifica si dos objetos tienen el mismo id entonces son iguales
@EqualsAndHashCode(of="id")

public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private Date fecha;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private String autor;
    private String curso;

    public Topic(DatosRegistroTopico datos) {
        this.id=null;
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.fecha = datos.fecha();
        this.estado = datos.estado();
        this.autor = datos.autor();
        this.curso = datos.curso();
    }

    public void actualizarTopicos(DatosActualizarTopic datos) {
        if(datos.titulo() != null){
            this.titulo=datos.titulo();
        }
        if(datos.mensaje() != null){
            this.mensaje = datos.mensaje();
        }
        if(this.fecha !=null){
            this.fecha = datos.fecha();
        }
        if(this.estado !=null){
            this.estado = datos.estado();
        }
        if(this.autor !=null){
            this.autor = datos.autor();
        }
        if(this.curso !=null){
            this.curso = datos.curso();
        }
    }
}
