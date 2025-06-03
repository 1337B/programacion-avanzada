package Model;

import java.util.List;

public class Response<T> {
    private boolean success;
    private String message;
    private Integer code;
    private List<T> data;
    private T obj;

    public Response(boolean success, String message, Integer code) {
        this.success = success;
        this.message = message;
        this.code = code;
    }

    //La sobrecarga de constructores sirve para crear diferentes tipos de respuestas
    // dependiendo de si se espera un objeto único o una lista de objetos.
    // Esto permite una mayor flexibilidad al manejar las respuestas en la aplicación.

    public Response(boolean success, String message, Integer code, List<T> data) {
        this.success = success;
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public Response(boolean success, String message, Integer code, T obj) {
        this.success = success;
        this.message = message;
        this.code = code;
        this.obj = obj;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
