package pe.edu.upeu.sysventas.service.Impl;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sysventas.model.Marca;


import pe.edu.upeu.sysventas.repositoty.ICrudGenericRepository;
import pe.edu.upeu.sysventas.repositoty.MarcaRepository;
import pe.edu.upeu.sysventas.service.IMarcaService;

@RequiredArgsConstructor
public class MarcaServiceImp extends CrudGenericServiceImp<Marca, Long> implements IMarcaService {
    private final MarcaRepository marcaRepository;

    @Override
    protected ICrudGenericRepository<Marca, Long> getRepo() {
        return marcaRepository;
    }
}
