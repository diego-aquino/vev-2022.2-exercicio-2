# V&V 2022.2 - Exercício 2

### Dupla

- Diego Cruz de Aquino (diego.cruz.aquino@ccc.ufcg.edu.br)
  - Programa escolhido: Calculadora de Salario
- Bruno Roberto Silva de Siqueira (bruno.siqueira@ccc.ufcg.edu.br)
  - Programa escolhido: Processador de Boletos

### Avaliação da experiência com TDD

- Diego
  - Ajudou a ter certeza que os requisitos foram compreendidos corretamente;
  - Ajudou a desenvolver de modo incremental, analisando previamente como seriam as interfaces públicas das classes e tendo segurança de que funcionalidades já implementadas continuavam funcionando;
  - Deu mais segurança para fazer refatorações de melhoria do código pela alta cobertura de testes;
  - Ajudou a escrever o código com auxílio da IDE, que já sugeria ações com base no código dos testes, como “Criar classe”, “Criar método” e “Adicionar parâmetro a construtor”.
- Bruno
  - Deu mais confianca a realizar mudancas no codigo, tendo em vista estar protegido pelo testes de que as funcionalidades anteriores nao estao prejudicadas
  - Permitiu notar facilmente possiveis causas de bugs simples, mesmo antes de escrever os testes, ex.: ausencia de validacao de entradas.
  - Pode levar acidentalmente a casos de programacao voltada ao codigo, e nao ao produto/cliente.
  - Pode levar a excesso de testes, com testes triviais, ou testes muito grandes, ou complexos - e as vezes mais complexos que a propria implementacao (excesso de "mocks").
  - O foco excessivo nos testes pode atrapalhar o "design" do codigo, onde o programador pode estar focado em produzir os testes e refatorar (e nao produzir a solucao), sem uma fase de experimentacao livre inicial (codigo engessado, "programming into a corner")
