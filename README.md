
# Práctica 2: API REST para Gestión de Carritos

Este proyecto implementa una API REST simplificada para un servicio de e-commerce, desarrollada con **Spring Boot**. 
Permite realizar operaciones CRUD (Create, Read, Update, Delete) sobre un recurso `Carrito`.

## Contexto del Proyecto
El objetivo es modelar el ciclo de vida de una compra.
Cada carrito contiene un único producto.

## Tecnologías Utilizadas
* **Java** (23)
* **Spring Boot** 
* **Maven**


| Método | Ruta             | Descripción | Respuestas |
| :--- |:-----------------| :--- | :--- |
| **GET** | '/carritos'      | Listar todos los carritos | 200 OK |
| **GET** | '/carritos/{id}' | Buscar un carrito por ID | 200 OK, 404 Not Found (si el carrito no existe) |
| **POST** | '/carritos'      | Crear un nuevo carrito | 201 Created |
| **PUT** | '/carritos/{id}' | Actualizar un carrito | 200 OK, 404 Not Found (si no existe carrito con ese id) |
| **DELETE** | '/carritos/{id}' | Eliminar un carrito | 204 No Content |