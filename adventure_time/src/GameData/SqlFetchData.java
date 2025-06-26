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

            ResultSetMetaData meta = rs.getMetaData();
            int columnCount = meta.getColumnCount();

            while(rs.next())
            {
                StringBuilder row = new StringBuilder();

                for(int i = 2; i <= columnCount; i++)
                {
                    row.append(rs.getString(i));
                    if (i < columnCount)
                    {
                        row.append("|");
                    }
                }

                data.add(row.toString());
            }
        }
        catch(SQLException e) {
            System.err.println("Error: " + e.getMessage());
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
