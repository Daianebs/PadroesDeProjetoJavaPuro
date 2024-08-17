# **Design Patterns com Java: Dos Clássicos (GOF)**

Este projeto faz parte do curso **GFT - Desenvolvimento Java com IA** oferecido pela Digital Innovation One (DIO) e tem como objetivo explorar e aplicar o conceito de **Padrões de Projeto** na prática. Ele exemplifica com alusões do cotidiano a implementação de padrões clássicos do **Gang of Four (GoF)** em um contexto genérico com Java puro.

## Padrão Strategy

Imagine que você está em sua casa, e conforme o ambiente e a situação mudam, você ajusta as luzes para criar a atmosfera ideal:

* **Para uma festa**: As luzes mudam para uma combinação de cores vibrantes, tornando o ambiente mais animado.
* **Para relaxamento**: As luzes se tornam mais quentes e suaves, criando uma atmosfera tranquila.

O padrão Strategy permite que a `LampadaInteligente` mude dinamicamente o comportamento da iluminação, oferecendo flexibilidade e modularidade ao sistema.

Essa alusão facilita a compreensão e memorização do padrão Strategy: dependendo da situação, você troca a estratégia para obter o comportamento desejado.

## Padrão Singleton

O padrão Singleton é um padrão **Criacional** que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. Ele é útil quando você precisa controlar o acesso a um recurso compartilhado.

Imagine que você trabalha em um escritório onde há apenas uma cafeteira inteligente. Todos os funcionários precisam usar a mesma cafeteira para preparar o café. Este cenário faz alusão à necessidade de ter uma única instância que gerencia o acesso comum, assim como o padrão Singleton faz.

* **Única Instância**: Assim como há uma única cafeteira para todos no escritório, o Singleton garante que há apenas uma instância do objeto gerenciando a tarefa.
* **Acesso Global**: Todos podem acessar essa instância única, mantendo a consistência (neste caso, garantindo que o café seja preparado e gerenciado de forma centralizada).

**Por que o método `getInstance()` é sincronizado?** Em ambientes multi-threaded, várias threads podem tentar criar uma instância ao mesmo tempo. A sincronização garante que apenas uma instância seja criada.

## Padrão Facade

O padrão Facade é um padrão **Estrutural** que fornece uma interface simplificada para um conjunto de subsistemas complexos. É especialmente útil em sistemas que possuem várias classes interdependentes, pois ele reduz o número de interações necessárias e melhora a manutenibilidade do código.

Imagine um **Sistema de E-commerce**:

* **Gestão de Estoque**: Verifica a disponibilidade do produto.
* **Sistema de Pagamento**: Processa o pagamento.
* **Gestão de Envio**: Organiza o envio e rastreamento do pedido.
* **Notificações**: Envia confirmações de pedido e envio por e-mail ou SMS.

Neste exemplo, a Facade simplifica a interação com esses subsistemas, fornecendo uma única interface para processar uma compra completa. Isso facilita o uso do sistema, pois o cliente precisa apenas interagir com a Facade em vez de lidar diretamente com cada subsistema.

Neste cenário, o padrão Facade age como uma API interna para os serviços do sistema de e-commerce, oferecendo um ponto de interação unificado e fácil de usar.
