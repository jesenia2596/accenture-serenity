# 🧪 Prueba Frontend - Automatización con Serenity BDD

## 📌 Descripción

Este proyecto contiene la automatización de pruebas funcionales para flujos de frontend utilizando **Serenity BDD**, siguiendo buenas prácticas de BDD (Behavior Driven Development) y enfoque orientado a negocio.

Se validan escenarios clave como:

* Gestión de pedidos
* Validación de flujos exitosos y fallidos
* Experiencia del usuario en la ejecución de los flujos

---

## ⚙️ Tecnologías utilizadas

* Java 21
* Gradle
* Serenity BDD
* Cucumber (Gherkin)
* Selenium WebDriver

---

## 🚀 Cómo ejecutar el proyecto

### 1. Clonar repositorio

```bash
git clone <URL_DEL_REPO>
cd PruebaFrontend
```

### 2. Ejecutar pruebas

```bash
./gradlew clean test
```

o en Windows:

```bash
gradlew.bat clean test
```

---

## 📊 Generar reportes

Una vez ejecutadas las pruebas:

```bash
./gradlew serenityReport
```

Los reportes se generan en:

```
target/site/serenity/index.html
```

---

## 🧪 Estructura del proyecto

```
src
 ├── test
 │   ├── java
 │   │   ├── runners
 │   │   ├── steps
 │   │   ├── tasks
 │   │   └── questions
 │   └── resources
 │       └── features
```

* **features** → escenarios en Gherkin
* **steps** → definición de pasos
* **tasks** → acciones del usuario (Screenplay)
* **questions** → validaciones

---

## ✅ Buenas prácticas aplicadas

* Separación clara entre lógica de negocio y automatización
* Uso del patrón Screenplay
* Escenarios orientados a comportamiento (no implementación)
* Validaciones funcionales y de experiencia de usuario

---

## 👨‍💻 Autor

Proyecto desarrollado como parte de una prueba técnica de automatización QA.
