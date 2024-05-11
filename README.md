<h1>LoginScreen</h1>

<p>Este é um sistema de autenticação simples representado por duas classes: LoginScreen e LoginScreenTest.</p>

  <h2>LoginScreen</h2>
    <p>A classe LoginScreen representa uma tela de login com funcionalidade básica de autenticação. Ela possui os seguintes métodos:</p>
    <ul>
        <li>login(String username, String password): Este método tenta autenticar um usuário com um nome de usuário e senha fornecidos. Retorna true se a autenticação for bem-sucedida e false caso contrário.</li>
        <li>addUser(String username, String password): Este método adiciona um novo usuário ao banco de dados.</li>
    </ul>
    <p>O banco de dados de usuários é simulado usando um HashMap, onde as chaves representam os nomes de usuário e os valores são as senhas correspondentes.</p>

  <h2>LoginScreenTest</h2>
    <p>A classe LoginScreenTest contém métodos de teste JUnit para verificar o funcionamento da classe LoginScreen. Ela inclui os seguintes métodos de teste:</p>
    <ul>
        <li>testSuccessfulLogin(): Verifica se o login é bem-sucedido com credenciais corretas.</li>
        <li>testFailedLogin(): Verifica se o login falha com credenciais incorretas.</li>
        <li>testAddUser(): Verifica se um novo usuário pode ser adicionado ao banco de dados e se é possível fazer login com as credenciais desse novo usuário.</li>
    </ul>

  <h2>Executando os Testes</h2>
    <p>Para executar os testes, é necessário ter o framework JUnit configurado no ambiente de desenvolvimento. Os testes podem ser executados individualmente ou em conjunto, garantindo que a funcionalidade do sistema de autenticação esteja correta.</p>


    
