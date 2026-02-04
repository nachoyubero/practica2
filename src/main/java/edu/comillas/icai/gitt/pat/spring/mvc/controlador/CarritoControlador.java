package edu.comillas.icai.gitt.pat.spring.mvc.controlador;

import edu.comillas.icai.gitt.pat.spring.mvc.modelo.Carrito;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CarritoControlador {
    private final Map<Integer, Carrito> carritos = new HashMap<>();

    //De esta manera se gestiona la petición de los carritos
    @GetMapping("/api/carrito")
    public Collection<Carrito> getCarritos() {
        return carritos.values();
    }
    // Aquí se crea el carrito
    @PostMapping("/api/carrito/")
    @ResponseStatus(HttpStatus.CREATED)
    public Carrito crearCarrito(@RequestBody Carrito carrito) {
        carritos.put(carrito.getIdCarrito(), carrito);
        return carrito;
    }

    @GetMapping("/api/contadores/{idCarrito}")
    public Carrito getCarrito(@PathVariable int  idCarrito) {
        return carritos.get(idCarrito);
    }
//
//    @PutMapping("/api/contadores/{nombre}/incremento/{incremento}")
//    public ModeloContador incrementa(@PathVariable String nombre,
//                                     @PathVariable Integer incremento) {
//        ModeloContador contadorActual = contadores.get(nombre);
//        ModeloContador contadorIncrementado =
//                new ModeloContador(nombre, contadorActual.valor() + incremento);
//        contadores.put(nombre, contadorIncrementado);
//        return contadorIncrementado;
//    }

    //Aquí en este caso el Delete es muy parecido al GET
    @DeleteMapping("/api/carrito/{idCarrito}")
    public void borrarCarrito(@PathVariable int  idCarrito) {
        carritos.remove(idCarrito);
    }
}

