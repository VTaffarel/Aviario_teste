package Classes;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaiaDAO {

	 public void cadastrarBaia(Baia baia){

		 // mudar isso
	        String sql = "INSERT INTO BAIA (QUANTIDADEDEGALINHAS) VALUES (?)";
	  
	        PreparedStatement ps = null;

	        try {
	            ps = Conexao.getConexao().prepareStatement(sql);
	            ps.setInt(1, baia.getQuantidadedegalinhas());
	           

	            ps.execute();
	            ps.close();
	          


	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	       
	    
	  
	    }
	
}
