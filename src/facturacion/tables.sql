DROP TABLE IF EXISTS fact_detalle;
DROP TABLE IF EXISTS producto;

CREATE TABLE producto (
    id INT NOT NULL AUTO_INCREMENT,
    codigo VARCHAR(10) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)     
);

CREATE TABLE fact_detalle (
    id INT NOT NULL AUTO_INCREMENT,
    fact_cab_id INT NOT NULL,
    producto_id INT NOT NULL,
    cantidad INT NOT NULL,
    precio_unit DECIMAL(10,2) NOT NULL,
    iva DECIMAL(3,2),
    PRIMARY KEY(id),
    FOREIGN KEY (producto_id)
        REFERENCES producto(id) 
);

DELETE FROM producto;
INSERT INTO producto (codigo, nombre) VALUES ("PROD1", "Producto 1");
INSERT INTO producto (codigo, nombre) VALUES ("PROD2", "Producto 2");
INSERT INTO producto (codigo, nombre) VALUES ("PROD3", "Producto 3");

DELETE FROM fact_detalle;
INSERT INTO fact_detalle (fact_cab_id, producto_id, cantidad, precio_unit, iva) 
    VALUES (1, 1, 10, 5, 0.21);
INSERT INTO fact_detalle (fact_cab_id, producto_id, cantidad, precio_unit, iva) 
    VALUES (1, 2, 3, 8, 0.21);
INSERT INTO fact_detalle (fact_cab_id, producto_id, cantidad, precio_unit, iva) 
    VALUES (1, 3, 5, 15, 0.21);


