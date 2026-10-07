# Práctica: Método de Gauss-Jordan (Unidad 3)

**Asignatura:** Métodos Numéricos  
**Unidad:** 3  
**Docente:** Mtro. Víctor Hugo Vásquez Herrera  
**Alumno:** Fernandez sangabriel Juan pablo  
**Institución:** Instituto Tecnológico Superior de Xalapa  
**Carrera:** Ingeniería en Sistemas Computacionales  

---

## 1. Estructura Modular del Proyecto

El programa está diseñado bajo el principio de reutilización de software y modularidad en Java:

* **`Gauss.java`**: Contiene el método de triangulación superior (`eliminacionGaussiana`) desarrollado en la práctica previa.
* **`GaussJordan.java`**: Invoca el proceso de triangulación de `Gauss`, realiza la normalización de la diagonal principal a 1 y ejecuta el barrido de coeficientes superiores para transformar la matriz en una matriz identidad.
* **`Main.java`**: Maneja el flujo del programa, la definición de la matriz de entrada y despliega la matriz reducida junto con el vector de soluciones.

---

## 2. Compilación y Ejecución

### Desde la Terminal (CMD / PowerShell / Bash):
1. Ubícate en la carpeta del proyecto:
   ```bash
   cd ruta/de/tu/proyecto


====================================================
  MÉTODOS NUMÉRICOS - PRÁCTICA: MÉTODO DE GAUSS-JORDAN
====================================================

--- Matriz Aumentada Original ---
  2.0000   1.0000  -1.0000 |   8.0000 
  3.0000  -1.0000   2.0000 |  -1.0000 
  1.0000   2.0000   3.0000 |   5.0000 

--- Matriz Reducida (Matriz Identidad) ---
  1.0000   0.0000   0.0000 |   1.6429 
 -0.0000   1.0000  -0.0000 |   3.5000 
  0.0000   0.0000   1.0000 |  -1.2143 

--- Solución Directa del Sistema ---
x1 =   1.6429
x2 =   3.5000
x3 =  -1.2143