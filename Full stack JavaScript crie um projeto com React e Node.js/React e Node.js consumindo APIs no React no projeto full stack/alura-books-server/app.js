const express = require("express");
const cors = require("cors");
const app = express();
const port = 8000;
const rotaLivro = require("./rotas/livro")
const rotaFavorito = require("./rotas/favorito")
app.use(express.json());
app.use(cors({origin:"*"}))
app.use('/livros',rotaLivro);
app.use('/favoritos', rotaFavorito)
app.listen(port, ()=> console.log(`Escutanto a porta ${port}`));