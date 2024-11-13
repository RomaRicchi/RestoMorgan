-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-11-2024 a las 16:18:14
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `restotf`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `idMesa` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `estado` tinyint(20) NOT NULL DEFAULT 1,
  `sector` varchar(30) NOT NULL,
  `situacion` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`idMesa`, `capacidad`, `estado`, `sector`, `situacion`) VALUES
(1, 4, 1, 'comedor', 'libre'),
(2, 4, 1, 'comedor', 'Libre'),
(3, 4, 0, 'comedor', 'libre'),
(4, 6, 1, 'comedor', 'libre'),
(5, 4, 1, 'comedor', 'Libre'),
(6, 4, 0, 'comedor', 'libre'),
(7, 4, 1, 'comedor', 'libre'),
(8, 4, 0, 'comedor', 'ocupada'),
(9, 2, 1, 'comedor', 'libre'),
(10, 4, 0, 'comedor', 'libre'),
(11, 2, 1, 'comedor', 'libre'),
(12, 2, 1, 'comedor', 'libre'),
(13, 2, 0, 'comedor', 'libre'),
(14, 4, 1, 'terraza', 'libre'),
(15, 4, 1, 'terraza', 'libre'),
(16, 4, 1, 'terraza', 'libre'),
(17, 4, 1, 'terraza', 'libre'),
(18, 4, 1, 'terraza', 'libre'),
(19, 4, 1, 'terraza', 'libre'),
(20, 4, 1, 'terraza', 'libre'),
(21, 4, 1, 'terraza', 'libre'),
(22, 4, 1, 'terraza', 'libre'),
(23, 4, 1, 'terraza', 'libre'),
(24, 4, 1, 'terraza', 'libre'),
(25, 4, 1, 'terraza', 'libre'),
(26, 4, 1, 'Patio', 'Libre'),
(27, 4, 0, 'Patio', 'Reservada'),
(28, 4, 1, 'Patio', 'Libre'),
(29, 4, 1, 'Patio', 'libre'),
(30, 4, 1, 'Patio', 'Libre'),
(31, 4, 1, 'Patio', 'libre'),
(32, 4, 1, 'Patio', 'libre'),
(33, 4, 0, 'Patio', 'libre'),
(34, 4, 1, 'Patio', 'Libre'),
(35, 4, 1, 'Patio', 'libre'),
(36, 4, 1, 'Patio', 'libre'),
(37, 4, 1, 'Patio', 'Libre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `idMesero` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `dni` int(20) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fechaRegistro` date DEFAULT curdate(),
  `turno` varchar(20) NOT NULL,
  `sector` varchar(20) NOT NULL,
  `estado` tinyint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`idMesero`, `nombre`, `dni`, `telefono`, `email`, `fechaRegistro`, `turno`, `sector`, `estado`) VALUES
(1, 'Juan Pérez', 12345678, '1234-5678', 'juan.perez@mail.com', '2024-10-21', 'mañana', 'Terraza', 1),
(2, 'Ana López', 87654321, '4321-8765', 'ana.lopez@mail.com', '2024-10-21', 'tarde', 'Patio', 1),
(3, 'Carlos García', 11223344, '45666777', NULL, '2024-10-21', 'mañana', 'comedor', 1),
(4, 'María Fernández', 55667788, '5566-7788', 'maria.fernandez@mail.com', '2024-10-21', 'tarde', 'Terraza', 1),
(5, 'Sofía Ramírez', 33445566, '3344-5566', 'sofia.ramirez@mail.com', '2024-10-21', 'mañana', 'Patio', 1),
(6, 'Pedro Gómez', 77889900, '435645677', NULL, '2024-10-21', 'tarde', 'Patio', 1),
(7, 'Matias Alvarez', 4134576, '266343234', 'matiSo@gmail.com', '2024-10-26', 'tarde', 'Comedor', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `idMesa` int(11) DEFAULT NULL,
  `idMesero` int(11) DEFAULT NULL,
  `fechaHora` datetime DEFAULT current_timestamp(),
  `estado` tinyint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `idMesa`, `idMesero`, `fechaHora`, `estado`) VALUES
