package DAO;
import Model.Product;
import Model.Response;
import Model.Brand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// DAO Data Access Object

// This class is responsible for managing the data access operations for Product entities
// It extends the abstract DAO class and implements the necessary methods for CRUD operations

public class ProductDAO extends BaseDAO<Product> {

    // Con super llama al constructo de la
    // clase padre, osea de BaseDAO
    // y le pasa la conexion a la base de datos

    public ProductDAO(Connection conn) {
        super(conn);
    }

    @Override
    public Response<Product> create(Product entity) {
        String sql = "INSERT INTO products (price, name, brand_id, category_id, image_url, stock) VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, entity.getPrice());
            ps.setString(2, entity.getName());
            ps.setInt(3, entity.getBrand().getBrandId());
            ps.setInt(4, entity.getCategory().getCategoryId());
            ps.setString(5, entity.getImage().toString());
            ps.setInt(6, entity.getStock());

            int rowsAffected = ps.executeUpdate();
            return new Response<>(true, "Product created successfully", 200);

        } catch (SQLException e) {
            return new Response<>(false, e.getMessage(), 400);
        }
    }

    @Override
    public Response<Product> update(Product entity) {
        return null;
    }

    @Override
    public Response<Product> delete(int id) {
        return null;
    }

    @Override
    public Response<Product> read(int id) {
        return null;
    }

    @Override
    public Response<Product> readAll() {
        return null;
    }
}
