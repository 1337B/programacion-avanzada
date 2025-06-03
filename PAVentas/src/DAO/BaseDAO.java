package DAO;
import Model.Response;

import java.sql.Connection;
import java.sql.SQLException;

// DAO fue una generalizacion de productoDAO, marcaDAO y categoriaDAO ya que usan los mismos metodos
// y tienen una estructura similar. Esto permite reutilizar el codigo y evitar la duplicacion
// entonces con la clase padre DAO podemos hacer especializaciones de las clases hijas
//Los hicimos abstractos para que no se puedan instanciar directamente
// y para que las clases hijas tengan que implementar los metodos abstractos.


public abstract class BaseDAO<T> implements ICrud<T>{

    // protected final Connection conn;
    protected Connection conn;

    // Constructor que recibe una conexión a la base de datos

    public BaseDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public abstract Response<T> create(T entity);

    @Override
    public abstract Response<T> update(T entity);

    @Override
    public abstract Response<T> delete(int id);

    @Override
    public abstract Response<T> read(int id);

    @Override
    public abstract Response<T> readAll();
}
