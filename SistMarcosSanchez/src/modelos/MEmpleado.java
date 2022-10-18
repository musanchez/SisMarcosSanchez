/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author User
 */
public class MEmpleado {
    private double salario;
    private String cargo;
    private String nombre;

    public MEmpleado(double salario, String cargo, String nombre) {
        this.salario = salario;
        this.cargo = cargo;
        this.nombre = nombre;
    }
    
    public void modificar_empleado() {
        switch (this.cargo) {
            case "Gerente":
                this.salario = 1.05 * this.salario;
                break;
            case "Asistente":
                this.salario = 1.1 * this.salario;
                break;
            case "Secretario":
                this.salario = 1.15 * this.salario;
        }   
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
