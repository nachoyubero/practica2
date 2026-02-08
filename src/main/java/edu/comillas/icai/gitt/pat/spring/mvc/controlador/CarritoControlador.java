package edu.comillas.icai.gitt.pat.spring.mvc.controlador;

import edu.comillas.icai.gitt.pat.spring.mvc.modelo.Carrito;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/carritos")
public class CarritoControlador {
    private final Map<Integer, Carrito> carritos = new HashMap<>();

    //De esta manera se gestiona la petición de los carritos
    @GetMapping
    public Collection<Carrito> getCarritos() {
        return carritos.values();
    }


    // Aquí se crea el carrito
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Carrito crearCarrito(@RequestBody Carrito carrito) {
        carritos.put(carrito.getIdCarrito(), carrito);
        return carrito;
    }
    //Hacemos un get para un solo carrito
    @GetMapping("/{idCarrito}")
    public Carrito getCarrito(@PathVariable int  idCarrito) {
        return carritos.get(idCarrito);
    }

    @PutMapping("/{idCarrito}")
    public Carrito modificarCarrito(@PathVariable int idCarrito, @RequestBody Carrito carrito) {
        carritos.put(idCarrito, carrito);
        return carrito;
    }

    //Aquí en este caso el Delete es muy parecido al GET
    @DeleteMapping("/{idCarrito}")
    public void borrarCarrito(@PathVariable int  idCarrito) {
        carritos.remove(idCarrito);
    }

}

