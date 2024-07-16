package com.programaone.forohub.security;
import com.programaone.forohub.usuario.Usuario;
import com.programaone.forohub.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (usuarioRepository.findByUsername("usuario") == null) {
            Usuario usuario = new Usuario();
            usuario.setUsername("usuario");
            usuario.setPassword(passwordEncoder.encode("123456"));
            usuarioRepository.save(usuario);
            System.out.println("Usuario de prueba creado");
        }
    }
}