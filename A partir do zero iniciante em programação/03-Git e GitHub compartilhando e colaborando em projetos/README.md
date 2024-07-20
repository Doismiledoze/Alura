# Git e GitHub: compartilhando e colaborando em projetos

- Crie seu portfólio de projetos no GitHub
- Aprenda a compartilhar o código de seus projetos no GitHub
- Entenda como colaborar em projetos
- Faça o versionamento de um projeto de software utilizando o Git
- Lide com conflitos em códigos utilizando o Git
- Analise e modifique o histórico de commits de um repositório Git

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Jogo do numero Secreto v2](https://gha-jogo-numero-secreto-v2.vercel.app/)

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Compartilhando projetos | <ul><li><p>Criar sua conta no GitHub para poder compartilhar seus projetos de software e/ou colaborar em projetos de outras pessoas;</p></li><li><p>Baixar e instalar o Git em seu computador;</p></li><li><p>Configurar sua conta do Git em seu computador, com os comandos <code>git config --global user.name</code> e <code>git config --global user.email</code>;</p></li><li><p>Criar um repositório remoto no GitHub;</p></li><li><p>Criar e conectar seu repositório local com o repositório remoto por meio dos comandos <code>git init</code>, <code>git add</code>, <code>git commit</code>, <code>git remote add</code> e <code>git push</code>.</p></li></ul>
Colaborando em projetos | <ul><li><p>Baixar uma cópia de um repositório hospedado no GitHub para o seu computador, utilizando o comando <code>git clone</code>;</p></li><li><p>Realizar alterações no código de um projeto e registrá-las com commits, utilizando os comandos <code>git add</code> e <code>git commit</code>;</p></li><li><p>Visualizar quais arquivos foram modificados no repositório local, utilizando o comando <code>git status</code>;</p></li><li><p>Listar os commits realizados no repositório, com dados do autor, data e mensagem de cada commit, utilizando o comando <code>git log</code>;</p></li><li><p>Visualizar os repositórios remotos linkados com o repositório local, utilizando o comando <code>git remote</code>;</p></li><li><p>Enviar commits feitos no repositório local para o repositório remoto, utilizando o comando <code>git push</code>;</p></li><li><p>Baixar commits do repositório remoto para o repositório local, utilizando o comando <code>git pull</code>;</p></li><li><p>Adicionar uma pessoa como colaboradora em um repositório no GitHub, e também como aceitar um convite de colaboração recebido.</p></li></ul>
Utilizando Git na IDE | <ul><li><p>Utilizar o Git pela integração do VSCode, ao invés de utilizar pelo terminal;</p></li><li><p>Entender como acontecem conflitos de códigos em commits que modificam um mesmo arquivo, feitos por pessoas distintas;</p></li><li><p>O Git sinaliza no código um conflito, via marcações visuais;</p></li><li><p>Resolver um conflito manualmente, editando o arquivo e realizando um commit que marca o conflito como resolvido.</p></li></ul>
Voltando no tempo | <ul><li><p>Reverter mudanças de um commit de maneira automática, utilizando o comando <code>git revert</code>;</p></li><li><p>Apagar um determinado commit do histórico, desfazendo automaticamente suas mudanças no código, utilizando o comando <code>git reset</code>;</p></li><li><p>Modificar o último commit efetuado, alterando sua mensagem ou modificações no código, utilizando o comando <code>git commit</code> com o parâmetro <code>--amend</code>.</p></li></ul>
Mais recursos | <ul><li><p>Criar o arquivo README de um repositório, que funciona como uma documentação;</p></li><li><p>Ensinar ao Git que determinados arquivos e/ou diretórios do projeto devem ser automaticamente ignorados do controle de versão, com a criação do arquivo oculto <code>.gitignore</code>;</p></li><li><p>Compartilhar trechos de códigos com a ferramenta <strong>Gist</strong> do GitHub.</p></li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

<details>
<summary>Compartilhando projetos</summary>

1. Crie uma conta no GitHub
2. Crie um repositório para um projeto pessoal.
3. Faça a instalação do Git
4. Crie um repositório localmente para o seu projeto pessoal
5. Adicione alguns arquivos no seu repositório local
6. Faça o commit das alterações

```bash
    git commit -m "mensagem de commit"
```

7. Configure a identidade do autor do commit.

```bash
    git -config --global user.email "seuemailaqui@example.com"
    git config --global user.name "seu nome aqui"
```

8. Crie a branch Main

```bash
    git branch -M main
```

9. Realize a conexão do seu repositório local com o remoto

```bash
    git remote add origin https://github.com/seunomedeusuario/seu-repositorio.git
```

10. Envie as alterações no repositório local para o remoto

```bash
    git push -u origin main
```

11. Utilize o comando git status

```bash
    git status
```

</details>
<br>
<details>
<summary>Colaborando em projetos</summary>

1. Crie um novo repositório remoto no Github e insira um arquivo.

2. Faça um clone do seu repositório remoto para o local.

```bash
    git clone <url-do-seu-repositorio>
```

3. Faça uma nova modificação no repositório remoto.

4. Atualize seu repositório local a partir do Remoto.

```bash
    git pull origin main
```

5. Utilize o comando git remote -v no terminal.

```bash
    git remote -v
```

6. Confira as mudanças nos arquivos.

```bash
    git status
```

</details>
<br>
<details>
<summary>Utilizando Git na IDE</summary>

1. Crie um novo repositório local

```bash
    git init
```

2. Adicione o repositório remoto criado nos exercícios anteriores ao seu repositório local.

```bash
    git remote add <nome-remoto> <url-do-repositorio-remoto>
```

3. Faça uma alteração no repositório local e envie para o remoto.

```bash
    git add
    git commit -m "Alteração no repositório local"
    git push <nome-remoto> main
```

4. Resolva os conflitos manualmente, escolhendo quais alterações serão mantidas

```bash
    git pull <nome-remoto> main
```

5. Realize um commit para registrar a resolução do conflito.

```bash
    git add
    git commit -m "Resolver conflito manualmente de ‘descrição do conflito’"
```

6. Verifique quais arquivos foram adicionados

```bash
    git status
    git diff
```

7. Sincronize o repositório local com o repositório remoto no GitHub.

```bash
    git push <nome-remoto> main
```

</details>
<br>
<details>
<summary>Voltando no tempo</summary>

1. Acesse todos os commits realizados

```bash
    git log
    git log -p
    git log --oneline
```

2. Modifique o último commit

```bash
    git commit --amend
```

3. Reverta mudanças no repositório local

```bash
    git revert <hash-do-commit>
    git revert -n <hash-do-ultimo-commit-a-manter>
```

4. Apague um ou mais commits

```bash
    git reset --hard <hash-do-ultimo-commit-a-manter>
```

> Se você apenas deseja desfazer commits, mas manter as alterações no diretório de trabalho
>
> ```bash
>   git reset --soft
> ```

5. Sincronize as modificações com o repositório remoto

```bash
    git push
```

6. Analise as mensagens de commits realizados e faça as alterações de acordo com as boas práticas

```bash
    git log
    git commit –amend / git revert.
```

</details>
<br>
<details>
<summary>Mais recursos</summary>

1. Criar um README.md para documentação de seu projeto
2. Crie um arquivo .txt com os logs de commits no seu projeto

```bash
    git log > logs.txt
```

3. Ignore o arquivo de logs durante a sincronização do repositório local para o remoto
4. Crie um README.md para o seu perfil do github

</details>
<br>

## Links Úteis

[Voltar à Navegação](#navegação)

- [Sobre repositórios - GitHub Docs](https://docs.github.com/pt/repositories/creating-and-managing-repositories/about-repositories)
- [Definir a visibilidade do repositório - GitHub Docs](https://docs.github.com/pt/repositories/managing-your-repositorys-settings-and-features/managing-repository-settings/setting-repository-visibility)
- [GitHub Student Developer Pack](https://education.github.com/pack?ref=producthunt)
- [Nova exigência do Git de autenticação por token, o que é e o que devo fazer?](https://www.alura.com.br/artigos/nova-exigencia-do-git-de-autenticacao-por-token-o-que-e-o-que-devo-fazer)
- [Documentação oficial do Git](https://git-scm.com/book/pt-br/v2/Come%C3%A7ando-O-B%C3%A1sico-do-Git)
- [Coautoria no GitHub](https://docs.github.com/pt/pull-requests/committing-changes-to-your-project/creating-and-editing-commits/creating-a-commit-with-multiple-authors)
- [Open Source - Uma breve introdução](https://www.alura.com.br/artigos/open-source-uma-breve-introducao)
- [Repositório do VS Code no Github](https://github.com/microsoft/vscode)
- [Repositório do React no Github](https://github.com/facebook/react-native)
- [Como o Visual Studio facilita o controle de versão com o Git](https://learn.microsoft.com/pt-br/visualstudio/version-control/git-with-visual-studio?view=vs-2022)
- [Como resolver conflitos de mesclagem no Visual Studio](https://learn.microsoft.com/pt-br/visualstudio/version-control/git-resolve-conflicts?view=vs-2022)
- [Um guia muito útil para mesclar conflitos - em Inglês](https://www.youtube.com/watch?v=HosPml1qkrg)
- [Git diff](https://git-scm.com/docs/git-diff/pt_BR)
- [Git reset](https://git-scm.com/docs/git-reset/pt_BR)
- [Documentação da Conventional Commits](https://www.conventionalcommits.org/pt-br/v1.0.0-beta.4/)
- [Markdown: como trabalhar com essa linguagem de markup?.](https://www.alura.com.br/artigos/como-trabalhar-com-markdown)
- [Markdown Quick Reference Cheat Sheet](https://wordpress.com/support/markdown-quick-reference/)
- [Como escrever um README incrível no seu Github](https://www.alura.com.br/artigos/escrever-bom-readme)
- [Como criar um README para o seu perfil do GitHub](https://www.alura.com.br/artigos/como-criar-um-readme-para-seu-perfil-github)
- [Git e GitHub: dominando controle de versão de código](https://cursos.alura.com.br/course/git-github-dominando-controle-versao-codigo)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
------------|-----------|--------
Controlando versões com Git e GitHub | Neste livro, Alexandre Aquiles e Rodrigo Ferreira mostrarão como utilizar o Git para controlar as versões do seu projeto. Serão ensinados comandos para criação de repositórios, trabalho local e remoto, branches, tags, conflitos, dentre outros assuntos. Além disso, será mostrado também como criar uma conta no GitHub e utilizá-la para hospedar seus repositórios | [ACESSAR](https://www.casadocodigo.com.br/pages/sumario-git-github)
Documentação git | Documentação oficial do Git, onde você encontrará informações importantes sobre comandos e funcionamento da ferramenta. | [ACESSAR](https://git-scm.com/book/pt-br/v2/Come%C3%A7ando-O-B%C3%A1sico-do-Git)
Documentação github Conventional Commits | A especificação do Conventional Commits é uma convenção simples para utilizar nas mensagens de commit. Ela define um conjunto de regras para criar um histórico de commit explícito, o que facilita a criação de ferramentas automatizadas. Esta convenção segue o SemVer, descrevendo os recursos, correções e modificações que quebram a compatibilidade nas mensagens de commit. | [ACESSAR](https://www.conventionalcommits.org/pt-br/v1.0.0-beta.4)
Ferramenta gerador de .gitignore | Ferramenta para criar arquivos .gitignore úteis para o seu projeto. | [ACESSAR](https://www.toptal.com/developers/gitignore/)
Ferramenta MarkDown Guide | O Markdown Guide é um guia de referência gratuito e de código aberto que explica como usar o Markdown, a linguagem de marcação simples e fácil de usar que você pode usar para formatar praticamente qualquer documento. | [ACESSAR](https://www.markdownguide.org/)
Markdown: como trabalhar com essa linguagem de markup? | Você irá entender sobre o funcionamento do Markdown, que é um formato de marcação de texto e como fazer o uso adequado dessa ferramenta. | [ACESSAR](https://www.alura.com.br/artigos/como-trabalhar-com-markdown?_gl=1*j8tztu*_ga*NzU2NTAyMDMyLjE2ODcxOTg5NTE.*_ga_1EPWSW3PCS*MTcwMTI4NjgzMy4yOTAuMS4xNzAxMjg5MzM1LjAuMC4w*_fplc*ZXM3TVQzbmI1bSUyQlhHeUZNY1h6VHFIdHZsc1BidGUwV1FWbFMzUm41VGxpSjk2dGl0M1o4OUVuUkdNMVJMN1p2MEtxWE1TV1ZsdFc0Y3A3cVdPYksxcWdUQllCb25CVDZpTGpIVENaakQ0QXlBRW5BbDQ1VTBkRU1NY00wUnclM0QlM0Q)
Introducing Github O’Reilly | Livro em Inglês para você, que é novo no GitHub. Este livro conciso mostra exatamente o que você precisa para começar e nada mais. É perfeito para gerentes de projetos e produtos e outros membros da equipe que desejam colaborar em um projeto de desenvolvimento, seja para revisar e comentar o trabalho em andamento ou para contribuir com mudanças específicas. Também é ótimo para desenvolvedores que estão aprendendo o GitHub. | [ACESSAR](https://www.oreilly.com/library/view/introducing-github/9781491949801/)
Learning Git O'Reilly | Este livro,em Inglês, ensina Git de maneira simples, visual e tangível para que você possa construir um modelo mental sólido de como funciona o controle de versão do Git. Através do uso de cores, narrativas e exercícios práticos, você aprenderá a usar essa ferramenta com confiança. As informações são introduzidas de forma incremental para que você não fique atolado em termos ou conceitos desconhecidos. | [ACESSAR](https://www.oreilly.com/library/view/learning-git/9781098133900/?_gl=1*1k0j59z*_ga*MTc2ODczMTk1MS4xNjk4NDI5NjAw*_ga_092EL089CH*MTcwMTcxODU5OC4yLjEuMTcwMTcxODc3NS41My4wLjA)