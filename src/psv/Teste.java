package psv;
import java.sql.*;
import java.util.*;
import java.sql.Connection;


public class Teste {
    public static void main(String[] args){
    
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

        cb.setPlaca("JKK1900");
        cb.setCor("Azul");
        cb.setDescricao("Carro1");
        System.out.println(cd.inserir(cb));
    }
}
