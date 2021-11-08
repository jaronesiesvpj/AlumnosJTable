/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnostablemodel;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jjaronesb01
 */
public class LogicaNegocio {
    
    public List<Alumno> listaAlumnos = new ArrayList<>();
    
    public LogicaNegocio(){
        
        listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Jose","DAM2"));
        listaAlumnos.add(new Alumno("Eduardo","DAM2"));
        listaAlumnos.add(new Alumno("Javier","DAM2"));
    }
    
    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
}
