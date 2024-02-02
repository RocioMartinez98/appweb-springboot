package com.appwebspringboot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //para que sea una entidad y se pueda mapear como tabla en la bd
@Table(name = "tbl_personas") //para darle otro nombre a la tabla, pero se puede omitir esta linea
@Data //Para getters y setters
@AllArgsConstructor //Para crear contructores
@NoArgsConstructor //Para crear constructor vacio
public class Persona {

    @Id //para que el id sea unico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int edad;

}
