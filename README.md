# Biblioteca_POO_JAVA
Se creara una biblioteca usando la programación orientada a objetos y interfaces con Jframe en JAVA, en esta primera entrega será sin Bases de datos.

## CLASES:

**Autor**: Debe contar un autor con un nombre.

**Libro**: Debe contar con un ID, nombre, poder seleccionar o añadir un autor, mostrar una breve descripción, año de creación y categorías en las que se encuentra el libro.

**Biblioteca**: Hace de contenedor.

**Genero**: Permite enlazar un genero al libro.


 ## 1. ¿Que debe debe hacer la clase Autor?
  La clase Autor nos permite crear autores.

  Esta clase debe tener los siguientes atributos:
  - Nombre.
  - Descripción.

## 2. ¿Que debe hacer la clase Libro?
  La clase Autor nos permite crear libros.

  Esta clase debe tener los siguientes atributos::
  - Nombre.
  - Descripción.
  - Asignar un autor.
  - Asignar genero/s.

  Opcional:
  - Portada

## 3. ¿Que debe hacer la clase Biblioteca?
  Esta clase almacenara la lógica, incluyendo gestión de las listas que la componen y la parte visual de nuestro proyecto.

   ### Requisitos:

  #### Crear Autor:
  ##### Funcionales:
  - Existencia de un autor anónimo, autor único existente desde principio.
  - Solicitar nombre.
  - Solicitar descripción.

  ##### No funcionales:
  - Mensaje de "creación exitosa del autor".
  - Mensaje de "creación errónea del autor".
  
  #### Crear Genero:
  ##### Funcionales:
  - Solicitar nombre.
  - Solicitar descripción.

  ##### No funcionales:
  - Mensaje de "creado correctamente".
  - Mensaje de "creado incorrectamente".
  - Asignar un color.

  #### Crear Libro:
  ##### Funcionales:
  - Solicitar nombre.
  - Solicitar descripción.
  - Solicitar asignación de autor.
  - Solicitar asignación de genero/s.

  ##### No funcionales:
  - Mensaje de "creado correctamente".
  - Mensaje de "creado incorrectamente".

  #### Búsqueda:
  ##### Funcionales:
  - Búsqueda por nombre del libro.
  - Búsqueda por autor del libro.
  
  ##### No funcionales:
  - Organizar por nombre.
  - mensaje de "Búsqueda exitosa".
  - Mensaje de "No se encontraron resultados".

  #### Editar
  ##### Funcionales:
  - Editar los atributos de la clase Libro, Genero y Autor.

  #### Borrar
  - Eliminar un autor, genero o libro.
  - Si se borra un autor se borraran sus libros.
  - Si se borra un libro, no afectara al resto.
  - Si se borra un genero, no afectara al resto.
  - El autor anónimo no podrá ser eliminado.
  
  ##### No funcionales
  -Eliminar autores, géneros o libros en conjunto
  - Mensaje de que se borro correctamente.
  - Mensaje de que no se pudo borrar.

  #### Inicio
  ##### Funcionales
  - Vista de los libros que alberga.

  ##### No funcionales:
  Ordenar los libros alfabéticamente.


## 4. ¿Que debe hacer la clase Genero?
  La clase Autor nos permite crear géneros.

  Esta clase debe tener los siguientes atributos:
  - Nombre.
  - Descripción.

  Opcional:
  - color