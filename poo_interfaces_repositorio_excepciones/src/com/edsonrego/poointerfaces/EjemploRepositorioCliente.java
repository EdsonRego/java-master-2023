package com.edsonrego.poointerfaces;

import com.edsonrego.poointerfaces.modelo.Cliente;
import com.edsonrego.poointerfaces.repositorio.*;
import com.edsonrego.poointerfaces.repositorio.excepciones.AccesoDatoException;
import com.edsonrego.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import com.edsonrego.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import com.edsonrego.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import com.edsonrego.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

import static com.edsonrego.poointerfaces.repositorio.Direccion.ASC;
import static com.edsonrego.poointerfaces.repositorio.Direccion.DESC;

public class EjemploRepositorioCliente {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Edson", "Rego"));
            repo.crear(new Cliente("Eva", "Alves"));
            repo.crear(new Cliente("Vastir", "Jardim"));
            Cliente johnDeere = new Cliente("John", "Deere");
            //duplicando johnDeere
            repo.crear(johnDeere);
            repo.crear(johnDeere);

            //prueba, creando cliente null
            //repo.crear(null);

            System.out.println("======= lista no paginada =======");
            List<Cliente> clientes = repo.listar();
            //clientes.forEach(c -> System.out.println(c));
            clientes.forEach(System.out::println);

            System.out.println("======= paginable =======");
            List<Cliente> paginable = repo.listar(1, 3);
            paginable.forEach(System.out::println);

            System.out.println("======= ordenar ascendente=======");
            List<Cliente> clientesOrdenAsc = repo.listar("nombre", ASC);
            clientesOrdenAsc.forEach(System.out::println);

            System.out.println("======= ordenar descendente=======");
            List<Cliente> clientesOrdenDesc = repo.listar("nombre", DESC);
            for (Cliente c : clientesOrdenDesc) {
                System.out.println(c);
            }

            System.out.println("======= editar database =======");
            Cliente evaActualziar = new Cliente("Eva", "Rego");
            evaActualziar.setId(2);
            repo.editar(evaActualziar);
            Cliente eva = repo.porId(2);
            System.out.println(eva);

            System.out.println("============== lista db modificado =================");
            repo.listar("nombre", ASC).forEach(System.out::println);

            System.out.println("============== eliminar =================");
            repo.eliminar(50);
            repo.listar().forEach(System.out::println);

            System.out.println("============== total =================");
            System.out.println("Total de registros: " + repo.total());
        }catch (RegistroDuplicadoAccesoDatoException e){
            System.out.println("Registro Duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e){
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        }catch (EscrituraAccesoDatoException e){
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        }catch (AccesoDatoException e){
            System.out.println("Genérica: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
