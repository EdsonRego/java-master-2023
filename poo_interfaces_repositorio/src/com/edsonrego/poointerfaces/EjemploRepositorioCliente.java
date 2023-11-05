package com.edsonrego.poointerfaces;

import com.edsonrego.poointerfaces.modelo.Cliente;
import com.edsonrego.poointerfaces.repositorio.*;
import com.edsonrego.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

import static com.edsonrego.poointerfaces.repositorio.Direccion.ASC;
import static com.edsonrego.poointerfaces.repositorio.Direccion.DESC;

public class EjemploRepositorioCliente {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Edson","Rego"));
        repo.crear(new Cliente("Eva","Alves"));
        repo.crear(new Cliente("Vastir", "Jardim"));
        repo.crear(new Cliente("John","Deere"));

        System.out.println("======= lista no paginada =======");
        List<Cliente> clientes = repo.listar();
        //clientes.forEach(c -> System.out.println(c));
        clientes.forEach(System.out::println);

        System.out.println("======= paginable =======");
        List<Cliente> paginable = repo.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("======= ordenar ascendente=======");
        List<Cliente> clientesOrdenAsc = repo.listar("nombre",ASC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println("======= ordenar descendente=======");
        List<Cliente> clientesOrdenDesc = repo.listar("nombre",DESC);
        for(Cliente c: clientesOrdenDesc){
            System.out.println(c);
        }

        System.out.println("======= editar database =======");
        Cliente evaActualziar = new Cliente("Eva","Rego");
        evaActualziar.setId(2);
        repo.editar(evaActualziar);
        Cliente eva = repo.porId(2);
        System.out.println(eva);

        System.out.println("============== lista db modificado =================");
        repo.listar("nombre",ASC).forEach(System.out::println);

        System.out.println("============== eliminar =================");
        repo.eliminar(1);
        repo.listar().forEach(System.out::println);

        System.out.println("============== total =================");
        System.out.println("Total de registros: " + repo.total());
    }
}
