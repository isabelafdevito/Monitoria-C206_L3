public class Anotacoes {

    /*
    Threads são usadas para prover paralelismo, ou seja, ter múltiplas atividades ocorrendo ao mesmo tempo.

    Ao usar threads, podemos monitorar e responder a eventos externos de forma assíncrona,
    sem interromper a execução principal do programa. Isso é útil em aplicativos que precisam lidar com entrada/saída,
    como redes ou interações do usuário.

    Ao dividir uma tarefa complexa em várias partes menores e executá-las em threads separadas,
    podemos simplificar a implementação e melhorar a modularidade do código.

    Porém, devemos ter cuidado quanto a limitação de Threads, para não usarmos muito do processador
    durante a execução do código e isso acabar atrasando a performance da aplicação.

    Formas de criar Threads:
    Extends Thread x Implements Runnable
    - A vantagem do "extends Thread" é que não precisamos criar o dobro de objetos para criar a Thread
    - A vantagem de "implements Runnable" é que assim podemos dar extends em alguma classe que precisamos no nosos projeto,
    já que o java só permite herança simples.

    Exemplos de situações que usamos Threads:
    - Atualização de interface do usuário
    - Download simultâneo de arquivos
    - Tarefas periódicas

    O comportamento de execução das threads é determinado pelo escalonador (scheduler) do sistema operacional.
    O escalonador é responsável por decidir qual thread será executada em um determinado momento.

    O escalonador utiliza algoritmos de escalonamento para determinar a ordem de execução das threads.
    Esses algoritmos podem variar de acordo com o sistema operacional e suas políticas de escalonamento.
    Alguns exemplos de algoritmos de escalonamento são o Round-Robin, Prioridade, FIFO (First-In-First-Out), entre outros.

    Na prática, a execução das threads pode parecer aleatória, pois o escalonador pode intercalar a execução das threads
    de maneira imprevisível. Isso acontece devido à natureza concorrente e paralela das threads,
    além de fatores como a disponibilidade de recursos do sistema e a carga de trabalho em cada thread.

    Exemplo de fatores:
    - Tempo de espera (uma thread que já esta na fila a mais tempo ser executada primeiro)
    - Recursos diponiveis (Se a thread estiver por exemplo aguardando um arquivo, ele dará prioridade
    a outras threads)

    Portanto, embora as threads sejam iniciadas em uma ordem específica no código,
    sua execução real pode variar de acordo com o escalonamento realizado pelo sistema operacional.
     */

}
