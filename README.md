\# 📣 MiForo - API REST con Spring Boot



MiForo es una API REST desarrollada como parte de un desafío de estudio en la plataforma Alura. Su objetivo es replicar el backend de un sistema de foros, permitiendo a los usuarios realizar operaciones CRUD sobre tópicos (temas de discusión).



\## 🚀 Funcionalidades



Esta API permite:



\- ✅ Crear un nuevo tópico

\- 📋 Listar todos los tópicos creados

\- 🔍 Visualizar un tópico específico por ID

\- ✏️ Actualizar un tópico existente

\- 🗑️ Eliminar un tópico



\## 🛠️ Tecnologías utilizadas



\- Java 17+

\- Spring Boot

\- Spring Data JPA

\- Spring Security (autenticación/autorización)

\- Hibernate

\- PostgreSQL (puede adaptarse a otra DB)

\- Maven

\- Lombok



\## 🔐 Seguridad



\- Implementación de autenticación y autorización con Spring Security.

\- Acceso restringido a ciertas rutas según rol/permisos del usuario.



\## ✅ Validaciones



Las entradas de datos están validadas conforme a las reglas de negocio, garantizando la integridad y coherencia de la información.



\## 🗄️ Persistencia



Los tópicos se almacenan en una base de datos relacional utilizando JPA. Incluye operaciones eficientes de consulta, inserción, actualización y eliminación.



\## 📦 Instalación y ejecución



1\. \*\*Clona el repositorio:\*\*

   ```bash

   git clone https://github.com/tu-usuario/miforo.git



2\. Accede al directorio del proyecto:



cd miforo



3\. Configura la base de datos en application.properties o application.yml



4\. Compila y ejecuta la aplicación:

&nbsp;  ./mvnw spring-boot:run



5.- Accede a la API: Visita hhtp://localhost:8080



📄 Rutas principales

| Método | Endpoint | Descripción | 

| POST | /topicos | Crear nuevo tópico | 

| GET | /topicos | Listar todos los tópicos | 

| GET | /topicos/{id} | Obtener un tópico por ID | 

| PUT | /topicos/{id} | Actualizar tópico existente | 

| DELETE | /topicos/{id} | Eliminar tópico | 



🎓 Proyecto educativo

Este proyecto forma parte del programa de formación de Alura, enfocado en buenas prácticas de desarrollo, arquitectura de APIs REST, y seguridad de aplicaciones web.





📦 Ejemplos de Payloads

Aquí tienes algunos ejemplos para probar las rutas de la API usando herramientas como Postman, Insomnia o Swagger UI:



🔧 Crear un nuevo tópico (POST /topicos)

{

&nbsp; "titulo": "¿Qué es Java Streams?",

&nbsp; "mensaje": "Me gustaría entender mejor cómo funcionan los Streams en Java.",

&nbsp; "autor": "victor.dev",

&nbsp; "curso": "Java avanzado"

}





✏️ Actualizar un tópico (PUT /topicos/{id})

{

&nbsp; "titulo": "Streams en Java",

&nbsp; "mensaje": "Actualizo la pregunta para incluir ejemplos prácticos."

}





📚 Documentación con Swagger

Esta API está documentada utilizando Swagger con SpringDoc OpenAPI. Para ver la documentación interactiva:

🔗 http://localhost:8080/swagger-ui/index.html

La interfaz Swagger te permitirá:

\- Probar endpoints directamente desde el navegador

\- Visualizar tipos de datos esperados (RequestBody, ResponseBody)

\- Ver posibles códigos de respuesta y errores











