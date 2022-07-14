# java
tipos de variáveis


Não existe a ideia de notação camelo para constante final, deve separa por anderlaine e todas as letras em maiúsculas.

Tipos de dados

São os valores e consequentemente operações que as variáveis podem assumir e sofrer, 
respectivamente."

Tipificação:

Estática (forte) quando uma linguagem obriga definir o tipo de sua varável já no início da criação. E aquele tipo não irá mudar.
Dinâmica não é obrigado a definir o tipo de variável no momento da criação, na execução da aplicação, a linguagem vai inferir qual é o valor que está dentro da variável e a partir desse momento vai assumir que a variável é daquele tipo, por isso ela também é considerada FRACA.
Pode pesquisar linguagem compiladas e linguagem interpretadas.

Primitivo são valores numéricos textuais.
Composto está muito ligado a orientação objeto, ele é heterogêneo, pode ser composto por vários tipos de dados primitivos, e até mesmo ser composto por outros tipos compostos, é uma composição dentro de outra composição.

Utilização

Exemplos numeral:
Byte: 128 até 127 -> byte b = 15;
long: 9.223.372.036.854.775.808 até 9.223.372.036.854.775.807      l o n g   l  = 5 9 3 8 5 1 5 7 8 5 l;
float: é para números reais fracionados de 32bytes       float f = 3.14(f); caso queira definir uma variável do tipo float no java tem que colocar f no final, já para o double é opcional.
Exemplo: 3.14(f);
 se não colocar o (f) no final ele vai inferir que é double


Textual:

Char caracteres de 16-bit Unicode  char c = ‘ T ‘; para trabalhar com um caractere isolado aspas simples.
String: um tipo “especial” String   s = “ T ”; é um tipo de dado composto, aspas duplas.

