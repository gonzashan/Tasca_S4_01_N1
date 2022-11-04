package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t01.n01.controllers;

public class ResponseEntity {

    private final String content;

    //Convertir en JSON el mensaje de retorno
    public ResponseEntity(String content) {

        this.content = content;
    }

    public String getContent() {
        return content;
    }

}