# 🐙Stream-Api-Exercicio🐙
Exercício realizado durante minha realização do curso do professor Nélio Alves

* Aprendi sobre a manipulação de streams e expressões lambda, além da utilização de **pipelines** para maior controle da aplicação.
* 🛠️Realizei o exercício lendo um arquivo onde:

### Um objeto Employee👨‍💼 foi criado para representar os funcionários lidos no arquivo. 

* Criei uma stream para filtrar pessoas com salario maior do que o valor que foi passado pelo úsuario, e pegar os emails dessas pessoas através da utilização do ````.map````. Por fim utilizei o ````.sorted```` para poder adcionar os email em ordem alfabética e transformei minha stream em uma lista novamente com o ````.collect(Collectors.toList())````.
* Na última etapa criei uma variável soma recebendo a lista transformada em stream, com os métodos ````.filter()```` para adcionar um predicado que filtra minha stream com funcionários que começam com a letra M. Afim de utilizar o método ````.map()```` para criar uma nova stream tendo acesso ao salário e ````.reduce()```` para realizar a soma entre os salários dos funcionários.

### Principais classes e métodos:
<h3>🔸Pipeline</h3>

* .filter() -> Utilizada para filtrar os elementos utilizando predicado.
* .sorted() -> utilizado para ordenação alfabética.
* .collect() -> para transformar minha stream em Lista novamente.
* .map() -> utilizado para criar uma nova stream.
* .reduce() -> para realizar  as operações de soma.

<h3>🔹Arquivo</h3>

* FileReader
* BufferedReader

###🟢 Como executar o projeto
* Clone meu repositório execute  ````git clone https://github.com/SasaGomess/Stream-Api-Exercicio.git````
* Execute no **Eclipse** ou **IntelliJ**.
* Pelo console digite os valores solicitados e veja na pratica a utilização da stream.

