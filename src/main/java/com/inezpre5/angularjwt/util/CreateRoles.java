package com.inezpre5.angularjwt.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.inezpre5.angularjwt.entity.Rol;
import com.inezpre5.angularjwt.enums.RolNombre;
import com.inezpre5.angularjwt.service.RolService;


/**
 * MUY IMPORTANTE: ESTA CLASE SÓLO SE EJECUTARÁ UNA VEZ PARA CREAR LOS ROLES.
 * UNA VEZ CREADOS SE DEBERÁ ELIMINAR O BIEN COMENTAR EL CÓDIGO
 *
 */

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
/*         Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolPersonal = new Rol(RolNombre.ROLE_PERSONAL);
        Rol rolAprendiz = new Rol(RolNombre.ROLE_APRENDIZ);
        Rol rolVigilante = new Rol(RolNombre.ROLE_VIGILANTE);
        Rol rolSubdirector = new Rol(RolNombre.ROLE_SUBDIRECTOR);
        Rol rolDirector = new Rol(RolNombre.ROLE_DIRECTOR);
        Rol rolMirador = new Rol(RolNombre.ROLE_MIRADOR);
        rolService.save(rolAdmin);
        rolService.save(rolPersonal);
        rolService.save(rolAprendiz);
        rolService.save(rolVigilante);
        rolService.save(rolSubdirector);
        rolService.save(rolDirector);
        rolService.save(rolMirador);
         */
    }
}
