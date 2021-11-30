package com.dam1;

public class Disco extends Multimedia {
private String xenero;
public Disco(){

}

    public Disco(String titulo, String autor, String formato, int duracion, String xenero) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
