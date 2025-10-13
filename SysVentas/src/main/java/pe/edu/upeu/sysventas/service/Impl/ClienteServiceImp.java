package pe.edu.upeu.sysventas.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.model.Cliente;
import pe.edu.upeu.sysventas.repositoty.ClienteRepository;
import pe.edu.upeu.sysventas.repositoty.ICrudGenericRepository;
import pe.edu.upeu.sysventas.service.IClienteService;

@Service
@RequiredArgsConstructor
public class ClienteServiceImp extends CrudGenericServiceImp<Cliente,String> implements IClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    protected ICrudGenericRepository<Cliente, String> getRepo() {
        return clienteRepository;
    }
}
