package com.controle.de.concorrencia.crebito.Crebito.service;

import com.controle.de.concorrencia.crebito.Crebito.dto.ClienteDto;
import com.controle.de.concorrencia.crebito.Crebito.model.Cliente;

public interface ClienteService {
    public Cliente buscarClientePorId(Long id);
    public void cadastrarCliente(ClienteDto clienteDto);
}
