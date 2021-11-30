package com.dam1;

public class Multimedia {
 private String titulo;
 private String autor;
 private String formato;
 private int duracion;

 public Multimedia() {
 }

 public Multimedia(String titulo, String autor, String formato, int duracion) {
  this.titulo = titulo;
  this.autor = autor;
  this.formato = formato;
  this.duracion = duracion;
 }

 public void setTitulo(String titulo) {
  this.titulo = titulo;
 }

 public void setAutor(String autor) {
  this.autor = autor;
 }

 public void setFormato(String formato) {
  this.formato = formato;
 }

 public void setDuracion(int duracion) {
  this.duracion = duracion;
 }

 @Override
 public String toString() {
  return
          "titulo='" + titulo + '\'' +
          ", autor='" + autor + '\'' +
          ", formato='" + formato + '\'' +
          ", duracion=" + duracion;
 }
}
