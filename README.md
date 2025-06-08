# Empleados SOLID Java 🧠💼

Este proyecto es una simulación de un sistema de empleados desarrollado en Java aplicando los **principios SOLID**. Cada tipo de empleado tiene su propia lógica para calcular el sueldo total según su experiencia, días trabajados y bonificación.

## 📚 Tecnologías usadas

- Java 8+
- Programación Orientada a Objetos (POO)
- Interfaces
- Principios SOLID

## 🧱 Estructura del proyecto
src/
└── com.joelru/
├── Employed.java
├── Developer.java
├── Gerent.java
├── Diseñador.java
├── Sueldo.java
├── PayBonifice.java
└── Main.java

## ✅ Principios SOLID aplicados

| Principio | Descripción | Cómo se aplica |
|----------|-------------|----------------|
| S - Single Responsibility | Una clase debe tener una sola razón para cambiar | Cada clase tiene una única responsabilidad (calcular sueldo, representar un empleado, etc.) |
| O - Open/Closed | Abierto para extensión, cerrado para modificación | Se pueden agregar nuevos tipos de empleados sin modificar el código existente |
| L - Liskov Substitution | Las subclases deben poder sustituir a la clase base sin romper el comportamiento | `Developer`, `Gerent`, `Diseñador` funcionan correctamente como `Employed` |
| I - Interface Segregation | No forzar a implementar métodos innecesarios | Separación entre `Sueldo` y `PayBonifice` permite implementar solo lo necesario |
| D - Dependency Inversion | Depender de abstracciones, no implementaciones | El código usa interfaces como `Sueldo` para acceder al comportamiento de cada empleado |

## 🔍 Cómo ejecutar

1. Abre el proyecto en IntelliJ IDEA (u otro IDE Java).
2. Asegúrate de tener configurado un SDK Java 8+.
3. Ejecuta `Main.java`.

Deberías ver en consola el sueldo total calculado para diferentes tipos de empleados.

## 📦 Ejemplo de salida
255
263
258

(Dependiendo de la lógica interna de bonificación por tipo de empleado).

## 🤝 Contribuciones

¡Bienvenido a colaborar! Puedes enviar sugerencias, mejoras o pull requests.

## ⚖️ Licencia

MIT © 2025 [@thejoelru](https://github.com/joelru)
