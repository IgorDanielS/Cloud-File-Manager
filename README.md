API de Gerenciamento de Arquivos na Nuvem

Este projeto é uma API backend para upload, download e gerenciamento de arquivos armazenados em serviços de nuvem como AWS S3, Google Cloud Storage ou Azure Blob Storage. O objetivo é oferecer um sistema seguro, escalável e eficiente para manipulação de arquivos.

Funcionalidades

1. Autenticação e Autorização

Autenticação com JWT (JSON Web Token).

Controle de acesso com Spring Security.

Perfis de usuário (admin, user) para diferentes permissões.

2. Upload de Arquivos

Envio de arquivos para o bucket na nuvem.

Validação do tipo e tamanho do arquivo.

3. Download de Arquivos

Geração de URLs temporárias para download direto.

Restrições de acesso baseadas no perfil do usuário.

4. Gerenciamento de Arquivos

Listagem de arquivos armazenados no bucket.

Exclusão de arquivos.

Atualização de metadados (ex.: renomear arquivos).

5. Controle de Acesso (ACL)

Permissões específicas por arquivo.

Visibilidade pública ou privada configurável.

Tecnologias Utilizadas

Java 17

Spring Boot:

spring-boot-starter-web

spring-boot-starter-security

spring-cloud-starter-aws (ou equivalente para outros provedores de nuvem)

Banco de Dados: PostgreSQL ou MySQL

Serviços de Nuvem: AWS S3 / Google Cloud Storage / Azure Blob Storage

JWT para autenticação

Maven para gerenciamento de dependências

Arquitetura do Projeto

Controller: Endpoints para upload, download e gerenciamento de arquivos.

Service: Lógica de negócio para integração com serviços de nuvem.

Repository: Gerenciamento de metadados no banco de dados.

Security: Configuração do Spring Security com JWT.
