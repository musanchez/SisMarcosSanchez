/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.MEmpleado;

/**
 *
 * @author User
 */
public class Empleados {
    private ArrayList<MEmpleado> registro = new ArrayList<>();

    public Empleados() {
    }

    public Empleados(ArrayList<MEmpleado> registro) {
        this.registro = registro;
    }
    
    public void agregarEmpleado(double salario, String cargo, String nombre) {
        MEmpleado emp = new MEmpleado(salario, cargo, nombre);
        this.registro.add(emp);
    }

    public ArrayList<MEmpleado> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<MEmpleado> registro) {
        this.registro = registro;
    }
    
    public DefaultTableModel getListEmp() {
        DefaultTableModel dtm = new DefaultTableModel();
        String titulo[] = {"Nombres", "Cargos", "Salarios"};
        // Asigna los encabezados a mi tabla
        dtm.setColumnIdentifiers(titulo);
        
        for (MEmpleado emp: registro) {
            String reg[] = new String[3];
            reg[0] = emp.getNombre();
            reg[1] = emp.getCargo();
            reg[2] = ""+emp.getSalario();
            dtm.addRow(reg);
        }        
        return dtm;
    }
}
