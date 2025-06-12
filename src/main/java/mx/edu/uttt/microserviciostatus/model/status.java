package mx.edu.uttt.microserviciostatus.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "estatus")
public class status {

    @Id
    @Column(name = "id_estatus", nullable = false, unique = true, length = 36)
    private String idEstatus;

    @Column(name = "nombre", nullable = false, unique = true, length = 36)
    private String nombre;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    // Getters y setters

    public String getIdStatus() {
        return idEstatus;
    }

    public void setIdStatus(String idStatus) {
        this.idEstatus = idStatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
