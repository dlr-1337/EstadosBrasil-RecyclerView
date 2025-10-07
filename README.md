# Estados do Brasil (RecyclerView)

Aplicativo Android escrito em Kotlin que demonstra o uso de `RecyclerView` para listar os 26 estados brasileiros mais o Distrito Federal. Cada item exibe a bandeira e o nome do estado e, ao ser selecionado, abre uma tela de detalhes com capital, população e região.

## Visão geral
- Interface principal com uma lista vertical simples (`RecyclerView` + `LinearLayoutManager`).
- Tela de detalhes (`DetalheEstadoActivity`) que reaproveita o mesmo objeto `Estado` enviado pela lista.
- Repositório em memória (`EstadosRepository`) contendo os dados estáticos dos estados e os recursos de bandeira correspondentes.
- Layouts otimizados para telas pequenas, com suporte a rolagem na tela de detalhes.

## Tecnologias e dependências
- Kotlin 2.0.21
- Android Gradle Plugin 8.12.3
- SDK alvo/compilação 36, `minSdk` 24
- AndroidX AppCompat, Core KTX, Material Components
- RecyclerView (incluso nas dependências padrão do AndroidX)

## Requisitos
- Android Studio Ladybug (ou mais recente) com JDK 17 configurado.
- Android SDK 24 ou superior instalado.
- Emulador ou dispositivo físico rodando Android 7.0 (API 24) ou superior.

## Como executar
1. Clone o repositório ou faça o download do código-fonte.
   ```bash
   git clone https://github.com/<seu-usuario>/RecyclerView.git
   cd RecyclerView
   ```
2. Abra o projeto no Android Studio e aguarde a sincronização do Gradle.
3. Execute o app com o atalho `Shift + F10` (Windows/Linux) ou assemelhado no macOS, selecionando um emulador/dispositivo.

Execução via linha de comando:
```bash
./gradlew assembleDebug
```
No Windows, use:
```bash
gradlew.bat assembleDebug
```

## Estrutura do projeto
- `app/src/main/java/com/example/recyclerview/` – código Kotlin principal (Activities, Adapter, modelos e repositório).
- `app/src/main/res/layout/` – layouts XML da lista, item e tela de detalhes.
- `app/src/main/res/drawable/` – bandeiras dos estados e ícones do aplicativo.
- `app/src/main/res/values/` – strings e temas.
- `gradle/libs.versions.toml` – catálogo de versões das dependências.

## Componentes principais
- `MainActivity.kt`: inicializa a lista de estados, configura o `RecyclerView` e trata o clique nos itens.
- `EstadoAdapter.kt`: adapta os objetos `Estado` para a lista, infla `item_estado.xml` e envia eventos de clique.
- `DetalheEstadoActivity.kt`: mostra bandeira, nome, capital, população e região do estado selecionado.
- `EstadosRepository.kt`: fornece a lista estática de estados com suas respectivas bandeiras.
- `Estado.kt`: modelo de dados serializável utilizado para navegação entre as telas.

## Personalização
- Para adicionar ou editar estados, atualize a lista em `EstadosRepository.kt`.
- Ajuste o layout do item (`item_estado.xml`) para incluir mais informações, ícones ou estilos.
- Substitua as bandeiras em `res/drawable` mantendo os mesmos nomes de arquivo ou atualize os IDs no repositório.
- Há um arquivo `res/bandeiras.7z` contendo os recursos originais de bandeira caso precise recuperar as imagens.

## Testes
- Testes locais (unitários): `./gradlew test`
- Testes instrumentados (em dispositivo/emulador): `./gradlew connectedAndroidTest`

Atualmente o projeto contém apenas os testes gerados automaticamente pelo template do Android Studio; adicione novos testes conforme evoluir a lógica da aplicação.

## Próximos passos sugeridos
1. Implementar ordenação/filtragem dos estados (por região ou nome).
2. Adicionar busca dinâmica na lista.
3. Incluir testes instrumentados que validem a navegação e a renderização do `RecyclerView`.

## Licença
Defina a licença desejada (por exemplo, MIT, Apache 2.0) e adicione-a aqui.
