# RealisticVillagers-Drake

Fork operativo de DrakesCraft para Purpur 1.21.11.

## Alcance de produccion

- Compila solo los modulos `core`, `v1_21_11` y `dist`.
- Requiere `packetevents-spigot 2.13.0` o superior.
- La configuracion de DrakesCraft limita los aldeanos interactivos a `SpawnWarps`.
- No asigna familias, no crea golems y no modifica granjas de aldeanos existentes.

## Skins de jugadores

El plugin puede usar sus skins humanas incluidas. Clonar skins de cuentas reales
requiere una clave privada de MineSkin; esa clave debe guardarse fuera de Git y
nunca en este repositorio.

## Despliegue

Copiar el JAR final como `plugins/RealisticVillagers-Drake-1.21.11.jar`, respaldar
antes `plugins/RealisticVillagers/config.yml` y aplicar ambos cambios solo en un
reinicio programado. No usar archivos `.next`.
