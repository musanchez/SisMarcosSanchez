/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author User
 */
public class MEdad {

    private int[] arreglo = new int[15];
    private int agregado;
    

    public MEdad(int agregado) {
        this.agregado = agregado;
    }
    public void agregarElemento(int elemento) {
        this.arreglo[this.agregado] = elemento;
    }
    public int getMayor() {
        int mayor = this.arreglo[0];
        for (int i = 0; i < this.agregado; i++) {
            if (mayor < this.arreglo[i]) {
                mayor = this.arreglo[i];
            }
        }
        return mayor;
    }

    public int getMenor() {
        int menor = this.arreglo[0];
        int i = 0;
        while (i < this.agregado) {
            if (menor > this.arreglo[i]) {
                menor = this.arreglo[i];
            }
            i++;
        }
        return menor;
    }

    public float promedio() {
        float promedio = 0;
        int i = 0;
        do {
            promedio += this.arreglo[i];
            i++;
        } while (i < this.agregado);
        promedio = promedio / this.agregado;
        return promedio;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getAgregado() {
        return agregado;
    }

    public void setAgregado(int agregado) {
        this.agregado = agregado;
    }

}
