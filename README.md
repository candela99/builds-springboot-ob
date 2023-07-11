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
