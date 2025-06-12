package mx.edu.uttt.microserviciostatus.service;

import mx.edu.uttt.microserviciostatus.model.status;
import mx.edu.uttt.microserviciostatus.repository.statusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.time.LocalDateTime;

@Service
public class statusService {

    @Autowired
    private statusRepository statusRepository;

    public List<status> obtenerTodos() {
        return statusRepository.findAll();
    }

    public Optional<status> obtenerPorId(String id) {
        return statusRepository.findById(id);
    }

    public status guardar(status estatus) {
        estatus.setIdStatus(UUID.randomUUID().toString());
        estatus.setFechaCreacion(LocalDateTime.now());
        return statusRepository.save(estatus);
    }

    public void eliminar(String id) {
        statusRepository.deleteById(id);
    }
}
