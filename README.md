# 🛠️ API REST - Gestión de Productos

Este es un proyecto backend construido con **Spring Boot 3 + Java 17** que permite gestionar productos (CRUD completo).  
La base de datos está alojada en **SQL Server dentro de una máquina virtual Ubuntu 20.04**.  
Se trata de una API REST pensada para integrarse con frontend en React o aplicaciones móviles.

---

## 📦 Características

- ✅ Crear, leer, actualizar y eliminar productos
- ✅ Validaciones con Jakarta Validation y DTOs
- ✅ Conexión remota a base de datos SQL Server en Ubuntu
- ✅ Probado con Postman
- ✅ Preparado para producción (estructura escalable)

---

## 💻 Tecnologías usadas

- Java 21  
- Spring Boot 3  
- Spring Data JPA  
- SQL Server  
- Jakarta Bean Validation  
- Postman  
- Git & GitHub  

---

## 📸 Capturas
### 📥 POST: Crear producto
![image](https://github.com/user-attachments/assets/b44f6e92-efc7-4883-854a-5454e65727a0)
### 📤 GET: Listar productos
![image](https://github.com/user-attachments/assets/e040e7e9-d9f1-4ad0-9e34-acfea68b8740)
### 🚫 Validación de campos
![image](https://github.com/user-attachments/assets/5836e66a-acd4-4eab-a057-0e1b2b4eaaa6)
![image](https://github.com/user-attachments/assets/c75bccce-695c-4b0d-bd9e-ac33ffe2d0ac)
## 🚀 Cómo ejecutar

1. Asegúrate de tener SQL Server corriendo y con la base de datos `GestionProductosDB`.
2. Clona este repositorio:
```bash
git clone https://github.com/marlondev/gestion-productos.git
```
3. Configura el archivo application.properties con tu IP y credenciales.
4. Ejecuta el proyecto desde IntelliJ o con:
```bash
./mvnw spring-boot:run
```
📬 Autor
Marlon Tarrillo
Portafolio en Netlify
marlontarrillo19@gmail.com
