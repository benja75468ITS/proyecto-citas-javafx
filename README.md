# Maqueta de Aplicación de Citas - JavaFX

Este proyecto es una maqueta funcional de la interfaz gráfica para una aplicación de citas, desarrollada con **JavaFX** y gestionada a través de **Maven**. Fue construida para la asignatura de Programación Avanzada de la Facultad de Ingeniería de la Universidad Autónoma de Campeche (UACAM).

El sistema se enfoca en la navegación por etapas, validación de diseño (UI/UX) con un estilo moderno, uso de tarjetas flotantes y gestión de sesión básica entre múltiples vistas.

## Estructura del Proyecto

El proyecto sigue la estructura estándar de Maven:

```text
proyecto-citas/
├── pom.xml                     # Configuración de Maven y dependencias (JavaFX)
├── README.md                   # Documentación del proyecto
├── screenshots/                # Capturas de pantalla de todas las vistas
└── src/
    └── main/
        ├── java/mx/uacam/fi/its/pa/
        │   ├── App.java                   # Clase principal de JavaFX
        │   ├── Launcher.java              # Clase lanzadora para evitar errores
        │   ├── controllers/               # Controladores de eventos
        │   └── utils/
        │       ├── SceneManager.java      # Gestor de vistas FXML
        │       └── Session.java           # Almacenamiento temporal 
        │
        └── resources/
            ├── css/
            │   └── styles.css             # Hoja de estilos principal
            ├── images/
            │   └── default.png            # Imagen por defecto
            └── views/                     # Archivos de interfaz visual
                ├── ContactForm.fxml
                ├── Inbox.fxml
                ├── MainFeed.fxml
                ├── Privacy.fxml
                ├── Profile.fxml
                └── Register.fxml
```

## Requisitos Previos
Para ejecutar este proyecto en tu entorno local, necesitas tener instalado:

Java Development Kit (JDK) 17 o superior.

Apache Maven.

Un IDE compatible con Java (Visual Studio Code, IntelliJ IDEA o Eclipse).

## Cómo descargar y ejecutar el proyecto
1. Clonar el repositorio
Abre tu terminal y ejecuta el siguiente comando para descargar el código a tu computadora:

##Bash
git clone https://github.com/TU_USUARIO/proyecto-citas-javafx.git

2. Abrir el proyecto
Abre la carpeta clonada en tu editor de código preferido (ej. Visual Studio Code). El IDE debería detectar automáticamente el archivo pom.xml y descargar las dependencias necesarias de JavaFX de forma automática.

3. Ejecutar la aplicación
Tienes dos opciones para iniciar la maqueta:

Opción A (Recomendada en VS Code): Ve al archivo src/main/java/mx/uacam/fi/its/pa/Launcher.java y presiona el botón Run (Ejecutar) desde tu editor.

Opción B (Por Terminal): Abre la terminal en la raíz del proyecto y utiliza el comando:

##Bash
mvn javafx:run
Características de la Interfaz
Flujo por etapas: Pantalla de privacidad, registro mínimo, feed principal, contacto, bandeja de entrada y perfil detallado.

Estilo visual: Tema claro, limpio y amigable, con tipografía robusta, bordes redondeados y uso de sombras suaves.

Integración de archivos: Uso de FileChooser nativo para la selección de imágenes de perfil.
