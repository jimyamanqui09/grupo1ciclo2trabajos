package pe.edu.upeu.sysventas.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.model.Usuario;
import pe.edu.upeu.sysventas.repositoty.ICrudGenericRepository;
import pe.edu.upeu.sysventas.repositoty.UsuarioRepository;
import pe.edu.upeu.sysventas.service.IUsuarioService;
@RequiredArgsConstructor
@Service
public class UsuarioServiceImp extends CrudGenericServiceImp<Usuario, Long> implements IUsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Override
    protected ICrudGenericRepository<Usuario, Long> getRepo() {
        return usuarioRepository;
    }
}
