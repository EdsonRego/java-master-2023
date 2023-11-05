package com.edsonrego.poointerfaces;

import com.edsonrego.poointerfaces.modelo.Cliente;
import com.edsonrego.poointerfaces.modelo.Producto;
import com.edsonrego.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import com.edsonrego.poointerfaces.repositorio.lista.ClienteListRepositorio;
import com.edsonrego.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

import static com.edsonrego.poointerfaces.repositorio.Direccion.ASC;
import static com.edsonrego.poointerfaces.repositorio.Direccion.DESC;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("mesa",50.5));
        repo.crear(new Producto("silla",20));
        repo.crear(new Producto("lampara", 15));
        repo.crear(new Producto("computador",1000));

        System.out.println("======= lista no paginada =======");
        List<Producto> productos = repo.listar();
        //clientes.forEach(c -> System.out.println(c));
        productos.forEach(System.out::println);

        System.out.println("======= paginable =======");
        List<Producto> paginable = repo.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("======= ordenar ascendente=======");
        List<Producto> productosOrdenAsc = repo.listar("descripcion",ASC);
        productosOrdenAsc.forEach(System.out::println);

        System.out.println("======= ordenar descendente=======");
        List<Producto> productosOrdenDesc = repo.listar("descripcion",DESC);
        for(Producto p: productosOrdenDesc){
            System.out.println(p);
        }

        System.out.println("======= editar database =======");
        Producto lamparaActualizar = new Producto("lampara escritorio",200);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara = repo.porId(3);
        System.out.println(lampara);

        System.out.println("============== lista db modificado =================");
        repo.listar("precio",ASC).forEach(System.out::println);

        System.out.println("============== eliminar =================");
        repo.eliminar(1);
        repo.listar().forEach(System.out::println);

        System.out.println("============== total =================");
        System.out.println("Total de registros: " + repo.total());
    }
}
