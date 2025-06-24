package GameData;

import java.util.*;
import java.sql.*;

public class SqlFetchData
{
    private String query;

    String connectionString = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=gameSample;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

    public SqlFetchData(String query)
    {
        setQuery(query);
    }

    public List<String> fetchData()
    {
        List<String> data = new LinkedList<>();
        try (Connection conn = DriverManager.getConnection(connectionString)){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                data.add(rs.getString(2) + "|" +  rs.getString(3) + "|" +  rs.getString(4) + "|" +  rs.getString(5) + "|" +  rs.getString(6) + "|" +  rs.getString(7) + "|" + rs.getDouble(8));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}
