create database cadastro_pagamento;
use cadastro_pagamento;
create table tb_usuario(
	usuario_usuario varchar(20),
    usuario_senha varchar(20),
	primary key (usuario_usuario)
);
create table tb_boleto (
	boleto_cod int auto_increment,
    boleto_valor varchar(12),
    boleto_data_vencimento varchar(12),
    boleto_data_pagamento varchar(12),
    boleto_descricao varchar (500),
    fk_usuario_usuario varchar(20),
    foreign key (fk_usuario_usuario) references tb_usuario(usuario_usuario),
    primary key (boleto_cod)
    
);
create table tb_acrecimo(
	acrecimo_multa varchar(12),
    acrecimo_juros varchar(12),
    acrecimo_novo_valor varchar (12),
    fk_boleto_cod int,	
    foreign key (fk_boleto_cod) references tb_boleto(boleto_cod)
);
drop database cadastro_pagamento;
use cadastro_pagamento;
SELECT * FROM tb_boleto,tb_acrecimo where boleto_cod=fk_boleto_cod;