(1, 1, 2, '2024-10-21 17:23:41', 1),
(2, 3, 1, '2024-10-21 17:23:41', 1),
(3, 2, 4, '2024-10-21 17:23:41', 1),
(4, 5, 3, '2024-10-21 17:23:41', 1),
(5, 2, 1, '2024-10-20 13:45:00', 0),
(6, 1, 3, '2024-10-19 20:30:00', 0),
(7, 4, 2, '2024-10-19 14:15:00', 0),
(8, 3, 4, '2024-10-21 12:00:00', 0),
(9, 5, 2, '2024-10-21 14:30:00', 0),
(10, 4, 1, '2024-10-21 19:00:00', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidoproducto`
--

CREATE TABLE `pedidoproducto` (
  `idPedidoProducto` int(11) NOT NULL,
  `idPedido` int(11) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  `subtotal` decimal(10,2) NOT NULL,
  `estado` tinyint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedidoproducto`
--

INSERT INTO `pedidoproducto` (`idPedidoProducto`, `idPedido`, `idProducto`, `cantidad`, `subtotal`, `estado`) VALUES
(1, 1, 2, 3, 900.00, 1),
(2, 1, 4, 2, 1600.00, 1),
(3, 2, 1, 1, 500.00, 1),
(4, 2, 3, 2, 1000.00, 1),
(5, 3, 5, 1, 1200.00, 1),
(6, 3, 2, 2, 600.00, 0),
(7, 4, 4, 1, 800.00, 1),
(8, 4, 1, 4, 2000.00, 1),
(9, 5, 3, 3, 1500.00, 1),
(10, 5, 5, 1, 1200.00, 0),
(11, 4, 31, 4, 3000.00, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `codigo` int(10) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` double(10,2) NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `codigo`, `nombre`, `tipo`, `descripcion`, `precio`, `stock`, `estado`) VALUES
(1, 101, 'Cerveza Artesanal', 'bebida', 'Cerveza artesanal de la casa, 500ml', 500.00, 50, 1),
(2, 102, 'Gaseosa', 'bebida', 'Gaseosa cola, botella de 500ml', 300.00, 100, 1),
(3, 103, 'Café Espresso', 'bebida', 'Café espresso intenso de 60ml', 250.00, 30, 1),
(4, 104, 'Mojito', 'trago', 'Cóctel clásico de ron con menta, 350ml', 800.00, 20, 1),
(5, 105, 'Whisky', 'trago', 'Whisky escocés añejo, vaso de 60ml', 1200.00, 15, 1),
(6, 106, 'Tostadas con Mermelada', 'desayuno', 'Tostadas de pan integral con mermelada casera', 350.00, 20, 1),
(7, 107, 'Huevos Revueltos', 'desayuno', 'Huevos revueltos con queso y especias', 450.00, 25, 1),
(8, 108, 'Yogur con Granola', 'desayuno', 'Yogur natural con granola y frutas frescas', 400.00, 10, 1),
(9, 109, 'Pizza Margherita', 'almuerzo', 'Pizza con salsa de tomate, mozzarella y albahaca', 1200.00, 10, 1),
(10, 110, 'Hamburguesa Completa', 'almuerzo', 'Hamburguesa con queso, lechuga, tomate y papas fritas', 1500.00, 15, 1),
(11, 111, 'Ensalada César', 'almuerzo', 'Ensalada con lechuga, pollo, crutones y aderezo César', 800.00, 12, 1),
(12, 112, 'Bife de Chorizo', 'cena', 'Corte de carne a la parrilla, acompañado de papas', 2000.00, 8, 1),
(13, 113, 'Pasta Carbonara', 'cena', 'Pasta con salsa carbonara de huevo y panceta', 1300.00, 10, 0),
(14, 114, 'Peceto a la Plancha', 'cena', 'Peceto a la plancha con ensalada de vegetales', 1800.00, 5, 0),
(15, 115, 'Margarita', 'trago', 'Cóctel de tequila, lima y sal, 300ml', 900.00, 20, 0),
(16, 116, 'Gin Tonic', 'trago', 'Cóctel de gin con agua tónica y limón, 350ml', 850.00, 25, 1),
(17, 117, 'Limonada', 'bebida', 'Limonada natural con menta, 400ml', 350.00, 40, 1),
(18, 118, 'Té Helado', 'bebida', 'Té helado con limón, 350ml', 300.00, 50, 1),
(19, 119, 'Smoothie de Fresa', 'bebida', 'Smoothie de fresa con yogurt, 300ml', 450.00, 25, 1),
(20, 120, 'Jugo de Naranja', 'bebida', 'Jugo de naranja recién exprimido, 350ml', 400.00, 20, 1),
(21, 121, 'Agua Mineral', 'bebida', 'Agua mineral sin gas, botella de 500ml', 200.00, 100, 1),
(22, 122, 'Panqueques con Miel', 'desayuno', 'Panqueques con miel y frutas frescas', 500.00, 15, 1),
(23, 123, 'Croissant', 'desayuno', 'Croissant recién horneado con mantequilla', 300.00, 30, 1),
(24, 124, 'Bagel con Queso Crema', 'desayuno', 'Bagel tostado con queso crema', 350.00, 20, 1),
(25, 125, 'Sándwich de Jamón y Queso', 'desayuno', 'Sándwich de jamón y queso en pan integral', 450.00, 25, 1),
(26, 126, 'Omelette de Verduras', 'desayuno', 'Waffles de chocolate', 600.00, 10, 1),
(27, 127, 'Sopa de Verduras', 'almuerzo', 'Sopa caliente de verduras frescas', 600.00, 12, 1),
(28, 128, 'Burrito de Pollo', 'almuerzo', 'Burrito de pollo con guacamole y frijoles', 1000.00, 15, 1),
(29, 129, 'Wrap Vegetariano', 'almuerzo', 'Wrap con verduras asadas y hummus', 850.00, 10, 1),
(30, 130, 'Pasta Alfredo', 'almuerzo', 'Pasta con salsa Alfredo y pollo', 1300.00, 8, 1),
(31, 131, 'Sándwich de Atún', 'almuerzo', 'Sándwich de atún con lechuga y tomate', 750.00, 20, 1),
(32, 132, 'Risotto de Champiñones', 'cena', 'Risotto cremoso de champiñones', 1800.00, 7, 1),
(33, 133, 'Pollo al Curry', 'cena', 'Pollo al curry con arroz basmati', 1600.00, 10, 1),
(34, 134, 'Tacos de Carne', 'cena', 'Tacos de carne con pico de gallo', 1200.00, 12, 1),
(35, 135, 'Salmón Teriyaki', 'cena', 'Salmón con salsa teriyaki y arroz', 2000.00, 5, 1),
(36, 136, 'Enchiladas', 'cena', 'Enchiladas de pollo con salsa roja', 1400.00, 8, 1),
(196, 5467678, 'Andes 1L', 'Bebida', 'cerveza rubia 1000ml', 2000.00, 24, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idMesa` int(11) DEFAULT NULL,
  `nombreCliente` varchar(50) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `comensales` int(11) NOT NULL,
  `sector` varchar(10) NOT NULL,
  `fechaHora` datetime NOT NULL,
  `estado` tinyint(2) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `idMesa`, `nombreCliente`, `telefono`, `comensales`, `sector`, `fechaHora`, `estado`) VALUES
(1, 26, 'Paola Argento a', '7867868', 3, 'Patio', '2024-11-04 13:20:00', 0),
(2, 27, 'Pepe Argento', '5645656454', 3, 'Patio', '2024-11-04 12:18:00', 0),
(3, 30, 'Coky Argento ', '654677880', 1, 'Patio', '2024-11-04 12:35:57', 0),
(4, 34, 'Moni Argento', '78678678', 3, 'Patio', '2024-11-04 15:16:47', 1),
(5, 28, 'MElena Fuseneco', '7876896798', 0, 'Patio', '2024-11-04 15:29:32', 1),
(6, 37, 'Pedro', '354346', 2, 'Patio', '2024-11-05 08:41:00', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`idMesa`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`idMesero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD UNIQUE KEY `telefono` (`telefono`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idMesa` (`idMesa`),
  ADD KEY `idMesero` (`idMesero`);

--
-- Indices de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD PRIMARY KEY (`idPedidoProducto`),
  ADD KEY `idPedido` (`idPedido`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD UNIQUE KEY `nombre` (`nombre`),
  ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD UNIQUE KEY `nombre_telefono` (`nombreCliente`,`telefono`) USING BTREE,
  ADD UNIQUE KEY `unica_reserva` (`idMesa`,`fechaHora`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `idMesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `idMesero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  MODIFY `idPedidoProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=197;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`idMesero`) REFERENCES `mesero` (`idMesero`);

--
-- Filtros para la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD CONSTRAINT `pedidoproducto_ibfk_1` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  ADD CONSTRAINT `pedidoproducto_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
