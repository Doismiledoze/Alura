const express = require("express");
const cors = require("cors");
const app = express();
const port = 8000;
const rotaLivro = require("./rotas/livro")
app.use(express.json());
app.use(cors({origin:"*"}))
app.use('/livros',rotaLivro);

app.listen(port, ()=> console.log(`Escutanto a porta ${port}`));