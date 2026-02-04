package com.produtoapi.controller;



import com.produtoapi.model.Produto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.produtoapi.model.Cliente;
import com.produtoapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarTodos(){
        return clienteService.listarTodos();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return clienteService.salvar(cliente);
    }
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        return  clienteService.atualizar(id, cliente);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        clienteService.deletar(id);
    }
    @GetMapping("/{id}")
    public Optional<Cliente> findByid(@PathVariable Long id){
        return clienteService.findById(id);
    }
    @PostMapping("/salvarLista")
    public List<Cliente> salvarLista(@RequestBody List<Cliente> clientes){
        return clienteService.salvarLista(clientes);
    }

}
