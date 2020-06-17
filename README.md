# problema-da-transportadora
Utilizando estrutura de dados Heap e Hash para mapeamento dos dados, visando resolver problemas de uma transportadora.

Sistema para uma transportadora de encomendas que possui as seguintes fases para realização de um trasporte de encomendas:

# Fase 1: 
Inicialmente o vendedor procura a transportadora para criar um processo de envio de encomenda, onde é atendido por um estagiário. O estagiário fica encarregado de criar a documentação inicial do processo de transporte e colocá-lo em uma lista processos que serão avaliados por um dos vários secretários que trabalham na transportadora.

Detalhes importantes desta fase:
1- O documento de um processo possui um padrão que consta de um código identificador único, um campo   de prioridade (prioridade que a encomenda possui para envio), nome do vendedor, nome do comprador, o nome do responsável pelo transporte, peso da encomenda, tipo da encomenda (comum ou de envio rápido) e um campo com detalhes sobre a encomenda (ex: caixa frágil, dentre outros).

2 - O estagiário é responsável por preencher apenas o nome do vendedor, nome do comprador, peso da encomenda, tipo da encomenda (comum ou de envio rápido) e o campo com detalhes sobre a encomenda. O código identificador único deverá ser criado pelo sistema assim que o estagiário cadastrar o documento (adicionar na lista de processos).

3 - Para cadastrar o documento no sistema (cadastrar na lista de processo) o estagiário não precisa estar logado no sistema, ou seja, não é necessária a verificação da pessoa que está cadastrando o documento de processo no sistema.

4 – A lista de processos deverá ser implementada com uma lista duplamente encadeada com ponteiros no início e no fim. O aluno deverá decidir qual a ordem de inserção e qual a ordem de remoção dessa lista.


# Fase 2:
Qualquer um dos secretários da transportadora pode remover um processo da lista de processos . Assim que o fizer, deverá ser responsável pelo transporte, não sendo possível recusar a gerenciar o processo. O secretário deve ler o processo, colocar um valor de token de 0 a 100 (maior valor representa maior prioridade) no campo de prioridade e cadastrar o documento do processo na fila de processos a serem transportados.

Detalhes importantes desta fase: 
1 - Assim que o secretário pedir para remover um documento de processo, o sistema deve pedir para que ele se identifique, requisitando seu cpf e senha. Esta verificação deverá ser processada através de uma tabela hash de tamanho 11, com função hash (exceto a função básica de divisão) e tratamento de exceção definidos pelo aluno. 

2 - Os dados dos secretários da empresa devem estar pré-cadastrados no sistema. O aluno deve criar pelo menos 3 secretários fictícios. Os dados que devem ser criados e armazenados para cada secretário são: nome, cpf, senha e um campo que deverá ser utilizado para garantir que esta pessoa e de fato é um secretário no sistema (outros tipos de usuários serão também cadastrados no sistema).

3 – Quando o secretário pedir para remover um documento de processo, automaticamente o sistema deverá adicionar seu nome no campo “nome do responsável pelo transporte” do documento removido.

4 – Quando o secretário cadastrar o token de prioridade no documento este deve ser colocado em uma fila de prioridades que deve ser implementada utilizando heap máxima.


# Fase 3: 
Qualquer um dos transportadores do sistema pode remover um documento de processo da fila de processos a serem transportados. O transportador remove o documento de processo e dá início aos pedidos formais para que se execute todos os processos do transporte da encomenda.

Detalhes importantes desta fase: 
1 - Assim que o transportador pedir para remover um documento de processo da fila de processos, o sistema deve pedir para que ele se identifique, requisitando seu cpf e senha. Esta verificação deverá ser processada através da mesma tabela hash definida na fase 2. 

2 - Os dados dos trasportadores do sistema de transporte devem estar pré-cadastrados no sistema. O aluno deve criar pelo menos 5 transportadores fictícios. Os dados que devem ser criados e armazenados para cada transportador são: nome, cpf, senha e um campo que deverá ser utilizado para garantir que esta pessoa é de fato um transportador no sistema (outros tipos de usuários serão também cadastrados no sistema).

3 - Note que quando o transportador pedir para remover um documento de processo da fila de processos, este deve ser sempre o de maior prioridade. Após a remoção nada mais é feito pelo sistema.
