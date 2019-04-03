-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.1.38-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para crm
CREATE DATABASE IF NOT EXISTS `crm` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `crm`;

-- Copiando estrutura para tabela crm.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `sobrenome` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `cpf` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL,
  `data_nasc` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `endereco` varchar(300) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bairro` varchar(120) COLLATE utf8_unicode_ci DEFAULT NULL,
  `regiao` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `telefone` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `celular` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `comentario` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela crm.cliente: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Copiando estrutura para tabela crm.emails
CREATE TABLE IF NOT EXISTS `emails` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `assunto` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `conteudo` text COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela crm.emails: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `emails` DISABLE KEYS */;
/*!40000 ALTER TABLE `emails` ENABLE KEYS */;

-- Copiando estrutura para tabela crm.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `sobrenome` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `login` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `senha` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela crm.usuario: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT IGNORE INTO `usuario` (`id`, `nome`, `sobrenome`, `login`, `senha`) VALUES
	(1, 'Ozéias', 'Correa', 'ozeias', 'MTIzNDU2');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
