USE [CS_GO]
GO
/****** Object:  Table [dbo].[CAMPEONATOS]    Script Date: 25/11/2021 13:51:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CAMPEONATOS](
	[COD_CAMPEONATO] [int] NOT NULL,
	[NOME_CAMP] [varchar](100) NULL,
	[ESTRUTURA_CAMP] [varchar](100) NULL,
	[LOCAL_CAMP] [varchar](100) NULL,
	[NUM_TIMES_CAMP] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[FAZEM]    Script Date: 25/11/2021 13:51:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[FAZEM](
	[TIME_PARTIDA] [int] NOT NULL,
	[COD_TIME] [int] NOT NULL,
	[COD_PARTIDAS] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[JOGA]    Script Date: 25/11/2021 13:51:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[JOGA](
	[COD_JOGA] [int] NOT NULL,
	[DATA_INICIO] [datetime] NULL,
	[DATA_FIM] [datetime] NULL,
	[COD_PESSOA] [int] NOT NULL,
	[COD_TIME] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PAIS]    Script Date: 25/11/2021 13:51:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PAIS](
	[COD_PAIS] [int] NOT NULL,
	[NOME_PAIS] [varchar](100) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PARTICIPA]    Script Date: 25/11/2021 13:51:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PARTICIPA](
	[TIME_CAMPEONATO] [int] NOT NULL,
	[COD_CAMPEONATO] [int] NOT NULL,
	[COD_TIME] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PARTIDAS]    Script Date: 25/11/2021 13:51:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PARTIDAS](
	[COD_PARTIDAS] [int] NOT NULL,
	[DATAHORA_PARTIDA] [datetime] NULL,
	[RESULTADO_PARTIDA] [int] NOT NULL,
	[COD_CAMPEONATO] [int] NOT NULL,
	[TIME1] [varchar](100) NULL,
	[TIME2] [varchar](100) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PESSOA]    Script Date: 25/11/2021 13:51:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PESSOA](
	[COD_PESSOA] [int] NOT NULL,
	[NICKNAME_PESSOA] [varchar](100) NULL,
	[NOME_PESSOA] [varchar](100) NULL,
	[END_PESSOA] [varchar](100) NULL,
	[BAIRRO_PESSOA] [varchar](100) NULL,
	[CIDADE_PESSOA] [varchar](100) NULL,
	[ESTADO_PESSOA] [char](2) NULL,
	[CEP_PESSOA] [int] NOT NULL,
	[COD_PAIS] [int] NOT NULL,
	[SENHA_PESSOA] [varchar](100) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TIMES]    Script Date: 25/11/2021 13:51:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TIMES](
	[COD_TIME] [int] NOT NULL,
	[APELIDO_TIME] [varchar](100) NULL,
	[NOME_TIME] [varchar](100) NULL,
	[COD_PAIS] [int] NOT NULL,
	[JOGADOR1] [varchar](100) NULL,
	[JOGADOR2] [varchar](100) NULL,
	[JOGADOR3] [varchar](100) NULL,
	[JOGADOR4] [varchar](100) NULL,
	[JOGADOR5] [varchar](100) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TREINA]    Script Date: 25/11/2021 13:51:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TREINA](
	[COD_TREINA] [int] NOT NULL,
	[DATA_INICIO] [datetime] NULL,
	[DATA_FIM] [datetime] NULL,
	[COD_PESSOA] [int] NOT NULL,
	[COD_TIME] [int] NOT NULL
) ON [PRIMARY]
GO
