/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.aop.servicio;

import cr.ac.una.aop.entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author allamchaves
 */
@Component
public class PersonaService {
    
    public Persona getPersonaById(Integer employeeId) {
        System.out.println("Method getPersonaById() called");
        return new Persona();
    }
 
    public List<Persona> getAllPersona() {
        System.out.println("Method getAllPersona() called");
        return new ArrayList<Persona>();
    }
 
    public void createPersona(Persona persona) {
        System.out.println("Method createPersona() called");
    }
 
    public void deletePersona(Integer personaId) {
        System.out.println("Method deletePersona() called");
    }
 
    public void updatePersona(Persona persona) {
        System.out.println("Method updatePersona() called");
    }
    
}
