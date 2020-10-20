package exceptions;

public class MonException extends Exception{

    private String message;

    public MonException() {
        message = "Il y a eu une erreur";
    }

    public MonException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MonException{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
