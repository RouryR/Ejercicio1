-- Crear la base de datos
DROP SCHEMA IF EXISTS ejerciciopractico_1;
DROP USER IF EXISTS 'usuario_practica'@'%';
CREATE DATABASE IF NOT EXISTS ejerciciopractico_1;
CREATE USER 'usuario_practica'@'%' IDENTIFIED BY 'la_Clave';
GRANT ALL PRIVILEGES ON ejerciciopractico_1.* TO 'usuario_practica'@'%';
FLUSH PRIVILEGES;

USE ejerciciopractico_1;


-- Crear la tabla estudiantes
CREATE TABLE IF NOT EXISTS estudiantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    identificacion VARCHAR(10),
    nivel_cursando VARCHAR(50),
    edad INT,
    altura DECIMAL(5, 2),
    peso DECIMAL(5, 2),
    genero VARCHAR(10),
    activo BOOL
);

-- Insertar registros en la tabla estudiantes
INSERT INTO estudiantes (nombre, identificacion, nivel_cursando, edad, altura, peso, genero, activo)
VALUES
    ('Juan', '1234567890', 'Noveno grado', 15, 1.65, 60.0, 'Masculino', true),
    ('Maria', '0987654321', 'Once grado', 17, 1.70, 55.5, 'Femenino', true),
    ('Pedro', '5678901234', 'Octavo grado', 14, 1.55, 50.2, 'Masculino', true),
    ('Ana', '4321098765', 'Once grado', 18, 1.68, 58.8, 'Femenino', true),
    ('Carlos', '9012345678', 'Noveno grado', 15, 1.72, 65.0, 'Masculino', true),
    ('Laura', '3456789012', 'Octavo grado', 14, 1.60, 48.5, 'Femenino', true),
    ('Luis', '6789012345', 'Noveno grado', 15, 1.75, 63.7, 'Masculino', true),
    ('Sofia', '2109876543', 'Once grado', 17, 1.63, 54.3, 'Femenino', true),
    ('Daniel', '4567890123', 'Octavo grado', 14, 1.70, 60.1, 'Masculino', true),
    ('Carolina', '7890123456', 'Once grado', 16, 1.65, 52.9, 'Femenino', true),
    ('Alejandro', '5432109876', 'Noveno grado', 15, 1.80, 70.2, 'Masculino', true),
    ('Valeria', '8765432109', 'Octavo grado', 14, 1.58, 47.3, 'Femenino', true),
    ('Gabriel', '1098765432', 'Once grado', 16, 1.72, 61.8, 'Masculino', true),
    ('Camila', '4321567890', 'Noveno grado', 15, 1.63, 56.4, 'Femenino', true),
    ('Andrés', '6789012345', 'Octavo grado', 14, 1.70, 63.2, 'Masculino', true);
