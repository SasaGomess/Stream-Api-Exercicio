# Stream-Api-Exercicio
Exercício realizado durante minha realização do curso do professor Nélio Alves

* Aprendi sobre a manipulação de streams e expressões lambda, além da utilização de **pipelines** para maior controle da aplicação.
* 🛠️Realizei o exercício lendo um arquivo onde:
<h2> 👨‍💼Um objeto Employee foi criado para representar os funcionários lidos no arquivo. </h2>

* Criei uma stream para filtrar pessoas com salario maior do que o valor que foi passado pelo úsuario, e pegar os emails dessas pessoas através da utilização do ````.map````. Por fim utilizei o ````.sorted```` para poder adcionar os email em ordem alfabética e transformei minha stream em uma lista novamente com o ````.collect(Collectors.toList())````.
* Na última etapa criei uma variável soma recebendo a lista transformada em stream, com os métodos ````.filter()```` para adcionar um predicado que filtra minha stream com funcionários que começam com a letra M. Afim de utilizar o método ````.map()```` para criar uma nova stream tendo acesso ao salário e ````.reduce()```` para realizar a soma entre os salários dos funcionários.
