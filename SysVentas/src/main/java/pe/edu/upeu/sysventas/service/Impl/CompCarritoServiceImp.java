package pe.edu.upeu.sysventas.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.model.CompCarrito;

import pe.edu.upeu.sysventas.repositoty.CompCarritoRepository;
import pe.edu.upeu.sysventas.repositoty.ICrudGenericRepository;
import pe.edu.upeu.sysventas.service.ICompCarritoService;

@RequiredArgsConstructor
@Service
public class CompCarritoServiceImp extends CrudGenericServiceImp<CompCarrito,Long> implements ICompCarritoService {

    private final CompCarritoRepository CompCarritoRepository;

    @Override
    protected ICrudGenericRepository<CompCarrito, Long> getRepo() {
        return CompCarritoRepository;
    }
}
