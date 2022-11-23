
--CRIAÇÃO DE SEQUENCES
CREATE SEQUENCE IF NOT EXISTS public.sq_sicontat
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

--CRIAÇÃO DA TABELA 
CREATE TABLE public.sicontat
(
    id bigint NOT NULL,
    nomcon character varying(200) NOT NULL,
    refere character varying(500),
    datnas timestamp without time zone,
    PRIMARY KEY (id)
);

COMMENT ON TABLE public.sicontat IS 'TABELA DE CONTATOS';
COMMENT ON COLUMN public.sicontat.id IS 'CÓDIGO';
COMMENT ON COLUMN public.sicontat.nomcon IS 'NOME DO CONTATO';
COMMENT ON COLUMN public.sicontat.refere IS 'REFERÊNCIA PARA LOCALIZAÇÃO';
COMMENT ON COLUMN public.sicontat.datnas IS 'DATA DE NASCIMENTO';