package pe.edu.upeu.sysventas.service.Impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.model.Venta;
import pe.edu.upeu.sysventas.repositoty.ICrudGenericRepository;
import pe.edu.upeu.sysventas.repositoty.VentaRepository;
import pe.edu.upeu.sysventas.service.IVentaService;
@RequiredArgsConstructor
 @Service
public class VentaServiceImp extends CrudGenericServiceImp<Venta, Long> implements IVentaService {

    private final VentaRepository ventaRepository;

    @Override
    protected ICrudGenericRepository<Venta, Long> getRepo() {
        return ventaRepository;
    }
}
