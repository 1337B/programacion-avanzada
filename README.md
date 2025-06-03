# Programación Avanzada

Este repositorio contiene **PAVentas**, un proyecto de ejemplo escrito en Java que implementa un sistema básico de gestión de productos haciendo uso del patrón DAO y de un pequeño modelo de dominio.

## Estructura

```
PAVentas/
├── src/
│   ├── DAO/           # Interfaces y clases de acceso a datos
│   ├── Model/         # Entidades del dominio y utilidades
│   └── Main.java      # Clase principal de prueba
└── .idea/             # Archivos de configuración de IntelliJ
```

En la carpeta `src` encontrarás las implementaciones de `Product`, `Brand`, `Category` y otras clases relacionadas, así como `DBConn`, la cual gestiona la conexión a una base de datos PostgreSQL.

## Requisitos

- JDK instalado (el proyecto se creó con IntelliJ y puede abrirse directamente con esta herramienta).
- PostgreSQL ejecutándose de forma local en `localhost:5432` según la configuración indicada en `Model/DBConn.java`.

## Compilación y ejecución

1. Abre el proyecto en tu IDE favorito o compila desde consola usando `javac` sobre los archivos dentro de `src`.
2. Ajusta las credenciales de base de datos en `Model/DBConn.java` si es necesario.
3. Ejecuta la clase `Main` para realizar pruebas simples.

Este proyecto está orientado a propósitos educativos dentro de la materia de Programación Avanzada.
