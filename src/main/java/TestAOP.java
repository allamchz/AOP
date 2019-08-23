/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author allamchaves
 */
import cr.ac.una.aop.entidad.Persona;
import cr.ac.una.aop.servicio.PersonaService;
import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class TestAOP
{
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        PersonaService manager = context.getBean(PersonaService.class);
 
        manager.getPersonaById(1);
        manager.createPersona(new Persona());
    }
}