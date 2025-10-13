package pe.edu.upeu.sysventas.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.model.VentaDetalle;
import pe.edu.upeu.sysventas.repositoty.ICrudGenericRepository;
import pe.edu.upeu.sysventas.repositoty.VentaDetalleRepository;
import pe.edu.upeu.sysventas.service.IVentaDetalleService;

@RequiredArgsConstructor
@Service
public class VentaDetalleServiceImp extends CrudGenericServiceImp<VentaDetalle, Long> implements IVentaDetalleService {
    private final VentaDetalleRepository ventaDetalleRepository;
    @Override
    protected ICrudGenericRepository<VentaDetalle, Long> getRepo() {
        return ventaDetalleRepository;
    }
}
