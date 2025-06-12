package mx.edu.uttt.microserviciostatus.controller;

import mx.edu.uttt.microserviciostatus.model.status;
import mx.edu.uttt.microserviciostatus.service.statusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estatus")
public class statusController {

    @Autowired
    private statusService statusService;

    @GetMapping("/obtenerTodos")
    public List<status> listarTodos() {
        return statusService.obtenerTodos();
    }

    @GetMapping("/obtenerID/{id}")
    public Optional<status> obtenerPorId(@PathVariable String id) {
        return statusService.obtenerPorId(id);
    }

    @PostMapping("/guardarEstatus")
    public status crear(@RequestBody status status) {
        return statusService.guardar(status);
    }

    @DeleteMapping("/eliminarID/{id}")
    public void eliminar(@PathVariable String id) {
        statusService.eliminar(id);
    }
}
