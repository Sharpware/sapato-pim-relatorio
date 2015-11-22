/* INSERT CLIENTES......... */
INSERT cliente (nome, email, cpf) VALUES ('CLIENTE01', 'CLIENTE01@CLIENTE01.com', '156.558.695-95');  -- 04
INSERT cliente (nome, email, cpf) VALUES ('CLIENTE02', 'CLIENTE02@CLIENTE02.com', '156.558.695-95');  -- 05
INSERT cliente (nome, email, cpf) VALUES ('CLIENTE03', 'CLIENTE03@CLIENTE03.com', '156.558.695-95');  -- 06
INSERT cliente (nome, email, cpf) VALUES ('CLIENTE04', 'CLIENTE04@CLIENTE04.com', '156.558.695-95');  -- 07
INSERT cliente (nome, email, cpf) VALUES ('CLIENTE05', 'CLIENTE05@CLIENTE05.com', '156.558.695-95');  -- 08
INSERT cliente (nome, email, cpf) VALUES ('CLIENTE06', 'CLIENTE06@CLIENTE06.com', '156.558.695-95');  -- 09
INSERT cliente (nome, email, cpf) VALUES ('CLIENTE07', 'CLIENTE07@CLIENTE07.com', '156.558.695-95');  -- 10
/* INSERT PRODUTOS ......... */
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO01', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 02
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO02', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 03
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO03', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 04
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO04', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 05
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO05', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 06
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO06', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 07
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO07', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 08
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO08', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 09
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO09', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 10
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO10', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 11
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO11', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 12
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO12', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 13
INSERT  produto (nome, marca, tamanho, codigo_barra, preco_custo) VALUES ('PRODUTO13', 'ZIGZIG', 'UNICO', '54645521115', '45.89') ;   -- 14
/*INSERT FUNCIONARIOS.........*/
INSERT funcionario (nome) VALUES ('Zé João'); -- 4
INSERT funcionario (nome) VALUES ('Alvarez'); -- 5
/* PARTE II DO INSERT .... VENDAS ..... */
INSERT venda (id_funcionario, id_cliente, data_venda, valor_total, tipo_venda) VALUES (4, 4,  '2015-11-18', '45.89', 'VENDA') ; -- 16
INSERT venda (id_funcionario, id_cliente, data_venda, valor_total, tipo_venda) VALUES (4, 6,  '2015-11-18', '91.78', 'VENDA') ; -- 17
INSERT venda (id_funcionario, id_cliente, data_venda, valor_total, tipo_venda) VALUES (5, 10, '2015-11-18', '137.67', 'VENDA') ; -- 18
/*PARTE III DO INSERT ITENS DAS VENDAS ...... */
INSERT itens_venda (quantidade, valor_total, id_produto, id_venda) VALUES ('1', '45.89', '03', '16'); -- 12
INSERT itens_venda (quantidade, valor_total, id_produto, id_venda) VALUES ('2', '91.78', '08', '17'); -- 13
INSERT itens_venda (quantidade, valor_total, id_produto, id_venda) VALUES ('1', '45.89', '10', '18'); -- 14
INSERT itens_venda (quantidade, valor_total, id_produto, id_venda) VALUES ('1', '45.89', '13', '18'); -- 15
INSERT itens_venda (quantidade, valor_total, id_produto, id_venda) VALUES ('1', '45.89', '14', '18'); -- 16
/**************************************************************************************************************************************************/

SELECT * FROM venda