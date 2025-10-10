package pe.edu.upeu.sysventas.service.Impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.repositoty.CategoriaRepository;
import pe.edu.upeu.sysventas.repositoty.ICrudGenericRepository;
import pe.edu.upeu.sysventas.service.ICategoriaService;

@Transactional
@RequiredArgsConstructor
@Service
public class CategoriaServiceImp extends CrudGenericServiceImp<Categoria,Long> implements ICategoriaService {
    private final CategoriaRepository categoriaRepository;
    @Override
    protected ICrudGenericRepository<Categoria, Long> getRepo() {
        return categoriaRepository;
    }
}
