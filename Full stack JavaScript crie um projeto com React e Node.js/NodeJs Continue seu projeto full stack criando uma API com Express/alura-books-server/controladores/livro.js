function getLivros(req, res){
    try{
        res.send("Olá Mundo da Alura do Brasil!")
    } catch (error){
        res.status(500);
        res.send(error.message);
    }
}

module.exports = {
    getLivros
}