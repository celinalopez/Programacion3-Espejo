# Endpoints de la API

## Profesores

| Método | Endpoint      | Descripción                 | Ejemplo de body                                        |
| :----- | :------------ | :-------------------------- | :----------------------------------------------------- |
| `POST` | `/profesores` | Crear un nuevo profesor     | `{ "nombre": "Juan Pérez", "email": "juan@mail.com" }` |
| `GET`  | `/profesores` | Listar todos los profesores | —                                                      |


## Estudiantes

| Método | Endpoint                   | Descripción                                          | Ejemplo de body                            |
| :----- | :------------------------- | :--------------------------------------------------- | :----------------------------------------- |
| `POST` | `/estudiantes`             | Crear un nuevo estudiante                            | `{ "nombre": "Ana", "matricula": "A123" }` |
| `GET`  | `/estudiantes`             | Listar todos los estudiantes                         | —                                          |
| `GET`  | `/estudiantes/{id}/cursos` | Listar los cursos donde está inscripto un estudiante | —                                          |


## Cursos

| Método   | Endpoint                                              | Descripción                                                | Ejemplo de body                                                                              |
| :------- | :---------------------------------------------------- | :--------------------------------------------------------- | :------------------------------------------------------------------------------------------- |
| `POST`   | `/cursos`                                             | Crear un nuevo curso con profesor y estudiantes existentes | `{ "nombre": "Programación Java", "profesor": { "id": 1 }, "estudiantes": [ { "id": 1 } ] }` |
| `GET`    | `/cursos`                                             | Listar todos los cursos                                    | —                                                                                            |
| `GET`    | `/cursos/{id}`                                        | Obtener un curso por su ID                                 | —                                                                                            |
| `DELETE` | `/cursos/{id}`                                        | Eliminar un curso por su ID                                | —                                                                                            |
| `POST`   | `/cursos/{cursoId}/agregar-estudiante/{estudianteId}` | Agregar un estudiante existente a un curso existente       | —                                                                                            |
