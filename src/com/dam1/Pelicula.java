package com.dam1;

public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;


    public Pelicula() {
    }

    public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
