package com.grupoatrium.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.grupoatrium.modelo.Libro;

public class appMain {

    public static void main(String[] args) {
        // Generar el contenedor de beans indicando el archivo xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        
        Libro l1 = context.getBean("libro1", Libro.class);
        System.out.println(l1);
        
                 
        // Crear el contenedor de beans a partir del archivo applicationContext.xml
        System.out.println(context.getBean("connectionMgr"));
     
     	     	
        //Clases que heredan
    	System.out.println(context.getBean("librosDAO"));
    	System.out.println(context.getBean("editorialesDAO"));
    	
           
    }

}