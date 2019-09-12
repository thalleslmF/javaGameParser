# javaGameParser
Setup: Importar o projeto projJava como projeto java e api2 como projeto maven na ide escolhida.Para desenvolvimento foi escolhida a IDE SpringToolSuite.

No projeto java,
a solução proposta foi utilizar biblioteca File e Scanner para o parser do arquivo,identificando o inicio e fim de cada jogo 
pelas buscas das substrings 'InitGame' e '0:00' respectivamente.Após isso,populou-se os jogadores,suas kills e total de kill de cada
game.Foram utilizados testes unitários com o framework Junit para os métodos de abertura,leitura e preenchimento dos games.
Após popular cada game,foi impresso um relatório com o número do game,jogadores e suas kills e o total de kills de cada game.
Também foi impresso o relatório com os jogadores com o seu total de kills.
Por ultimo,o relatorio com os tipo de kills de cada game e a quantidade destes.
No projeto maven api2,
foi implementada uma api rest com o framework spring que através da url /game e do id se busca os detalhes de um game.
Por exemplo, a url http://localhost:8080/game?id=4 trará os detalhes do game 4 quando o projeto maven for executado.




