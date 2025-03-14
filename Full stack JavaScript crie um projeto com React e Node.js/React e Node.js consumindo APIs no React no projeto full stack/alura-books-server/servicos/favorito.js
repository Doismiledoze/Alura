const fs = require("fs");

function getTodosFavoritos(){
    return JSON.parse(fs.readFileSync("favoritos.json"));
}


function insereFavorito(id){
    const livros = JSON.parse(fs.readFileSync("livros.json"));
    const favoritos = JSON.parse(fs.readFileSync("favoritos.json"));
    const livroInserido = livros.find(livro => livro.id===id);
    const novaListaDeFavoritos = [...favoritos, livroInserido];
    fs.writeFileSync("Favoritos.json", JSON.stringify(novaListaDeFavoritos));
}

function deletaFavoritoPorId(id){
    const livros = JSON.parse(fs.readFileSync("favoritos.json"));
    const livrosFiltrados = livros.filter(livro => livro.id!==id);
    fs.writeFileSync("favoritos.json", JSON.stringify(livrosFiltrados));
}

module.exports = {
    getTodosFavoritos,
    insereFavorito,
    deletaFavoritoPorId
}