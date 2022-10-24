package com.sistema.blog.servicio;

import com.sistema.blog.dto.PublicacionDTO;
import com.sistema.blog.dto.PublicacionRespuesta;

public interface PublicacionServicio {

    public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO);
    public PublicacionRespuesta obtenerTodasLasPublicaciones(int numeroPag, int medidaPag, String ordenarPor, String sortDir);
    public PublicacionDTO obtenerPublicacionPorId(Long id);
    public void eliminarPublicacion(Long id);
    public PublicacionDTO actualizarPublicacion(PublicacionDTO publicacionDTO, Long id);
}
