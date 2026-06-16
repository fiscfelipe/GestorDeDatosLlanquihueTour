# Gestor De Datos Llanquihue Tour

## Descripción

Gestor de datos Llanquihue Tour es un programa desarrollado en Java que permite cargar información de tours turísticos desde un archivo de texto (.txt), crear objetos de tipo Tour y almacenarlos en una colección ArrayList.

El programa muestra todos los tours que ofrece la compañía y filtra los que no tienen stock, simulando una gestión básica de catálogo para una agencia de turismo.

## Estructura del proyecto

```text
src/
├── data/
│   └── GestorDatos.java
├── model/
│   └── Tour.java
└── ui/
    └── Main.java

resources/
└── tours.txt
```

## Estructura del archivo tours.txt

Cada línea del archivo contiene la información de un tour separada por punto y coma (;):

```text
NombreTour;Tipo;Precio;Stock
```

Ejemplo:

```text
RutaLacustre;Aventura;25000;15
VolcanOsorno;Aventura;35000;8
SaboresDelSur;Gastronomico;18000;0
```

## Cómo ejecutar

1. Abrir el proyecto en NetBeans.
2. Verificar que el archivo `tours.txt` se encuentre en la carpeta `resources`.
3. Ejecutar la clase `Main`.
4. Revisar los resultados en la consola.
