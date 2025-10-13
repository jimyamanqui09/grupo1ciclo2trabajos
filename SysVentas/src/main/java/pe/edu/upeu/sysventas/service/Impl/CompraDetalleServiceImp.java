package pe.edu.upeu.sysventas.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.model.CompraDetalle;
import pe.edu.upeu.sysventas.repositoty.CompraDetalleRepository;
import pe.edu.upeu.sysventas.repositoty.ICrudGenericRepository;
import pe.edu.upeu.sysventas.service.ICompraDetalleService;

@RequiredArgsConstructor
@Service
public class CompraDetalleServiceImp extends CrudGenericServiceImp<CompraDetalle, Long> implements ICompraDetalleService {

    private final CompraDetalleRepository compraDetalleRepository;

    @Override
    protected ICrudGenericRepository<CompraDetalle, Long> getRepo() {
        return compraDetalleRepository;
    }
}
