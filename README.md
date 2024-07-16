# ForoHub

ForoHub es una API REST para gestionar tópicos en un foro. Permite crear, leer, actualizar y eliminar tópicos, y está protegida con autenticación JWT.

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/paulodelosrey/forohub.git
   cd forohub
   ```

2. Configura el entorno de desarrollo:
   - Asegúrate de tener Java 17 y Maven instalados.
   - Configura tu base de datos PostgreSQL y actualiza `application.properties` con tus credenciales.

3. Instala las dependencias:
   ```bash
   mvn clean install
   ```

## Uso

### Endpoints

- **GET /topicos**: Lista todos los tópicos.
- **GET /topicos/{id}**: Obtiene un tópico específico.
- **POST /topicos**: Crea un nuevo tópico.
- **PUT /topicos/{id}**: Actualiza un tópico existente.
- **DELETE /topicos/{id}**: Elimina un tópico.

### Autenticación

1. Obtén un token JWT:
   - Haz una solicitud POST a `/login` con el siguiente cuerpo:
     ```json
     {
       "username": "usuario",
       "password": "123456"
     }
     ```

2. Usa el token en las solicitudes:
   - Incluye el token en el encabezado de autorización:
     ```
     Authorization: Bearer <tu-token-jwt>
     ```

## Contribución

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Haz commit de tus cambios (`git commit -m 'Agrega nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT.
```
