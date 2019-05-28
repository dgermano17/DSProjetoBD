package psv;
import java.sql.*;
import java.util.*;

public class CarroDAO {
    private Connection con; 

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
    public CarroDAO(Connection con){
        setCon(con);
    }       

    public String inserir(CarroBean carro){
        
        String sql = "insert into carro(placa,cor,descricao) values(?,?,?)";
        
        try{
            PrepareStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
        }
    }
}