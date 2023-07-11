## Despliegue de apps Spring Boot en Heroku


1. Crear el archivo `system.properties` en el proyecto con el contenido:
```
java.runtime.version=17
```
2. Crear una cuenta en heroku.com y github.com
3. Tener configurado git en la pc
   1. `git config --global user.name "nombre de usuario local"`
   2. `git config --global user.email "email" `
4. Subir el proyecto a GitHub
5. Desde Heroku > crear app > elegit método GitHub > buscar el repositorio subido
6. Habilitar deploy automático y ejecutar el deploy


## Ejercicio 1

* Probar a empaquetar la aplicación con Maven package desde Itellij IDEA
* Desde terminal en Intellij IDEA verificar que se ejecuta correctamente con el comando:

```
java -jar target/spring-deploy-1.0.jar
```

* Crear un perfil para dev y otro para test con una propiedad nueva que carguemos en el controlador.

## Proveedores Cloud

* Heroku -- Java, Spring, PostgreSQL
* Netlify -- Frontend (React, Angular...)
* Vercel -- Frontend (React, Angular...)

