<h1>API de Gerenciamento de Arquivos na Nuvem</h1>

<p>Este projeto é uma API backend para upload, download e gerenciamento de arquivos armazenados na nuvem utilizando o Supabase. O objetivo é oferecer um sistema seguro, escalável e eficiente para manipulação de arquivos.
</p>
<hr>

<h2>Funcionalidades</h2>
<h3>1. Autenticação e Autorização</h3>
<ul>
    <li>Autenticação com JWT (JSON Web Token).</li>
    <li>Controle de acesso com Spring Security.</li>
    <li>Perfis de usuário (admin, user) para diferentes permissões.</li>
</ul>

<h3>2. Upload de Arquivos</h3>
<ul>
    <li>Envio de arquivos para o bucket na nuvem.</li>
    <li>Validação do tipo e tamanho do arquivo.</li>
</ul>

<h3>3. Download de Arquivos</h3>
<ul>
    <li>Geração de URLs temporárias para download direto.</li>
    <li>Restrições de acesso baseadas no perfil do usuário.</li>
</ul>

<h3>4. Gerenciamento de Arquivos</h3>
<ul>
    <li>Listagem de arquivos armazenados no bucket.</li>
    <li>Exclusão de arquivos.</li>
    <li>Atualização de metadados (ex.: renomear arquivos).</li>
</ul>

<h3>5. Controle de Acesso (ACL)</h3>
<ul>
    <li>Permissões específicas por arquivo.</li>
    <li>Visibilidade pública ou privada configurável.</li>
</ul>

<hr>

<h2>Tecnologias Utilizadas</h2>
<ul>
    <li><strong>Java 17</strong></li>
    <li><strong>Spring Boot</strong>:
        <ul>
            <li>spring-boot-starter-web</li>
            <li>spring-boot-starter-security</li>
        </ul>
    </li>
    <li><strong>Banco de Dados</strong>: PostgreSQL ou MySQL</li>
    <li><strong>Serviço de Nuvem</strong>: Supabase</li>
    <li><strong>JWT</strong> para autenticação</li>
    <li><strong>Maven</strong> para gerenciamento de dependências</li>
</ul>

<hr>

<h2>Arquitetura do Projeto</h2>
<ul>
    <li><strong>Controller</strong>: Endpoints para upload, download e gerenciamento de arquivos.</li>
    <li><strong>Service</strong>: Lógica de negócio para integração com serviços de nuvem.</li>
    <li><strong>Repository</strong>: Gerenciamento de metadados no banco de dados.</li>
    <li><strong>Security</strong>: Configuração do Spring Security com JWT.</li>
</ul>
