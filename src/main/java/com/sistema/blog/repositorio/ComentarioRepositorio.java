package com.sistema.blog.repositorio;

import com.sistema.blog.entidades.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepositorio extends JpaRepository<Comentario, Long> {
}
