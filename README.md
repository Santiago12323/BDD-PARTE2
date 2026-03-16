# BDD-Lab

Laboratorio práctico en Java para aplicar la metodología **Behavior-Driven Development (BDD)** mediante la automatización de pruebas web utilizando **Cucumber, Selenium WebDriver, PageFactory, Maven y Java 17+**.

---

# Objetivo

Implementar pruebas automatizadas basadas en comportamiento utilizando **Gherkin** y **Cucumber**, validando diferentes funcionalidades web mediante **Selenium WebDriver** ejecutándose en **modo headless**.

Este laboratorio demuestra cómo estructurar un proyecto BDD profesional con:

* Features escritas en lenguaje natural (Gherkin)
* Step Definitions implementadas en Java
* Automatización con Selenium WebDriver
* Uso del patrón **PageFactory**
* Ejecución automatizada con Maven
* Generación automática de **reportes HTML**

---

# Tecnologías Utilizadas

* Java 17+
* Maven
* Cucumber
* Selenium WebDriver
* PageFactory
* Chrome Headless

---

# Metodología Aplicada: BDD

El desarrollo sigue el flujo clásico de **Behavior-Driven Development**:

1. Definir el comportamiento esperado en **Gherkin (Feature)**
2. Implementar los **Step Definitions en Java**
3. Automatizar la interacción con la UI usando **Selenium WebDriver**
4. Ejecutar los escenarios con **Maven**
5. Validar los resultados mediante **reportes HTML**

---

# Estructura del Proyecto

```
src
 └── test
      ├── java
      │    └── com
      │         └── eci
      │              └── myproject
      │                   ├── pages
      │                   │  LoginPage.java         (ya existe)
      │                   │  AddRemovePage.java     (NUEVO)
      │                   │  AlertPage.java         (NUEVO)
      │                   │  InputsPage.java        (NUEVO)
      │                   └── steps
      │                      LoginSteps.java        (ya existe)
      │                      AddRemoveSteps.java    (NUEVO)
      │                      AlertSteps.java        (NUEVO)
      │                      InputsSteps.java       (NUEVO)
      │
      └── resources
           └── features
                login.feature         (ya existe)
                addremove.feature     (NUEVO)
                alert.feature         (NUEVO)
                inputs.feature        (NUEVO)

TestRunner.java
```

---

# Escenarios Implementados

## 1️⃣ alert.feature

```gherkin
Feature: JavaScript Alerts

Scenario: Accept JS alert
  Given I open the alerts page
  When I click the JS Alert button
  Then I accept the alert
```

---

## 2️⃣ Add Remove Elements

```gherkin
Feature: Add Remove Elements

Scenario: Add element and verify delete button
  Given I open the add remove page
  When I click the Add Element button
  Then the Delete button should appear
```

---

## 3️⃣ inputs.feature

```gherkin
Feature: Inputs field

Scenario: Enter a number
  Given I open the inputs page
  When I enter the number "10"
  Then the input value should be "10"
```

---

# Cómo ejecutar el laboratorio

Para ejecutar todas las pruebas automatizadas:

```bash
mvn clean test
```

Esto ejecutará todos los escenarios definidos en las **features**.

---

# Reporte de Resultados

Después de ejecutar las pruebas, Maven generará un **reporte HTML** con los resultados.

Ubicación del reporte:

```
target/HtmlReports/report.html
```

Este reporte muestra:

* Escenarios ejecutados
* Escenarios exitosos
* Errores encontrados
* Tiempo de ejecución

---

# Ejemplo de Ejecución

```bash
mvn clean test
```

Salida esperada:

```
Tests run: X
Failures: 0
Errors: 0
BUILD SUCCESS
```

---

# funcionamiento

---

