Abstract Factory
Conceito

O Abstract Factory é um padrão de projeto criacional que fornece uma interface para criar famílias inteiras de objetos relacionados, sem que o código cliente precise conhecer as classes concretas envolvidas.

A ideia central é garantir que os objetos produzidos em conjunto sejam sempre compatíveis entre si — ou seja, pertençam à mesma "variante" ou "família". 

Trocar de fábrica concreta troca a família inteira de produtos de uma vez, sem que o cliente precise mudar nenhuma linha de código.

Cenário simulado:

Uma aplicação com temas visuais de interface (claro e escuro). Cada tema precisa fornecer um Botao e uma CaixaDeTexto compatíveis entre si — não se pode ter, por engano, um botão do tema escuro junto com uma caixa de texto do tema claro na mesma tela.

Quando usar:
Quando o sistema precisa trabalhar com famílias de produtos relacionados e for importante garantir que os produtos de uma mesma família sejam usados em conjunto (ex.: temas de UI, drivers de banco de dados por SGBD, componentes de um mesmo sistema operacional).
Quando você quer isolar o código cliente das classes concretas de produtos, dependendo apenas de interfaces.
Quando é preciso trocar toda uma família de objetos de uma vez, apenas trocando a fábrica concreta injetada.
