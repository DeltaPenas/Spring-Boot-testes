package com.produtoapi.service;
import com.produtoapi.repository.ClienteRepository;
import com.produtoapi.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
        }else{
            throw new RuntimeException("cliente não encontrado ou id errado");
        }
        
    }

    public Cliente atualizar(Long id, Cliente cliente){
        if(clienteRepository.existsById(id)){
            cliente.setId(id);
            return clienteRepository.save(cliente);
        }else{
            throw new RuntimeException("cliente não encontrado ou id errado");
        }

    }

    public Optional<Cliente> findById(Long id){
        return clienteRepository.findById(id);
    }

}
